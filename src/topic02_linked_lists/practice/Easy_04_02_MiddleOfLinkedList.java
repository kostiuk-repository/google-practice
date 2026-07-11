package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_04_02_MiddleOfLinkedList {

    /**
     * Drill 2/5 for Easy_04_MiddleOfLinkedList — One-Third Node
     * Technique: generalizes the speed ratio of Easy_04_MiddleOfLinkedList — instead of slow=1x
     * and fast=2x, use slow=1x and fast=3x, so when fast reaches the end, slow has covered
     * roughly one third of the list.
     *
     * Given the head of a singly linked list, return the node located approximately one third of
     * the way through the list, found by advancing a slow pointer 1 step and a fast pointer 3
     * steps per iteration until fast (or fast.next or fast.next.next) reaches the end.
     *
     * Example:
     * Input: head = [1,2,3,4,5,6,7,8,9]
     * Output: Node(3)
     */
    public ListNode oneThirdNode(ListNode head) {
        // TODO: Implement your solution here.
        return null;
    }
}
