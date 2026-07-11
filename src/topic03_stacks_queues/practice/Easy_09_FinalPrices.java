package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Easy_09_FinalPrices {

    /**
     * Problem: Final Prices With a Special Discount in a Shop
     * 
     * You are given an integer array prices where prices[i] is the price of the i-th item in a shop.
     * 
     * There is a special discount for items in the shop. If you buy the i-th item, then you will 
     * receive a discount equivalent to prices[j] where j is the minimum index such that j > i 
     * and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.
     * 
     * Return an integer array answer where answer[i] is the final price you will pay for the 
     * i-th item of the shop, considering the special discount.
     * 
     * Example:
     * Input: prices = [8,4,6,2,3]
     * Output: [4,2,4,2,3]
     */
    public int[] finalPrices(int[] prices) {
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
     * Mentor Question: This is a classic "Next Smaller Element" problem. When using a 
     * Monotonic Stack here, what does the stack store (the values themselves, or their indices)? 
     * Why?
     * 
     * Your Answer: 
     * 
     */
}
