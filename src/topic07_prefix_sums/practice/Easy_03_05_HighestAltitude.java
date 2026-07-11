package topic07_prefix_sums.practice;

public class Easy_03_05_HighestAltitude {

    /**
     * Drill 5/5 for Easy_03_HighestAltitude — Sub-Trip Highest Altitude
     * Technique: capstone — build the altitude prefix array once, then reuse it to
     * answer many "highest altitude reached during just this sub-range of the trip
     * (restarting the sub-trip at altitude 0)" queries, combining build-once-query-many
     * with the max-so-far idea from the original problem.
     *
     * A biker starts at altitude 0, with gain[i] the net altitude change between point i
     * and point i + 1. Given gain and a list of queries where each query is a range
     * [l, r] (l <= r, indices into the altitude array), treat the segment as an
     * independent mini-trip that starts fresh at altitude 0 at point l, and return the
     * highest altitude reached within altitudes[l..r] relative to altitudes[l].
     *
     * Example:
     * Input: gain = [-5,1,5,0,-7], queries = [[1,3],[0,5]]
     * Output: [6, 1]
     * Explanation: altitudes = [0,-5,-4,1,1,-6]. Sub-trip [1,3]: max(altitudes[1..3]) = 1,
     * relative to altitudes[1] = -5, so answer = 1 - (-5) = 6. Sub-trip [0,5]:
     * max(altitudes[0..5]) = 1, relative to altitudes[0] = 0, so answer = 1 - 0 = 1.
     */
    public int[] highestAltitudeInRange(int[] gain, int[][] queries) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
