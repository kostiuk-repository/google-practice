package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_04_01_MinStack {

    /**
     * Drill 1/5 for Easy_04_MinStack — Max Stack
     * Technique: mirror of Easy_04_MinStack's two-stack augmentation — instead of a second
     * stack tracking the running MINIMUM alongside every push, track the running MAXIMUM,
     * pushing onto the auxiliary stack only when the new value is >= its current top.
     *
     * Design a MaxStack class that supports push, pop, top, and retrieving the maximum
     * element in O(1) time.
     * - MaxStack() initializes the stack object.
     * - void push(int val) pushes val onto the stack.
     * - void pop() removes the element on top of the stack.
     * - int top() gets the top element of the stack.
     * - int getMax() retrieves the maximum element currently in the stack.
     *
     * Example:
     * push(3); push(1); push(5); getMax() -> 5; pop(); getMax() -> 3
     */
    static class MaxStack {
        private final Deque<Integer> values = new ArrayDeque<>();
        private final Deque<Integer> maxes = new ArrayDeque<>();

        public MaxStack() {
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

        public int getMax() {
            // TODO: Implement
            return 0;
        }
    }
}
