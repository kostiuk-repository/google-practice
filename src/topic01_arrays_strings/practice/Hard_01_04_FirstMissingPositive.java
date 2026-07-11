package topic01_arrays_strings.practice;

public class Hard_01_04_FirstMissingPositive {

    /**
     * Drill 4/5 for Hard_01_FirstMissingPositive — First Missing Non-Negative
     * Technique: cyclic sort / index placement, with the target-index formula shifted by
     * one compared to the original problem: instead of placing value x (1 <= x <= n) at
     * index x-1, this variant places value x (0 <= x <= n-1) directly at index x, since
     * the range being tracked now starts at 0 instead of 1.
     *
     * Given an array nums of length n, find the smallest missing non-negative integer
     * (0, 1, 2, ...) using the same in-place swap/placement technique as the original
     * problem, in O(N) time and O(1) extra space.
     *
     * Example:
     * Input: nums = [1,0,2]
     * Output: 3
     * Explanation: 0, 1, and 2 are all present, so the smallest missing non-negative
     * integer is 3.
     *
     * Example 2:
     * Input: nums = [0,1,3]
     * Output: 2
     * Explanation: n = 3, so the tracked range is [0,2]; 3 is out of range and ignored,
     * leaving 2 missing.
     */
    public int firstMissingNonNegative(int[] nums) {
        // TODO: Implement your solution here in O(N) time and O(1) space.
        return 0;
    }
}
