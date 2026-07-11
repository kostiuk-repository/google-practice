package topic01_arrays_strings.practice;

public class Medium_04_05_ProductExceptSelf {

    /**
     * Drill 5/5 for Medium_04_ProductExceptSelf — Max Except Self
     * Technique: transplant the prefix-aggregate + suffix-aggregate sweep
     * from the original problem to a different combining function — max
     * instead of product — using a running prefix-max array and a running
     * suffix-max array, combined per index with Math.max instead of
     * multiplication.
     *
     * Given an integer array nums, return an array result where result[i] is
     * equal to the maximum of all elements of nums except nums[i]. Run in
     * O(N) time.
     *
     * Example:
     * Input: nums = [3,1,4,1,5]
     * Output: [5,5,5,5,4]
     * Explanation: excluding index 0 (3), the max of the rest is 5; excluding
     * index 4 (5), the max of the rest is 4.
     */
    public int[] maxExceptSelf(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
