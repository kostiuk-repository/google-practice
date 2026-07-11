package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_02_02_ImplementQueueUsingStacks {

    /**
     * Drill 2/5 for Easy_02_ImplementQueueUsingStacks — Queue With Eager Transfer
     * Technique: mirror of the original's lazy (amortized) transfer — instead of moving
     * elements from input to output only when output is empty, transfer everything back to
     * front on every single push, keeping output always fully ordered but making push the
     * expensive O(n) operation instead of pop/peek.
     *
     * Design a MyQueueEagerTransfer class using two stacks where push(x) rebuilds the
     * output stack immediately (so output's top is always the oldest element), making
     * pop() and peek() simple O(1) operations on output at the cost of an O(n) push.
     *
     * Example:
     * push(1); push(2); peek() -> 1; pop() -> 1; peek() -> 2
     */
    static class MyQueueEagerTransfer {
        private Deque<Integer> input = new ArrayDeque<>();
        private Deque<Integer> output = new ArrayDeque<>();

        public MyQueueEagerTransfer() {
            // TODO: Implement
        }

        public void push(int x) {
            // TODO: Implement (rebuild output fully on every push)
        }

        public int pop() {
            // TODO: Implement
            return 0;
        }

        public int peek() {
            // TODO: Implement
            return 0;
        }

        public boolean empty() {
            // TODO: Implement
            return true;
        }
    }
}
