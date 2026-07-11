package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Easy_05_01_FindIfPathExists {

    /**
     * Drill 1/5 for Easy_05_FindIfPathExists — Build the Adjacency List
     * Technique: isolates the graph-construction sub-step that Easy_05_FindIfPathExists relies
     * on before any DFS/BFS can run — turning a flat array of undirected edges into an
     * adjacency list, one List<Integer> of neighbors per node.
     *
     * Given the number of nodes n (labeled 0 to n - 1) and an array edges where each
     * edges[i] = [a, b] represents an undirected edge between a and b, return the adjacency
     * list representation: a List of n lists, where list[i] contains all neighbors of node i.
     *
     * Example:
     * Input: n = 4, edges = [[0,1],[1,2],[2,3]]
     * Output: [[1], [0,2], [1,3], [2]]
     */
    public List<List<Integer>> buildAdjacencyList(int n, int[][] edges) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
