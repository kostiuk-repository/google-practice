package topic05_two_pointers;

/**
 * Example Problem: Two Sum II - Input Array Is Sorted
 * 
 * Problem Statement:
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Return the 1-indexed indices of the two numbers [index1, index2] as an integer array of size 2.
 * 
 * Constraint: You may not use the same element twice. Your solution must use only O(1) constant extra space.
 */
public class Example {

    public int[] twoSum(int[] numbers, int target) {
        // =========================================================================
        // STEP 1: CLARIFICATION & CONSTRAINTS (Gathering requirements)
        // =========================================================================
        // - "Is the input array guaranteed to be sorted?" -> Yes, non-decreasing order.
        // - "Can we have negative numbers?" -> Yes, numbers can be negative, zero, or positive.
        // - "Is there always exactly one unique solution?" -> Let's assume yes (typical for this problem).
        // - "What should we return if no solution exists?" -> Return an empty array or throw an exception.
        // - "Can we use the same index twice?" -> No, the problem specifies index1 != index2.
        // - "Are the returned indices 1-indexed?" -> Yes, so we need to add 1 to our array indices.
        // - "What are the size constraints?" -> Array length is between 2 and 3 * 10^4.
        
        // =========================================================================
        // STEP 2: GUARD CLAUSES / EDGE CASES (Handling invalid/extreme inputs)
        // =========================================================================
        if (numbers == null || numbers.length < 2) {
            return new int[0]; // Invalid input, cannot find a pair
        }

        // =========================================================================
        // STEP 3: HIGH-LEVEL ALGORITHM & COMPLEXITY DESIGN
        // =========================================================================
        // Naive Approach: Nested loops checking all pairs. Time: O(N^2), Space: O(1).
        // HashMap Approach: Store seen elements and their indices. Time: O(N), Space: O(N).
        // Two Pointers Approach (Optimal):
        // Since the array is sorted, we can place one pointer at the start (left) and one at the end (right).
        // - If numbers[left] + numbers[right] == target: We found the pair! Return [left + 1, right + 1].
        // - If sum < target: Since the array is sorted, we need a larger sum. Move left pointer right (left++).
        // - If sum > target: We need a smaller sum. Move right pointer left (right--).
        // Time Complexity: O(N) because we visit each element at most once.
        // Space Complexity: O(1) auxiliary space as we only use two integer pointers.

        // =========================================================================
        // STEP 4: CLEAN IMPLEMENTATION
        // =========================================================================
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1}; // Found the solution (1-indexed)
            } else if (currentSum < target) {
                left++; // Sum is too small, move left pointer right to increase sum
            } else {
                right--; // Sum is too large, move right pointer left to decrease sum
            }
        }

        return new int[0]; // Fallback in case no solution is found
    }

    // =========================================================================
    // STEP 5: DRY RUN / TESTING (Walkthrough with sample inputs)
    // =========================================================================
    /*
     * Test Case 1: numbers = [2, 7, 11, 15], target = 9
     * - Initialization: left = 0, right = 3
     * - Iteration 1:
     *     numbers[0] + numbers[3] = 2 + 15 = 17
     *     17 > 9 (target) -> right-- (right becomes 2)
     * - Iteration 2:
     *     numbers[0] + numbers[2] = 2 + 11 = 13
     *     13 > 9 (target) -> right-- (right becomes 1)
     * - Iteration 3:
     *     numbers[0] + numbers[1] = 2 + 7 = 9
     *     9 == 9 (target) -> returns [0 + 1, 1 + 1] -> [1, 2]
     * - Status: Success!
     * 
     * Test Case 2: numbers = [-1, 0], target = -1
     * - Initialization: left = 0, right = 1
     * - Iteration 1:
     *     numbers[0] + numbers[1] = -1 + 0 = -1
     *     -1 == -1 (target) -> returns [0 + 1, 1 + 1] -> [1, 2]
     * - Status: Success!
     */
}
