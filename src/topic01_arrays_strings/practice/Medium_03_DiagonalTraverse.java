package topic01_arrays_strings.practice;

public class Medium_03_DiagonalTraverse {

    /**
     * Problem: Diagonal Traverse
     * 
     * Given an m x n matrix mat, return an array of all the elements of the array 
     * in a diagonal order.
     * 
     * Example:
     * Input: mat = [[1,2,3],
     *               [4,5,6],
     *               [7,8,9]]
     * Output: [1,2,4,7,5,3,6,8,9]
     */
    public int[] findDiagonalOrder(int[][] mat) {
        // TODO: Implement your solution here.
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
     * Mentor Question: Diagonal traversal swaps directions (up-right vs. down-left). 
     * When moving up-right and hitting the top boundary (row < 0) or the right boundary (col >= n), 
     * how do you mathematically adjust row and col to transition to the next diagonal? 
     * Which boundary check must take precedence to avoid array index bounds issues?
     * 
     * Your Answer: 
     * 
     */
}
