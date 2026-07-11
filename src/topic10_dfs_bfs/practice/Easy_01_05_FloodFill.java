package topic10_dfs_bfs.practice;

public class Easy_01_05_FloodFill {

    /**
     * Drill 5/5 for Easy_01_FloodFill — Multi-Source Flood Fill (capstone)
     * Technique: combine the same-value flood-fill DFS/BFS from Easy_01_FloodFill with
     * MULTIPLE simultaneous seed points instead of one — every region touched by any source
     * cell (matched against that source's own original color) gets flood-filled in a single
     * pass, sharing one visited set so overlapping regions are not processed twice.
     *
     * Given a 2D grid image, an array sources where each sources[i] = [row, col] is a starting
     * cell, and a new color, flood-fill (4-directionally) the connected region of each source's
     * original color, for every source, then return the modified image. A cell already
     * repainted by one source's flood fill must not be flood-filled again by another source.
     *
     * Example:
     * Input: image = [[1,1,0],
     *                  [1,1,0],
     *                  [0,0,2]], sources = [[0,0],[2,2]], color = 9
     * Output: [[9,9,0],
     *          [9,9,0],
     *          [0,0,9]]
     */
    public int[][] floodFillMultiSource(int[][] image, int[][] sources, int color) {
        // TODO: Implement your solution here.
        return new int[0][0];
    }
}
