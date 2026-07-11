# Linked Lists - Study Notes

A **Linked List** is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element (called a **Node**) contains a value and a pointer (reference) to the next node in the sequence.

---

## 1. Core Concepts & Comparison

Unlike arrays, which are contiguous, linked list nodes are scattered across the heap memory.

| Operation | Array (Static) | Dynamic Array (`ArrayList`) | Linked List |
| :--- | :--- | :--- | :--- |
| **Random Access** | $O(1)$ | $O(1)$ | $O(N)$ (must traverse from head) |
| **Insert/Delete at Head** | $O(N)$ (requires shifting) | $O(N)$ | $O(1)$ (just update pointers) |
| **Insert/Delete at Tail** | $O(1)$ | $O(1)$ amortized | $O(1)$ (with tail pointer) or $O(N)$ |
| **Insert/Delete in Middle** | $O(N)$ | $O(N)$ | $O(1)$ (once node is found) |

---

## 2. Types of Linked Lists

1. **Singly Linked List:** Each node points only to the next node. The last node points to `null`.
2. **Doubly Linked List:** Each node has two pointers: `next` and `prev`. Allows traversal in both directions.
3. **Circular Linked List:** The last node points back to the first node (head) instead of `null`.

---

## 3. Crucial Interview Patterns

### A. The Dummy Head (Sentinel Node)
Using a dummy node at the beginning of the list simplifies code when adding/removing nodes at the head. It eliminates the need for `if (head == null)` checks.
* **Template:**
  ```java
  ListNode dummy = new ListNode(0);
  ListNode curr = dummy;
  // ... build the list using curr.next = ...
  return dummy.next;
  ```

### B. Two Pointers (Fast & Slow Pointers)
Also known as the **Tortoise and Hare** algorithm.
* **Finding the Middle:** If `fast` moves 2 steps and `slow` moves 1 step, when `fast` reaches the end, `slow` is at the middle.
* **Cycle Detection:** If there is a cycle, the `fast` pointer will eventually catch up and meet the `slow` pointer inside the loop.

### C. Pointer Manipulation (In-Place Reversal)
Reversing list directions by updating `next` pointers. This requires a `prev`, `curr`, and a temporary `nextTemp` pointer to prevent losing the rest of the list.

---

## 4. Google Interview Strategy & Tips

* **Always Draw it Out:** Linked list problems are highly visual. Draw the nodes and pointers on paper/whiteboard to trace transitions before coding.
* **Pointer Loss Trap:** When changing `node.next`, you lose the reference to the original next node. Always save it first:
  ```java
  ListNode nextTemp = curr.next;
  curr.next = prev; // mutation
  prev = curr;
  curr = nextTemp; // step forward safely
  ```
* **Boundary Checks:** Always check for `null` pointers. The most common error is `NullPointerException` (e.g., trying to access `curr.next.next` when `curr.next` is null).
* **Space Complexity:** Google interviewers heavily prefer **in-place** modifications ($O(1)$ auxiliary space) over creating copies of nodes.
