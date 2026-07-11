package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_02_04_ImplementQueueUsingStacks {

    /**
     * Drill 4/5 for Easy_02_ImplementQueueUsingStacks — Kth From Front
     * Technique: generalizes the input/output transfer to arbitrary positional access —
     * transfer just enough elements from input to output to expose the k-th-from-front
     * element, read it, then transfer everything back to input so the queue's logical
     * order is fully restored.
     *
     * Given two stacks, input (holding a queue's elements with the most-recently-pushed on
     * top) and output (assumed empty), and an index k, return the value of the k-th element
     * from the FRONT of the queue (0-indexed) without permanently losing any elements —
     * both stacks must be restored to their original queue order (all elements back in
     * input) before returning.
     *
     * Example:
     * Input: input represents queue [1,2,3,4] front-to-back, k = 2
     * Output: 3
     */
    public int kthFromFront(Deque<Integer> input, Deque<Integer> output, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
