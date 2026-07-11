package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_04_04_MinStack {

    /**
     * Drill 4/5 for Easy_04_MinStack — Sum Stack
     * Technique: same augmentation pattern as Easy_04_MinStack (a second stack recomputed
     * on every push/pop), but tracking a different running aggregate — the SUM of all
     * elements currently in the stack — instead of the minimum.
     *
     * Design a SumStack class that supports push, pop, top, and getSum, all in O(1) time.
     * - SumStack() initializes the stack object.
     * - void push(int val) pushes val onto the stack.
     * - void pop() removes the element on top of the stack.
     * - int top() gets the top element of the stack.
     * - int getSum() retrieves the sum of all elements currently in the stack.
     *
     * Example:
     * push(3); push(5); getSum() -> 8; push(2); getSum() -> 10; pop(); getSum() -> 8
     */
    static class SumStack {
        private final Deque<Integer> values = new ArrayDeque<>();
        private final Deque<Integer> sums = new ArrayDeque<>();

        public SumStack() {
            // TODO: Implement
        }

        public void push(int val) {
            // TODO: Implement
        }

        public void pop() {
            // TODO: Implement
        }

        public int top() {
            // TODO: Implement
            return 0;
        }

        public int getSum() {
            // TODO: Implement
            return 0;
        }
    }
}
