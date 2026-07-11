package topic01_arrays_strings.practice;

public class Medium_03_03_DiagonalTraverse {

    /**
     * Drill 3/5 for Medium_03_DiagonalTraverse — Anti-Diagonal Sums
     * Technique: direct use of the diagonal-grouping index math from the
     * original problem (elements with i + j == k belong to diagonal k), but
     * instead of collecting the elements themselves, accumulate a running sum
     * per diagonal index.
     *
     * Given an m x n matrix mat, return an int[] result where result[k] is
     * the sum of all elements mat[i][j] with i + j == k, for every k from 0
     * to (m + n - 2).
     *
     * Example:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: [1,6,15,14,9]
     * Explanation: k=0 -> 1; k=1 -> 2+4=6; k=2 -> 3+5+7=15; k=3 -> 6+8=14;
     * k=4 -> 9.
     */
    public int[] antiDiagonalSums(int[][] mat) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
