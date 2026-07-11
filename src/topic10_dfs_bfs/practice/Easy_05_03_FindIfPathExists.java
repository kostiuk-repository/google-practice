package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Easy_05_03_FindIfPathExists {

    /**
     * Drill 3/5 for Easy_05_FindIfPathExists — Count Connected Components
     * Technique: same adjacency-list-plus-DFS/BFS traversal as Easy_05_FindIfPathExists, but
     * instead of answering a single source/destination connectivity query, DFS from every
     * unvisited node to partition the WHOLE graph into connected components and count how many
     * there are — the graph analogue of counting distinct flood-fill regions in a grid.
     *
     * Given the number of nodes n and an array edges of undirected edges, return the number of
     * connected components in the graph.
     *
     * Example:
     * Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4]]
     * Output: 2
     * Explanation: {0,1,2} and {3,4,5} are the two connected components.
     */
    public int countConnectedComponents(int n, int[][] edges) {
        // TODO: Implement your solution here.
        return 0;
    }
}
