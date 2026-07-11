package topic10_dfs_bfs.practice;

public class Easy_02_04_IslandPerimeter {

    /**
     * Drill 4/5 for Easy_02_IslandPerimeter — Perimeter of the Island Containing a Given Cell
     * Technique: same DFS boundary-counting traversal as Drill 2, but instead of assuming the
     * whole grid is a single island, the DFS is scoped to start from a caller-given land cell
     * and only explore ITS connected component — so it correctly ignores other islands
     * elsewhere in the grid.
     *
     * Given a grid that may contain multiple islands and a starting cell (r, c) that is
     * guaranteed to be land (grid[r][c] == 1), return the perimeter of the single island that
     * contains (r, c), ignoring every other island in the grid.
     *
     * Example:
     * Input: grid = [[1,1,0,0],
     *                [1,0,0,1],
     *                [0,0,0,1]], r = 0, c = 0
     * Output: 8
     * Explanation: only the 3-cell island in the top-left is measured; the separate 2-cell
     * island in the bottom-right is not part of the answer.
     */
    public int islandPerimeterAt(int[][] grid, int r, int c) {
        // TODO: Implement your solution here.
        return 0;
    }
}
