import { afterAll, beforeAll, describe, expect, it, vi } from 'vitest';
import { EditorState } from '@codemirror/state';
import { EditorView } from '@codemirror/view';
import { java } from '@codemirror/lang-java';
import { java21ImportDiagnostics } from './java21LanguageSupport';

const catalog = {
  version: 21,
  source: 'https://docs.oracle.com/en/java/javase/21/docs/api/',
  packages: ['java.lang', 'java.util'],
  types: [
    { n: 'String', l: 'String', p: 'java.lang', q: 'java.lang.String', d: 'https://example.test/String' },
    { n: 'List', l: 'List', p: 'java.util', q: 'java.util.List', d: 'https://example.test/List' },
  ],
  members: { 'java.util.List': ['add(E)', 'size()'] },
};

describe('Java 21 import diagnostics', () => {
  beforeAll(() => {
    vi.stubGlobal('fetch', vi.fn(async () => new Response(JSON.stringify(catalog), { status: 200 })));
  });

  afterAll(() => vi.unstubAllGlobals());

  it('detects a missing standard-library import and offers a fix', async () => {
    const view = new EditorView({
      state: EditorState.create({
        doc: 'package demo;\n\npublic class Example { List<String> values; }',
        extensions: [java()],
      }),
    });
    const diagnostics = await java21ImportDiagnostics(view);
    const missing = diagnostics.find((diagnostic) => diagnostic.message.includes('java.util.List'));
    expect(missing).toBeDefined();
    missing?.actions?.[0].apply(view, missing.from, missing.to);
    expect(view.state.doc.toString()).toContain('import java.util.List;');
    view.destroy();
  });

  it('reports duplicate and unknown imports', async () => {
    const view = new EditorView({
      state: EditorState.create({
        doc: 'import java.util.Missing;\nimport java.util.Missing;\nclass Example {}',
        extensions: [java()],
      }),
    });
    const diagnostics = await java21ImportDiagnostics(view);
    expect(diagnostics.some((diagnostic) => diagnostic.message.includes('не знайдено'))).toBe(true);
    expect(diagnostics.some((diagnostic) => diagnostic.message.includes('оголошено вище'))).toBe(true);
    view.destroy();
  });
});
