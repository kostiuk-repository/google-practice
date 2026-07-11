package topic06_sliding_window.practice;

public class Easy_03_03_MinDifference {

    /**
     * Drill 3/5 for Easy_03_MinDifference — Minimum Difference for Every K
     * Technique: same sort-then-slide-fixed-window technique as Easy_03_MinDifference, but
     * generalized: instead of one fixed k, we run the windowing step once for EACH possible k
     * from 1 to n and collect all the results.
     *
     * Given an integer array nums of length n, sort it, then for every k from 1 to n compute the
     * minimum difference between the highest and lowest of k consecutive scores (as in
     * Easy_03_MinDifference). Return an array result of length n where result[k-1] holds that
     * minimum difference for that k.
     *
     * Example:
     * Input: nums = [9,4,1,7]
     * Output: [0,2,5,8]
     * Explanation: Sorted: [1,4,7,9]. k=1: any single score, diff 0. k=2: best window [7,9], diff 2.
     * k=3: best window [4,7,9], diff 5. k=4: only window [1,4,7,9], diff 8.
     */
    public int[] minimumDifferenceForEveryK(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
