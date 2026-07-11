package topic07_prefix_sums.practice;

public class Easy_02_05_FindMiddleIndex {

    /**
     * Drill 5/5 for Easy_02_FindMiddleIndex — Closest-to-Balanced Index
     * Technique: capstone — extend the exact-match leftSum == rightSum check from
     * Easy_02_FindMiddleIndex into an optimization: when no exact middle index exists,
     * find the index that gets closest to balanced.
     *
     * Given an array nums, return the index i that minimizes the absolute difference
     * between the sum of elements to its left and the sum of elements to its right.
     * If multiple indices tie for the minimum difference, return the smallest such index.
     *
     * Example:
     * Input: nums = [1,2,3,10]
     * Output: 3
     * Explanation: index 0: |0-15|=15. index 1: |1-13|=12. index 2: |3-10|=7.
     * index 3: |6-0|=6. The smallest difference (6) occurs at index 3.
     */
    public int closestBalancedIndex(int[] nums) {
        // TODO: Implement your solution here.
        return -1;
    }
}
