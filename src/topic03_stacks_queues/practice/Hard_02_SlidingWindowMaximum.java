package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Hard_02_SlidingWindowMaximum {

    /**
     * Problem: Sliding Window Maximum
     * 
     * You are given an array of integers nums, there is a sliding window of size k which is 
     * moving from the very left of the array to the very right. You can only see the k numbers 
     * in the window. Each time the sliding window moves right by one position.
     * 
     * Return the max sliding window.
     * 
     * Example:
     * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
     * Output: [3,3,5,5,6,7]
     * Explanation: 
     * Window position                Max
     * ---------------               ----
     * [1  3  -1] -3  5  3  6  7       3
     *  1 [3  -1  -3] 5  3  6  7       3
     *  1  3 [-1  -3  5] 3  6  7       5
     *  1  3  -1 [-3  5  3] 6  7       5
     *  1  3  -1  -3 [5  3  6] 7       6
     *  1  3  -1  -3  5 [3  6  7]      7
     * 
     * Constraint: Solve it in O(N) time complexity using a Monotonic Queue (Deque).
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO: Implement your solution here.
        return new int[0];
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
     * Mentor Question: A Monotonic Deque (Double-ended Queue) is used here. 
     * Why do we pop elements from the BACK of the Deque when a new element is added, 
     * and when/why do we pop from the FRONT of the Deque?
     * 
     * Your Answer: 
     * 
     */
}
