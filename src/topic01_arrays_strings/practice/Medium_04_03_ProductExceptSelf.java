package topic01_arrays_strings.practice;

public class Medium_04_03_ProductExceptSelf {

    /**
     * Drill 3/5 for Medium_04_ProductExceptSelf — Sum Except Self
     * Technique: the same prefix-aggregate + suffix-aggregate sweep as the
     * original problem, but with addition standing in for multiplication (and
     * 0 as the identity value instead of 1) — a sanity-check mirror that
     * confirms the technique generalizes to any associative combining
     * operation, not just products.
     *
     * Given an integer array nums, return an array result where result[i] is
     * equal to the sum of all elements of nums except nums[i]. Do not use
     * division, and run in O(N) time.
     *
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [9,8,7,6]
     * Explanation: total sum is 10; result[i] = 10 - nums[i] computed via
     * prefix-sum + suffix-sum sweep rather than a single subtraction.
     */
    public int[] sumExceptSelf(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
