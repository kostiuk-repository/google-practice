package topic04_hash_tables.practice;

import java.util.*;

public class Hard_01_04_MaxPointsOnLine {

    /**
     * Drill 4/5 for Hard_01_MaxPointsOnLine — Count Collinear Triplets
     * Technique: geometry, cross product / slope comparison
     *
     * Given an array of points, return the number of triplets (i, j, k) of distinct 
     * indices (i < j < k) such that the points[i], points[j], and points[k] are collinear.
     */
    public int countCollinearTriplets(int[][] points) {
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
     * Mentor Question: To check if three points A(x1, y1), B(x2, y2), and C(x3, y3) 
     * are collinear, we can check if their cross product equals zero: 
     * (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1).
     * Explain why this approach is safer than comparing slopes as floating-point values.
     * 
     * Your Answer: 
     * 
     */
}
