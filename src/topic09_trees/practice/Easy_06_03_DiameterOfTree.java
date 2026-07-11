package topic09_trees.practice;

import java.util.Queue;
import java.util.LinkedList;
import topic09_trees.TreeNode;

public class Easy_06_03_DiameterOfTree {

    /**
     * Drill 3/5 for Easy_06_DiameterOfTree — Maximum Width
     * Technique: Easy_06_DiameterOfTree combines information from a node's children to
     * produce a tree-wide answer (the diameter). This drill computes a different tree-wide
     * answer — the maximum WIDTH — by combining information per LEVEL instead of per node
     * (level-by-level BFS, taking the max of each level's node count).
     *
     * Given the root of a binary tree, return its maximum width: the largest number of
     * nodes present at any single level of the tree.
     *
     * Example:
     * Input: root = [1,2,3,4,null,null,5,6]
     * Output: 2
     * Explanation: level 0 has 1 node, level 1 has 2 nodes (2,3), level 2 has 2 nodes
     * (4,5), level 3 has 1 node (6). The maximum is 2.
     */
    public int maxWidth(TreeNode root) {
        // TODO: Implement your solution here.
        return 0;
    }
}
