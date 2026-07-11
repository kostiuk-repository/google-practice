package topic10_dfs_bfs.practice;

public class Easy_01_01_FloodFill {

    /**
     * Drill 1/5 for Easy_01_FloodFill — Connected Region Size
     * Technique: DFS from a seed cell, following only neighbors that share the same value as
     * the seed and tracking visited cells — the same connectivity check used by flood fill in
     * Easy_01_FloodFill, but here we only COUNT the region instead of repainting it.
     *
     * Given a 2D grid image and a starting cell (sr, sc), return the number of cells in the
     * 4-directionally connected region that share the same value as image[sr][sc] (including
     * the starting cell itself).
     *
     * Example:
     * Input: image = [[1,1,0],
     *                  [1,1,0],
     *                  [0,0,1]], sr = 0, sc = 0
     * Output: 4
     * Explanation: The four 1s in the top-left 2x2 block are connected; the bottom-right 1 is
     * a separate, isolated region.
     */
    public int countConnectedRegionSize(int[][] image, int sr, int sc) {
        // TODO: Implement your solution here.
        return 0;
    }
}
