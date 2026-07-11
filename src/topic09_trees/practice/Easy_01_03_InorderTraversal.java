package topic09_trees.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import topic09_trees.TreeNode;

public class Easy_01_03_InorderTraversal {

    /**
     * Drill 3/5 for Easy_01_InorderTraversal — Iterative Inorder Traversal
     * Technique: same left-root-right visit order as Easy_01_InorderTraversal, but the
     * call stack is replaced by an explicit Deque, pushing left children until null then
     * popping and stepping right — the standard iterative rewrite of the recursive shape.
     *
     * Given the root of a binary tree, return the values of its nodes using an inorder
     * traversal, implemented ITERATIVELY with an explicit stack instead of recursion.
     *
     * Example:
     * Input: root = [1,null,2,3]   (1 -> right child 2, 2 -> left child 3)
     * Output: [1,3,2]
     */
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        // TODO: Implement your solution here.
        return new ArrayList<>();
    }
}
