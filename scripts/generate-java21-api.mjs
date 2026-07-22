import { writeFile } from 'node:fs/promises';
import path from 'node:path';

const apiRoot = 'https://docs.oracle.com/en/java/javase/21/docs/api';

async function loadIndex(name, variable) {
  const response = await fetch(`${apiRoot}/${name}`);
  if (!response.ok) throw new Error(`Could not download ${name}: HTTP ${response.status}`);
  const source = await response.text();
  const prefix = `${variable} = `;
  if (!source.startsWith(prefix)) throw new Error(`Unexpected ${name} format.`);
  const arrayStart = source.indexOf('[', prefix.length);
  const arrayEnd = source.lastIndexOf(']');
  if (arrayStart < 0 || arrayEnd < arrayStart) throw new Error(`Could not find JSON payload in ${name}.`);
  return JSON.parse(source.slice(arrayStart, arrayEnd + 1));
}

const [packageIndex, typeIndex, memberIndex] = await Promise.all([
  loadIndex('package-search-index.js', 'packageSearchIndex'),
  loadIndex('type-search-index.js', 'typeSearchIndex'),
  loadIndex('member-search-index.js', 'memberSearchIndex'),
]);

const packageModules = new Map(packageIndex
  .filter((entry) => entry.m && entry.l)
  .map((entry) => [entry.l, entry.m]));

const types = typeIndex
  .filter((entry) => entry.p && entry.l)
  .map((entry) => {
    const moduleName = packageModules.get(entry.p);
    const qualifiedName = `${entry.p}.${entry.l}`;
    return {
      n: entry.l.split('.').at(-1),
      l: entry.l,
      p: entry.p,
      q: qualifiedName,
      d: moduleName
        ? `${apiRoot}/${moduleName}/${entry.p.replaceAll('.', '/')}/${entry.l}.html`
        : `${apiRoot}/search.html?q=${encodeURIComponent(qualifiedName)}`,
    };
  })
  .sort((left, right) => left.n.localeCompare(right.n) || left.q.localeCompare(right.q));

const knownTypes = new Set(types.map((type) => type.q));
const members = {};
for (const entry of memberIndex) {
  if (!entry.p || !entry.c || !entry.l) continue;
  const owner = `${entry.p}.${entry.c}`;
  if (!knownTypes.has(owner)) continue;
  (members[owner] ??= []).push(entry.l);
}
for (const owner of Object.keys(members)) {
  members[owner] = [...new Set(members[owner])].sort((left, right) => left.localeCompare(right));
}

const catalog = {
  version: 21,
  source: `${apiRoot}/`,
  types,
  packages: [...packageModules.keys()].sort(),
  members,
};

const outputPath = path.join(process.cwd(), 'public', 'java21-api.json');
await writeFile(outputPath, JSON.stringify(catalog));
console.log(`Generated Java 21 API catalog: ${types.length} types, ${Object.values(members).reduce((sum, list) => sum + list.length, 0)} members.`);
