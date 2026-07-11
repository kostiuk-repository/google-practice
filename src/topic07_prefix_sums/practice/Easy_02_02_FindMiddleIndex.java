package topic07_prefix_sums.practice;

public class Easy_02_02_FindMiddleIndex {

    /**
     * Drill 2/5 for Easy_02_FindMiddleIndex — Middle Index From a Precomputed Prefix Array
     * Technique: separate the BUILD step from the QUERY step — build the prefix sum array
     * once, then scan it to find the middle index, instead of recomputing sums on the fly.
     *
     * Given an array nums, first build its prefix sum array (prefix[i] = sum of nums[0..i]),
     * then use that prefix array to find and return the first index i where the sum of
     * elements before i equals the sum of elements after i. Return -1 if none exists.
     *
     * Example:
     * Input: nums = [1,7,3,6,5,6]
     * Output: 3
     * Explanation: prefix = [1,8,11,17,22,28]. At i=3: left = prefix[2] = 11,
     * right = prefix[5] - prefix[3] = 28 - 17 = 11.
     */
    public int findMiddleIndexFromPrefix(int[] nums) {
        // TODO: Implement your solution here.
        return -1;
    }
}
