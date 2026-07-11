package topic10_dfs_bfs.practice;

import topic09_trees.TreeNode;
import java.util.Queue;
import java.util.LinkedList;

public class Easy_04_01_MaxDepthNaryTree {

    /**
     * Drill 1/5 for Easy_04_MaxDepthNaryTree — Max Depth via BFS Level Counting
     * Technique: instead of the recursive "1 + max(child depths)" DFS used by
     * Easy_04_MaxDepthNaryTree, process the tree level by level with a queue, incrementing a
     * counter once per full level — the same "how many levels does this tree have" answer,
     * produced by BFS instead of DFS.
     *
     * Given the root of a binary tree, return its maximum depth (the number of nodes along the
     * longest path from the root down to the farthest leaf), computed with BFS.
     *
     * Example:
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     */
    public int maxDepthBFS(TreeNode root) {
        // TODO: Implement your solution here.
        return 0;
    }
}
