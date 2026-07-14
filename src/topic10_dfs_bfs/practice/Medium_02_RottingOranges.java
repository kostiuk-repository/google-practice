package topic10_dfs_bfs.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Medium_02_RottingOranges {

        /**
     * Problem: Rotting Oranges
     *
     * You are given an m x n grid where each cell can have one of three values:
     *
     *   - 0 representing an empty cell,
     *   - 1 representing a fresh orange, or
     *   - 2 representing a rotten orange.
     *
     * Every minute, any fresh orange that is 4-directionally adjacent to a rotten
     * orange becomes rotten.
     *
     * Return the minimum number of minutes that must elapse until no cell has a fresh
     * orange. If this is impossible, return -1.
     *
     * Example 1:
     * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
     * Output: 4
     * Example 2:
     * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
     * Output: -1
     * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
     * Example 3:
     * Input: grid = [[0,2]]
     * Output: 0
     * Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
     * Constraints:
     *
     *   - m == grid.length
     *   - n == grid[i].length
     *   - 1 <= m, n <= 10
     *   - grid[i][j] is 0, 1, or 2.
     */
    public int orangesRotting(int[][] grid) {
        // TODO: Implement your solution here.
        return 0;
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: Explain why BFS (multi-source BFS) is required rather than DFS to compute minimum minutes elapsed.
     * 
     * Your Answer: 
     * 
     */
}
