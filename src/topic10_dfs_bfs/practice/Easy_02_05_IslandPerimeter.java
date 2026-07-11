package topic10_dfs_bfs.practice;

public class Easy_02_05_IslandPerimeter {

    /**
     * Drill 5/5 for Easy_02_IslandPerimeter — Total Perimeter of All Islands (capstone)
     * Technique: combine "enumerate every connected component in the grid" (as in counting
     * distinct regions) with the boundary-counting DFS from Drill 2 — DFS from every unvisited
     * land cell, add that island's boundary-edge count to a running total, and move on to the
     * next unvisited island, until the whole grid has been covered.
     *
     * Given a grid that may contain zero or more islands (each a 4-directionally connected
     * group of 1s, with no lakes), return the SUM of the perimeters of every island in the
     * grid.
     *
     * Example:
     * Input: grid = [[1,1,0,0],
     *                [1,0,0,1],
     *                [0,0,0,1]]
     * Output: 14
     * Explanation: the top-left island has perimeter 8, the bottom-right island has
     * perimeter 6; 8 + 6 = 14.
     */
    public int totalPerimeterAllIslands(int[][] grid) {
        // TODO: Implement your solution here.
        return 0;
    }
}
