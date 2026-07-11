package topic03_stacks_queues.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Easy_01_03_ImplementStackUsingQueues {

    /**
     * Drill 3/5 for Easy_01_ImplementStackUsingQueues — Stack With Expensive Pop
     * Technique: mirror of the original two-queue design — instead of making push
     * expensive (transfer-on-push), keep push O(1) (plain enqueue) and make pop/top
     * expensive by transferring n-1 elements to a helper queue, popping the last one,
     * then swapping the two queue references.
     *
     * Design a MyStackPopCostly class using two queues where push(x) is a simple O(1)
     * enqueue onto the primary queue, and pop()/top() do the O(n) work of moving all but
     * the last element into a secondary queue before returning the last element.
     *
     * Example:
     * push(1); push(2); push(3); pop() -> 3 (queue1 held [1,2,3]; 1 and 2 are moved to
     * queue2, 3 is polled and returned, then the primary/secondary references are swapped).
     */
    static class MyStackPopCostly {
        private Queue<Integer> primary = new LinkedList<>();
        private Queue<Integer> secondary = new LinkedList<>();

        public MyStackPopCostly() {
            // TODO: Implement
        }

        public void push(int x) {
            // TODO: Implement (O(1) enqueue onto primary)
        }

        public int pop() {
            // TODO: Implement (transfer all but last to secondary, then swap references)
            return 0;
        }

        public int top() {
            // TODO: Implement
            return 0;
        }

        public boolean empty() {
            // TODO: Implement
            return true;
        }
    }
}
