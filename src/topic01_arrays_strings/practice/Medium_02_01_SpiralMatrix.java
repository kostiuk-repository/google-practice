package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_02_01_SpiralMatrix {

    /**
     * Drill 1/5 for Medium_02_SpiralMatrix — Spiral Order Counter-Clockwise
     * Technique: same 4 shrinking boundary pointers (top, bottom, left, right)
     * as the original problem, but the direction sequence is mirrored: DOWN
     * along the left column, RIGHT along the bottom row, UP along the right
     * column, LEFT along the top row, shrinking inward after each leg — the
     * counter-clockwise mirror image of the original's clockwise sequence.
     *
     * Given an m x n matrix, return all elements of the matrix in
     * COUNTER-clockwise spiral order, starting at the top-left corner and
     * moving DOWN first.
     *
     * Example:
     * Input: matrix = [[1,2,3],
     *                  [4,5,6],
     *                  [7,8,9]]
     * Output: [1,4,7,8,9,6,3,2,5]
     * Explanation: down the left column (1,4,7), right along the bottom row
     * (8,9), up the right column (6,3), left along the remaining top row (2),
     * then the single center element (5).
     */
    public List<Integer> spiralOrderCounterClockwise(int[][] matrix) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
