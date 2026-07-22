import { DEFAULT_RUNNER_SETTINGS, type RunnerSettings } from '../types/runner';

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

export const preferenceStorage = {
  getTheme: (): 'dark' | 'light' =>
    localStorage.getItem(key('theme')) === 'light' ? 'light' : 'dark',
  setTheme(theme: 'dark' | 'light') {
    localStorage.setItem(key('theme'), theme);
  },
  getRunnerSettings: (): RunnerSettings => ({
    ...DEFAULT_RUNNER_SETTINGS,
    ...readJson<Partial<RunnerSettings>>(key('runner'), {}),
  }),
  setRunnerSettings(settings: RunnerSettings) {
    writeJson(key('runner'), settings);
  },
  getLastTopic: () => localStorage.getItem(key('last-topic')),
  setLastTopic(topicId: string) {
    localStorage.setItem(key('last-topic'), topicId);
  },
};
