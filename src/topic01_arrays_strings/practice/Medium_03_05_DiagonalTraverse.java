package topic01_arrays_strings.practice;

public class Medium_03_05_DiagonalTraverse {

    /**
     * Drill 5/5 for Medium_03_DiagonalTraverse — Diagonal Traverse Rectangular
     * Technique: the exact same zigzag diagonal traversal as the original
     * problem (alternate direction between diagonals sharing i + j = constant,
     * with row/column clamping at the boundaries), but forced onto a
     * NON-square rectangular matrix (m != n) so that the boundary-adjustment
     * edge cases (a diagonal getting clipped by the narrower dimension, not
     * just by row 0 / column 0) actually get exercised.
     *
     * Given an m x n matrix mat (where m may differ from n), return an array
     * of all the elements of mat in zigzag diagonal order: diagonals with an
     * even i + j are read bottom-left to top-right, diagonals with an odd
     * i + j are read top-right to bottom-left, in order of increasing i + j.
     *
     * Example:
     * Input: mat = [[1,2,3,4],
     *               [5,6,7,8]]
     * Output: [1,2,5,6,3,4,7,8]
     * Explanation: diagonal i+j=0 -> {1}; i+j=1 (odd, top-right to
     * bottom-left) -> {2,5}; i+j=2 (even, bottom-left to top-right) ->
     * {6,3}; i+j=3 (odd, top-right to bottom-left) -> {4,7}; i+j=4 -> {8}.
     * Note the matrix has only 2 rows but 4 columns, so several diagonals are
     * clipped by the row boundary rather than the column boundary.
     */
    public int[] findDiagonalOrderRectangular(int[][] mat) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
