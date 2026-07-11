package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Hard_01_LargestRectangleInHistogram {

    /**
     * Problem: Largest Rectangle in Histogram
     * 
     * Given an array of integers heights representing the histogram's bar height where the width 
     * of each bar is 1, return the area of the largest rectangle in the histogram.
     * 
     * Example:
     * Input: heights = [2,1,5,6,2,3]
     * Output: 10
     * Explanation: The largest rectangle is shown in the red area, which has an area = 10 units.
     * (formed by bars 5 and 6, width 2, height 5).
     * 
     * Constraint: Solve it in O(N) time complexity using a Monotonic Stack.
     */
    public int largestRectangleArea(int[] heights) {
        // TODO: Implement your solution here.
        return 0;
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
     * Mentor Question: Explain the mechanism of the monotonic stack in this problem. 
     * 1. What does the stack store (heights or indices)?
     * 2. Why do we pop elements when we see a height smaller than the top of the stack?
     * 3. How do we calculate the width of the rectangle when we pop an element?
     * 
     * Your Answer: 
     * 
     */
}
