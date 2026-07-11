package topic03_stacks_queues.practice;

import java.util.Queue;
import java.util.LinkedList;

public class Easy_08_TimeNeededToBuyTickets {

    /**
     * Problem: Time Needed to Buy Tickets
     * 
     * There are n people in a line queuing to buy tickets, where the 0-th person is at the 
     * front of the line and the (n - 1)-th person is at the back of the line.
     * 
     * You are given a 0-indexed integer array tickets of length n where the number of tickets 
     * that the i-th person would like to buy is tickets[i].
     * 
     * Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time 
     * and has to go back to the end of the line (which happens instantaneously) to buy more tickets. 
     * If a person has no more tickets to buy, they leave the line.
     * 
     * Return the time taken for the person at index k (0-indexed) to finish buying tickets.
     * 
     * Example:
     * Input: tickets = [2,3,2], k = 2
     * Output: 6
     */
    public int timeRequiredToBuy(int[] tickets, int k) {
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
     * Mentor Question: You can simulate this using a Queue, but there is a mathematical way 
     * to solve this in a single O(N) pass without any queue simulation. 
     * Explain the logic for calculating how many tickets people before index `k` and people 
     * after index `k` will buy before person `k` finishes.
     * 
     * Your Answer: 
     * 
     */
}
