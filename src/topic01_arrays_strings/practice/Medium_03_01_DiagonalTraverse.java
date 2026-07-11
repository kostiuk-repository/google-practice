package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_03_01_DiagonalTraverse {

    /**
     * Drill 1/5 for Medium_03_DiagonalTraverse — Group By Diagonals
     * Technique: elements on the same diagonal share i + j = constant (the
     * core index math behind the original zigzag traversal), but here there is
     * NO zigzag — each diagonal's elements are simply grouped together and
     * listed in order of increasing row index, from the top-left diagonal
     * (i + j = 0) to the bottom-right diagonal (i + j = m + n - 2).
     *
     * Given an m x n matrix mat, return a List of Lists where each inner list
     * contains the elements of one diagonal (grouped by i + j), each diagonal
     * listed in order of increasing row index, and the diagonals themselves
     * ordered from i + j = 0 up to i + j = m + n - 2.
     *
     * Example:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: [[1],[2,4],[3,5,7],[6,8],[9]]
     */
    public List<List<Integer>> groupByDiagonals(int[][] mat) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
