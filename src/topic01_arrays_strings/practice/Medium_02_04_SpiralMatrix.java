package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_02_04_SpiralMatrix {

    /**
     * Drill 4/5 for Medium_02_SpiralMatrix — Spiral From Bottom-Right
     * Technique: the same 4 shrinking boundary pointers (top, bottom, left,
     * right) as the original, but the walk both starts at the opposite corner
     * AND runs counter-clockwise: UP along the right column, LEFT along the
     * top row, DOWN along the left column, RIGHT along the bottom row,
     * shrinking inward after each full lap.
     *
     * Given an m x n matrix, return all elements of the matrix in spiral
     * order, starting at the BOTTOM-RIGHT corner and spiraling
     * COUNTER-clockwise inward toward the center.
     *
     * Example:
     * Input: matrix = [[1,2,3],
     *                  [4,5,6],
     *                  [7,8,9]]
     * Output: [9,6,3,2,1,4,7,8,5]
     * Explanation: up the right column (9,6,3), left along the top row (2,1),
     * down the left column (4,7), right along the remaining bottom row (8),
     * then the single center element (5).
     */
    public List<Integer> spiralFromBottomRight(int[][] matrix) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
