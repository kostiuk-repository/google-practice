package topic03_stacks_queues.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Easy_01_ImplementStackUsingQueues {

    /**
     * Problem: Implement Stack using Queues
     * 
     * Implement a last-in-first-out (LIFO) stack using only two queues. 
     * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
     * 
     * You must use only standard operations of a queue, which means only push to back, 
     * peek/pop from front, size, and is empty operations are valid.
     */
    static class MyStack {
        // TODO: Define your queues here.

        public MyStack() {
            
        }
        
        public void push(int x) {
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
        
        public boolean empty() {
            // TODO: Implement
            return true;
        }
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: It is actually possible to implement this stack using only ONE queue. 
     * Explain how you can rotate the queue during `push(int x)` to make it behave like a stack. 
     * What is the time complexity of `push` in this case?
     * 
     * Your Answer: 
     * 
     */
}
