package topic04_hash_tables;

import java.util.HashMap;
import java.util.Map;

/**
 * Example Problem: Two Sum
 * 
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use 
 * the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Example {

    public int[] twoSum(int[] nums, int target) {
        // =========================================================================
        // STEP 1: CLARIFICATION & CONSTRAINTS (Gathering requirements)
        // =========================================================================
        // - "Can elements be negative?" -> Yes, inputs can be negative, positive, or zero.
        // - "Is the input array sorted?" -> No, unsorted.
        // - "Are we guaranteed to find a solution?" -> Yes, the problem assumes exactly one solution.
        // - "Can we use the same index twice?" -> No, the two indices must be distinct.
        // - "What are the size constraints?" -> Array length is between 2 and 10^4.
        
        // =========================================================================
        // STEP 2: GUARD CLAUSES / EDGE CASES (Handling invalid/extreme inputs)
        // =========================================================================
        if (nums == null || nums.length < 2) {
            return new int[0];
        }

        // =========================================================================
        // STEP 3: HIGH-LEVEL ALGORITHM & COMPLEXITY DESIGN
        // =========================================================================
        // Naive Approach: Double nested loop checking every pair. Time: O(N^2), Space: O(1).
        
        // HashMap Lookup Approach (Optimal):
        // We can traverse the array and look for the complement of the current number (target - nums[i]).
        // - If the complement is already in our map, we have found the pair! We return [map.get(complement), i].
        // - If not, we add the current number and its index to the map.
        //
        // Why this works: We only need to check what we've "seen" so far. 
        // If the solution pair is [A, B], when we visit B, A will already be stored in the map.
        // Time Complexity: O(N) since we perform a single pass and HashMap lookups are O(1) on average.
        // Space Complexity: O(N) to store elements in the HashMap.

        // =========================================================================
        // STEP 4: CLEAN IMPLEMENTATION
        // =========================================================================
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i}; // Found the pair!
            }

            seen.put(nums[i], i); // Store current number and its index
        }

        return new int[0]; // Fallback in case no solution is found
    }

    // =========================================================================
    // STEP 5: DRY RUN / TESTING (Walkthrough with sample inputs)
    // =========================================================================
    /*
     * Test Case 1: nums = [2, 11, 7, 15], target = 9
     * - seen = {}
     * 
     * - i = 0: nums[0] = 2. complement = 9 - 2 = 7.
     *     seen.containsKey(7) -> false.
     *     seen.put(2, 0) -> seen = {2: 0}
     * 
     * - i = 1: nums[1] = 11. complement = 9 - 11 = -2.
     *     seen.containsKey(-2) -> false.
     *     seen.put(11, 1) -> seen = {2: 0, 11: 1}
     * 
     * - i = 2: nums[2] = 7. complement = 9 - 7 = 2.
     *     seen.containsKey(2) -> true!
     *     Returns: [seen.get(2), 2] -> [0, 2]
     * - Status: Success!
     */
}
