package topic10_dfs_bfs.practice;

public class Easy_02_03_IslandPerimeter {

    /**
     * Drill 3/5 for Easy_02_IslandPerimeter — Largest Island's Perimeter
     * Technique: the grid may now contain MULTIPLE islands instead of the single island
     * assumed by Easy_02_IslandPerimeter. Run the same DFS boundary-counting traversal
     * (Drill 2's technique) from every unvisited land cell to get that island's perimeter and
     * size, and keep the perimeter of whichever island has the most cells.
     *
     * Given a grid containing zero or more islands (each a 4-directionally connected group of
     * 1s), return the perimeter of the island with the largest area (number of land cells). If
     * there are no islands, return 0.
     *
     * Example:
     * Input: grid = [[1,1,0,0],
     *                [1,0,0,1],
     *                [0,0,0,1]]
     * Output: 8
     * Explanation: the top-left island has area 3 (perimeter 8); the bottom-right island has
     * area 2 (perimeter 6). The top-left island has the larger area, so its perimeter, 8, is
     * returned.
     */
    public int largestIslandPerimeter(int[][] grid) {
        // TODO: Implement your solution here.
        return 0;
    }
}
