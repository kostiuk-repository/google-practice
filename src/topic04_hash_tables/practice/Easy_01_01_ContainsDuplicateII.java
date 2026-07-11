package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_01_01_ContainsDuplicateII {

    /**
     * Drill 1/5 for Easy_01_ContainsDuplicateII — Nearby Duplicate Indices
     * Technique: HashMap<value, lastSeenIndex> to detect a nearby duplicate — same core map
     * as Easy_01_ContainsDuplicateII, but here you must return the actual index pair instead
     * of a boolean.
     *
     * Given an integer array nums and an integer k, return the indices [i, j] (i < j) of any
     * pair such that nums[i] == nums[j] and j - i <= k. If no such pair exists, return an
     * empty array.
     *
     * Example:
     * Input: nums = [1,2,3,1], k = 3
     * Output: [0,3]
     */
    public int[] nearbyDuplicateIndices(int[] nums, int k) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
