package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_01_03_ContainsDuplicateII {

    /**
     * Drill 3/5 for Easy_01_ContainsDuplicateII — Count Nearby Duplicate Pairs
     * Technique: same HashMap<value, lastSeenIndex> nearby-duplicate check as
     * Easy_01_ContainsDuplicateII, but instead of stopping at the first match, keep scanning
     * and tally every qualifying pair.
     *
     * Given an integer array nums and an integer k, return the total number of pairs (i, j)
     * with i < j such that nums[i] == nums[j] and j - i <= k.
     *
     * Example:
     * Input: nums = [1,2,1,1], k = 2
     * Output: 2
     * Explanation: (0,2) has distance 2 and (2,3) has distance 1. (0,3) has distance 3 > 2,
     * so it does not count.
     */
    public int countNearbyDuplicatePairs(int[] nums, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
