package topic02_linked_lists.practice;

import topic02_linked_lists.ListNode;

public class Easy_09_02_BinaryToInteger {

    /**
     * Drill 2/5 for Easy_09_BinaryToInteger — Least Significant Bit At Head
     * Technique: mirrors the positional convention of Easy_09_BinaryToInteger — instead of the
     * most significant bit being at the head (allowing a simple left-to-right
     * result = result*2 + bit accumulate), the LEAST significant bit is at the head here, which
     * requires tracking the power of two for each position instead.
     *
     * Given head, a reference to a singly-linked list whose node values are 0 or 1, where the
     * LEAST significant bit is at the head (reverse of Easy_09_BinaryToInteger's convention),
     * return the decimal value of the number represented.
     *
     * Example:
     * Input: head = [1,0,1]
     * Output: 5
     * Explanation: LSB-first bits 1,0,1 represent binary 101 read tail-to-head, which is 5.
     */
    public int getDecimalValueLsbFirst(ListNode head) {
        // TODO: Implement your solution here.
        return 0;
    }
}
