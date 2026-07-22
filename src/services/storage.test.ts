import { describe, expect, it } from 'vitest';
import { codeStorage, learningStorage, preferenceStorage, workspaceStorage } from './storage';
import { DEFAULT_RUNNER_SETTINGS } from '../types/runner';

describe('workspaceStorage', () => {
  it('exports code and learning progress without runner credentials', () => {
    codeStorage.set('topic/task', 'v1', 'class Solution {}');
    learningStorage.set('topic/task', 'v1', { attempts: 2, passed: true, hintsRevealed: 1, confidence: 3 });
    preferenceStorage.setRunnerSettings({ ...DEFAULT_RUNNER_SETTINGS, authHeaderValue: 'secret-token' });
    const snapshot = workspaceStorage.exportSnapshot();
    expect(Object.values(snapshot.entries).join('\n')).toContain('class Solution');
    expect(JSON.stringify(snapshot)).not.toContain('secret-token');
    expect(Object.keys(snapshot.entries).some((key) => key.endsWith(':runner'))).toBe(false);
  });

  it('imports a valid snapshot', () => {
    workspaceStorage.importSnapshot({ schemaVersion: 1, exportedAt: new Date().toISOString(), entries: { 'java-lab:v1:completed': '["task"]' } });
    expect(localStorage.getItem('java-lab:v1:completed')).toBe('["task"]');
  });
});
