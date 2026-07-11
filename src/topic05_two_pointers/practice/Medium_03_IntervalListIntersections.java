package topic05_two_pointers.practice;

import java.util.ArrayList;
import java.util.List;

public class Medium_03_IntervalListIntersections {

    /**
     * Problem: Interval List Intersections
     * 
     * You are given two lists of closed intervals, firstList and secondList, where 
     * firstList[i] = [start_i, end_i] and secondList[j] = [start_j, end_j]. 
     * Each list of intervals is pairwise disjoint and in sorted order.
     * 
     * Return the intersection of these two interval lists.
     * 
     * A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
     * The intersection of two closed intervals is a set of real numbers that is either empty or 
     * represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].
     * 
     * Example:
     * Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
     * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
     */
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // TODO: Implement your solution here using Two Pointers.
        return new int[0][0];
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
     * Mentor Question: When checking for an intersection between interval A = [startA, endA] 
     * and B = [startB, endB], how do you calculate the start and end of their intersection? 
     * Also, how do you decide which pointer to advance (i.e., whether to move indexA or indexB)?
     * 
     * Your Answer: 
     * 
     */
}
