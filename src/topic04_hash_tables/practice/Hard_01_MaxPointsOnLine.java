package topic04_hash_tables.practice;

import java.util.HashMap;
import java.util.Map;

public class Hard_01_MaxPointsOnLine {

    /**
     * Problem: Max Points on a Line
     * 
     * Given an array of points where points[i] = [xi, yi] represents a point on the 2D plane, 
     * return the maximum number of points that lie on the same straight line.
     * 
     * Example:
     * Input: points = [[1,1],[2,2],[3,3]]
     * Output: 3
     */
    public int maxPoints(int[][] points) {
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
     * Mentor Question: A straight line through point P is uniquely determined by its slope. 
     * 1. How do you calculate the slope between two points (x1, y1) and (x2, y2)?
     * 2. Floating-point division (e.g. `(double)(y2 - y1) / (x2 - x1)`) suffers from precision issues 
     *    which can cause different slopes to round to the same value (collision). How do you represent 
     *    the slope as a coprime fraction (using GCD) or a string key to avoid floating-point errors?
     * 
     * Your Answer: 
     * 
     */
}
