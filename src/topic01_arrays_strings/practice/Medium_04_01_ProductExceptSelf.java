package topic01_arrays_strings.practice;

public class Medium_04_01_ProductExceptSelf {

    /**
     * Drill 1/5 for Medium_04_ProductExceptSelf — Prefix Product Array
     * Technique: isolate just the FIRST of the two sweeps used in the
     * original problem — a running prefix aggregate, accumulated left to
     * right, with result[0] seeded as the identity value (1 for
     * multiplication) since there is nothing before index 0.
     *
     * Given an integer array nums, return an array result where result[i] is
     * the product of all elements BEFORE index i (result[0] = 1, since there
     * are no elements before index 0).
     *
     * Example:
     * Input: nums = [1,2,3,4]
     * Output: [1,1,2,6]
     * Explanation: result[0]=1 (empty product), result[1]=1, result[2]=1*2=2,
     * result[3]=1*2*3=6.
     */
    public int[] prefixProduct(int[] nums) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
