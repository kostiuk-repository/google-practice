package topic02_linked_lists.practice;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Hard_03_CopyListWithRandomPointer {

    /**
     * Problem: Copy List with Random Pointer
     * 
     * A linked list of length n is given such that each node contains an additional random 
     * pointer, which could point to any node in the list, or null.
     * 
     * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, 
     * where each new node has its value set to the value of its corresponding original node. 
     * Both the next and random pointer of the new nodes should point to new nodes in the copied list.
     * 
     * Return the head of the copied linked list.
     * 
     * Challenge: Solve it in O(N) time and O(1) auxiliary space (without using a HashMap).
     */
    public Node copyRandomList(Node head) {
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
     * Mentor Question: The O(1) space constraint is typically solved by weaving the copied nodes 
     * directly into the original list (e.g. A -> A' -> B -> B' -> C -> C'). 
     * Explain the three passes needed to make this copy:
     * 1. Interleaving the copies.
     * 2. Setting random pointers.
     * 3. Splitting/unweaving the lists.
     * 
     * Your Answer: 
     * 
     */
}
