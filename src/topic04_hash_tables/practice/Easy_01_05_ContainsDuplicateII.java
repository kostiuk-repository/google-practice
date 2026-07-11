package topic04_hash_tables.practice;

import java.util.TreeMap;

public class Easy_01_05_ContainsDuplicateII {

    /**
     * Drill 5/5 for Easy_01_ContainsDuplicateII — Nearby Almost-Duplicate (Contains Duplicate III)
     * Technique: capstone — extends the sliding-window idea from Easy_01_ContainsDuplicateII
     * (window of size k on the index axis) with a second tolerance window on the VALUE axis:
     * instead of exact equality, values only need to be within t of each other. A HashSet no
     * longer suffices; you need a value-ordered structure (e.g. bucketing by (t+1) or a
     * TreeMap) to query "is there a value within t" in better than O(k) per step.
     *
     * Given an integer array nums and integers indexDiff (k) and valueDiff (t), return true if
     * there exist two distinct indices i and j such that abs(i - j) <= indexDiff and
     * abs(nums[i] - nums[j]) <= valueDiff.
     *
     * Example:
     * Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
     * Output: true
     * Explanation: nums[0] = 1 and nums[3] = 1 are equal (within valueDiff) but too far apart
     * (index distance 3 > 2). However nums[1] = 5 and nums[4] = 5 are equal and index distance
     * is 3 too. Consider nums[0]=1 and value window: need a pair with both constraints
     * satisfied; e.g. nums = [1,2,3,1], indexDiff=3, valueDiff=0 gives true via indices 0 and 3.
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // TODO: Implement your solution here.
        return false;
    }
}
