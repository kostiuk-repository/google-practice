package topic03_stacks_queues.practice;

import java.util.Deque;
import java.util.ArrayDeque;

public class Easy_06_RemoveAdjacentDuplicates {

    /**
     * Problem: Remove All Adjacent Duplicates In String
     * 
     * You are given a string s consisting of lowercase English letters. 
     * A duplicate removal consists of choosing two adjacent and equal letters and removing them.
     * 
     * We repeatedly make duplicate removals on s until we no longer can.
     * Return the final string after all such duplicate removals have been made.
     * 
     * Example:
     * Input: s = "abbaca"
     * Output: "ca"
     * Explanation: In "abbaca" we could remove "bb" since the letters are adjacent and equal, 
     * and this is the only possible move. The result of this move is that the string is "aaca", 
     * of which only "aa" is possible, so the final string is "ca".
     */
    public String removeDuplicates(String s) {
        // TODO: Implement your solution here.
        return null;
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
     * Mentor Question: Instead of using an object-based Stack (like ArrayDeque<Character>), 
     * how can you use a StringBuilder or a primitive char array as a stack to avoid 
     * the overhead of box/unbox operations in Java?
     * 
     * Your Answer: 
     * 
     */
}
