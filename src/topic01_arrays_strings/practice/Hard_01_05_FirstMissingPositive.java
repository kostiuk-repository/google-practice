package topic01_arrays_strings.practice;

public class Hard_01_05_FirstMissingPositive {

    /**
     * Drill 5/5 for Hard_01_FirstMissingPositive — Find Missing And Duplicate
     * Technique: cyclic sort / index placement — same swap-into-home-index-x-1 pass as
     * the original problem, then the final scan looks for the one index i where
     * nums[i] != i+1: the value found there tells you the duplicate, and the expected
     * value i+1 tells you the missing number (the classic "Set Mismatch" problem).
     *
     * An array nums of length n originally contained each integer from 1 to n exactly
     * once, but one number got duplicated, overwriting another number which is now
     * missing. Using the same in-place swap/placement technique as the original problem,
     * in O(N) time and O(1) extra space, return an int[2] = [duplicateNumber,
     * missingNumber].
     *
     * Example:
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     * Explanation: 2 is duplicated, and 3 is missing.
     */
    public int[] findMissingAndDuplicate(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) space.
        return new int[0];
    }
}
