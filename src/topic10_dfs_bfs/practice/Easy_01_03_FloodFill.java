package topic10_dfs_bfs.practice;

public class Easy_01_03_FloodFill {

    /**
     * Drill 3/5 for Easy_01_FloodFill — Count Distinct Regions
     * Technique: instead of flood-filling ONE region from a given seed, DFS from every
     * unvisited cell of the grid, using each DFS launch as a "flood fill" that marks a whole
     * connected same-value region as visited — the same connectivity rule as
     * Easy_01_FloodFill, but now applied across the entire grid to count regions instead of
     * repainting one.
     *
     * Given a 2D grid image, return the number of distinct 4-directionally connected regions
     * of equal-valued cells in the whole grid.
     *
     * Example:
     * Input: image = [[1,1,0],
     *                  [1,1,0],
     *                  [0,0,2]]
     * Output: 3
     * Explanation: the 1-block, the 0-region, and the single 2 are three separate regions.
     */
    public int countDistinctRegions(int[][] image) {
        // TODO: Implement your solution here.
        return 0;
    }
}
