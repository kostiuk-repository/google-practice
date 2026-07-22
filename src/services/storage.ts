import { DEFAULT_RUNNER_SETTINGS, type RunnerSettings } from '../types/runner';
import { EMPTY_LEARNING_RECORD, type LearningRecord } from '../types/learning';

const PREFIX = 'java-lab:v1';
const key = (suffix: string) => `${PREFIX}:${suffix}`;

function readJson<T>(storageKey: string, fallback: T): T {
  try {
    const raw = localStorage.getItem(storageKey);
    return raw ? (JSON.parse(raw) as T) : fallback;
  } catch {
    return fallback;
  }
}

function writeJson(storageKey: string, value: unknown) {
  try {
    localStorage.setItem(storageKey, JSON.stringify(value));
  } catch {
    // Private mode or a full quota must not make the editor unusable.
  }
}

export const codeStorage = {
  get(taskId: string, iterationId: string, fallback: string) {
    return localStorage.getItem(key(`code:${taskId}:${iterationId}`)) ?? fallback;
  },
  set(taskId: string, iterationId: string, source: string) {
    try {
      localStorage.setItem(key(`code:${taskId}:${iterationId}`), source);
    } catch {
      // Autosave is best-effort.
    }
  },
  reset(taskId: string, iterationId: string) {
    localStorage.removeItem(key(`code:${taskId}:${iterationId}`));
  },
};

export const progressStorage = {
  getCompleted: () => new Set(readJson<string[]>(key('completed'), [])),
  setCompleted(completed: Set<string>) {
    writeJson(key('completed'), [...completed]);
  },
};

export const learningStorage = {
  get(taskId: string, iterationId: string): LearningRecord {
    return {
      ...EMPTY_LEARNING_RECORD,
      ...readJson<Partial<LearningRecord>>(key(`learning:${taskId}:${iterationId}`), {}),
    };
  },
  set(taskId: string, iterationId: string, record: LearningRecord) {
    writeJson(key(`learning:${taskId}:${iterationId}`), record);
  },
};

export interface WorkspaceSnapshot {
  schemaVersion: 1;
  exportedAt: string;
  entries: Record<string, string>;
}

export const workspaceStorage = {
  exportSnapshot(): WorkspaceSnapshot {
    const entries: Record<string, string> = {};
    for (let index = 0; index < localStorage.length; index++) {
      const storageKey = localStorage.key(index);
      if (!storageKey?.startsWith(`${PREFIX}:`) || storageKey === key('runner')) continue;
      const value = localStorage.getItem(storageKey);
      if (value !== null) entries[storageKey] = value;
    }
    return { schemaVersion: 1, exportedAt: new Date().toISOString(), entries };
  },
  importSnapshot(snapshot: WorkspaceSnapshot) {
    if (snapshot.schemaVersion !== 1 || !snapshot.entries || typeof snapshot.entries !== 'object') {
      throw new Error('Unsupported or invalid progress file.');
    }
    const serializedSize = JSON.stringify(snapshot).length;
    if (serializedSize > 5_000_000) throw new Error('Progress file is larger than 5 MB.');
    Object.entries(snapshot.entries).forEach(([storageKey, value]) => {
      if (!storageKey.startsWith(`${PREFIX}:`) || storageKey === key('runner') || typeof value !== 'string') return;
      localStorage.setItem(storageKey, value);
    });
  },
};

export const preferenceStorage = {
  getTheme: (): 'dark' | 'light' =>
    localStorage.getItem(key('theme')) === 'light' ? 'light' : 'dark',
  setTheme(theme: 'dark' | 'light') {
    localStorage.setItem(key('theme'), theme);
  },
  getRunnerSettings: (): RunnerSettings => {
    const stored = readJson<Partial<RunnerSettings>>(key('runner'), {});
    const legacyProvider = !stored.provider && stored.endpoint?.includes('piston') ? 'piston' : undefined;
    return {
      ...DEFAULT_RUNNER_SETTINGS,
      ...stored,
      provider: stored.provider ?? legacyProvider ?? DEFAULT_RUNNER_SETTINGS.provider,
    };
  },
  setRunnerSettings(settings: RunnerSettings) {
    writeJson(key('runner'), settings);
  },
  getLastTopic: () => localStorage.getItem(key('last-topic')),
  setLastTopic(topicId: string) {
    localStorage.setItem(key('last-topic'), topicId);
  },
};
