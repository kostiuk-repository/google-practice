export type RunMode = 'code' | 'tests';
export type ExecutionStatus = 'idle' | 'preparing' | 'running' | 'success' | 'error';

export interface RunnerSettings {
  endpoint: string;
  runtimeVersion: string;
  authHeaderName: string;
  authHeaderValue: string;
  compileTimeoutMs: number;
  runTimeoutMs: number;
}

export interface TestResult {
  name: string;
  passed: boolean;
  durationMs: number;
  message?: string;
}

export interface ExecutionResult {
  ok: boolean;
  language: string;
  version: string;
  compileOutput: string;
  stdout: string;
  stderr: string;
  exitCode: number | null;
  signal: string | null;
  durationMs: number;
  tests: TestResult[];
  rawOutput: string;
}

export const DEFAULT_RUNNER_SETTINGS: RunnerSettings = {
  endpoint: 'https://emkc.org/api/v2/piston/execute',
  runtimeVersion: '*',
  authHeaderName: 'Authorization',
  authHeaderValue: '',
  compileTimeoutMs: 15_000,
  runTimeoutMs: 8_000,
};
