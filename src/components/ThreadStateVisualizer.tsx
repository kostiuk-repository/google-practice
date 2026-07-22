import { ArrowRight, Cpu, Pause, Play, Square } from 'lucide-react';
import type { ExecutionResult } from '../types/runner';

export function ThreadStateVisualizer({ result }: { result: ExecutionResult | null }) {
  const hasOutput = Boolean(result?.stdout || result?.stderr);
  return (
    <div className="thread-visualizer">
      <div className="thread-viz-intro">
        <Cpu size={16} />
        <div>
          <strong>Thread lifecycle lens</strong>
          <span>Conceptual view for topics 17–20</span>
        </div>
      </div>
      <div className="thread-state-flow" aria-label="Життєвий цикл Java-потоку">
        <div className="thread-state"><Play size={14} /><b>NEW</b><span>created</span></div>
        <ArrowRight size={14} />
        <div className="thread-state is-primary"><Cpu size={14} /><b>RUNNABLE</b><span>scheduled</span></div>
        <ArrowRight size={14} />
        <div className="thread-state"><Pause size={14} /><b>WAITING</b><span>park / join</span></div>
        <ArrowRight size={14} />
        <div className="thread-state"><Square size={14} /><b>TERMINATED</b><span>completed</span></div>
      </div>
      <div className="thread-viz-note">
        {hasOutput
          ? `Останній запуск: ${result?.ok ? 'успішне завершення' : 'помилка або переривання'}, exit ${result?.exitCode ?? '—'}, ${result?.durationMs ?? 0} ms.`
          : 'Запустіть concurrency-тест, щоб пов’язати console output зі станами виконання.'}
      </div>
      <div className="thread-event-list">
        {(result?.stdout.split(/\r?\n/).filter(Boolean).slice(0, 8) ?? []).map((line, index) => (
          <div key={`${line}-${index}`}><span>{String(index + 1).padStart(2, '0')}</span><code>{line}</code></div>
        ))}
      </div>
    </div>
  );
}
