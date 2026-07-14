package topic15_advanced_data_structures.practice;

public class Easy_01_RangeSumQuery {

    public Easy_01_RangeSumQuery() {}

    public Easy_01_RangeSumQuery(int[] nums) {
        // TODO: Initialize your prefix-sum data structure here.
    }

        /**
     * Problem: Range Sum Query - Immutable
     *
     * Given an integer array nums, handle multiple queries of the following type:
     *
     *   - Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
     *
     * Implement the NumArray class:
     *
     *   - NumArray(int[] nums) Initializes the object with the integer array nums.
     *   - int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     *
     * Example 1:
     * Input
     * ["NumArray", "sumRange", "sumRange", "sumRange"]
     * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
     * Output
     * [null, 1, -1, -3]
     *
     * Explanation
     * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
     * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
     * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
     * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
     *
     * Constraints:
     *
     *   - 1 <= nums.length <= 10^4
     *   - -10^5 <= nums[i] <= 10^5
     *   - 0 <= left <= right < nums.length
     *   - At most 10^4 calls will be made to sumRange.
     */
    public int sumRange(int left, int right) {
        // TODO: Implement your solution here.
        return 0;
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: Чому префіксний масив є окремим спрощеним випадком дерева сегментів?
     * 
     * Your Answer: 
     * 
     */
}
