import { useEffect, useMemo, useRef, useState } from 'react';
import { AlertTriangle, LoaderCircle } from 'lucide-react';
import { Editor } from './components/Editor';
import { Header } from './components/Header';
import { ResultsPanel } from './components/ResultsPanel';
import { SettingsModal } from './components/SettingsModal';
import { TopicNavigator } from './components/TopicNavigator';
import { WorkspaceLayout } from './components/WorkspaceLayout';
import { loadCatalog, loadHarness, loadTopic } from './services/catalog';
import { runJava } from './services/pistonRunner';
import { codeStorage, learningStorage, preferenceStorage, progressStorage } from './services/storage';
import type { CatalogManifest, PracticeTask, TopicContent } from './types/catalog';
import { EMPTY_LEARNING_RECORD, type LearningRecord } from './types/learning';
import {
  DEFAULT_RUNNER_SETTINGS,
  type ExecutionResult,
  type ExecutionStatus,
  type RunMode,
  type RunnerSettings,
} from './types/runner';

function LoadingScreen({ message }: { message: string }) {
  return <div className="app-loading"><LoaderCircle className="spin" size={26} /><strong>{message}</strong></div>;
}

export default function App() {
  const [catalog, setCatalog] = useState<CatalogManifest | null>(null);
  const [topic, setTopic] = useState<TopicContent | null>(null);
  const [topicId, setTopicId] = useState('');
  const [taskId, setTaskId] = useState('');
  const [iterationId, setIterationId] = useState('starter');
  const [code, setCode] = useState('');
  const [saved, setSaved] = useState(true);
  const [completed, setCompleted] = useState(() => progressStorage.getCompleted());
  const [theme, setTheme] = useState<'dark' | 'light'>(() => preferenceStorage.getTheme());
  const [search, setSearch] = useState('');
  const [settingsOpen, setSettingsOpen] = useState(false);
  const [runnerSettings, setRunnerSettings] = useState<RunnerSettings>(() => preferenceStorage.getRunnerSettings());
  const [status, setStatus] = useState<ExecutionStatus>('idle');
  const [result, setResult] = useState<ExecutionResult | null>(null);
  const [runError, setRunError] = useState('');
  const [learningRecord, setLearningRecord] = useState<LearningRecord>(EMPTY_LEARNING_RECORD);
  const [appError, setAppError] = useState('');
  const topicCache = useRef(new Map<string, TopicContent>());

  useEffect(() => {
    document.documentElement.dataset.theme = theme;
    preferenceStorage.setTheme(theme);
  }, [theme]);

  useEffect(() => {
    loadCatalog()
      .then((manifest) => {
        setCatalog(manifest);
        const remembered = preferenceStorage.getLastTopic();
        const initial = manifest.topics.some((candidate) => candidate.id === remembered)
          ? remembered!
          : manifest.topics[0]?.id ?? '';
        setTopicId(initial);
      })
      .catch((error: unknown) => setAppError(error instanceof Error ? error.message : 'Catalog loading failed.'));
  }, []);

  useEffect(() => {
    if (!topicId) return;
    let cancelled = false;
    preferenceStorage.setLastTopic(topicId);
    const cached = topicCache.current.get(topicId);
    const topicPromise = cached ? Promise.resolve(cached) : loadTopic(topicId);
    topicPromise
      .then((content) => {
        if (cancelled) return;
        topicCache.current.set(topicId, content);
        setTopic(content);
        setTaskId(content.tasks[0]?.id ?? '');
        setIterationId('starter');
      })
      .catch((error: unknown) => !cancelled && setAppError(error instanceof Error ? error.message : 'Topic loading failed.'));
    return () => { cancelled = true; };
  }, [topicId]);

  const task = useMemo<PracticeTask | null>(() =>
    topic?.tasks.find((candidate) => candidate.id === taskId) ?? topic?.tasks[0] ?? null,
  [topic, taskId]);
  const iteration = useMemo(() =>
    task?.iterations.find((candidate) => candidate.id === iterationId) ?? task?.iterations[0] ?? null,
  [task, iterationId]);

  useEffect(() => {
    if (!task || !iteration) return;
    setCode(codeStorage.get(task.id, iteration.id, iteration.source));
    setSaved(true);
    setResult(null);
    setRunError('');
    setStatus('idle');
    setLearningRecord(learningStorage.get(task.id, iteration.id));
  }, [task?.id, iteration?.id]);

  useEffect(() => {
    if (!task || !iteration) return;
    setSaved(false);
    const timer = window.setTimeout(() => {
      codeStorage.set(task.id, iteration.id, code);
      setSaved(true);
    }, 350);
    return () => window.clearTimeout(timer);
  }, [code, task?.id, iteration?.id]);

  const totalTasks = catalog?.topics.reduce((sum, item) => sum + item.taskCount, 0) ?? 0;
  const completedModules = catalog?.topics.filter((item) => {
    let count = 0;
    completed.forEach((id) => { if (id.startsWith(`${item.id}/`)) count++; });
    return item.taskCount > 0 && count >= item.taskCount;
  }).length ?? 0;

  const selectTask = (nextTaskId: string) => {
    setTaskId(nextTaskId);
    setIterationId('starter');
  };

  const saveRunnerSettings = (next: RunnerSettings) => {
    const normalized = {
      ...DEFAULT_RUNNER_SETTINGS,
      ...next,
      endpoint: next.endpoint.trim(),
    };
    setRunnerSettings(normalized);
    preferenceStorage.setRunnerSettings(normalized);
  };

  const execute = async (mode: RunMode) => {
    if (!task || !iteration || !code.trim()) return;
    setRunError('');
    setResult(null);
    setStatus('preparing');
    if (mode === 'tests') {
      setLearningRecord((previous) => {
        const next = { ...previous, attempts: previous.attempts + 1, lastAttemptAt: new Date().toISOString() };
        learningStorage.set(task.id, iteration.id, next);
        return next;
      });
    }
    try {
      const harness = await loadHarness();
      setStatus('running');
      const nextResult = await runJava(mode, task, iteration.id, code, harness, runnerSettings);
      setResult(nextResult);
      setStatus(nextResult.ok ? 'success' : 'error');
      if (mode === 'tests' && nextResult.ok && nextResult.tests.length > 0) {
        setLearningRecord((previous) => {
          const next = { ...previous, passed: true };
          learningStorage.set(task.id, iteration.id, next);
          return next;
        });
        setCompleted((previous) => {
          const next = new Set(previous);
          if (iteration.kind === 'task') next.add(task.id);
          progressStorage.setCompleted(next);
          return next;
        });
      }
    } catch (error: unknown) {
      const message = error instanceof DOMException && error.name === 'TimeoutError'
        ? 'Execution request timed out before the selected provider returned a result.'
        : error instanceof Error ? error.message : 'Remote execution failed.';
      setRunError(message);
      setStatus('error');
    }
  };

  const resetCode = () => {
    if (!task || !iteration) return;
    if (!window.confirm('Видалити локальні зміни цієї ітерації та відновити код із репозиторію?')) return;
    codeStorage.reset(task.id, iteration.id);
    setCode(iteration.source);
  };

  const updateLearningRecord = (patch: Partial<LearningRecord>) => {
    if (!task || !iteration) return;
    setLearningRecord((previous) => {
      const next = { ...previous, ...patch };
      learningStorage.set(task.id, iteration.id, next);
      return next;
    });
  };

  if (appError) {
    return <div className="app-fatal"><AlertTriangle size={30} /><h1>Platform failed to start</h1><p>{appError}</p><code>npm run generate:content</code></div>;
  }
  if (!catalog || !topic || !task || !iteration) return <LoadingScreen message="Building your Java workspace…" />;

  return (
    <div className="app-shell">
      <Header
        activeTopic={`${String(topic.number).padStart(2, '0')} · ${topic.title}`}
        completedModules={completedModules}
        completedTasks={completed.size}
        totalTasks={totalTasks}
        theme={theme}
        search={search}
        onSearch={setSearch}
        onToggleTheme={() => setTheme((value) => value === 'dark' ? 'light' : 'dark')}
        onOpenSettings={() => setSettingsOpen(true)}
      />
      <WorkspaceLayout
        learning={
          <TopicNavigator
            topics={catalog.topics}
            activeTopic={topic}
            activeTask={task}
            completed={completed}
            search={search}
            theme={theme}
            onSelectTopic={setTopicId}
            onSelectTask={selectTask}
          />
        }
        editor={
          <Editor
            code={code}
            fileName={iteration.fileName}
            iterations={task.iterations}
            activeIterationId={iteration.id}
            theme={theme}
            saved={saved}
            onChange={setCode}
            onIterationChange={setIterationId}
            onReset={resetCode}
            onRunTests={() => void execute('tests')}
          />
        }
        results={
          <ResultsPanel
            status={status}
            result={result}
            error={runError}
            isConcurrency={topic.track === 'Concurrency'}
            topicId={topic.id}
            taskTitle={task.title}
            taskDoc={task.doc}
            learningRecord={learningRecord}
            onRevealHint={(count) => updateLearningRecord({ hintsRevealed: count })}
            onConfidenceChange={(confidence) => updateLearningRecord({ confidence })}
            onRun={(mode) => void execute(mode)}
            onOpenSettings={() => setSettingsOpen(true)}
          />
        }
      />
      <SettingsModal
        open={settingsOpen}
        settings={runnerSettings}
        onClose={() => setSettingsOpen(false)}
        onSave={saveRunnerSettings}
      />
    </div>
  );
}
