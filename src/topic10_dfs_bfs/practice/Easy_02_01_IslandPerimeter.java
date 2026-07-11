package topic10_dfs_bfs.practice;

public class Easy_02_01_IslandPerimeter {

    /**
     * Drill 1/5 for Easy_02_IslandPerimeter — Add-4-Subtract-2 Counting
     * Technique: the non-traversal counting shortcut behind Easy_02_IslandPerimeter — for
     * every land cell add 4 to the running total, then subtract 2 for each land neighbor
     * directly to its right or directly below it (each such adjacency hides two shared edges
     * that are not part of the perimeter). This isolates the arithmetic rule before the DFS
     * version (Drill 2) computes the same answer by walking the island's boundary instead.
     *
     * Given a grid of 0s (water) and 1s (land) containing exactly one island (one connected
     * group of 1s, with no lakes), return the island's perimeter using the add-4/subtract-2
     * scan (a single double loop over every cell, no DFS/BFS required).
     *
     * Example:
     * Input: grid = [[0,1,0],
     *                [1,1,1],
     *                [0,1,0]]
     * Output: 12
     */
    public int islandPerimeterCounting(int[][] grid) {
        // TODO: Implement your solution here.
        return 0;
    }
}
