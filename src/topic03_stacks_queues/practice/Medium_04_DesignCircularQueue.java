package topic03_stacks_queues.practice;

public class Medium_04_DesignCircularQueue {

    /**
     * Problem: Design Circular Queue
     * 
     * Design your implementation of the circular queue. The circular queue is a linear data 
     * structure in which the operations are performed based on FIFO (First In First Out) principle 
     * and the last position is connected back to the first position to make a circle. 
     * It is also called "Ring Buffer".
     * 
     * One of the benefits of the circular queue is that we can make use of the spaces in front 
     * of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element 
     * even if there is a space in front of the queue. But using the circular queue, we can store 
     * the next element in those spaces.
     * 
     * Implement the MyCircularQueue class:
     * - MyCircularQueue(k) Initializes the object with the size of the queue to be k.
     * - int Front() Gets the front item from the queue. If the queue is empty, return -1.
     * - int Rear() Gets the last item from the queue. If the queue is empty, return -1.
     * - boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
     * - boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
     * - boolean isEmpty() Checks whether the circular queue is empty or not.
     * - boolean isFull() Checks whether the circular queue is full or not.
     */
    static class MyCircularQueue {
        // TODO: Define internal array and pointers.

        public MyCircularQueue(int k) {
            
        }
        
        public boolean enQueue(int value) {
            // TODO: Implement
            return false;
        }
        
        public boolean deQueue() {
            // TODO: Implement
            return false;
        }
        
        public int Front() {
            // TODO: Implement
            return 0;
        }
        
        public int Rear() {
            // TODO: Implement
            return 0;
        }
        
        public boolean isEmpty() {
            // TODO: Implement
            return false;
        }
        
        public boolean isFull() {
            // TODO: Implement
            return false;
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
     * Mentor Question: When implementing a circular queue with an array of size k, how do you 
     * handle the pointers mathematically (using modulo `%`) when incrementing them? 
     * How do you distinguish between an "empty" queue and a "full" queue since in both cases, 
     * the head and tail pointers might point to the same index?
     * 
     * Your Answer: 
     * 
     */
}
