package topic06_sliding_window.practice;

public class Easy_02_01_DefuseBomb {

    /**
     * Drill 1/5 for Easy_02_DefuseBomb — Circular Forward Sum
     * Technique: circular index mapping via modulo — isolates the "k > 0" (look forward) half of
     * the decryption rule used in Easy_02_DefuseBomb, without the k == 0 or k < 0 cases.
     *
     * Given a circular integer array code and a positive integer k, return an array result where
     * result[i] is the sum of the k elements immediately following index i, wrapping around to
     * the start of the array when the end is reached.
     *
     * Example:
     * Input: code = [5,7,1,4], k = 3
     * Output: [12,10,16,13]
     * Explanation: result[0] = code[1]+code[2]+code[3] = 7+1+4 = 12, and so on, wrapping around.
     */
    public int[] decryptForward(int[] code, int k) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
