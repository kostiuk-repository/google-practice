package topic01_arrays_strings.practice;

public class Medium_03_02_DiagonalTraverse {

    /**
     * Drill 2/5 for Medium_03_DiagonalTraverse — Count Multi-Element Diagonals
     * Technique: the same i + j diagonal-grouping index math as the original
     * problem, reduced to a single count instead of a full zigzag traversal —
     * a diagonal has more than one element whenever it is not one of the two
     * "corner" diagonals (i + j = 0 or i + j = m + n - 2) and is short enough
     * to be clipped by a matrix edge.
     *
     * Given an m x n matrix mat, return how many diagonals (elements grouped
     * by i + j) contain more than one element.
     *
     * Example:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: 3
     * Explanation: the diagonals are {1}, {2,4}, {3,5,7}, {6,8}, {9}. The
     * diagonals {2,4}, {3,5,7}, and {6,8} each have more than one element.
     */
    public int countMultiElementDiagonals(int[][] mat) {
        // TODO: Implement your solution here.
        return 0;
    }
}
