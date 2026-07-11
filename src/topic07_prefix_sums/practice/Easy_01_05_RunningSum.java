package topic07_prefix_sums.practice;

public class Easy_01_05_RunningSum {

    /**
     * Drill 5/5 for Easy_01_RunningSum — Build Once, Query Range Sums Many Times
     * Technique: capstone — build a padded prefix-sum array (prefix[0] = 0) ONCE, then
     * reuse it to answer many range-sum queries in O(1) each, foreshadowing Range Sum Query.
     *
     * Given an array nums and a list of queries where each query is a pair [left, right],
     * build the prefix sum array once, then for each query return the sum of
     * nums[left..right] inclusive, computed via prefix-array differences instead of
     * re-summing the range from scratch each time. Return an array of answers, one per query.
     *
     * Example:
     * Input: nums = [1,2,3,4,5], queries = [[0,1],[1,3],[0,4]]
     * Output: [3,9,15]
     */
    public int[] answerRangeSumQueries(int[] nums, int[][] queries) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
