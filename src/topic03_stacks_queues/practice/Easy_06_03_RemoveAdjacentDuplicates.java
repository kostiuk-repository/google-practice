package topic03_stacks_queues.practice;

import java.util.*;

public class Easy_06_03_RemoveAdjacentDuplicates {

    /**
     * Drill 3/5 for Easy_06_RemoveAdjacentDuplicates — Remove Adjacent Duplicates with Wildcards
     * Technique: stack-based pair-cancellation with dynamic matching.
     *
     * Given a string s, the character '*' acts as a wildcard that can match and cancel
     * any adjacent character. Repeatedly remove such pairs until no duplicate or wildcard-matched
     * pair remains.
     *
     * Example:
     * Input: s = "ab*ba"
     * Output: "a"
     * Explanation: '*' cancels adjacent 'b', leaving "aba". Then 'b' and 'a' don't match, so "aba" remains.
     */
    public String removeDuplicatesWildcard(String s) {
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
     * Mentor Question: How does the presence of a wildcard affect the stack-based pair-cancellation logic? Do we need to look ahead?
     * 
     * Your Answer: 
     * 
     */
}
