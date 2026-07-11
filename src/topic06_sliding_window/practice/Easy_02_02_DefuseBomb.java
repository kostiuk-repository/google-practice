package topic06_sliding_window.practice;

public class Easy_02_02_DefuseBomb {

    /**
     * Drill 2/5 for Easy_02_DefuseBomb — Circular Backward Sum
     * Technique: mirror direction of Drill 1 — circular index mapping via modulo, but looking
     * BACKWARD instead of forward, matching the "k < 0" half of Easy_02_DefuseBomb's rule.
     *
     * Given a circular integer array code and a positive integer k, return an array result where
     * result[i] is the sum of the k elements immediately preceding index i, wrapping around to
     * the end of the array when index 0 is passed.
     *
     * Example:
     * Input: code = [5,7,1,4], k = 2
     * Output: [5,9,12,8]
     * Explanation: result[0] = code[3]+code[2] = 4+1 = 5 (the 2 elements before index 0, wrapping
     * backward). result[1] = code[0]+code[3] = 5+4 = 9. result[2] = code[1]+code[0] = 7+5 = 12.
     * result[3] = code[2]+code[1] = 1+7 = 8.
     */
    public int[] decryptBackward(int[] code, int k) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
