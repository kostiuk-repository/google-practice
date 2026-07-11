package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_05_04_DeleteNode {

    /**
     * Drill 4/5 for Easy_05_DeleteNode — Delete Even If It Might Be The Tail
     * Technique: contrasts the O(1) trick from Easy_05_DeleteNode with the general-case solution —
     * here you ARE given the head, so when node happens to be the tail (where the trick from
     * Easy_05_DeleteNode is inapplicable), fall back to an O(N) predecessor search from head.
     *
     * Given the head of a singly linked list and a reference to a node to delete (which may or
     * may not be the tail), delete that node from the list. If node is not the tail, prefer the
     * O(1) value-copy trick; if node IS the tail, find its predecessor by walking from head and
     * unlink it the traditional way.
     *
     * Example:
     * Input: head = [4,5,1,9], node = Node(9) (the tail)
     * Output: List becomes 4 -> 5 -> 1
     */
    public void deleteNodeGeneral(ListNode head, ListNode node) {
        // TODO: Implement your solution here.
    }
}
