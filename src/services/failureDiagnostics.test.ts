import { describe, expect, it } from 'vitest';
import { diagnoseFailure } from './failureDiagnostics';
import type { ExecutionResult, TestResult } from '../types/runner';

const result = { compileOutput: '', stderr: '' } as ExecutionResult;

describe('diagnoseFailure', () => {
  it('extracts expected and actual values', () => {
    const test = { message: 'expected: <7> but was: <5>' } as TestResult;
    expect(diagnoseFailure(test, result)).toMatchObject({ expected: '7', actual: '5' });
  });

  it('recognizes boundary errors', () => {
    const test = { message: 'java.lang.ArrayIndexOutOfBoundsException: Index 5' } as TestResult;
    expect(diagnoseFailure(test, result).title).toContain('межі');
  });

  it('does not present compile-only drill coverage as a solution failure', () => {
    const test = { message: 'No embedded assertion targets this drill iteration.' } as TestResult;
    expect(diagnoseFailure(test, result).title).toContain('correctness contract');
  });
});
