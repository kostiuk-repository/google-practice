package topic05_two_pointers.practice;

public class Medium_05_CompareVersionNumbers {

    /**
     * Problem: Compare Version Numbers
     * 
     * Given two version strings, version1 and version2, compare them.
     * A version string consists of revisions separated by dots '.'. The value of the 
     * revision is its integer conversion ignoring leading zeroes.
     * 
     * To compare version strings, compare their revisions in left-to-right order. 
     * Revisions are compared by their integer values. If one of the version strings has fewer 
     * revisions, treat the missing revisions as 0.
     * 
     * Return:
     * - If version1 < version2, return -1.
     * - If version1 > version2, return 1.
     * - Otherwise, return 0.
     * 
     * Example:
     * Input: version1 = "1.01", version2 = "1.001"
     * Output: 0
     * Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer 1.
     * 
     * Challenge: Implement this without using String.split() to save O(N) auxiliary space. 
     * Use two pointers traversing both strings in a single pass.
     */
    public int compareVersion(String version1, String version2) {
        // TODO: Implement your solution here using Two Pointers in O(1) auxiliary space.
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
     * Mentor Question: Since you are traversing the strings directly using index pointers 
     * instead of using `String.split()`, how do you parse the integer value of a revision block 
     * character-by-character while handling arbitrary numbers of digits (without overflow)?
     * 
     * Your Answer: 
     * 
     */
}
