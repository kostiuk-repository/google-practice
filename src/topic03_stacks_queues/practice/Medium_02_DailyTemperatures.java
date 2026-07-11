package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Medium_02_DailyTemperatures {

    /**
     * Problem: Daily Temperatures
     * 
     * Given an array of integers temperatures represents the daily temperatures, 
     * return an array answer such that answer[i] is the number of days you have to wait 
     * after the i-th day to get a warmer temperature. 
     * If there is no future day for which this is possible, keep answer[i] == 0 instead.
     * 
     * Example:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     */
    public int[] dailyTemperatures(int[] temperatures) {
        // TODO: Implement your solution here using a Monotonic Stack.
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
     * Mentor Question: Describe how the monotonic stack works here. Why is the stack 
     * kept in decreasing order? If we see a temperature warmer than the one at the top 
     * of the stack, what actions do we perform?
     * 
     * Your Answer: 
     * 
     */
}
