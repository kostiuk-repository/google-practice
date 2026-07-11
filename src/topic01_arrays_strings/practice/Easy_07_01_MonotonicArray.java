package topic01_arrays_strings.practice;

public class Easy_07_01_MonotonicArray {

    /**
     * Drill 1/5 for Easy_07_MonotonicArray — Strictly Monotonic
     * Technique: single pass with two boolean flags (isIncreasing / isDecreasing) that get
     * flipped to false on a violation — same core idea as Easy_07_MonotonicArray, but using
     * strict inequalities so equal adjacent elements now count as violations.
     *
     * An array is strictly monotonic if it is either strictly increasing (nums[i] < nums[i+1]
     * for all consecutive pairs) or strictly decreasing (nums[i] > nums[i+1] for all
     * consecutive pairs). Equal adjacent elements are NOT allowed in either direction.
     *
     * Given an integer array nums, return true if it is strictly monotonic, or false otherwise.
     *
     * Example:
     * Input: nums = [1,2,2,3]
     * Output: false
     * Explanation: nums[1] == nums[2], so it is neither strictly increasing nor strictly decreasing.
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: true
     */
    public boolean isStrictlyMonotonic(int[] nums) {
        // TODO: Implement your solution here.
        return false;
    }
}
