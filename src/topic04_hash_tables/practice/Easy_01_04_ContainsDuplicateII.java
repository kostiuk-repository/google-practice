package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_01_04_ContainsDuplicateII {

    /**
     * Drill 4/5 for Easy_01_ContainsDuplicateII — Nearby Duplicate Across Two Arrays
     * Technique: the same value -> last-seen-index HashMap idea from
     * Easy_01_ContainsDuplicateII, but now the map is built from a SECOND array so lookups
     * cross between two collections instead of within one.
     *
     * Given two integer arrays nums1 and nums2 (same length, representing values recorded
     * at the same sequence of time slots) and an integer k, return true if there exists a
     * value v with index i in nums1 and index j in nums2 such that nums1[i] == nums2[j] == v
     * and abs(i - j) <= k.
     *
     * Example:
     * Input: nums1 = [1,2,3,4], nums2 = [9,9,2,9], k = 1
     * Output: true
     * Explanation: nums1[1] = 2 and nums2[2] = 2, with abs(1 - 2) = 1 <= k.
     */
    public boolean containsNearbyDuplicateAcrossArrays(int[] nums1, int[] nums2, int k) {
        // TODO: Implement your solution here.
        return false;
    }
}
