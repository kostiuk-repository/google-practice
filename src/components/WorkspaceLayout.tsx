import { useState, type ReactNode } from 'react';
import { Code2, FileText, Terminal } from 'lucide-react';
import { Group, Panel, Separator } from 'react-resizable-panels';
import { useMediaQuery } from '../hooks/useMediaQuery';

interface WorkspaceLayoutProps {
  learning: ReactNode;
  editor: ReactNode;
  results: ReactNode;
}

export function WorkspaceLayout({ learning, editor, results }: WorkspaceLayoutProps) {
  const compact = useMediaQuery('(max-width: 980px)');
  const [active, setActive] = useState<'learn' | 'code' | 'results'>('code');

  if (compact) {
    return (
      <main className="compact-workspace">
        <nav className="compact-tabs">
          <button className={active === 'learn' ? 'is-active' : ''} onClick={() => setActive('learn')}><FileText size={15} /> Learn</button>
          <button className={active === 'code' ? 'is-active' : ''} onClick={() => setActive('code')}><Code2 size={15} /> Code</button>
          <button className={active === 'results' ? 'is-active' : ''} onClick={() => setActive('results')}><Terminal size={15} /> Results</button>
        </nav>
        <div className="compact-panel">{active === 'learn' ? learning : active === 'code' ? editor : results}</div>
      </main>
    );
  }

  return (
    <main className="workspace">
      <Group orientation="horizontal" id="workspace-panels">
        <Panel id="learning-panel" defaultSize="28%" minSize="320px" maxSize="48%">{learning}</Panel>
        <Separator className="resize-handle" />
        <Panel id="editor-panel" defaultSize="45%" minSize="420px">{editor}</Panel>
        <Separator className="resize-handle" />
        <Panel id="results-panel" defaultSize="27%" minSize="300px" maxSize="42%">{results}</Panel>
      </Group>
    </main>
  );
}
