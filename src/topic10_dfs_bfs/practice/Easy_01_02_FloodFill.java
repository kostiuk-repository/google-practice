package topic10_dfs_bfs.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Easy_01_02_FloodFill {

    /**
     * Drill 2/5 for Easy_01_FloodFill — BFS Flood Fill
     * Technique: replace the recursive DFS flood fill of Easy_01_FloodFill with an explicit
     * queue-based BFS — same "spread to same-colored neighbors" rule, different traversal
     * order (level by level instead of depth-first).
     *
     * Given a 2D grid image and a starting cell (sr, sc), perform flood fill using BFS: change
     * every 4-directionally connected cell that shares image[sr][sc]'s original color to the
     * new color, then return the modified image. If the starting color already equals color,
     * return the image unchanged (to avoid infinite re-processing).
     *
     * Example:
     * Input: image = [[1,1,1],
     *                  [1,1,0],
     *                  [1,0,1]], sr = 1, sc = 1, color = 2
     * Output: [[2,2,2],
     *          [2,2,0],
     *          [2,0,1]]
     */
    public int[][] floodFillBFS(int[][] image, int sr, int sc, int color) {
        // TODO: Implement your solution here.
        return new int[0][0];
    }
}
