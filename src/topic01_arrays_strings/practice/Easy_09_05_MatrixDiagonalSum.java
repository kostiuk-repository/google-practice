package topic01_arrays_strings.practice;

public class Easy_09_05_MatrixDiagonalSum {

    /**
     * Drill 5/5 for Easy_09_MatrixDiagonalSum — Rectangular Primary Diagonal Sum
     * Technique: generalize the mat[i][i] index formula from Easy_09_MatrixDiagonalSum past
     * the square-only assumption — the loop still uses i as both row and column index, but
     * now bounded by min(m, n) instead of n, since a non-square matrix's diagonal runs out
     * along whichever dimension is smaller.
     *
     * Given a possibly non-square matrix mat with m rows and n columns, return the sum of
     * its primary diagonal, defined as mat[i][i] for i from 0 to min(m, n) - 1.
     *
     * Example:
     * Input: mat = [[1,2,3,4],
     *               [5,6,7,8]]
     * Output: 7
     * Explanation: m = 2, n = 4, so min(m, n) = 2. Diagonal = mat[0][0] + mat[1][1] = 1 + 6 = 7.
     */
    public int rectangularPrimaryDiagonalSum(int[][] mat) {
        // TODO: Implement your solution here.
        return 0;
    }
}
