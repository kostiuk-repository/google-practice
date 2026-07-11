package topic01_arrays_strings.practice;

public class Medium_04_02_ProductExceptSelf {

    /**
     * Drill 2/5 for Medium_04_ProductExceptSelf — Suffix Product Array
     * Technique: isolate the SECOND of the two sweeps used in the original
     * problem — a running suffix aggregate, accumulated right to left, with
     * the last slot seeded as the identity value (1 for multiplication) since
     * there is nothing after the last index.
     *
     * Given an integer array nums, return an array result where result[i] is
     * the product of all elements AFTER index i (result[nums.length - 1] = 1,
     * since there are no elements after the last index).
     *
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [24,12,4,1]
     * Explanation: result[3]=1 (empty product), result[2]=4, result[1]=3*4=12,
     * result[0]=2*3*4=24.
     */
    public int[] suffixProduct(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
