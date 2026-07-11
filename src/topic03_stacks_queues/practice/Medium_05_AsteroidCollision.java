package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Medium_05_AsteroidCollision {

    /**
     * Problem: Asteroid Collision
     * 
     * We are given an array asteroids of integers representing asteroids in a row.
     * For each asteroid, the absolute value represents its size, and the sign represents 
     * its direction (positive meaning right, negative meaning left). Each asteroid moves 
     * at the same speed.
     * 
     * Find out the state of the asteroids after all collisions. If two asteroids meet, 
     * the smaller one will explode. If both are the same size, both will explode. 
     * Two asteroids moving in the same direction will never meet.
     * 
     * Example:
     * Input: asteroids = [5,10,-5]
     * Output: [5,10]
     * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
     * 
     * Example 2:
     * Input: asteroids = [10,2,-5]
     * Output: [10]
     * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
     */
    public int[] asteroidCollision(int[] asteroids) {
        // TODO: Implement your solution here using a Stack.
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
     * Mentor Question: Under what direction conditions will asteroids collide? 
     * (e.g. Does a right-moving asteroid at the left collide with a left-moving asteroid at the right? 
     * What about left-moving on left and right-moving on right?).
     * Explain how the Stack handles the collision loop.
     * 
     * Your Answer: 
     * 
     */
}
