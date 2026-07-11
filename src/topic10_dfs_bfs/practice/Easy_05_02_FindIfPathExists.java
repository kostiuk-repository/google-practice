package topic10_dfs_bfs.practice;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Easy_05_02_FindIfPathExists {

    /**
     * Drill 2/5 for Easy_05_FindIfPathExists — Valid Path via BFS
     * Technique: the same "build adjacency list, then traverse with a visited set" approach as
     * Easy_05_FindIfPathExists, but the traversal is BFS (queue) instead of DFS (recursion or
     * stack) — mirrors the technique in iterative, level-by-level form.
     *
     * Given the number of nodes n, an array edges of undirected edges, a source node, and a
     * destination node, return true if there is a path from source to destination, using BFS.
     *
     * Example:
     * Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
     * Output: false
     * Explanation: {0,1,2} and {3,4,5} are two separate connected components.
     */
    public boolean validPathBFS(int n, int[][] edges, int source, int destination) {
        // TODO: Implement your solution here.
        return false;
    }
}
