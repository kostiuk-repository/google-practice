package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Easy_02_05_ContainsDuplicate {

    /**
     * Drill 5/5 for Easy_02_ContainsDuplicate — Almost Distinct (Remove At Most One)
     * Technique: capstone — builds a full frequency HashMap like Easy_02_ContainsDuplicate's
     * membership check, but now tolerates a bounded amount of "duplicate-ness": the array only
     * needs to become duplicate-free after removing AT MOST one element.
     *
     * Given an integer array nums, return true if it is possible to remove at most one
     * element from nums so that all remaining elements are distinct.
     *
     * Example:
     * Input: nums = [1,2,3,2,4]
     * Output: true
     * Explanation: removing one of the two 2's leaves all-distinct elements.
     *
     * Example 2:
     * Input: nums = [1,1,2,2]
     * Output: false
     * Explanation: two separate values each repeat; removing a single element cannot fix both.
     */
    public boolean canBeDistinctAfterOneRemoval(int[] nums) {
        // TODO: Implement your solution here.
        return false;
    }
}
