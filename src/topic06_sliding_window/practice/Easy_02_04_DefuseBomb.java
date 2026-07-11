package topic06_sliding_window.practice;

public class Easy_02_04_DefuseBomb {

    /**
     * Drill 4/5 for Easy_02_DefuseBomb — Variable Per-Index Radius Decrypt
     * Technique: same circular forward-sum modulo addressing as Easy_02_DefuseBomb, but the
     * window size is no longer a single constant k — it is generalized to a per-index array ks,
     * so each position looks ahead by its own radius.
     *
     * Given a circular integer array code and an integer array ks of the same length, return an
     * array result where result[i] is the sum of the ks[i] elements immediately following index i,
     * wrapping around the array as needed. ks[i] is always non-negative and may be 0 (meaning 0).
     *
     * Example:
     * Input: code = [5,7,1,4], ks = [1,2,0,3]
     * Output: [7,5,0,13]
     * Explanation: result[0] = code[1] = 7 (radius 1). result[1] = code[2]+code[3] = 1+4 = 5
     * (radius 2). result[2] = 0 (radius 0, sum of zero elements). result[3] = code[0]+code[1]+code[2]
     * = 5+7+1 = 13 (radius 3, wraps around).
     */
    public int[] decryptVariableK(int[] code, int[] ks) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
