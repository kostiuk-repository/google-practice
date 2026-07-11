package topic06_sliding_window.practice;

public class Easy_02_05_DefuseBomb {

    /**
     * Drill 5/5 for Easy_02_DefuseBomb — Circular Net Difference Decrypt
     * Technique: capstone — combines the forward circular window sum (Drill 1) and the backward
     * circular window sum (Drill 2) from Easy_02_DefuseBomb's family in a single pass: at each
     * index compute both sums and take their difference.
     *
     * Given a circular integer array code and a positive integer k, return an array result where
     * result[i] = (sum of the k elements immediately following index i) - (sum of the k elements
     * immediately preceding index i), both wrapping around the array as needed.
     *
     * Example:
     * Input: code = [5,7,1,4], k = 1
     * Output: [3,-4,-3,4]
     * Explanation: result[0] = code[1] - code[3] = 7 - 4 = 3. result[1] = code[2] - code[0] =
     * 1 - 5 = -4. result[2] = code[3] - code[1] = 4 - 7 = -3. result[3] = code[0] - code[2] =
     * 5 - 1 = 4.
     */
    public int[] decryptNetDifference(int[] code, int k) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
