package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_09_03_BinaryToInteger {

    /**
     * Drill 3/5 for Easy_09_BinaryToInteger — Divisible By Three?
     * Technique: replaces the value-building accumulate of Easy_09_BinaryToInteger
     * (result = result*2 + bit) with a MODULAR streaming accumulate
     * (remainder = (remainder*2 + bit) % 3), avoiding ever materializing the full (possibly huge)
     * decimal value.
     *
     * Given head, a reference to a singly-linked list whose node values are 0 or 1 representing a
     * binary number (most significant bit at head), return true if the number represented is
     * evenly divisible by 3, without computing the full decimal value.
     *
     * Example:
     * Input: head = [1,1,0]
     * Output: true
     * Explanation: binary 110 = 6, and 6 is divisible by 3.
     */
    public boolean isDivisibleByThree(ListNode head) {
        // TODO: Implement your solution here.
        return false;
    }
}
