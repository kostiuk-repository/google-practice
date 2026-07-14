package topic03_stacks_queues.practice;

public class Easy_06_01_RemoveAdjacentDuplicates {

    /**
     * Drill 1/5 for Easy_06_RemoveAdjacentDuplicates — Remove K Adjacent Duplicates
     * Technique: generalizes the pair-cancellation stack in Easy_06_RemoveAdjacentDuplicates
     * (which always cancels a RUN OF 2) to a run of any size k — the stack now stores
     * (character, run-length) pairs, incrementing the count on a match and popping the
     * whole entry once the count reaches k.
     *
     * Given a string s of lowercase English letters and an integer k, repeatedly remove k
     * adjacent and equal letters until no such run of exactly k remains. Return the final
     * string.
     *
     * Example:
     * Input: s = "deeedbbcccbdaa", k = 3
     * Output: "aa"
     * Explanation: "eee" is removed first, merging the surrounding d's into a run of 2;
     * "ccc" is removed next, merging the surrounding b's into a run of 3, which is then
     * also removed; that merges the d's on either side into a run of 3, which is removed
     * too. Only "aa" (a run of 2) is left, so the final string is "aa".
     */
    public String removeDuplicatesK(String s, int k) {
        // TODO: Implement your solution here.
        return null;
    }
}
