package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Easy_04_MinStack {

    /**
     * Problem: Min Stack
     * 
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time O(1).
     * 
     * Implement the MinStack class:
     * - MinStack() initializes the stack object.
     * - void push(int val) pushes the element val onto the stack.
     * - void pop() removes the element on the top of the stack.
     * - int top() gets the top element of the stack.
     * - int getMin() retrieves the minimum element in the stack.
     */
    static class MinStack {
        // TODO: Define your structure here.

        public MinStack() {
            
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
     * Mentor Question: A simple implementation uses two stacks (one for values, one for minimums). 
     * How can we optimize this to use only ONE stack where each node stores a pair of values, 
     * or by storing the difference between the value and the minimum? 
     * What are the trade-offs of these optimizations?
     * 
     * Your Answer: 
     * 
     */
}
