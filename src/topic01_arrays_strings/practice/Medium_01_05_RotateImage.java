package topic01_arrays_strings.practice;

public class Medium_01_05_RotateImage {

    /**
     * Drill 5/5 for Medium_01_RotateImage — Rotate Outer Ring Only
     * Technique: layer-by-layer four-way cyclic swap (the classic alternative
     * to transpose+reverse for rotating a matrix), but restricted to a single
     * layer — the outermost ring — leaving every interior element untouched.
     *
     * You are given an n x n 2D matrix representing an image. Rotate ONLY the
     * outermost ring (border) of the matrix 90 degrees clockwise, in place,
     * leaving all interior elements unchanged. Do not allocate another 2D
     * matrix.
     *
     * Example:
     * Input: matrix = [[1,2,3,4],
     *                  [5,6,7,8],
     *                  [9,10,11,12],
     *                  [13,14,15,16]]
     * Output: [[13,9,5,1],
     *          [14,6,7,2],
     *          [15,10,11,3],
     *          [16,12,8,4]]
     * Explanation: The 12 border elements are cyclically rotated one layer
     * clockwise; the interior elements 6, 7, 10, 11 stay exactly where they were.
     */
    public void rotateOuterRing(int[][] matrix) {
        // TODO: Implement your solution here in-place.
    }
}
