import { mkdir, readFile, readdir, rm, writeFile } from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const sourceRoot = path.join(root, 'src');
const testRoot = path.join(root, 'test');
const guideRoot = path.join(root, 'docs', 'learning-guide');
const outputRoot = path.join(root, 'public', 'content');

const titles = [
  'Arrays & Strings', 'Linked Lists', 'Stacks & Queues', 'Hash Tables',
  'Two Pointers', 'Sliding Window', 'Prefix Sums', 'Binary Search', 'Trees',
  'DFS & BFS', 'Recursion & Backtracking', 'Heaps & Sorting', 'Advanced Graphs',
  'Dynamic Programming', 'Advanced Data Structures', 'Bit Manipulation & Math',
  'Multithreading Basics', 'Concurrency Coordination',
  'Concurrent Collections & Executors', 'Modern Java Concurrency',
];

const difficultyOrder = { Easy: 0, Medium: 1, Hard: 2 };
const read = async (file, fallback = '') => {
  try {
    return await readFile(file, 'utf8');
  } catch {
    return fallback;
  }
};
const humanize = (value) => value
  .replace(/([a-z0-9])([A-Z])/g, '$1 $2')
  .replace(/_/g, ' ')
  .trim();

await rm(outputRoot, { recursive: true, force: true });
await mkdir(path.join(outputRoot, 'topics'), { recursive: true });

const topicDirs = (await readdir(sourceRoot, { withFileTypes: true }))
  .filter((entry) => entry.isDirectory() && /^topic\d{2}_/.test(entry.name))
  .sort((a, b) => a.name.localeCompare(b.name));

const sharedSources = [];
for (const topic of topicDirs) {
  const files = await readdir(path.join(sourceRoot, topic.name), { withFileTypes: true });
  for (const file of files) {
    if (file.isFile() && file.name.endsWith('.java') && file.name !== 'Example.java') {
      sharedSources.push({
        name: file.name,
        content: await read(path.join(sourceRoot, topic.name, file.name)),
      });
    }
  }
  const practicePath = path.join(sourceRoot, topic.name, 'practice');
  const practiceFiles = await readdir(practicePath, { withFileTypes: true });
  for (const file of practiceFiles) {
    if (file.isFile() && file.name.endsWith('.java') && !/^(Easy|Medium|Hard)_/.test(file.name)) {
      sharedSources.push({
        name: file.name,
        content: await read(path.join(practicePath, file.name)),
      });
    }
  }
}

const practiceAssertions = await read(path.join(testRoot, 'support', 'PracticeAssertions.java'));
await writeFile(
  path.join(outputRoot, 'harness.json'),
  JSON.stringify({ practiceAssertions, sharedSources }),
);

const guideFiles = await readdir(guideRoot);
const manifest = [];
for (const [index, topicEntry] of topicDirs.entries()) {
  const number = index + 1;
  const slug = topicEntry.name;
  const practiceDir = path.join(sourceRoot, slug, 'practice');
  const testDir = path.join(testRoot, slug, 'practice');
  const practiceFiles = await readdir(practiceDir);
  const canonical = practiceFiles
    .map((name) => ({ name, match: name.match(/^(Easy|Medium|Hard)_(\d+)_([A-Za-z].*)\.java$/) }))
    .filter((item) => item.match)
    .sort((a, b) => {
      const [, ad, an] = a.match;
      const [, bd, bn] = b.match;
      return difficultyOrder[ad] - difficultyOrder[bd] || Number(an) - Number(bn);
    });

  const tasks = [];
  for (const item of canonical) {
    const [, difficulty, orderText, rawTitle] = item.match;
    const baseName = item.name.slice(0, -5);
    const variantPattern = new RegExp(`^${difficulty}_${orderText}_(\\d{2})_${rawTitle}\\.java$`);
    const variants = practiceFiles
      .map((name) => ({ name, match: name.match(variantPattern) }))
      .filter((variant) => variant.match)
      .sort((a, b) => Number(a.match[1]) - Number(b.match[1]));

    const iterations = [{
      id: 'starter',
      kind: 'task',
      order: 0,
      label: `Main task · ${humanize(rawTitle)}`,
      fileName: item.name,
      sourcePath: `src/${slug}/practice/${item.name}`,
      source: await read(path.join(practiceDir, item.name)),
    }];
    for (const variant of variants) {
      const version = Number(variant.match[1]);
      const variantSource = await read(path.join(practiceDir, variant.name));
      const drillTitle = variantSource.match(/Drill\s+\d+\/\d+[^—\r\n]*—\s*([^\r\n*]+)/)?.[1]?.trim()
        ?? `Practice drill ${version}`;
      iterations.push({
        id: `v${version}`,
        kind: 'drill',
        order: version,
        label: `Drill ${String(version).padStart(2, '0')} · ${drillTitle}`,
        fileName: variant.name,
        sourcePath: `src/${slug}/practice/${variant.name}`,
        source: variantSource,
      });
    }

    const testFileName = `${baseName}Test.java`;
    tasks.push({
      id: `${slug}/${baseName}`,
      baseName,
      title: humanize(rawTitle),
      difficulty,
      order: Number(orderText),
      packageName: `${slug}.practice`,
      doc: await read(path.join(practiceDir, `${baseName}_Doc.md`), '# Документація ще не додана'),
      testFileName,
      testSource: await read(path.join(testDir, testFileName)),
      iterations,
    });
  }

  const guideName = guideFiles.find((name) => name.startsWith(`${String(number).padStart(2, '0')}-`));
  const meta = {
    id: slug,
    number,
    title: titles[index],
    track: number <= 16 ? 'DSA' : 'Concurrency',
    taskCount: tasks.length,
    easyCount: tasks.filter((task) => task.difficulty === 'Easy').length,
    mediumCount: tasks.filter((task) => task.difficulty === 'Medium').length,
    hardCount: tasks.filter((task) => task.difficulty === 'Hard').length,
  };
  manifest.push(meta);
  await writeFile(path.join(outputRoot, 'topics', `${slug}.json`), JSON.stringify({
    ...meta,
    notes: await read(path.join(sourceRoot, slug, 'notes.md')),
    guide: guideName ? await read(path.join(guideRoot, guideName)) : '',
    tasks,
  }));
}

await writeFile(path.join(outputRoot, 'catalog.json'), JSON.stringify({
  generatedAt: new Date().toISOString(),
  topics: manifest,
}));

console.log(`Generated ${manifest.length} topics and ${manifest.reduce((sum, topic) => sum + topic.taskCount, 0)} tasks.`);
