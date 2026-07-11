package topic10_dfs_bfs.practice;

public class Easy_01_04_FloodFill {

    /**
     * Drill 4/5 for Easy_01_FloodFill — Diagonal (8-Directional) Flood Fill
     * Technique: the same seed-based flood-fill DFS as Easy_01_FloodFill, but the neighbor set
     * is generalized from the 4 orthogonal directions to all 8 surrounding cells (including
     * diagonals) — same "same original color spreads" rule, wider adjacency definition.
     *
     * Given a 2D grid image and a starting cell (sr, sc), flood fill using 8-directional
     * connectivity (up, down, left, right, and the four diagonals): change every connected
     * cell that shares image[sr][sc]'s original color to the new color, then return the
     * modified image.
     *
     * Example:
     * Input: image = [[0,0,0],
     *                  [0,0,0],
     *                  [0,0,1]], sr = 0, sc = 0, color = 5
     * Output: [[5,5,5],
     *          [5,5,5],
     *          [5,5,1]]
     * Explanation: the diagonal at (1,1) still connects to (0,0), so the whole block of 0s is
     * flood-filled even though a purely 4-directional walk from (0,0) to (1,1) is not possible
     * without passing through non-diagonal cells that already belong to the region.
     */
    public int[][] floodFillDiagonal(int[][] image, int sr, int sc, int color) {
        // TODO: Implement your solution here.
        return new int[0][0];
    }
}
