package topic09_trees.practice;

import java.util.List;
import java.util.ArrayList;
import topic09_trees.TreeNode;

public class Easy_01_01_InorderTraversal {

    /**
     * Drill 1/5 for Easy_01_InorderTraversal — Preorder Traversal
     * Technique: recursive DFS traversal that visits root-left-right, reusing the same
     * "recurse into left, recurse into right, add current value to result" shape as
     * Easy_01_InorderTraversal but with the visit of the current node moved to the front.
     *
     * Given the root of a binary tree, return the values of its nodes using a preorder
     * traversal (visit the current node, then its left subtree, then its right subtree).
     *
     * Example:
     * Input: root = [1,null,2,3]   (1 -> right child 2, 2 -> left child 3)
     * Output: [1,2,3]
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
