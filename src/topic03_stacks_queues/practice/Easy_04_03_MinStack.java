package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_04_03_MinStack {

    /**
     * Drill 3/5 for Easy_04_MinStack — Min Stack With Difference Encoding
     * Technique: the single-stack optimization of Easy_04_MinStack's two-stack idea — store
     * only ONE stack, where each pushed value is replaced by (val - currentMin), and a
     * single variable tracks the current minimum. When the stored difference is negative,
     * it means val was a new minimum, and the old minimum can be recovered algebraically.
     *
     * Design a MinStackEncoded class that supports push, pop, top, and getMin, all in O(1)
     * time, using only ONE internal stack of longs (no second auxiliary stack of minimums
     * allowed) plus one variable holding the current minimum.
     * - MinStackEncoded() initializes the stack object.
     * - void push(int val) pushes val onto the stack.
     * - void pop() removes the element on top of the stack.
     * - int top() gets the actual (decoded) top element of the stack.
     * - int getMin() retrieves the minimum element currently in the stack.
     *
     * Example:
     * push(3); push(1); push(2); getMin() -> 1; top() -> 2; pop(); pop(); getMin() -> 3
     */
    static class MinStackEncoded {
        private final Deque<Long> diffs = new ArrayDeque<>();
        private long currentMin;

        public MinStackEncoded() {
            // TODO: Implement
        }

        public void push(int val) {
            // TODO: Implement (store val - currentMin, update currentMin if val is smaller)
        }

        public void pop() {
            // TODO: Implement (restore previous currentMin if the popped diff is negative)
        }

        public int top() {
            // TODO: Implement (decode: if top diff >= 0, value = diff + currentMin; else value = currentMin)
            return 0;
        }

        public int getMin() {
            // TODO: Implement
            return 0;
        }
    }
}
