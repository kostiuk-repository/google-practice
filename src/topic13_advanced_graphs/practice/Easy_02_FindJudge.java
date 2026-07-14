package topic13_advanced_graphs.practice;

public class Easy_02_FindJudge {

        /**
     * Problem: Find the Town Judge
     *
     * In a town, there are n people labeled from 1 to n. There is a rumor that one of
     * these people is secretly the town judge.
     *
     * If the town judge exists, then:
     *
     *   - The town judge trusts nobody.
     *   - Everybody (except for the town judge) trusts the town judge.
     *   - There is exactly one person that satisfies properties 1 and 2.
     *
     * You are given an array trust where trust[i] = [a_i, b_i] representing that the
     * person labeled a_i trusts the person labeled b_i. If a trust relationship does
     * not exist in trust array, then such a trust relationship does not exist.
     *
     * Return the label of the town judge if the town judge exists and can be
     * identified, or return -1 otherwise.
     *
     * Example 1:
     * Input: n = 2, trust = [[1,2]]
     * Output: 2
     * Example 2:
     * Input: n = 3, trust = [[1,3],[2,3]]
     * Output: 3
     * Example 3:
     * Input: n = 3, trust = [[1,3],[2,3],[3,1]]
     * Output: -1
     * Constraints:
     *
     *   - 1 <= n <= 1000
     *   - 0 <= trust.length <= 10^4
     *   - trust[i].length == 2
     *   - All the pairs of trust are unique.
     *   - a_i != b_i
     *   - 1 <= a_i, b_i <= n
     */
    public int findJudge(int n, int[][] trust) {
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
     * Mentor Question: Як змоделювати довіру через вхідні та вихідні ступені вершин (in-degree / out-degree)?
     * 
     * Your Answer: 
     * 
     */
}
