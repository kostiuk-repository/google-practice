package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_01_02_ContainsDuplicateII {

    /**
     * Drill 2/5 for Easy_01_ContainsDuplicateII — Minimum Distance Between Duplicates
     * Technique: HashMap<value, lastSeenIndex>, but instead of checking against a fixed k,
     * track the smallest gap found across ALL duplicate pairs — this is the value of k at
     * which Easy_01_ContainsDuplicateII would first start returning true.
     *
     * Given an integer array nums, return the minimum distance abs(i - j) between any two
     * indices i != j such that nums[i] == nums[j]. If no value repeats, return -1.
     *
     * Example:
     * Input: nums = [1,3,2,1,5,3]
     * Output: 3
     * Explanation: value 1 repeats at distance 3 (indices 0 and 3); value 3 repeats at
     * distance 3 (indices 1 and 5). The minimum is 3.
     */
    public int minDistanceBetweenDuplicates(int[] nums) {
        // TODO: Implement your solution here.
        return -1;
    }
}
