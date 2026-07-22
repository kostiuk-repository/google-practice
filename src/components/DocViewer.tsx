import { lazy, Suspense, useEffect, useId, useMemo, useState, type ReactNode } from 'react';
import ReactMarkdown, { type Components } from 'react-markdown';
import rehypeKatex from 'rehype-katex';
import remarkGfm from 'remark-gfm';
import remarkMath from 'remark-math';
import { AlertTriangle, Check, Clipboard, Expand, ListTree, X } from 'lucide-react';
import 'katex/dist/katex.min.css';

interface DocViewerProps {
  markdown: string;
  theme: 'dark' | 'light';
  title?: string;
}

interface TocItem {
  level: number;
  text: string;
  id: string;
}

const AlgorithmVisualizer = lazy(() => import('./AlgorithmVisualizer')
  .then((module) => ({ default: module.AlgorithmVisualizer })));

function slugify(text: string) {
  return text
    .toLocaleLowerCase('uk')
    .replace(/[`*_~:[\](){}]/g, '')
    .replace(/[^\p{L}\p{N}]+/gu, '-')
    .replace(/^-|-$/g, '');
}

function textFromChildren(children: ReactNode): string {
  if (typeof children === 'string' || typeof children === 'number') return String(children);
  if (Array.isArray(children)) return children.map(textFromChildren).join('');
  if (children && typeof children === 'object' && 'props' in children) {
    return textFromChildren((children as { props: { children?: ReactNode } }).props.children);
  }
  return '';
}

function MermaidBlock({ source, theme }: { source: string; theme: 'dark' | 'light' }) {
  const reactId = useId().replaceAll(':', '');
  const [svg, setSvg] = useState('');
  const [error, setError] = useState('');
  const [expanded, setExpanded] = useState(false);

  useEffect(() => {
    let cancelled = false;
    const render = async () => {
      try {
        const { default: mermaid } = await import('mermaid');
        mermaid.initialize({
          startOnLoad: false,
          securityLevel: 'strict',
          theme: theme === 'dark' ? 'dark' : 'neutral',
          fontFamily: 'Inter, system-ui, sans-serif',
        });
        const result = await mermaid.render(`mermaid-${reactId}-${theme}`, source.trim());
        if (!cancelled) {
          setSvg(result.svg);
          setError('');
        }
      } catch (renderError) {
        if (!cancelled) {
          setError(renderError instanceof Error ? renderError.message : 'Не вдалося відобразити діаграму.');
        }
      }
    };
    void render();
    return () => { cancelled = true; };
  }, [source, theme, reactId]);

  const diagram = error ? (
    <div className="diagram-error"><AlertTriangle size={16} />{error}</div>
  ) : svg ? (
    <div className="mermaid-svg" dangerouslySetInnerHTML={{ __html: svg }} />
  ) : (
    <div className="diagram-loading">Rendering diagram…</div>
  );

  return (
    <div className="diagram-frame">
      <div className="diagram-header">
        <span>MERMAID VISUALIZATION</span>
        <button onClick={() => setExpanded(true)} title="Відкрити на весь екран"><Expand size={14} /></button>
      </div>
      {diagram}
      {expanded && (
        <div className="diagram-modal" role="dialog" aria-modal="true" aria-label="Діаграма на весь екран">
          <button className="diagram-close" onClick={() => setExpanded(false)} aria-label="Закрити"><X size={20} /></button>
          <div className="diagram-modal-content">{diagram}</div>
        </div>
      )}
    </div>
  );
}

function CodeBlock({ language, source }: { language: string; source: string }) {
  const [copied, setCopied] = useState(false);
  const copy = async () => {
    await navigator.clipboard.writeText(source);
    setCopied(true);
    window.setTimeout(() => setCopied(false), 1_400);
  };
  return (
    <div className="doc-code-block">
      <div className="doc-code-header">
        <span>{language || 'text'}</span>
        <button onClick={copy}>{copied ? <Check size={13} /> : <Clipboard size={13} />}{copied ? 'Copied' : 'Copy'}</button>
      </div>
      <pre><code>{source}</code></pre>
    </div>
  );
}

export function DocViewer({ markdown, theme, title }: DocViewerProps) {
  const [tocOpen, setTocOpen] = useState(false);
  const toc = useMemo<TocItem[]>(() => markdown
    .split(/\r?\n/)
    .map((line) => line.match(/^(#{2,3})\s+(.+)$/))
    .filter((match): match is RegExpMatchArray => Boolean(match))
    .map((match) => ({ level: match[1].length, text: match[2].replace(/[`*_]/g, ''), id: slugify(match[2]) })), [markdown]);

  const heading = (level: 2 | 3) => ({ children }: { children?: ReactNode }) => {
    const text = textFromChildren(children);
    const Tag = `h${level}` as const;
    return <Tag id={slugify(text)}>{children}</Tag>;
  };

  const components: Components = {
    h2: heading(2),
    h3: heading(3),
    a: ({ href, children }) => <a href={href} target={href?.startsWith('http') ? '_blank' : undefined} rel="noreferrer">{children}</a>,
    pre: ({ children }) => <>{children}</>,
    code: ({ className, children }) => {
      const language = className?.replace('language-', '') ?? '';
      const source = String(children).replace(/\n$/, '');
      if (language === 'mermaid') return <MermaidBlock source={source} theme={theme} />;
      if (language === 'algoviz') return (
        <Suspense fallback={<div className="diagram-loading">Loading interactive visualization…</div>}>
          <AlgorithmVisualizer source={source} theme={theme} />
        </Suspense>
      );
      if (!className) return <code className="inline-code">{children}</code>;
      return <CodeBlock language={language} source={source} />;
    },
  };

  return (
    <section className="doc-viewer">
      <div className="doc-reader-header">
        <div>
          <span className="eyebrow">MARKDOWN READER</span>
          <strong>{title ?? 'Theory guide'}</strong>
        </div>
        <button className={tocOpen ? 'toolbar-button is-active' : 'toolbar-button'} onClick={() => setTocOpen((value) => !value)}>
          <ListTree size={14} /> Contents
        </button>
      </div>
      <div className="doc-reader-body">
        {tocOpen && toc.length > 0 && (
          <nav className="doc-toc" aria-label="Зміст документа">
            <span>ON THIS PAGE</span>
            {toc.map((item, index) => (
              <a key={`${item.id}-${index}`} className={item.level === 3 ? 'toc-level-3' : ''} href={`#${item.id}`}>
                {item.text}
              </a>
            ))}
          </nav>
        )}
        <article className="markdown-body">
          <ReactMarkdown remarkPlugins={[remarkGfm, remarkMath]} rehypePlugins={[rehypeKatex]} components={components}>
            {markdown || '# Матеріал завантажується…'}
          </ReactMarkdown>
        </article>
      </div>
    </section>
  );
}
