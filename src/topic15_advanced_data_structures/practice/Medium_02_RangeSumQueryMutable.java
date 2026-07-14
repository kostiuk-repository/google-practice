package topic15_advanced_data_structures.practice;

public class Medium_02_RangeSumQueryMutable {

    public Medium_02_RangeSumQueryMutable() {}

    public Medium_02_RangeSumQueryMutable(int[] nums) {
        // TODO: Initialize your mutable range-sum data structure here.
    }

    public void update(int index, int val) {
        // TODO: Implement your solution here.
    }

        /**
     * Problem: Range Sum Query - Mutable
     *
     * Given an integer array nums, handle multiple queries of the following types:
     *
     *   - Update the value of an element in nums.
     *   - Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
     *
     * Implement the NumArray class:
     *
     *   - NumArray(int[] nums) Initializes the object with the integer array nums.
     *   - void update(int index, int val) Updates the value of nums[index] to be val.
     *   - int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     *
     * Example 1:
     * Input
     * ["NumArray", "sumRange", "update", "sumRange"]
     * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
     * Output
     * [null, 9, null, 8]
     *
     * Explanation
     * NumArray numArray = new NumArray([1, 3, 5]);
     * numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
     * numArray.update(1, 2); // nums = [1, 2, 5]
     * numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
     *
     * Constraints:
     *
     *   - 1 <= nums.length <= 3 * 10^4
     *   - -100 <= nums[i] <= 100
     *   - 0 <= index < nums.length
     *   - -100 <= val <= 100
     *   - 0 <= left <= right < nums.length
     *   - At most 3 * 10^4 calls will be made to update and sumRange.
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
     * Mentor Question: Порівняйте часову складність оновлення та запиту суми для Segment Tree та Binary Indexed Tree (Fenwick).
     * 
     * Your Answer: 
     * 
     */
}
