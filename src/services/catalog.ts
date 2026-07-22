import type { CatalogManifest, HarnessContent, TopicContent } from '../types/catalog';

const contentUrl = (path: string) => `${import.meta.env.BASE_URL}content/${path}`;

async function getJson<T>(url: string): Promise<T> {
  const response = await fetch(url);
  if (!response.ok) {
    throw new Error(`Не вдалося завантажити навчальний каталог (${response.status}).`);
  }
  return response.json() as Promise<T>;
}

export const loadCatalog = () => getJson<CatalogManifest>(contentUrl('catalog.json'));

export const loadTopic = (topicId: string) =>
  getJson<TopicContent>(contentUrl(`topics/${encodeURIComponent(topicId)}.json`));

let harnessPromise: Promise<HarnessContent> | undefined;
export const loadHarness = () => {
  harnessPromise ??= getJson<HarnessContent>(contentUrl('harness.json'));
  return harnessPromise;
};
