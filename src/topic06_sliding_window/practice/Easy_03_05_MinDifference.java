package topic06_sliding_window.practice;

public class Easy_03_05_MinDifference {

    /**
     * Drill 5/5 for Easy_03_MinDifference — Sum of Differences Across K-Sized Groups
     * Technique: capstone — extends the sort-then-fixed-window technique from Easy_03_MinDifference
     * from "find the ONE best window" to "partition the entire sorted array into consecutive,
     * non-overlapping windows of size k and aggregate a difference metric across ALL of them."
     *
     * Given an integer array nums and an integer k, sort the array, then split it into consecutive
     * groups of k scores each (the final group may have fewer than k scores if nums.length is not
     * divisible by k). Return the sum of (highest - lowest) across all groups.
     *
     * Example:
     * Input: nums = [9,4,1,7,5,2], k = 2
     * Output: 4
     * Explanation: Sorted: [1,2,4,5,7,9]. Groups of 2: [1,2] diff 1, [4,5] diff 1, [7,9] diff 2.
     * Total: 1 + 1 + 2 = 4.
     */
    public int sumOfDifferencesInGroups(int[] nums, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
