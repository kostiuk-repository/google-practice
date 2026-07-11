package topic01_arrays_strings.practice;

public class Medium_04_ProductExceptSelf {

    /**
     * Problem: Product of Array Except Self
     * 
     * Given an integer array nums, return an array answer such that answer[i] is equal 
     * to the product of all the elements of nums except nums[i].
     * 
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(N) time and without using the division operation.
     * 
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * 
     * Follow-up: Can you solve the problem in O(1) extra space complexity? 
     * (The output array does not count as extra space for space complexity analysis.)
     */
    public int[] productExceptSelf(int[] nums) {
        // TODO: Implement your solution here in O(N) time without division.
        return new int[0];
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
     * Mentor Question: Explain why using the division operator (i.e. computing totalProduct 
     * and then doing totalProduct / nums[i]) fails as a general solution. Think about 
     * what happens when the array contains one or more zeroes.
     * 
     * Your Answer: 
     * 
     */
}
