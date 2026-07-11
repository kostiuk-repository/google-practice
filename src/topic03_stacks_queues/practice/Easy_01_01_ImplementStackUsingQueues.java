package topic03_stacks_queues.practice;

import java.util.Queue;

public class Easy_01_01_ImplementStackUsingQueues {

    /**
     * Drill 1/5 for Easy_01_ImplementStackUsingQueues — Rotate Queue After Push
     * Technique: single-queue rotation trick — enqueue the new element, then rotate the
     * queue (dequeue-and-enqueue repeatedly) so the newest element ends up at the front,
     * which is the exact rotation insight that lets MyStack.push work with just one queue.
     *
     * Given a queue of integers representing a stack (front of the queue = top of the
     * stack) and a new value x, push x onto the queue and then rotate the queue so that x
     * becomes the new front. Return the same queue instance after the rotation.
     *
     * Example:
     * Input: queue = [3,2,1] (front=3), x = 5
     * Output: [5,3,2,1] (front=5)
     * Explanation: 5 is enqueued at the back, then the queue is rotated (its previous
     * size) times so 5 moves from the back all the way to the front.
     */
    public Queue<Integer> rotateQueueForPush(Queue<Integer> queue, int x) {
        // TODO: Implement your solution here.
        return queue;
    }
}
