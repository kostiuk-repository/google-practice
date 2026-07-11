package topic06_sliding_window.practice;



public class Easy_08_04_SubstringSizeThree {

    /**
     * Drill 4/5 for Easy_08_SubstringSizeThree — Fixed size window with at most maxDistinct distinct characters
     *
     * Input: s = "abacab", size = 3, maxDistinct = 2
     * Output: 4 ("aba", "aca", "cab" is distinct=2, "abacab" -> aba (2), bac (3), aca (2), cab (3), so 2 substrings of size 3 have <= 2 distinct characters? Actually wait: aba, aca are <= 2 distinct. Wait, let's trace: aba (a,b), bac (b,a,c -> 3), aca (a,c), cab (c,a,b -> 3). Yes, so 2)
     */
    public int countGoodSubstringsAtMostKDistinct(String s, int size, int maxDistinct) {
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
     * Mentor Question: How do we adjust the distinct character count when sliding a fixed-size window?
     * 
     * Your Answer: 
     * 
     */
}
