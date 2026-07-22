import type { Iteration, PracticeTask, SourceFile } from '../types/catalog';

interface MethodParameter {
  type: string;
  name: string;
}

interface ParsedMethod {
  returnType: string;
  name: string;
  parameters: MethodParameter[];
}

function splitTopLevel(source: string) {
  const parts: string[] = [];
  let start = 0;
  let square = 0;
  let round = 0;
  let angle = 0;
  let quote = '';
  for (let index = 0; index < source.length; index++) {
    const character = source[index];
    if (quote) {
      if (character === quote && source[index - 1] !== '\\') quote = '';
      continue;
    }
    if (character === '"' || character === "'") quote = character;
    else if (character === '[') square++;
    else if (character === ']') square--;
    else if (character === '(') round++;
    else if (character === ')') round--;
    else if (character === '<') angle++;
    else if (character === '>') angle--;
    else if (character === ',' && square === 0 && round === 0 && angle === 0) {
      parts.push(source.slice(start, index).trim());
      start = index + 1;
    }
  }
  parts.push(source.slice(start).trim());
  return parts.filter(Boolean);
}

function parseMethod(source: string): ParsedMethod | null {
  const match = source.match(/public\s+(?:static\s+)?([\w<>?,.\[\] ]+?)\s+(\w+)\s*\(([^)]*)\)\s*(?:throws\s+[\w., ]+)?\s*\{/);
  if (!match) return null;
  const parameters = splitTopLevel(match[3]).map((parameter) => {
    const cleaned = parameter.replace(/\bfinal\s+/g, '').trim();
    const nameMatch = cleaned.match(/(.+?)\s+(\w+)$/);
    return nameMatch ? { type: nameMatch[1].trim(), name: nameMatch[2] } : null;
  });
  if (parameters.some((parameter) => !parameter)) return null;
  return { returnType: match[1].trim(), name: match[2], parameters: parameters as MethodParameter[] };
}

function exampleLine(source: string, label: 'Input' | 'Output') {
  return source.match(new RegExp(`^\\s*\\*\\s*${label}:\\s*(.*?)\\s*$`, 'mi'))?.[1]?.trim() ?? '';
}

function javaLiteral(type: string, raw: string): string | null {
  const normalizedType = type.replace(/\s+/g, '');
  const value = raw.trim();
  if (!value) return null;
  if (/^(byte|short|int|long|float|double|boolean|String|char)$/.test(normalizedType)) {
    if (normalizedType === 'long' && /^-?\d+$/.test(value)) return `${value}L`;
    if (normalizedType === 'float' && /^-?\d+(?:\.\d+)?$/.test(value)) return `${value}f`;
    return value;
  }
  if (/^(?:int|long|double|boolean|char|String)(?:\[\])+$/.test(normalizedType) && value.startsWith('[') && value.endsWith(']')) {
    return `new ${normalizedType}${value.replaceAll('[', '{').replaceAll(']', '}')}`;
  }
  const listMatch = normalizedType.match(/^List<(.+)>$/);
  if (listMatch && value.startsWith('[') && value.endsWith(']')) {
    const inner = value.slice(1, -1);
    const items = splitTopLevel(inner);
    if (listMatch[1].startsWith('List<')) {
      const nestedType = listMatch[1];
      const nested = items.map((item) => javaLiteral(nestedType, item));
      return nested.some((item) => item === null) ? null : `java.util.List.of(${nested.join(', ')})`;
    }
    return `java.util.List.of(${items.join(', ')})`;
  }
  return null;
}

function parseInputs(method: ParsedMethod, input: string) {
  const assignments = new Map<string, string>();
  splitTopLevel(input).forEach((part) => {
    const assignment = part.match(/^(\w+)\s*=\s*([\s\S]+)$/);
    if (assignment) assignments.set(assignment[1], assignment[2].trim());
  });
  if (method.parameters.length === 1 && assignments.size === 0) assignments.set(method.parameters[0].name, input.trim());
  const values = method.parameters.map((parameter) => {
    const raw = assignments.get(parameter.name);
    return raw ? javaLiteral(parameter.type, raw) : null;
  });
  return values.some((value) => value === null) ? null : values as string[];
}

function assertionFor(returnType: string, expected: string, invocation: string, parameters: MethodParameter[], argumentsList: string[]) {
  const type = returnType.replace(/\s+/g, '');
  if (type === 'void') {
    const mutableIndex = parameters.findIndex((parameter) => parameter.type.includes('[]'));
    if (mutableIndex < 0) return null;
    const expectedLiteral = javaLiteral(parameters[mutableIndex].type, expected);
    if (!expectedLiteral) return null;
    const declarations = parameters.map((parameter, index) => `${parameter.type} arg${index} = ${argumentsList[index]};`).join('\n    ');
    const call = invocation.replace(argumentsList.join(', '), parameters.map((_, index) => `arg${index}`).join(', '));
    return `${declarations}\n    ${call};\n    assertArrayEquals(${expectedLiteral}, arg${mutableIndex});`;
  }
  const expectedLiteral = javaLiteral(returnType, expected);
  if (!expectedLiteral) return null;
  if (type === 'double' || type === 'float') return `assertEquals(${expectedLiteral}, ${invocation}, 1e-7);`;
  if (type.endsWith('[]')) return `assertArrayEquals(${expectedLiteral}, ${invocation});`;
  return `assertEquals(${expectedLiteral}, ${invocation});`;
}

export function buildDrillExampleContract(task: PracticeTask, iteration: Iteration): SourceFile | null {
  if (iteration.kind !== 'drill') return null;
  const source = iteration.source;
  const input = exampleLine(source, 'Input');
  const output = exampleLine(source, 'Output');
  const method = parseMethod(source);
  if (!input || !output || !method) return null;
  const argumentsList = parseInputs(method, input);
  if (!argumentsList) return null;
  const className = iteration.fileName.replace(/\.java$/, '');
  const invocation = `new ${className}().${method.name}(${argumentsList.join(', ')})`;
  const assertion = assertionFor(method.returnType, output, invocation, method.parameters, argumentsList);
  if (!assertion) return null;
  const generatedClass = `Generated_${className}_ContractTest`;
  return {
    name: `${generatedClass}.java`,
    content: `package ${task.packageName};
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ${generatedClass} {
  @Test
  public void testDrill${String(iteration.order).padStart(2, '0')}_ExampleContract() {
    ${assertion}
  }
}`,
  };
}
