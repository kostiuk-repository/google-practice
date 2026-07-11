package topic03_stacks_queues.practice;

import java.util.Queue;

public class Easy_01_04_ImplementStackUsingQueues {

    /**
     * Drill 4/5 for Easy_01_ImplementStackUsingQueues — Peek Bottom via Rotation
     * Technique: reuse the rotate-the-queue mechanism for read-only positional access
     * instead of push — rotate the whole queue around once to read the bottom element (the
     * stack's oldest element), restoring the original order once the value is read.
     *
     * Given a queue of integers representing a stack (front of the queue = top of the
     * stack), return the value at the BOTTOM of the stack (the last element of the queue)
     * without permanently changing the order of the queue's elements.
     *
     * Example:
     * Input: queue = [3,2,1] (front=3, so bottom=1)
     * Output: 1
     */
    public int peekBottomUsingRotation(Queue<Integer> queue) {
        // TODO: Implement your solution here.
        return 0;
    }
}
