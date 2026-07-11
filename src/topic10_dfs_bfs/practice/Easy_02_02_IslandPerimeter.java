package topic10_dfs_bfs.practice;

public class Easy_02_02_IslandPerimeter {

    /**
     * Drill 2/5 for Easy_02_IslandPerimeter — Perimeter via DFS Boundary Counting
     * Technique: DFS from a land cell with a visited set (the same traversal shape used
     * throughout this topic), but instead of flood-filling a color, each call adds to a
     * running perimeter total whenever it hits a "boundary edge" — an out-of-grid neighbor or
     * a water (0) neighbor. This is the traversal-based way to compute what
     * Easy_02_IslandPerimeter (and Drill 1's arithmetic shortcut) both compute.
     *
     * Given a grid with exactly one island, find any land cell, then DFS across the island
     * (tracking visited cells so each land cell is processed once) and return the total
     * perimeter, where every out-of-bounds or water neighbor of a visited land cell
     * contributes 1 to the perimeter.
     *
     * Example:
     * Input: grid = [[0,1,0],
     *                [1,1,1],
     *                [0,1,0]]
     * Output: 12
     */
    public int islandPerimeterDFS(int[][] grid) {
        // TODO: Implement your solution here.
        return 0;
    }
}
