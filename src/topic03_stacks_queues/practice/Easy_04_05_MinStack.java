package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_04_05_MinStack {

    /**
     * Drill 5/5 for Easy_04_MinStack — Min Stack With Pop-Min
     * Technique: capstone that extends Easy_04_MinStack's min-tracking augmentation to
     * support removing the minimum element specifically — wherever it sits in the stack —
     * rather than only ever popping from the top, requiring the structure to rebuild itself
     * around the removed element while keeping relative order of the rest intact.
     *
     * Design a MinStackWithPopMin class that supports push, pop (removes the top), top,
     * getMin, and popMin (removes and returns the current minimum element from wherever it
     * is in the stack, preserving the relative order of the remaining elements).
     * - MinStackWithPopMin() initializes the stack object.
     * - void push(int val) pushes val onto the stack.
     * - int pop() removes and returns the element on top of the stack.
     * - int top() gets the top element of the stack.
     * - int getMin() retrieves the minimum element currently in the stack.
     * - int popMin() removes and returns the minimum element, wherever it is in the stack.
     *
     * Example:
     * push(5); push(1); push(3); popMin() -> 1 (removes the 1, stack becomes [5,3] with
     * 5 below 3); top() -> 3; getMin() -> 3
     */
    static class MinStackWithPopMin {
        private final Deque<Integer> values = new ArrayDeque<>();

        public MinStackWithPopMin() {
            // TODO: Implement
        }

        public void push(int val) {
            // TODO: Implement
        }

        public int pop() {
            // TODO: Implement
            return 0;
        }

        public int top() {
            // TODO: Implement
            return 0;
        }

        public int getMin() {
            // TODO: Implement
            return 0;
        }

        public int popMin() {
            // TODO: Implement
            return 0;
        }
    }
}
