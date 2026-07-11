package topic02_linked_lists;

/**
 * Example Problem: Reverse Linked List
 * 
 * Problem Statement:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Example:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Constraint: Solve it in-place using O(1) extra space.
 */
public class Example {

    public ListNode reverseList(ListNode head) {
        // =========================================================================
        // STEP 1: CLARIFICATION & CONSTRAINTS (Gathering requirements)
        // =========================================================================
        // - "Can the list be empty?" -> Yes, head can be null.
        // - "Can we modify the original list in-place?" -> Yes, modifying in-place is preferred.
        // - "What is the range of number of nodes?" -> The number of nodes is in the range [0, 5000].
        // - "What are the node values?" -> Between -5000 and 5000.
        
        // =========================================================================
        // STEP 2: GUARD CLAUSES / EDGE CASES (Handling invalid/extreme inputs)
        // =========================================================================
        if (head == null || head.next == null) {
            return head; // If empty or only one element, it's already reversed.
        }

        // =========================================================================
        // STEP 3: HIGH-LEVEL ALGORITHM & COMPLEXITY DESIGN
        // =========================================================================
        // Iterative Approach:
        // We maintain three pointers:
        // - 'prev' (initially null): keeps track of the reversed portion.
        // - 'curr' (initially head): the node we are currently reversing.
        // - 'nextTemp' (temporary): stores the next node before we break the link.
        //
        // Loop process:
        // 1. Store next node: nextTemp = curr.next
        // 2. Reverse link: curr.next = prev
        // 3. Move prev forward: prev = curr
        // 4. Move curr forward: curr = nextTemp
        //
        // Time Complexity: O(N) since we visit each node exactly once.
        // Space Complexity: O(1) auxiliary space as we only re-assign pointers.

        // =========================================================================
        // STEP 4: CLEAN IMPLEMENTATION
        // =========================================================================
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // 1. Save next node reference
            curr.next = prev;              // 2. Reverse current pointer link
            prev = curr;                   // 3. Move prev one step forward
            curr = nextTemp;               // 4. Move curr one step forward
        }

        return prev; // 'prev' ends up pointing to the new head of the reversed list
    }

    // =========================================================================
    // STEP 5: DRY RUN / TESTING (Walkthrough with sample inputs)
    // =========================================================================
    /*
     * Test Case 1: head = [1, 2, 3]
     * - Initialization: prev = null, curr = Node(1)
     * 
     * - Loop Iteration 1:
     *     nextTemp = curr.next = Node(2)
     *     curr.next = prev = null  (Node(1) now points to null)
     *     prev = curr = Node(1)
     *     curr = nextTemp = Node(2)
     * 
     * - Loop Iteration 2:
     *     nextTemp = curr.next = Node(3)
     *     curr.next = prev = Node(1) (Node(2) now points to Node(1))
     *     prev = curr = Node(2)
     *     curr = nextTemp = Node(3)
     * 
     * - Loop Iteration 3:
     *     nextTemp = curr.next = null
     *     curr.next = prev = Node(2) (Node(3) now points to Node(2))
     *     prev = curr = Node(3)
     *     curr = nextTemp = null
     * 
     * - Loop Ends (curr is null)
     * - Returns: prev = Node(3) -> Node(2) -> Node(1) -> null
     * - Status: Success!
     */
}
