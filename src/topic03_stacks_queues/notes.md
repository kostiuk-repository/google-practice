# Stacks & Queues - Study Notes

**Stacks** and **Queues** are linear data structures characterized by their strict access rules. They are typically implemented using arrays or linked lists and are fundamental components of many advanced graph algorithms (like DFS and BFS).

---

## 1. Core Concepts

### A. Stack: LIFO (Last In, First Out)
The element added last is the first one to be removed. Think of a stack of plates.
* **Key Operations:**
  * `push(val)`: Add element to the top. $O(1)$
  * `pop()`: Remove and return the top element. $O(1)$
  * `peek()` / `top()`: Return the top element without removing it. $O(1)$
  * `isEmpty()`: Check if the stack is empty. $O(1)$
* **Java Class:** Use `java.util.Deque` implemented by `java.util.ArrayDeque` (e.g., `Deque<Integer> stack = new ArrayDeque<>();`). Avoid using `java.util.Stack` because it is synchronized, making it slow.

### B. Queue: FIFO (First In, First Out)
The element added first is the first one to be removed. Think of a line at a store.
* **Key Operations:**
  * `offer(val)` / `enqueue(val)`: Add element to the back. $O(1)$
  * `poll()` / `dequeue()`: Remove and return the front element. $O(1)$
  * `peek()`: Return the front element without removing it. $O(1)$
* **Java Interface:** `java.util.Queue` implemented by `java.util.ArrayDeque` or `java.util.LinkedList`.

---

## 2. Advanced Stack Patterns (Highly Tested at Google)

### A. Monotonic Stack
A stack that maintains its elements in a strictly increasing or decreasing order.
* **Use Case:** "Next Greater Element" or "Next Smaller Element".
* **How it works:** When a new element arrives, we pop all elements from the stack that violate the monotonic property before pushing the new element.
* **Time Complexity:** $O(N)$ because each element is pushed and popped at most once.

### B. Monotonic Queue
A queue that maintains elements in a monotonic order.
* **Use Case:** Finding the maximum or minimum element in a sliding window.
* **Java Class:** Typically implemented using `java.util.Deque` (Double-ended queue) to allow popping from both the front and back.

---

## 3. Google Interview Strategy & Tips

* **Matching Patterns:**
  * Use a **Stack** when you need to "remember" previous elements while processing the current one (e.g., matching parentheses, resolving nested structures, path simplification, recursion simulation).
  * Use a **Queue** for processing items in the order they arrive (e.g., scheduling, BFS, rate limiters, sliding window tracking).
* **Stack vs. Deque in Java:**
  * Always use `Deque<Integer> stack = new ArrayDeque<>();` for stacks.
  * In Java, `ArrayDeque` is more memory efficient than `LinkedList` because it has no node allocation overhead.
* **Recursion Simulation:** Any recursive algorithm can be written iteratively using an explicit Stack. If an interviewer asks to optimize stack space, discuss how tail recursion or explicit stacks behave.
