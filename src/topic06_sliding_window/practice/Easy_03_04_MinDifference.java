package topic06_sliding_window.practice;

public class Easy_03_04_MinDifference {

    /**
     * Drill 4/5 for Easy_03_MinDifference — Largest Window Within a Difference Limit
     * Technique: inversion of Easy_03_MinDifference — instead of fixing the window size k and
     * minimizing the difference, we fix a maximum allowed difference (limit) and instead grow a
     * VARIABLE-size window over the sorted array to find how large it can get while staying valid.
     *
     * Given an integer array nums and an integer limit, sort the array, then find the maximum
     * number of scores you can include in one contiguous (in sorted order) window such that the
     * difference between the highest and lowest score in that window is at most limit.
     *
     * Example:
     * Input: nums = [1,4,7,8,10], limit = 3
     * Output: 3
     * Explanation: Sorted: [1,4,7,8,10]. The window [7,8,10] has diff 3 (allowed) and size 3,
     * which is the largest valid window; e.g. [4,7,8] has diff 4, which exceeds the limit.
     */
    public int maxWindowWithinLimit(int[] nums, int limit) {
        // TODO: Implement your solution here.
        return 0;
    }
}
