import { execFile } from 'node:child_process';
import { mkdtemp, mkdir, readFile, rm, writeFile } from 'node:fs/promises';
import { tmpdir } from 'node:os';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { promisify } from 'node:util';
import ts from 'typescript';

const exec = promisify(execFile);
const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const temporaryRoot = await mkdtemp(path.join(tmpdir(), 'google-practice-runner-'));

async function json(relativePath) {
  return JSON.parse(await readFile(path.join(root, relativePath), 'utf8'));
}

try {
  const catalog = await json('public/content/catalog.json');
  const harness = await json('public/content/harness.json');
  if (catalog.topics.length !== 20) throw new Error(`Expected 20 topics, found ${catalog.topics.length}`);

  const topics = await Promise.all(catalog.topics.map((topic) =>
    json(`public/content/topics/${topic.id}.json`)));
  const tasks = topics.flatMap((topic) => topic.tasks);
  if (tasks.length !== 320) throw new Error(`Expected 320 tasks, found ${tasks.length}`);

  for (const task of tasks) {
    if (!task.doc.trim()) throw new Error(`Missing documentation: ${task.id}`);
    if (!task.testSource.trim()) throw new Error(`Missing test source: ${task.id}`);
    if (!task.iterations.length) throw new Error(`Missing starter code: ${task.id}`);
  }

  const runnerBundle = path.join(temporaryRoot, 'runner.mjs');
  const contractBundle = path.join(temporaryRoot, 'drillContracts.mjs');
  const runnerTypeScript = await readFile(path.join(root, 'src/services/pistonRunner.ts'), 'utf8');
  const contractTypeScript = await readFile(path.join(root, 'src/services/drillContracts.ts'), 'utf8');
  const compilerOptions = {
    module: ts.ModuleKind.ESNext,
    target: ts.ScriptTarget.ES2022,
  };
  const runnerJavaScript = ts.transpileModule(runnerTypeScript, {
    compilerOptions: {
      module: ts.ModuleKind.ESNext,
      target: ts.ScriptTarget.ES2022,
    },
  }).outputText.replace("'./drillContracts'", "'./drillContracts.mjs'");
  const contractJavaScript = ts.transpileModule(contractTypeScript, { compilerOptions }).outputText;
  await Promise.all([
    writeFile(runnerBundle, runnerJavaScript),
    writeFile(contractBundle, contractJavaScript),
  ]);
  const { buildExecutionFiles, runJava } = await import(pathToFileURL(runnerBundle));
  const { buildDrillExampleContract } = await import(pathToFileURL(contractBundle));

  const coverage = { explicit: 0, generatedExample: 0, compileOnly: 0 };
  for (const task of tasks) {
    for (const iteration of task.iterations.filter((candidate) => candidate.kind === 'drill')) {
      const explicitPattern = new RegExp(`testDrill${String(iteration.order).padStart(2, '0')}(?!\\d)`);
      if (explicitPattern.test(task.testSource)) coverage.explicit++;
      else if (buildDrillExampleContract(task, iteration)) coverage.generatedExample++;
      else coverage.compileOnly++;
    }
  }
  if (Object.values(coverage).reduce((sum, count) => sum + count, 0) !== 1_600) {
    throw new Error(`Drill coverage audit did not account for all 1,600 drills: ${JSON.stringify(coverage)}`);
  }

  const samples = [topics[0].tasks[0], topics[16].tasks[0]];
  for (const task of samples) {
    const sampleRoot = path.join(temporaryRoot, task.baseName);
    const classesRoot = path.join(sampleRoot, 'classes');
    await mkdir(classesRoot, { recursive: true });
    const iteration = task.iterations.at(-1);
    const files = buildExecutionFiles('tests', task, iteration.id, iteration.source, harness);
    await Promise.all(files.map((file) => writeFile(path.join(sampleRoot, file.name), file.content)));
    const javaFiles = files.map((file) => path.join(sampleRoot, file.name));
    await exec('javac', ['--release', '21', '-d', classesRoot, ...javaFiles], { maxBuffer: 4_000_000 });
  }

  const drillTask = topics[0].tasks.find((task) => task.baseName === 'Easy_02_PlusOne');
  const drillIteration = drillTask.iterations.find((iteration) => iteration.id === 'v1');
  const solvedDrill = drillIteration.source.replace(
    /\s*\/\/ TODO: Implement your solution here\.\s*return new int\[0\];/,
    `
        int carry = 1;
        int[] result = digits.clone();
        for (int i = result.length - 1; i >= 0 && carry > 0; i--) {
            int next = result[i] + carry;
            result[i] = next % 10;
            carry = next / 10;
        }
        if (carry == 0) return result;
        int[] expanded = new int[result.length + 1];
        expanded[0] = carry;
        System.arraycopy(result, 0, expanded, 1, result.length);
        return expanded;`,
  );
  const contractRoot = path.join(temporaryRoot, 'generated-contract');
  const contractClasses = path.join(contractRoot, 'classes');
  await mkdir(contractClasses, { recursive: true });
  const contractFiles = buildExecutionFiles('tests', drillTask, drillIteration.id, solvedDrill, harness);
  await Promise.all(contractFiles.map((file) => writeFile(path.join(contractRoot, file.name), file.content)));
  await exec('javac', ['--release', '21', '-d', contractClasses, ...contractFiles.map((file) => path.join(contractRoot, file.name))], { maxBuffer: 4_000_000 });
  const contractRun = await exec('java', ['-cp', contractClasses, 'Main'], { maxBuffer: 4_000_000 });
  if (!contractRun.stdout.includes('@@TEST|PASS|testDrill01_ExampleContract')) {
    throw new Error(`Generated drill contract did not pass:\n${contractRun.stdout}\n${contractRun.stderr}`);
  }

  if (process.argv.includes('--wandbox')) {
    const task = topics[0].tasks[0];
    const solvedSource = task.iterations[0].source.replace(
      /\s*\/\/ TODO: Implement your solution here\.\s*return 0;/,
      `
        int altitude = 0;
        int highest = 0;
        for (int change : gain) {
            altitude += change;
            highest = Math.max(highest, altitude);
        }
        return highest;`,
    );
    const result = await runJava('tests', task, 'starter', solvedSource, harness, {
      provider: 'wandbox',
      endpoint: 'https://wandbox.org/api/compile.json',
      runtimeVersion: 'openjdk-jdk-21+35',
      authHeaderName: '',
      authHeaderValue: '',
      compileTimeoutMs: 20_000,
      runTimeoutMs: 10_000,
    });
    if (!result.ok || result.tests.length < 3) {
      throw new Error(`Wandbox bundle failed:\n${result.rawOutput}`);
    }
    console.log(`Wandbox executed ${result.tests.length} Java 21 assertions successfully.`);
  }

  console.log(`Verified ${topics.length} topics, ${tasks.length} tasks, ${samples.length} Java bundles, and one generated drill contract.`);
  console.log(`Drill verification coverage: ${coverage.explicit} explicit, ${coverage.generatedExample} generated example contracts, ${coverage.compileOnly} compile-only.`);
} finally {
  await rm(temporaryRoot, { recursive: true, force: true });
}
