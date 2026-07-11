package topic03_stacks_queues.practice;

import java.util.Queue;

public class Easy_01_05_ImplementStackUsingQueues {

    /**
     * Drill 5/5 for Easy_01_ImplementStackUsingQueues — Kth From Top via Rotation
     * Technique: generalizes the rotation trick from a fixed position (front or back) to an
     * arbitrary position k — rotate the queue k times to bring the k-th element to the
     * front, read it, then rotate the remainder back to restore the original order.
     *
     * Given a queue of integers representing a stack (front of the queue = top of the
     * stack, index 0) and an index k, return the value of the k-th element from the top
     * (0-indexed) without permanently changing the order of the queue's elements.
     *
     * Example:
     * Input: queue = [5,4,3,2,1] (front=5), k = 2
     * Output: 3
     * Explanation: Counting from the top (0-indexed): 5(0), 4(1), 3(2). The element at
     * index 2 is 3.
     */
    public int kthFromTopUsingQueue(Queue<Integer> queue, int k) {
        // TODO: Implement your solution here.
        return 0;
    }
}
