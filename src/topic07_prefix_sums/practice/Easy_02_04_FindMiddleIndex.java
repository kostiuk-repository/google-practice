package topic07_prefix_sums.practice;

import java.util.List;

public class Easy_02_04_FindMiddleIndex {

    /**
     * Drill 4/5 for Easy_02_FindMiddleIndex — Batch Middle Index Lookup
     * Technique: apply the leftSum == rightSum prefix decomposition independently to
     * several arrays in one call, reusing the same per-array O(n) scan for each.
     *
     * Given a list of integer arrays, return a list of integers where the i-th value is
     * the middle index (as defined in Easy_02_FindMiddleIndex) of the i-th array, or -1
     * if that array has no middle index.
     *
     * Example:
     * Input: arrays = [[2,3,-1,8,4], [1,-1,4]]
     * Output: [3, 2]
     * Explanation: First array's middle index is 3. Second array: left at i=2 is 1-1=0,
     * right is empty sum 0, so index 2 works.
     */
    public List<Integer> findMiddleIndices(List<int[]> arrays) {
        // TODO: Implement your solution here.
        return new java.util.ArrayList<>();
    }
}
