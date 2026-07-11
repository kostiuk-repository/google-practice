package topic01_arrays_strings.practice;

public class Easy_09_03_MatrixDiagonalSum {

    /**
     * Drill 3/5 for Easy_09_MatrixDiagonalSum — Is Symmetric
     * Technique: instead of summing along the primary diagonal with the mat[i][i] formula
     * from Easy_09_MatrixDiagonalSum, use the primary diagonal as an axis of reflection and
     * compare each cell against its mirror across it.
     *
     * Given a square matrix mat of size n x n, return true if the matrix is symmetric about
     * its primary diagonal, meaning mat[i][j] == mat[j][i] for every pair of indices i, j.
     *
     * Example:
     * Input: mat = [[1,2,3],
     *               [2,5,6],
     *               [3,6,9]]
     * Output: true
     *
     * Example 2:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: false
     * Explanation: mat[0][1] = 2 but mat[1][0] = 4, so it is not symmetric.
     */
    public boolean isSymmetric(int[][] mat) {
        // TODO: Implement your solution here.
        return false;
    }
}
