package topic06_sliding_window.practice;

public class Easy_02_03_DefuseBomb {

    /**
     * Drill 3/5 for Easy_02_DefuseBomb — Circular Window Maximum
     * Technique: same circular index mapping as Easy_02_DefuseBomb, but the aggregation function
     * changes from SUM to MAX — the window still wraps via modulo, only what we compute over it differs.
     *
     * Given a circular integer array code and a positive integer k, return an array result where
     * result[i] is the MAXIMUM value among the k elements immediately following index i, wrapping
     * around to the start of the array when the end is reached.
     *
     * Example:
     * Input: code = [5,7,1,4], k = 2
     * Output: [7,4,5,7]
     * Explanation: result[0] = max(code[1],code[2]) = max(7,1) = 7. result[1] = max(code[2],code[3])
     * = max(1,4) = 4. result[2] = max(code[3],code[0]) = max(4,5) = 5 (wraps). result[3] =
     * max(code[0],code[1]) = max(5,7) = 7 (wraps).
     */
    public int[] decryptMax(int[] code, int k) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
