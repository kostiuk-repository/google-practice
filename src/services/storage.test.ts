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

  it('uses readable display defaults and clamps editor font size', () => {
    expect(preferenceStorage.getDisplaySettings()).toEqual({ uiFontSize: 'comfortable', editorFontSize: 14 });
    localStorage.setItem('java-lab:v1:display', JSON.stringify({ uiFontSize: 'large', editorFontSize: 99 }));
    expect(preferenceStorage.getDisplaySettings()).toEqual({ uiFontSize: 'large', editorFontSize: 20 });
  });
});
