package topic10_dfs_bfs.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Medium_02_03_RottingOranges {

    /**
     * Drill 3/5 for Medium_02_RottingOranges — BFS Distance from Source
     * Technique: find shortest distance from a single starting cell (r, c) to all other cells.
     * Return a grid of distances (-1 for unreachable / water, 0 for starting cell).
     *
     * Input: grid = [[1,1,1],[1,1,1],[1,1,1]], r = 0, c = 0
     * Output: [[0, 1, 2], [1, 2, 3], [2, 3, 4]]
     */
    public int[][] shortestPathFromSource(int[][] grid, int r, int c) {
        // TODO: Implement your solution here.
        return new int[0][0];
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
     * Mentor Question: Why is BFS guaranteed to find the shortest path in an unweighted grid?
     * 
     * Your Answer: 
     * 
     */
}
