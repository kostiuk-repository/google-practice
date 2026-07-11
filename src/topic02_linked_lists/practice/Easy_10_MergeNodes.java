package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_10_MergeNodes {

    /**
     * Problem: Merge Nodes in Between Zeros
     * 
     * You are given the head of a linked list, which contains a series of integers 
     * separated by 0's. The beginning and end of the linked list will have Node.val == 0.
     * 
     * For every two consecutive 0's, merge all the nodes lying in between them into a single 
     * node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
     * 
     * Return the head of the modified linked list.
     * 
     * Example:
     * Input: head = [0,3,1,0,4,5,2,0]
     * Output: [4,11]
     * Explanation: 
     * - The sum of the nodes between the first and second 0 is 3 + 1 = 4.
     * - The sum of the nodes between the second and third 0 is 4 + 5 + 2 = 11.
     */
    public ListNode mergeNodes(ListNode head) {
        // TODO: Implement your solution here.
        return null;
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
     * Mentor Question: Can you solve this in-place by reusing the existing ListNode objects 
     * to store the merged sums instead of allocating new nodes? How would you manage 
     * the write pointer and read pointer during the traversal?
     * 
     * Your Answer: 
     * 
     */
}
