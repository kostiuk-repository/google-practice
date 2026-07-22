import { describe, expect, it } from 'vitest';
import { buildDrillExampleContract } from './drillContracts';
import type { Iteration, PracticeTask } from '../types/catalog';

const iteration: Iteration = {
  id: 'v1',
  kind: 'drill',
  order: 1,
  label: 'Drill 01 · Running Sum',
  fileName: 'Easy_01_01_Sample.java',
  sourcePath: 'src/topic01/practice/Easy_01_01_Sample.java',
  source: `package topic01.practice;
public class Easy_01_01_Sample {
  /**
   * Input: nums = [1,2,3,4]
   * Output: [1,3,6,10]
   */
  public int[] runningSum(int[] nums) { return new int[0]; }
}`,
};

const task = {
  id: 'topic01/sample',
  packageName: 'topic01.practice',
} as PracticeTask;

describe('buildDrillExampleContract', () => {
  it('generates a real array assertion from JavaDoc Input/Output', () => {
    const contract = buildDrillExampleContract(task, iteration);
    expect(contract?.name).toBe('Generated_Easy_01_01_Sample_ContractTest.java');
    expect(contract?.content).toContain('assertArrayEquals(new int[]{1,3,6,10}');
    expect(contract?.content).toContain('testDrill01_ExampleContract');
  });

  it('refuses to claim coverage when no expected output exists', () => {
    expect(buildDrillExampleContract(task, { ...iteration, source: iteration.source.replace('Output:', 'Result:') })).toBeNull();
  });
});
