package topic01_arrays_strings.practice;

public class Medium_04_04_ProductExceptSelf {

    /**
     * Drill 4/5 for Medium_04_ProductExceptSelf — Product Except Self, Constant Space
     * Technique: the exact original problem, but implementing its own
     * follow-up: build the output array as the prefix-product array first (one
     * left-to-right pass, written directly into the output), then sweep once
     * more from the right, multiplying a single running suffix variable
     * directly into the output array in place — no separate suffix array is
     * ever allocated, so extra space is O(1) (the output array itself does not
     * count).
     *
     * Given an integer array nums, return an array answer such that answer[i]
     * is equal to the product of all elements of nums except nums[i]. Do not
     * use division, run in O(N) time, and use only O(1) EXTRA space beyond
     * the output array.
     *
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     */
    public int[] productExceptSelfConstantSpace(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
