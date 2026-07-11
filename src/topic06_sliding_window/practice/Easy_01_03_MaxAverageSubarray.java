package topic06_sliding_window.practice;

public class Easy_01_03_MaxAverageSubarray {

    /**
     * Drill 3/5 for Easy_01_MaxAverageSubarray — Count Windows With Average At Least Threshold
     * Technique: same fixed-size window sum update as Easy_01_MaxAverageSubarray, but instead of
     * tracking a single best value we test EVERY window against a threshold and tally how many pass.
     *
     * Given an integer array nums, an integer k, and a double threshold, return the number of
     * contiguous subarrays of length k whose average is greater than or equal to threshold.
     *
     * Example:
     * Input: nums = [1,3,2,6,-1,4,1,8,2], k = 3, threshold = 3.0
     * Output: 4
     * Explanation: Windows [3,2,6] (avg 3.67), [2,6,-1] (avg 2.33, no), [6,-1,4] (avg 3.0),
     * [-1,4,1] (avg 1.33, no), [4,1,8] (avg 4.33), [1,8,2] (avg 3.67) — 4 windows qualify.
     */
    public int countWindowsAverageAtLeast(int[] nums, int k, double threshold) {
        // TODO: Implement your solution here.
        return 0;
    }
}
