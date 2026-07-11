package topic01_arrays_strings;

/**
 * Example Problem: Find Pivot Index
 * 
 * Problem Statement:
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left 
 * of the index is equal to the sum of all the numbers strictly to the index's right.
 * 
 * If the index is on the left edge of the array, then the left sum is 0 because there 
 * are no elements to the left. This also applies to the right edge of the array.
 * 
 * Return the leftmost pivot index. If no such index exists, return -1.
 * 
 * Example:
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation: 
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 */
public class Example {

    public int pivotIndex(int[] nums) {
        // =========================================================================
        // STEP 1: CLARIFICATION & CONSTRAINTS (Gathering requirements)
        // =========================================================================
        // - "Can elements be negative?" -> Yes.
        // - "What if the array length is very small?" -> The length is at least 1.
        // - "What if there are multiple pivot indices?" -> The problem asks for the leftmost pivot index.
        // - "What are the limits on array size?" -> Between 1 and 10^4.
        // - "Can the sum exceed the integer limit?" -> With array size 10^4 and values between -1000 and 1000, 
        //   the max possible sum is 10^7, which comfortably fits in a standard 32-bit signed integer.
        
        // =========================================================================
        // STEP 2: GUARD CLAUSES / EDGE CASES (Handling invalid/extreme inputs)
        // =========================================================================
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0; // The left sum is 0, and the right sum is 0.
        }

        // =========================================================================
        // STEP 3: HIGH-LEVEL ALGORITHM & COMPLEXITY DESIGN
        // =========================================================================
        // Naive Approach: For each index i, calculate sum(0 to i-1) and sum(i+1 to end).
        // Time Complexity: O(N^2) because we sum elements repeatedly. Space: O(1).
        
        // Prefix Sum Approach (Optimal):
        // 1. Calculate the grand total sum of all elements first.
        // 2. Iterate through the array keeping track of the running leftSum.
        // 3. For any index i:
        //    - The right sum is: rightSum = totalSum - leftSum - nums[i]
        //    - Check if leftSum == rightSum.
        //    - If yes, return i (since we are moving left-to-right, this will naturally be the leftmost pivot index).
        //    - Otherwise, add nums[i] to leftSum and continue.
        // Time Complexity: O(N) since we do one pass to compute totalSum and another pass to find the pivot.
        // Space Complexity: O(1) as we only use two integer variables.

        // =========================================================================
        // STEP 4: CLEAN IMPLEMENTATION
        // =========================================================================
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Check if left sum equals right sum
            // rightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i]; // Update left sum for the next index
        }

        return -1; // No pivot index found
    }

    // =========================================================================
    // STEP 5: DRY RUN / TESTING (Walkthrough with sample inputs)
    // =========================================================================
    /*
     * Test Case 1: nums = [1, 7, 3, 6, 5, 6]
     * - totalSum = 1 + 7 + 3 + 6 + 5 + 6 = 28
     * - leftSum = 0
     * - i = 0: nums[0] = 1. Is leftSum (0) == totalSum - leftSum - nums[0] (28 - 0 - 1 = 27)? No.
     *          leftSum becomes 0 + 1 = 1
     * - i = 1: nums[1] = 7. Is leftSum (1) == totalSum - leftSum - nums[1] (28 - 1 - 7 = 20)? No.
     *          leftSum becomes 1 + 7 = 8
     * - i = 2: nums[2] = 3. Is leftSum (8) == totalSum - leftSum - nums[2] (28 - 8 - 3 = 17)? No.
     *          leftSum becomes 8 + 3 = 11
     * - i = 3: nums[3] = 6. Is leftSum (11) == totalSum - leftSum - nums[3] (28 - 11 - 6 = 11)? YES!
     * - Returns: 3
     * - Status: Success!
     * 
     * Test Case 2: nums = [2, 1, -1]
     * - totalSum = 2 + 1 + -1 = 2
     * - leftSum = 0
     * - i = 0: nums[0] = 2. Is leftSum (0) == totalSum - leftSum - nums[0] (2-0-2 = 0)? YES!
     * - Returns: 0
     * - Status: Success!
     */
}
