package topic06_sliding_window.practice;

public class Easy_01_05_MaxAverageSubarray {

    /**
     * Drill 5/5 for Easy_01_MaxAverageSubarray — Max Average Subarray in a Circular Array
     * Technique: capstone — combines the fixed-size window sum update from Easy_01_MaxAverageSubarray
     * with circular index wrap-around (mat[(start + i) % n] style addressing), so the window is
     * allowed to wrap from the end of the array back to the beginning.
     *
     * Given an integer array nums (treated as circular, meaning the subarray may wrap past the
     * last element back to index 0) and an integer k, return the maximum average of any
     * contiguous circular subarray of length k.
     *
     * Example:
     * Input: nums = [5,1,2,8,3], k = 3
     * Output: 5.333333333333333
     * Explanation: The circular window starting at index 3, [8,3,5] (wrapping around), has
     * average (8+3+5)/3 = 5.33, which is the highest possible.
     */
    public double maxAverageSubarrayCircular(int[] nums, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
