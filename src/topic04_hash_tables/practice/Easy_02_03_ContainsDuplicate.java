package topic04_hash_tables.practice;

import java.util.HashSet;
import java.util.Set;

public class Easy_02_03_ContainsDuplicate {

    /**
     * Drill 3/5 for Easy_02_ContainsDuplicate — First Repeated Element
     * Technique: same "add to HashSet, check membership before adding" scan as
     * Easy_02_ContainsDuplicate, but the answer depends on SCAN ORDER — you must return the
     * value of the first element that is a repeat when scanning left to right, not merely
     * whether one exists.
     *
     * Given an integer array nums, return the value of the first element (scanning left to
     * right) that has already appeared earlier in the array. If no element repeats, return -1.
     *
     * Example:
     * Input: nums = [5,1,3,1,5,7]
     * Output: 1
     * Explanation: 1 at index 3 is the first element seen again (its earlier occurrence was
     * at index 1), even though 5 repeats too (at index 4, later).
     */
    public int firstRepeatedElement(int[] nums) {
        // TODO: Implement your solution here.
        return -1;
    }
}
