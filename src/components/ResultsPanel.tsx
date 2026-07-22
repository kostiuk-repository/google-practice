import { useEffect, useMemo, useState } from 'react';
import {
  AlertCircle,
  BrainCircuit,
  CheckCircle2,
  CircleDashed,
  Code2,
  LoaderCircle,
  Play,
  Settings2,
  Terminal,
  TestTube2,
  XCircle,
} from 'lucide-react';
import type { ExecutionResult, ExecutionStatus, RunMode } from '../types/runner';
import type { LearningRecord } from '../types/learning';
import { diagnoseFailure } from '../services/failureDiagnostics';
import { LearningCoach } from './LearningCoach';
import { ThreadStateVisualizer } from './ThreadStateVisualizer';

interface ResultsPanelProps {
  status: ExecutionStatus;
  result: ExecutionResult | null;
  error: string;
  isConcurrency: boolean;
  topicId: string;
  taskTitle: string;
  taskDoc: string;
  learningRecord: LearningRecord;
  onRevealHint: (count: number) => void;
  onConfidenceChange: (confidence: 1 | 2 | 3) => void;
  onRun: (mode: RunMode) => void;
  onOpenSettings: () => void;
}

const statusCopy: Record<ExecutionStatus, string> = {
  idle: 'Idle',
  preparing: 'Packaging sources',
  running: 'Compiling & running',
  success: 'Success',
  error: 'Error',
};

export function ResultsPanel({
  status,
  result,
  error,
  isConcurrency,
  topicId,
  taskTitle,
  taskDoc,
  learningRecord,
  onRevealHint,
  onConfidenceChange,
  onRun,
  onOpenSettings,
}: ResultsPanelProps) {
  const [tab, setTab] = useState<'coach' | 'tests' | 'console' | 'threads'>('coach');
  const busy = status === 'preparing' || status === 'running';
  const passed = result?.tests.filter((test) => test.passed).length ?? 0;
  const failed = result?.tests.filter((test) => !test.passed).length ?? 0;
  const consoleOutput = useMemo(() => {
    if (error) return error;
    if (!result) return 'Ready. Run code or tests to open a remote Java sandbox.\n\nTip: Ctrl/⌘ + Enter runs the current test suite.';
    return result.rawOutput || 'Process completed without output.';
  }, [error, result]);

  useEffect(() => {
    if (error) setTab('console');
    else if (result) setTab(result.tests.length ? 'tests' : 'console');
  }, [error, result]);

  useEffect(() => setTab('coach'), [taskTitle]);

  return (
    <section className="results-panel">
      <div className="run-actions">
        <button className="run-button secondary-run" disabled={busy} onClick={() => onRun('code')}>
          <Code2 size={16} /> Run code
        </button>
        <button className="run-button primary-run" disabled={busy} onClick={() => onRun('tests')}>
          {busy ? <LoaderCircle className="spin" size={16} /> : <Play size={16} fill="currentColor" />}
          Run tests
        </button>
        <button className="icon-button runner-settings" onClick={onOpenSettings} aria-label="Execution provider settings"><Settings2 size={16} /></button>
      </div>

      <div className={`execution-status status-${status}`}>
        {status === 'idle' && <CircleDashed size={15} />}
        {busy && <LoaderCircle className="spin" size={15} />}
        {status === 'success' && <CheckCircle2 size={15} />}
        {status === 'error' && <AlertCircle size={15} />}
        <div><span>EXECUTION STATUS</span><strong>{statusCopy[status]}</strong></div>
        {result && <code>{result.language} {result.version}</code>}
      </div>

      <div className="result-tabs">
        <button className={tab === 'coach' ? 'is-active' : ''} onClick={() => setTab('coach')}><BrainCircuit size={14} /> Coach</button>
        <button className={tab === 'tests' ? 'is-active' : ''} onClick={() => setTab('tests')}><TestTube2 size={14} /> Tests</button>
        <button className={tab === 'console' ? 'is-active' : ''} onClick={() => setTab('console')}><Terminal size={14} /> Console</button>
        {isConcurrency && <button className={tab === 'threads' ? 'is-active' : ''} onClick={() => setTab('threads')}><CircleDashed size={14} /> Threads</button>}
      </div>

      <div className="results-body">
        {tab === 'coach' && (
          <LearningCoach
            topicId={topicId}
            taskTitle={taskTitle}
            taskDoc={taskDoc}
            record={learningRecord}
            onRevealHint={onRevealHint}
            onConfidenceChange={onConfidenceChange}
          />
        )}
        {tab === 'tests' && (
          <>
            <div className="test-summary">
              <div><span>Passed</span><strong className="success-text">{passed}</strong></div>
              <div><span>Failed</span><strong className={failed ? 'error-text' : ''}>{failed}</strong></div>
              <div><span>Runtime</span><strong>{result ? `${result.durationMs} ms` : '—'}</strong></div>
            </div>
            <div className="test-list">
              {!result?.tests.length && (
                <div className="empty-state"><TestTube2 size={24} /><strong>No test results yet</strong><span>Run the embedded repository test suite.</span></div>
              )}
              {result?.tests.map((test) => {
                const diagnostic = !test.passed ? diagnoseFailure(test, result) : null;
                return (
                  <div key={test.name} className={test.passed ? 'test-card is-pass' : 'test-card is-fail'}>
                    <div className="test-card-main">
                      {test.passed ? <CheckCircle2 size={15} /> : <XCircle size={15} />}
                      <div><strong>{test.name}()</strong>{test.message && <span>{test.message}</span>}</div>
                      <code>{test.durationMs} ms</code>
                    </div>
                    {diagnostic && (
                      <div className="failure-insight">
                        <span>WHY IT LIKELY FAILED</span>
                        <strong>{diagnostic.title}</strong>
                        {diagnostic.expected !== undefined && <div className="expected-actual"><code>expected {diagnostic.expected}</code><code>actual {diagnostic.actual}</code></div>}
                        <p>{diagnostic.explanation}</p>
                        <blockquote>{diagnostic.question}</blockquote>
                      </div>
                    )}
                  </div>
                );
              })}
            </div>
          </>
        )}
        {tab === 'console' && <pre className="terminal-output"><code>{consoleOutput}</code></pre>}
        {tab === 'threads' && isConcurrency && <ThreadStateVisualizer result={result} />}
      </div>
    </section>
  );
}
