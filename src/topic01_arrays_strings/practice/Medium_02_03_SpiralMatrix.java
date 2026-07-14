package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_02_03_SpiralMatrix {

    /**
     * Drill 3/5 for Medium_02_SpiralMatrix — Outer Ring Only
     * Technique: a single pass of the 4 boundary pointers (top, bottom, left,
     * right) with NO inward shrinking afterward — isolates just one lap of the
     * original's clockwise walk (right along the top, down the right side, left
     * along the bottom, up the left side) without recursing into the interior.
     *
     * Given an m x n matrix, return only the elements of the outermost ring
     * (border) of the matrix in clockwise order, starting at the top-left
     * corner. Interior elements are not included.
     *
     * Example:
     * Input: matrix = [[1,2,3,4],
     *                  [5,6,7,8],
     *                  [9,10,11,12]]
     * Output: [1,2,3,4,8,12,11,10,9,5]
     * Explanation: top row left-to-right (1,2,3,4), right column top-to-bottom
     * excluding the corner already used (8,12), bottom row right-to-left
     * excluding the corner already used (11,10,9), left column bottom-to-top
     * excluding both corners already used (5). Elements 6 and 7 are interior
     * and excluded.
     */
    public List<Integer> outerRing(int[][] matrix) {
        // TODO: Implement your solution here.
        return null;
    }
}
