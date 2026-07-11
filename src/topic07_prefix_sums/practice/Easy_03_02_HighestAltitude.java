package topic07_prefix_sums.practice;

public class Easy_03_02_HighestAltitude {

    /**
     * Drill 2/5 for Easy_03_HighestAltitude — Altitude Change Between Two Points
     * Technique: build the altitude prefix array once (as in Easy_03_HighestAltitude),
     * then reuse it to answer many "altitude change between two points" queries in O(1)
     * each via prefix-array subtraction, instead of re-walking the gain array per query.
     *
     * A biker starts at altitude 0, with gain[i] the net altitude change between point i
     * and point i + 1. Given gain and a list of queries where each query is a pair
     * [from, to], return an array of answers where each answer is the altitude at point
     * "to" minus the altitude at point "from".
     *
     * Example:
     * Input: gain = [-5,1,5,0,-7], queries = [[0,2],[1,4],[0,5]]
     * Output: [-4,-2,-6]
     * Explanation: altitudes = [0,-5,-4,1,1,-6]. altitudes[2]-altitudes[0] = -4-0 = -4.
     */
    public int[] altitudeChangeBetween(int[] gain, int[][] queries) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
