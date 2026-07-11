package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_04_02_MinStack {

    /**
     * Drill 2/5 for Easy_04_MinStack — Min-Max Stack
     * Technique: combine two applications of Easy_04_MinStack's augmentation in the same
     * structure — maintain TWO auxiliary stacks side by side, one tracking the running
     * minimum and one tracking the running maximum, both updated on every push/pop.
     *
     * Design a MinMaxStack class that supports push, pop, top, getMin, and getMax, all in
     * O(1) time.
     * - MinMaxStack() initializes the stack object.
     * - void push(int val) pushes val onto the stack.
     * - void pop() removes the element on top of the stack.
     * - int top() gets the top element of the stack.
     * - int getMin() retrieves the minimum element currently in the stack.
     * - int getMax() retrieves the maximum element currently in the stack.
     *
     * Example:
     * push(5); push(1); push(9); getMin() -> 1; getMax() -> 9; pop(); getMax() -> 5
     */
    static class MinMaxStack {
        private final Deque<Integer> values = new ArrayDeque<>();
        private final Deque<Integer> mins = new ArrayDeque<>();
        private final Deque<Integer> maxes = new ArrayDeque<>();

        public MinMaxStack() {
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

        public int getMin() {
            // TODO: Implement
            return 0;
        }

        public int getMax() {
            // TODO: Implement
            return 0;
        }
    }
}
