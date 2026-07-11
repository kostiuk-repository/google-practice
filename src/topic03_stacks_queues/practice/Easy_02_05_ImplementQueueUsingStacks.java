package topic03_stacks_queues.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy_02_05_ImplementQueueUsingStacks {

    /**
     * Drill 5/5 for Easy_02_ImplementQueueUsingStacks — Double-Ended Queue Using Stacks
     * Technique: capstone that extends the two-stack input/output technique from a single-
     * ended queue to a full double-ended queue — both stacks can now be pushed/popped from,
     * and whichever side is queried transfers elements from the other stack (reversing
     * them) whenever it runs dry, generalizing the amortized-transfer idea to both ends.
     *
     * Design a MyDequeUsingStacks class using two stacks (front and back) that supports
     * pushFront(x), pushBack(x), popFront(), and popBack(), where popping from an empty
     * side transfers (and reverses) all elements from the other side first.
     *
     * Example:
     * pushBack(1); pushBack(2); pushFront(0); popFront() -> 0; popBack() -> 2
     */
    static class MyDequeUsingStacks {
        private Deque<Integer> front = new ArrayDeque<>();
        private Deque<Integer> back = new ArrayDeque<>();

        public MyDequeUsingStacks() {
            // TODO: Implement
        }

        public void pushFront(int x) {
            // TODO: Implement
        }

        public void pushBack(int x) {
            // TODO: Implement
        }

        public int popFront() {
            // TODO: Implement (transfer from back if front is empty)
            return 0;
        }

        public int popBack() {
            // TODO: Implement (transfer from front if back is empty)
            return 0;
        }
    }
}
