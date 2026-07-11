package topic10_dfs_bfs.practice;

public class Hard_03_02_ShortestPathAllKeys {

    /**
     * Drill 2/5 for Hard_03_ShortestPathAllKeys — Can Unlock Gate
     * Technique: verify if the gate represented by an uppercase char (e.g. 'A'-'F') can be unlocked
     * using the key possession bitmask.
     *
     * Input: gate = 'A', keyMask = 1 (bitmask for having key 'a' only)
     * Output: true
     */
    public boolean canUnlock(char gate, int keyMask) {
        // TODO: Implement your solution here.
        return false;
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
     * Mentor Question: How does the bitwise operation `(keyMask & (1 << (gate - 'A')))` check if we have the corresponding key?
     * 
     * Your Answer: 
     * 
     */
}
