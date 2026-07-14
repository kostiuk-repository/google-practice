package topic01_arrays_strings.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_02_05_SpiralMatrix {

    /**
     * Drill 5/5 for Medium_02_SpiralMatrix — Spiral First K
     * Technique: the same 4 shrinking boundary pointers (top, bottom, left,
     * right) walking the clockwise spiral as in the original problem, combined
     * with an early exit as soon as k elements have been collected — no need
     * to finish the spiral if the caller only wants a prefix of it.
     *
     * Given an m x n matrix and an integer k (0 <= k <= m*n), return the first
     * k elements encountered when reading the matrix in clockwise spiral
     * order.
     *
     * Example:
     * Input: matrix = [[1,2,3],
     *                  [4,5,6],
     *                  [7,8,9]], k = 5
     * Output: [1,2,3,6,9]
     * Explanation: the full clockwise spiral is [1,2,3,6,9,8,7,4,5]; only the
     * first 5 elements are returned.
     */
    public List<Integer> spiralFirstK(int[][] matrix, int k) {
        // TODO: Implement your solution here.
        return null;
    }
}
