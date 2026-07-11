package topic10_dfs_bfs.practice;

import java.util.List;

public class Medium_03_02_PacificAtlantic {

    /**
     * Drill 2/5 for Medium_03_PacificAtlantic — Flow Inward (Reverse DFS)
     * Technique: perform DFS from a list of border cells inward (going only to cells with height >= current).
     *
     * Input: heights = [[1,2],[3,4]], borderCells = [[0,0]]
     * Output: [[true, true], [true, true]] (since all heights >= 1)
     */
    public boolean[][] getReachableCells(int[][] heights, List<int[]> borderCells) {
        // TODO: Implement your solution here.
        return new boolean[0][0];
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
     * Mentor Question: Why is reverse flow (from lower border cells to higher internal cells) much more efficient than forward flow?
     * 
     * Your Answer: 
     * 
     */
}
