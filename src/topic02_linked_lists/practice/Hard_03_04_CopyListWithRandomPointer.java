package topic02_linked_lists.practice;



public class Hard_03_04_CopyListWithRandomPointer {

    /**
     * Drill 4/5 for Hard_03_CopyListWithRandomPointer — Set Random Pointers in Interleaved List
     * Technique: interleaved random pointer resolution
     *
     * Given an interleaved list where original and copy nodes alternate, set the random pointers of the copy nodes. Return head.
     *
     * Input: A -> A' -> B -> B' where A.random = B
     * Output: A -> A' -> B -> B' where A'.random = B'
     */
    public Node setRandomPointersInInterleaved(Node head) {
        // TODO: Implement your solution here.
        return null;
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
     * Mentor Question: Чому ми можемо безпечно писати curr.next.random = curr.random.next, не турбуючись про втрату оригінальних зв'язків? Що робити, якщо curr.random є null?
     * 
     * Your Answer: 
     * 
     */
}
