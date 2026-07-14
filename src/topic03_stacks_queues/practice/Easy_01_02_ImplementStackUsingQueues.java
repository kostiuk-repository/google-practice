package topic03_stacks_queues.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Easy_01_02_ImplementStackUsingQueues {

    /**
     * Drill 2/5 for Easy_01_ImplementStackUsingQueues — Stack Using a Single Queue
     * Technique: full realization of the single-queue rotation trick — every push enqueues
     * the new value then rotates the queue (size - 1) times so the newest value is always
     * at the front, which makes pop/top trivial O(1) front operations.
     *
     * Design a MyStackOneQueue class that implements a LIFO stack using exactly ONE queue
     * (no auxiliary queue or stack allowed). Support push(x), pop(), top(), and empty(),
     * using only standard queue operations (offer to back, poll/peek from front, size).
     *
     * Example:
     * push(1); push(2); push(3); top() -> 3; pop() -> 3; top() -> 2
     */
    static class MyStackOneQueue {
        private final Queue<Integer> queue = new LinkedList<>();

        public MyStackOneQueue() {
            // TODO: Implement
        }

        public void push(int x) {
            // TODO: Implement using enqueue + rotation.
        }

        public int pop() {
            // TODO: Implement
            return 0;
        }

        public int top() {
            // TODO: Implement
            return 0;
        }

        public boolean empty() {
            // TODO: Implement
            return false;
        }
    }
}
