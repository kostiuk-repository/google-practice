package topic07_prefix_sums.practice;

public class Easy_03_03_HighestAltitude {

    /**
     * Drill 3/5 for Easy_03_HighestAltitude — Compare Two Points
     * Technique: build the altitude prefix array once, then answer many "which point is
     * higher" comparison queries in O(1) each by comparing precomputed prefix values
     * instead of recomputing altitude from scratch for each query.
     *
     * A biker starts at altitude 0, with gain[i] the net altitude change between point i
     * and point i + 1. Given gain and a list of queries where each query is a pair
     * [a, b], return an array of strings where each answer is "HIGHER" if point a is
     * strictly higher than point b, "LOWER" if strictly lower, or "EQUAL" otherwise.
     *
     * Example:
     * Input: gain = [-5,1,5,0,-7], queries = [[0,3],[1,5],[2,3]]
     * Output: ["LOWER","HIGHER","EQUAL"]
     * Explanation: altitudes = [0,-5,-4,1,1,-6]. Point 0 (0) < point 3 (1) -> LOWER.
     */
    public String[] compareAltitudes(int[] gain, int[][] queries) {
        // TODO: Implement your solution here.
        return new String[0];
    }
}
