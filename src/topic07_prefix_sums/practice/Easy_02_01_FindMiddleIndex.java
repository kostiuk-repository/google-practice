package topic07_prefix_sums.practice;

public class Easy_02_01_FindMiddleIndex {

    /**
     * Drill 1/5 for Easy_02_FindMiddleIndex — Count All Middle Indices
     * Technique: same leftSum/rightSum prefix decomposition as Easy_02_FindMiddleIndex,
     * but instead of stopping at the first match, keep scanning and count every match.
     *
     * Given an array nums, an index i is a "middle index" if the sum of all elements
     * to its left equals the sum of all elements to its right. Return the COUNT of how
     * many middle indices exist in nums (there can be more than one).
     *
     * Example:
     * Input: nums = [2,3,-1,8,4]
     * Output: 1
     * Explanation: Only index 3 works (left = 2+3-1 = 4, right = 4).
     *
     * Example 2:
     * Input: nums = [0,0,0,0]
     * Output: 4
     * Explanation: leftSum == rightSum == 0 at every index.
     */
    public int countMiddleIndices(int[] nums) {
        // TODO: Implement your solution here.
        return 0;
    }
}
