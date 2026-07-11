package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_07_04_PalindromeLinkedList {

    /**
     * Drill 4/5 for Easy_07_PalindromeLinkedList — Remove The Middle, Then Check
     * Technique: combines the fast/slow middle-finding step from Easy_07_PalindromeLinkedList
     * with node deletion — for an odd-length list, first unlink the true middle node, then run
     * the remaining reverse+compare logic on what is left.
     *
     * Given the head of a singly linked list guaranteed to have an ODD number of nodes, first
     * remove the middle node from the list (using fast/slow pointers to locate it and a trailing
     * pointer to unlink it), then determine whether the REMAINING list (now even length) is a
     * palindrome. Return true or false.
     *
     * Example:
     * Input: head = [1,2,9,2,1]
     * Output: true
     * Explanation: removing the middle node 9 leaves [1,2,2,1], which is a palindrome.
     */
    public boolean isPalindromeAfterRemovingMiddle(ListNode head) {
        // TODO: Implement your solution here.
        return false;
    }
}
