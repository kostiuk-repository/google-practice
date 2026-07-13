package topic09_trees.practice;

import topic09_trees.TreeNode;

public class Medium_04_ValidateBST {

        /**
     * Problem: Validate Binary Search Tree
     *
     * Given the root of a binary tree, determine if it is a valid binary search tree
     * (BST).
     *
     * A valid BST is defined as follows:
     *
     *   - The left subtree of a node contains only nodes with keys strictly less than the node's key.
     *   - The right subtree of a node contains only nodes with keys strictly greater than the node's key.
     *   - Both the left and right subtrees must also be binary search trees.
     *
     * Example 1:
     * Input: root = [2,1,3]
     * Output: true
     * Example 2:
     * Input: root = [5,1,4,null,null,3,6]
     * Output: false
     * Explanation: The root node's value is 5 but its right child's value is 4.
     * Constraints:
     *
     *   - The number of nodes in the tree is in the range [1, 10^4].
     *   - -2^31 <= Node.val <= 2^31 - 1
     */
    public boolean isValidBST(TreeNode root) {
        // TODO: Implement your solution here.
        return false;
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
     * Mentor Question: Why is checking root.left.val < root.val < root.right.val insufficient to validate a BST? Hint: Think of values deeper in subtrees.
     * 
     * Your Answer: 
     * 
     */
}
