package topic10_dfs_bfs.practice;

public class Easy_05_05_FindIfPathExists {

    /**
     * Drill 5/5 for Easy_05_FindIfPathExists — Path Within K Edges (capstone)
     * Technique: combines the adjacency-list-plus-BFS technique from Easy_05_FindIfPathExists
     * with a depth limit — BFS naturally processes nodes in order of distance (number of
     * edges) from the source, so the same traversal can simply stop expanding once it would
     * exceed k edges, tracking the number of "hops" taken alongside each queued node.
     *
     * Given the number of nodes n, an array edges of undirected edges, a source node, a
     * destination node, and an integer k, return true if there is a path from source to
     * destination that uses AT MOST k edges.
     *
     * Example:
     * Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]], source = 0, destination = 4, k = 3
     * Output: false
     * Explanation: the only path from 0 to 4 uses 4 edges, which exceeds k = 3.
     */
    public boolean validPathWithinK(int n, int[][] edges, int source, int destination, int k) {
        // TODO: Implement your solution here.
        return false;
    }
}
