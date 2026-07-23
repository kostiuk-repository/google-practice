import { readdir, readFile } from 'node:fs/promises';
import path from 'node:path';

const root = process.cwd();
const guideRoot = path.join(root, 'docs', 'learning-guide');
const topicRoot = path.join(root, 'src', 'topic01_arrays_strings');
const supportedTypes = new Set([
  'array', 'matrix', 'two-pointers', 'sliding-window', 'binary-search', 'sorting', 'stack', 'queue',
  'linked-list', 'tree', 'graph', 'heap', 'dp-table', 'recursion-tree', 'thread-timeline',
]);
const guideFiles = (await readdir(guideRoot))
  .filter((name) => name.endsWith('.md'))
  .map((name) => ({ name: path.join('docs', 'learning-guide', name), path: path.join(guideRoot, name) }));
const topicFiles = [
  { name: path.join('src', 'topic01_arrays_strings', 'notes.md'), path: path.join(topicRoot, 'notes.md') },
  ...(await readdir(path.join(topicRoot, 'practice')))
    .filter((name) => name.endsWith('_Doc.md'))
    .map((name) => ({
      name: path.join('src', 'topic01_arrays_strings', 'practice', name),
      path: path.join(topicRoot, 'practice', name),
    })),
];
const files = [...guideFiles, ...topicFiles];
let blockCount = 0;

function assert(condition, message) {
  if (!condition) throw new Error(message);
}

for (const file of files) {
  const markdown = await readFile(file.path, 'utf8');
  const blocks = [...markdown.matchAll(/```algoviz\s*\r?\n([\s\S]*?)\r?\n```/g)];
  for (const [position, match] of blocks.entries()) {
    const location = `${file.name} algoviz #${position + 1}`;
    let definition;
    try {
      definition = JSON.parse(match[1]);
    } catch (error) {
      throw new Error(`${location}: invalid JSON — ${error.message}`);
    }
    assert(supportedTypes.has(definition.type), `${location}: unsupported type "${definition.type}".`);
    assert(Array.isArray(definition.values) && definition.values.length > 0, `${location}: values must be a non-empty array.`);
    assert(definition.values.length <= 40, `${location}: values supports at most 40 items.`);
    assert(Array.isArray(definition.steps) && definition.steps.length > 0, `${location}: steps must be a non-empty array.`);
    const isIndex = (value) => Number.isInteger(value) && value >= 0 && value < definition.values.length;
    definition.steps.forEach((step, stepIndex) => {
      const prefix = `${location}, step ${stepIndex + 1}`;
      assert(typeof step.label === 'string' && step.label.trim(), `${prefix}: label is required.`);
      const indexes = [step.pointer, ...Object.values(step.pointers ?? {})].filter((value) => value !== undefined);
      const groups = [step.visited, step.active, step.compare].filter(Boolean);
      assert(indexes.every(isIndex) && groups.flat().every(isIndex), `${prefix}: index is outside values.`);
      assert(!step.range || (step.range.length === 2 && step.range.every(isIndex) && step.range[0] <= step.range[1]), `${prefix}: range is invalid.`);
      assert(!step.values || step.values.length === definition.values.length, `${prefix}: step values length changed.`);
      if (step.prediction) {
        assert(typeof step.prediction.prompt === 'string', `${prefix}: prediction prompt is required.`);
        assert(Array.isArray(step.prediction.options) && step.prediction.options.length >= 2, `${prefix}: prediction needs at least two options.`);
        assert(Number.isInteger(step.prediction.answer) && step.prediction.answer >= 0 && step.prediction.answer < step.prediction.options.length, `${prefix}: prediction answer is invalid.`);
      }
    });
    blockCount++;
  }
}

console.log(`Verified ${blockCount} algoviz blocks across ${files.length} learning documents.`);
