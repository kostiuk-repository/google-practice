import { readFile } from 'node:fs/promises';
import path from 'node:path';

const catalog = JSON.parse(await readFile(path.join(process.cwd(), 'public', 'java21-api.json'), 'utf8'));
if (catalog.version !== 21) throw new Error(`Expected Java 21 catalog, got ${catalog.version}.`);
if (!Array.isArray(catalog.types) || catalog.types.length < 4_500) throw new Error('Java 21 type catalog is incomplete.');
const memberCount = Object.values(catalog.members ?? {}).reduce((sum, members) => sum + members.length, 0);
if (memberCount < 50_000) throw new Error('Java 21 member catalog is incomplete.');
for (const qualifiedName of ['java.lang.String', 'java.util.ArrayList', 'java.util.concurrent.CompletableFuture', 'java.lang.Thread']) {
  if (!catalog.types.some((type) => type.q === qualifiedName)) throw new Error(`Missing required type ${qualifiedName}.`);
}
if (!catalog.members['java.util.ArrayList']?.some((member) => member.startsWith('add('))) {
  throw new Error('ArrayList member completion data is missing.');
}
console.log(`Verified Java 21 API catalog: ${catalog.types.length} types and ${memberCount} members.`);
