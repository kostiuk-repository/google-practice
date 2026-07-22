import type { Completion, CompletionContext, CompletionSource } from '@codemirror/autocomplete';
import { syntaxTree } from '@codemirror/language';
import type { Diagnostic } from '@codemirror/lint';
import type { EditorView } from '@codemirror/view';

interface JavaApiType {
  n: string;
  l: string;
  p: string;
  q: string;
  d: string;
}

interface JavaApiCatalog {
  version: number;
  source: string;
  types: JavaApiType[];
  packages: string[];
  members: Record<string, string[]>;
}

interface PreparedCatalog extends JavaApiCatalog {
  typeByQualified: Map<string, JavaApiType>;
  typesBySimple: Map<string, JavaApiType[]>;
  packageSet: Set<string>;
}

let catalogPromise: Promise<PreparedCatalog> | undefined;

function prepareCatalog(catalog: JavaApiCatalog): PreparedCatalog {
  const typesBySimple = new Map<string, JavaApiType[]>();
  for (const type of catalog.types) {
    const existing = typesBySimple.get(type.n) ?? [];
    existing.push(type);
    typesBySimple.set(type.n, existing);
  }
  return {
    ...catalog,
    typeByQualified: new Map(catalog.types.map((type) => [type.q, type])),
    typesBySimple,
    packageSet: new Set(catalog.packages),
  };
}

export function loadJava21Api() {
  catalogPromise ??= fetch(`${import.meta.env.BASE_URL}java21-api.json`)
    .then((response) => {
      if (!response.ok) throw new Error(`Java 21 API catalog returned HTTP ${response.status}.`);
      return response.json() as Promise<JavaApiCatalog>;
    })
    .then(prepareCatalog);
  return catalogPromise;
}

function preferredType(types: JavaApiType[]) {
  return [...types].sort((left, right) => typeRank(left) - typeRank(right) || left.q.localeCompare(right.q))[0];
}

function typeRank(type: JavaApiType) {
  if (type.p === 'java.lang') return 0;
  if (type.p === 'java.util') return 1;
  if (type.p.startsWith('java.util.concurrent')) return 2;
  if (type.p.startsWith('java.time')) return 3;
  if (type.p.startsWith('java.io') || type.p.startsWith('java.nio')) return 4;
  if (type.p.startsWith('java.')) return 5;
  if (type.p.startsWith('javax.')) return 6;
  return 7;
}

function importsFrom(source: string) {
  const imports = new Map<string, string>();
  const wildcardPackages = new Set<string>();
  for (const match of source.matchAll(/^[ \t]*import[ \t]+(?!static\b)([\w.]+)(\.\*)?[ \t]*;/gm)) {
    if (match[2]) wildcardPackages.add(match[1]);
    else imports.set(match[1].split('.').at(-1) ?? match[1], match[1]);
  }
  return { imports, wildcardPackages };
}

function importInsertion(source: string, qualifiedName: string) {
  if (source.includes(`import ${qualifiedName};`)) return null;
  const imports = [...source.matchAll(/^[ \t]*import[ \t]+[^;]+;[ \t]*$/gm)];
  if (imports.length) {
    const last = imports.at(-1)!;
    return { from: last.index + last[0].length, insert: `\nimport ${qualifiedName};` };
  }
  const packageMatch = source.match(/^[ \t]*package[ \t]+[\w.]+[ \t]*;[ \t]*$/m);
  if (packageMatch?.index !== undefined) {
    return { from: packageMatch.index + packageMatch[0].length, insert: `\n\nimport ${qualifiedName};` };
  }
  return { from: 0, insert: `import ${qualifiedName};\n\n` };
}

function apiInfo(type: JavaApiType, signature?: string) {
  return () => {
    const container = document.createElement('div');
    const code = document.createElement('code');
    code.textContent = signature ? `${type.q}.${signature}` : type.q;
    const link = document.createElement('a');
    link.href = type.d;
    link.target = '_blank';
    link.rel = 'noreferrer';
    link.textContent = 'Open official Java 21 API ↗';
    container.append(code, document.createElement('br'), link);
    return container;
  };
}

function typeCompletion(type: JavaApiType): Completion {
  return {
    label: type.n,
    displayLabel: type.l,
    detail: type.p,
    type: 'class',
    boost: 10 - typeRank(type),
    info: apiInfo(type),
    apply(view, _completion, from, to) {
      const source = view.state.doc.toString();
      const line = view.state.doc.lineAt(from).text;
      const insideImport = /^\s*import\s+/.test(line);
      const changes: Array<{ from: number; to?: number; insert: string }> = [
        { from, to, insert: insideImport ? type.q : type.n },
      ];
      if (!insideImport && type.p !== 'java.lang') {
        const addition = importInsertion(source, type.q);
        if (addition) changes.push(addition);
      }
      changes.sort((left, right) => left.from - right.from);
      view.dispatch({ changes });
    },
  };
}

function importedOwner(name: string, source: string, catalog: PreparedCatalog) {
  const direct = catalog.typeByQualified.get(name);
  if (direct) return direct;
  const { imports, wildcardPackages } = importsFrom(source);
  const imported = imports.get(name);
  if (imported) return catalog.typeByQualified.get(imported);
  const candidates = catalog.typesBySimple.get(name) ?? [];
  return candidates.find((type) => type.p === 'java.lang' || wildcardPackages.has(type.p))
    ?? preferredType(candidates);
}

function inferOwner(expression: string, source: string, catalog: PreparedCatalog) {
  if (expression === 'System.out' || expression === 'System.err') return catalog.typeByQualified.get('java.io.PrintStream');
  const finalPart = expression.split('.').at(-1) ?? expression;
  if (/^[A-Z]/.test(finalPart)) return importedOwner(finalPart, source, catalog);
  const escaped = finalPart.replace(/[.*+?^${}()|[\]\\]/g, '\\$&');
  const declaration = [...source.matchAll(new RegExp(`\\b([A-Z][\\w$.]*(?:\\s*<[^;=()]+>)?(?:\\[\\])*)\\s+${escaped}\\b`, 'g'))].at(-1);
  const declaredType = declaration?.[1].replace(/\s*<.*>/, '').replace(/\[\]$/, '').split('.').at(-1);
  return declaredType ? importedOwner(declaredType, source, catalog) : undefined;
}

function applyMember(view: EditorView, from: number, to: number, signature: string) {
  const parenthesis = signature.indexOf('(');
  if (parenthesis < 0) {
    view.dispatch({ changes: { from, to, insert: signature } });
    return;
  }
  const name = signature.slice(0, parenthesis);
  const insert = `${name}()`;
  view.dispatch({
    changes: { from, to, insert },
    selection: { anchor: from + name.length + 1 },
  });
}

export const java21CompletionSource: CompletionSource = async (context: CompletionContext) => {
  const nodeName = syntaxTree(context.state).resolveInner(context.pos, -1).name;
  if (/Comment|String|Character/.test(nodeName)) return null;
  let catalog: PreparedCatalog;
  try {
    catalog = await loadJava21Api();
  } catch {
    return null;
  }
  const source = context.state.doc.toString();
  const line = context.state.doc.lineAt(context.pos);
  const beforeCursor = line.text.slice(0, context.pos - line.from);
  const importMatch = beforeCursor.match(/^\s*import\s+(?:static\s+)?([\w.]*)$/);
  if (importMatch) {
    return {
      from: context.pos - importMatch[1].length,
      options: catalog.types.map((type) => ({
        label: type.q,
        detail: 'Java 21 API',
        type: 'class',
        info: apiInfo(type),
      })),
      validFor: /^[\w.]*$/,
    };
  }

  const memberMatch = context.matchBefore(/(?:[A-Za-z_$][\w$]*\.)+[A-Za-z_$\d]*/);
  if (memberMatch) {
    const dot = memberMatch.text.lastIndexOf('.');
    const expression = memberMatch.text.slice(0, dot);
    const owner = inferOwner(expression, source, catalog);
    if (owner) {
      const signatures = catalog.members[owner.q] ?? [];
      return {
        from: memberMatch.from + dot + 1,
        options: signatures.map((signature) => ({
          label: signature,
          detail: owner.l,
          type: signature.includes('(') ? 'method' : 'property',
          info: apiInfo(owner, signature),
          apply: (view, _completion, from, to) => applyMember(view, from, to, signature),
        })),
        validFor: /^[\w$]*$/,
      };
    }
  }

  const word = context.matchBefore(/[A-Za-z_$][\w$]*/);
  if (!word || (!context.explicit && !/^[A-Z]/.test(word.text))) return null;
  return {
    from: word.from,
    options: catalog.types.map(typeCompletion),
    validFor: /^[\w$]*$/,
  };
};

function isCodePosition(view: EditorView, position: number) {
  const nodeName = syntaxTree(view.state).resolveInner(position, -1).name;
  return !/Comment|String|Character|ImportDeclaration|PackageDeclaration/.test(nodeName);
}

export async function java21ImportDiagnostics(view: EditorView): Promise<Diagnostic[]> {
  let catalog: PreparedCatalog;
  try {
    catalog = await loadJava21Api();
  } catch (error) {
    return [{
      from: 0,
      to: Math.min(1, view.state.doc.length),
      severity: 'info',
      source: 'Java 21 API',
      message: error instanceof Error ? error.message : 'Java 21 API catalog is unavailable.',
    }];
  }
  const source = view.state.doc.toString();
  const diagnostics: Diagnostic[] = [];
  const seenImports = new Set<string>();
  const importedTypes = new Map<string, string>();
  const wildcardPackages = new Set<string>();
  const importPattern = /^[ \t]*import[ \t]+(static[ \t]+)?([\w.]+?)(\.\*)?[ \t]*(;?)[ \t]*$/gm;

  for (const match of source.matchAll(importPattern)) {
    const full = match[0];
    const target = match[2];
    const wildcard = Boolean(match[3]);
    const isStatic = Boolean(match[1]);
    const start = match.index;
    if (!match[4]) {
      diagnostics.push({ from: start, to: start + full.length, severity: 'error', source: 'Imports', message: 'Після import потрібна крапка з комою.' });
    }
    const identity = `${isStatic ? 'static ' : ''}${target}${wildcard ? '.*' : ''}`;
    if (seenImports.has(identity)) {
      diagnostics.push({ from: start, to: start + full.length, severity: 'warning', source: 'Imports', message: 'Цей import уже оголошено вище.' });
    }
    seenImports.add(identity);

    if (!isStatic && wildcard) wildcardPackages.add(target);
    if (!isStatic && !wildcard) importedTypes.set(target.split('.').at(-1) ?? target, target);

    let exists = false;
    if (!isStatic) exists = wildcard ? catalog.packageSet.has(target) : catalog.typeByQualified.has(target);
    else if (wildcard) exists = catalog.typeByQualified.has(target);
    else {
      const parts = target.split('.');
      exists = parts.some((_, index) => catalog.typeByQualified.has(parts.slice(0, parts.length - index).join('.')));
    }
    if (!exists) {
      diagnostics.push({
        from: start + full.indexOf(target),
        to: start + full.indexOf(target) + target.length,
        severity: 'warning',
        source: 'Java 21 API',
        message: 'Import не знайдено в офіційному Java 21 API. Project/external тип остаточно перевірить javac.',
      });
    }
    if (!isStatic && target.startsWith('java.lang.')) {
      diagnostics.push({ from: start, to: start + full.length, severity: 'info', source: 'Imports', message: 'java.lang імпортується автоматично; цей рядок зайвий.' });
    }
  }

  const localTypes = new Set([...source.matchAll(/\b(?:class|interface|enum|record)\s+([A-Za-z_$][\w$]*)/g)].map((match) => match[1]));
  const ignoredTypes = new Set(['T', 'E', 'K', 'V', 'R', 'U', 'Node', 'ListNode', 'TreeNode', 'TrieNode']);
  const reported = new Set<string>();
  for (const match of source.matchAll(/\b[A-Z][A-Za-z0-9_$]*\b/g)) {
    const name = match[0];
    const position = match.index;
    if (reported.has(name) || localTypes.has(name) || ignoredTypes.has(name) || !isCodePosition(view, position)) continue;
    if (source[position - 1] === '.') continue;
    const candidates = catalog.typesBySimple.get(name) ?? [];
    if (!candidates.length || candidates.some((type) => type.p === 'java.lang')) continue;
    const imported = importedTypes.get(name);
    if (imported || candidates.some((type) => wildcardPackages.has(type.p))) continue;
    const suggestion = preferredType(candidates);
    if (!suggestion) continue;
    reported.add(name);
    diagnostics.push({
      from: position,
      to: position + name.length,
      severity: 'warning',
      source: 'Imports',
      message: candidates.length === 1
        ? `Тип ${name} не імпортовано. Додайте import ${suggestion.q};`
        : `Тип ${name} неоднозначний. Найімовірніше: ${suggestion.q} (${candidates.length} варіантів у Java 21).`,
      actions: [{
        name: `Add import ${suggestion.q}`,
        apply(targetView) {
          const addition = importInsertion(targetView.state.doc.toString(), suggestion.q);
          if (addition) targetView.dispatch({ changes: { from: addition.from, insert: addition.insert } });
        },
      }],
    });
  }
  return diagnostics;
}
