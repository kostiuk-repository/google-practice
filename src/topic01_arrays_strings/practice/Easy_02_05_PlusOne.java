package topic01_arrays_strings.practice;

public class Easy_02_05_PlusOne {

    /**
     * Drill 5/5 for Easy_02_PlusOne — Multiply Digit Array by a Small Integer
     * Technique: capstone of the carry-propagation family. Same right-to-left,
     * carry-forward loop as Easy_02_PlusOne, but each step now produces a
     * multi-digit partial result (digit * factor + carry) instead of a simple +1,
     * so the carry can be larger than just 0 or 1.
     *
     * You are given a large non-negative integer represented as an integer array
     * digits, most significant digit first, and a single-digit factor
     * (0 <= factor <= 9). Return the digit array representing digits * factor, with
     * no leading zeros (unless the result is 0).
     *
     * Example:
     * Input: digits = [1,2,3], factor = 3
     * Output: [3,6,9]
     * Explanation: 123 * 3 = 369
     *
     * Example 2:
     * Input: digits = [9,9], factor = 9
     * Output: [8,9,1]
     * Explanation: 99 * 9 = 891
     */
    public int[] multiplyBySmallInt(int[] digits, int factor) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
