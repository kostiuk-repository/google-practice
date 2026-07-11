package topic01_arrays_strings.practice;

public class Medium_03_04_DiagonalTraverse {

    /**
     * Drill 4/5 for Medium_03_DiagonalTraverse — Boustrophedon Row Traverse
     * Technique: the "alternate direction at a boundary" idea from the
     * original zigzag diagonal traversal, transplanted to a simpler ROW-based
     * setting: instead of alternating direction between diagonals, alternate
     * direction between rows (even rows left-to-right, odd rows
     * right-to-left) — the boundary transition is just "end of row" instead
     * of a diagonal's row/column clamp.
     *
     * Given an m x n matrix mat, traverse it in "boustrophedon" (ox-plowing,
     * zigzag) order by row: row 0 read left-to-right, row 1 read
     * right-to-left, row 2 read left-to-right, and so on, alternating for
     * every row. Return the flattened result as an int[].
     *
     * Example:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: [1,2,3,6,5,4,7,8,9]
     * Explanation: row 0 left-to-right (1,2,3), row 1 right-to-left (6,5,4),
     * row 2 left-to-right (7,8,9).
     */
    public int[] boustrophedonRowTraverse(int[][] mat) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
