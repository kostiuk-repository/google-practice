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
  const runnerTypeScript = await readFile(path.join(root, 'src/services/pistonRunner.ts'), 'utf8');
  const runnerJavaScript = ts.transpileModule(runnerTypeScript, {
    compilerOptions: {
      module: ts.ModuleKind.ESNext,
      target: ts.ScriptTarget.ES2022,
    },
  }).outputText;
  await writeFile(runnerBundle, runnerJavaScript);
  const { buildExecutionFiles } = await import(pathToFileURL(runnerBundle));

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

  console.log(`Verified ${topics.length} topics, ${tasks.length} tasks, and ${samples.length} compilable Java test bundles.`);
} finally {
  await rm(temporaryRoot, { recursive: true, force: true });
}
