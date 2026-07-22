import type { HarnessContent, PracticeTask, SourceFile } from '../types/catalog';
import type {
  ExecutionResult,
  RunMode,
  RunnerSettings,
  TestResult,
} from '../types/runner';

interface PistonStage {
  stdout?: string;
  stderr?: string;
  output?: string;
  code?: number | null;
  signal?: string | null;
  message?: string | null;
}

interface PistonResponse {
  language?: string;
  version?: string;
  compile?: PistonStage;
  run?: PistonStage;
  message?: string;
}

interface WandboxResponse {
  status?: string;
  signal?: string;
  compiler_output?: string;
  compiler_error?: string;
  compiler_message?: string;
  program_output?: string;
  program_error?: string;
  program_message?: string;
}

const TEST_ANNOTATION = `package org.junit.jupiter.api;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {}`;

const EXECUTABLE = `package org.junit.jupiter.api.function;
@FunctionalInterface
public interface Executable { void execute() throws Throwable; }`;

const ASSERTIONS = `package org.junit.jupiter.api;
import java.util.*;
import java.util.function.Supplier;
import org.junit.jupiter.api.function.Executable;

public final class Assertions {
  private Assertions() {}
  private static AssertionError error(String message, Object expected, Object actual) {
    return new AssertionError((message == null ? "" : message + " ==> ") +
        "expected: <" + expected + "> but was: <" + actual + ">");
  }
  public static void fail(String message) { throw new AssertionError(message); }
  public static void assertTrue(boolean value) { assertTrue(value, (String) null); }
  public static void assertTrue(boolean value, String message) { if (!value) throw new AssertionError(message == null ? "expected true" : message); }
  public static void assertTrue(boolean value, Supplier<String> message) { if (!value) throw new AssertionError(message == null ? "expected true" : message.get()); }
  public static void assertFalse(boolean value) { assertFalse(value, null); }
  public static void assertFalse(boolean value, String message) { if (value) throw new AssertionError(message == null ? "expected false" : message); }
  public static void assertNull(Object value) { if (value != null) throw error(null, null, value); }
  public static void assertNotNull(Object value) { if (value == null) throw new AssertionError("expected a non-null value"); }
  public static void assertSame(Object expected, Object actual) { if (expected != actual) throw error(null, expected, actual); }
  public static void assertNotSame(Object expected, Object actual) { if (expected == actual) throw new AssertionError("expected different object identities"); }
  public static void assertEquals(Object expected, Object actual) { assertEquals(expected, actual, null); }
  public static void assertEquals(Object expected, Object actual, String message) { if (!Objects.equals(expected, actual)) throw error(message, expected, actual); }
  public static void assertEquals(double expected, double actual, double delta) { if (Math.abs(expected - actual) > delta) throw error(null, expected, actual); }
  public static void assertArrayEquals(int[] expected, int[] actual) { if (!Arrays.equals(expected, actual)) throw error(null, Arrays.toString(expected), Arrays.toString(actual)); }
  public static void assertArrayEquals(long[] expected, long[] actual) { if (!Arrays.equals(expected, actual)) throw error(null, Arrays.toString(expected), Arrays.toString(actual)); }
  public static void assertArrayEquals(char[] expected, char[] actual) { if (!Arrays.equals(expected, actual)) throw error(null, Arrays.toString(expected), Arrays.toString(actual)); }
  public static void assertArrayEquals(Object[] expected, Object[] actual) { if (!Arrays.deepEquals(expected, actual)) throw error(null, Arrays.deepToString(expected), Arrays.deepToString(actual)); }
  public static <T extends Throwable> T assertThrows(Class<T> type, Executable executable) {
    try { executable.execute(); }
    catch (Throwable thrown) {
      if (type.isInstance(thrown)) return type.cast(thrown);
      throw new AssertionError("unexpected exception type: " + thrown, thrown);
    }
    throw new AssertionError("expected exception: " + type.getName());
  }
  public static void assertDoesNotThrow(Executable executable) {
    try { executable.execute(); }
    catch (Throwable thrown) { throw new AssertionError("unexpected exception", thrown); }
  }
}`;

function testMain(testClassName: string, iterationId: string, entryClassName: string) {
  const drillNumber = iterationId === 'starter'
    ? ''
    : iterationId.slice(1).padStart(2, '0');
  return `import java.lang.reflect.*;
import org.junit.jupiter.api.Test;

public class ${entryClassName} {
  public static void main(String[] args) throws Exception {
    Class<?> testClass = ${testClassName}.class;
    int passed = 0, failed = 0;
    int selected = 0;
    for (Method method : testClass.getDeclaredMethods()) {
      if (!method.isAnnotationPresent(Test.class)) continue;
      boolean drillTest = method.getName().matches("testDrill\\\\d+.*");
      boolean selectedTest = "${iterationId}".equals("starter")
          ? !drillTest
          : method.getName().startsWith("testDrill${drillNumber}");
      if (!selectedTest) continue;
      selected++;
      Object instance = testClass.getDeclaredConstructor().newInstance();
      method.setAccessible(true);
      long started = System.nanoTime();
      try {
        method.invoke(instance);
        long ms = (System.nanoTime() - started) / 1_000_000;
        System.out.println("@@TEST|PASS|" + method.getName() + "|" + ms + "|");
        passed++;
      } catch (InvocationTargetException error) {
        long ms = (System.nanoTime() - started) / 1_000_000;
        Throwable cause = error.getCause();
        String message = cause == null ? error.toString() : cause.toString();
        message = message.replace("\\n", " ").replace("|", "¦");
        System.out.println("@@TEST|FAIL|" + method.getName() + "|" + ms + "|" + message);
        if (cause != null) cause.printStackTrace(System.out);
        failed++;
      }
    }
    if (selected == 0) {
      System.out.println("@@TEST|FAIL|embedded-test-coverage|0|No embedded assertion targets this drill iteration; compilation still succeeded.");
      failed++;
    }
    System.out.println("@@SUMMARY|" + passed + "|" + failed);
    if (failed > 0) System.exit(1);
  }
}`;
}

function compileMain(qualifiedClassName: string, entryClassName: string) {
  return `public class ${entryClassName} {
  public static void main(String[] args) throws Exception {
    Class<?> solution = ${qualifiedClassName}.class;
    System.out.println("✓ Compilation successful");
    System.out.println("Loaded solution: " + solution.getName());
  }
}`;
}

export function buildExecutionFiles(
  mode: RunMode,
  task: PracticeTask,
  iterationId: string,
  source: string,
  harness: HarnessContent,
  entryClassName = 'Main',
): SourceFile[] {
  const selectedIteration = task.iterations.find((iteration) => iteration.id === iterationId)
    ?? task.iterations[0];
  const selectedClassName = selectedIteration.fileName.replace(/\.java$/, '');
  const qualifiedSolution = `${task.packageName}.${selectedClassName}`;
  const testClass = `${task.packageName}.${task.baseName}Test`;
  const files: SourceFile[] = [{
    name: `${entryClassName}.java`,
    content: mode === 'tests'
      ? testMain(testClass, iterationId, entryClassName)
      : compileMain(qualifiedSolution, entryClassName),
  }, ...harness.sharedSources];

  if (mode === 'tests') {
    files.push(...task.iterations.map((iteration) => ({
      name: iteration.fileName,
      content: iteration.id === iterationId ? source : iteration.source,
    })));
  } else {
    files.push({ name: selectedIteration.fileName, content: source });
  }

  if (mode === 'tests') {
    files.push(
      { name: task.testFileName, content: task.testSource },
      { name: 'Test.java', content: TEST_ANNOTATION },
      { name: 'Executable.java', content: EXECUTABLE },
      { name: 'Assertions.java', content: ASSERTIONS },
    );
    if (harness.practiceAssertions && task.testSource.includes('PracticeAssertions')) {
      files.push({ name: 'PracticeAssertions.java', content: harness.practiceAssertions });
    }
  }
  return files;
}

function parseTests(stdout: string): TestResult[] {
  return stdout
    .split(/\r?\n/)
    .filter((line) => line.startsWith('@@TEST|'))
    .map((line) => {
      const [, state, name, duration, ...message] = line.split('|');
      return {
        name,
        passed: state === 'PASS',
        durationMs: Number(duration) || 0,
        message: message.join('|').replaceAll('¦', '|') || undefined,
      };
    });
}

function friendlyHttpError(status: number, body: string) {
  if (status === 401 || status === 403) {
    return 'Piston відхилив запит авторизації. Додайте token у налаштуваннях або використайте self-hosted endpoint.';
  }
  if (status === 429) return 'Ліміт Piston вичерпано. Спробуйте пізніше або змініть endpoint.';
  return `Piston API повернув HTTP ${status}${body ? `: ${body.slice(0, 240)}` : ''}`;
}

function wandboxFilePath(file: SourceFile) {
  const packageName = file.content.match(/^\s*package\s+([\w.]+)\s*;/m)?.[1];
  return packageName
    ? `${packageName.replaceAll('.', '/')}/${file.name}`
    : file.name;
}

async function runWandbox(
  mode: RunMode,
  task: PracticeTask,
  iterationId: string,
  source: string,
  harness: HarnessContent,
  settings: RunnerSettings,
): Promise<ExecutionResult> {
  const files = buildExecutionFiles(mode, task, iterationId, source, harness, 'prog');
  const [primary, ...additional] = files;
  const started = performance.now();
  const response = await fetch(settings.endpoint, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
      compiler: settings.runtimeVersion || 'openjdk-jdk-21+35',
      code: primary.content,
      codes: additional.map((file) => ({ file: wandboxFilePath(file), code: file.content })),
      stdin: '',
    }),
    signal: AbortSignal.timeout(settings.compileTimeoutMs + settings.runTimeoutMs + 5_000),
  });
  const responseText = await response.text();
  if (!response.ok) {
    const suffix = responseText ? `: ${responseText.slice(0, 240)}` : '';
    throw new Error(`Wandbox API повернув HTTP ${response.status}${suffix}`);
  }

  let payload: WandboxResponse;
  try {
    payload = JSON.parse(responseText) as WandboxResponse;
  } catch {
    throw new Error('Wandbox повернув невалідну JSON-відповідь.');
  }

  const compileOutput = [payload.compiler_output, payload.compiler_error, payload.compiler_message]
    .filter(Boolean).join('\n').trim();
  const stdout = payload.program_output ?? '';
  const stderr = payload.program_error ?? '';
  const rawOutput = [compileOutput, stdout, stderr, payload.program_message]
    .filter(Boolean).join('\n').trim();
  const exitCode = Number(payload.status ?? 1);
  const tests = parseTests(stdout);
  const executionSucceeded = payload.status === '0';

  return {
    ok: executionSucceeded && tests.every((test) => test.passed),
    language: 'java',
    version: settings.runtimeVersion || 'openjdk-jdk-21+35',
    compileOutput,
    stdout,
    stderr,
    exitCode: Number.isFinite(exitCode) ? exitCode : null,
    signal: payload.signal || null,
    durationMs: Math.round(performance.now() - started),
    tests,
    rawOutput,
  };
}

export async function runJava(
  mode: RunMode,
  task: PracticeTask,
  iterationId: string,
  source: string,
  harness: HarnessContent,
  settings: RunnerSettings,
): Promise<ExecutionResult> {
  if (!task.testSource && mode === 'tests') {
    throw new Error('Для цієї задачі test source не знайдено в каталозі.');
  }

  if (settings.provider === 'wandbox') {
    return runWandbox(mode, task, iterationId, source, harness, settings);
  }

  const headers: Record<string, string> = { 'Content-Type': 'application/json' };
  if (settings.authHeaderName.trim() && settings.authHeaderValue.trim()) {
    headers[settings.authHeaderName.trim()] = settings.authHeaderValue.trim();
  }

  const started = performance.now();
  const response = await fetch(settings.endpoint, {
    method: 'POST',
    headers,
    body: JSON.stringify({
      language: 'java',
      version: settings.runtimeVersion || '*',
      files: buildExecutionFiles(mode, task, iterationId, source, harness),
      stdin: '',
      args: [],
      compile_timeout: settings.compileTimeoutMs,
      run_timeout: settings.runTimeoutMs,
      compile_cpu_time: settings.compileTimeoutMs,
      run_cpu_time: settings.runTimeoutMs,
    }),
    signal: AbortSignal.timeout(settings.compileTimeoutMs + settings.runTimeoutMs + 5_000),
  });

  const responseText = await response.text();
  if (!response.ok) throw new Error(friendlyHttpError(response.status, responseText));

  let payload: PistonResponse;
  try {
    payload = JSON.parse(responseText) as PistonResponse;
  } catch {
    throw new Error('Piston повернув невалідну JSON-відповідь.');
  }

  const compileOutput = [payload.compile?.stdout, payload.compile?.stderr, payload.compile?.message]
    .filter(Boolean).join('\n').trim();
  const stdout = payload.run?.stdout ?? '';
  const stderr = payload.run?.stderr ?? '';
  const rawOutput = [compileOutput, stdout, stderr, payload.run?.message]
    .filter(Boolean).join('\n').trim();
  const exitCode = payload.run?.code ?? payload.compile?.code ?? null;
  const signal = payload.run?.signal ?? payload.compile?.signal ?? null;
  const tests = parseTests(stdout);
  const compileFailed = payload.compile != null && payload.compile.code !== 0;
  const runFailed = payload.run != null && payload.run.code !== 0;

  return {
    ok: !compileFailed && !runFailed && tests.every((test) => test.passed),
    language: payload.language ?? 'java',
    version: payload.version ?? settings.runtimeVersion,
    compileOutput,
    stdout,
    stderr,
    exitCode,
    signal,
    durationMs: Math.round(performance.now() - started),
    tests,
    rawOutput,
  };
}
