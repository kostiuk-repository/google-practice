package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_02_03_ImplementQueueUsingStacks {

    /**
     * Drill 3/5 for Easy_02_ImplementQueueUsingStacks — Palindrome via Stack Reversal
     * Technique: combine the input-to-output transfer (which reverses order) with a
     * comparison step — reversing a sequence with one stack and comparing it element by
     * element against the original order is exactly how the two-stack queue exposes FIFO
     * order out of LIFO storage.
     *
     * Given an array of integers nums, push every element onto a stack (so the stack holds
     * them in reverse), then transfer them into a second stack (reversing them again, back
     * to original order), and compare the two stacks' pop order to determine whether nums
     * reads the same forwards and backwards. Return true if nums is a palindrome.
     *
     * Example:
     * Input: nums = [1,2,3,2,1]
     * Output: true
     */
    public boolean isPalindromeViaStackReversal(int[] nums) {
        // TODO: Implement your solution here.
        return false;
    }
}
