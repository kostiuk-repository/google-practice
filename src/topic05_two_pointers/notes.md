# Two Pointers Technique - Study Notes

The **Two Pointers** technique is an algorithmic pattern where two pointers (indices) are used to traverse a data structure (typically an array, string, or linked list) to solve a problem with optimal time and space complexity. It is a favorite of Google interviewers because it often optimizes a naive $O(N^2)$ solution down to $O(N)$ time and $O(1)$ space.

---

## 1. Core Concepts & Classification

Two Pointers problems generally fall into three main categories:

### Type A: Opposite Direction (Meeting in the Middle)
Pointers start at opposite ends of the structure and move toward each other.
* **Initialization:** `left = 0`, `right = array.length - 1`
* **Condition:** `while (left < right)`
* **Common Use Cases:**
  * Searching in a sorted array (e.g., Two Sum II).
  * Reversing elements or checking symmetry (e.g., Valid Palindrome).
  * Finding boundaries that maximize an area (e.g., Container With Most Water).

### Type B: Same Direction (Fast & Slow Pointers)
Both pointers start at the same end and move in the same direction, but at different speeds or intervals.
* **Initialization:** `slow = 0`, `fast = 0` (or `fast = 1`)
* **Condition:** `while (fast < array.length)`
* **Common Use Cases:**
  * Cycle detection in Linked Lists (Floyd's Tortoise and Hare).
  * Finding the middle element of a Linked List.
  * In-place array modification/filtering (e.g., Remove Duplicates, Move Zeroes).

### Type C: Two Different Arrays/Lists
Each pointer traverses a separate data structure.
* **Initialization:** `p1 = 0`, `p2 = 0`
* **Condition:** `while (p1 < array1.length && p2 < array2.length)`
* **Common Use Cases:**
  * Merging two sorted arrays (as in Merge Sort).
  * Finding intersections or unions of sorted lists.
  * Comparing two strings (e.g., backspace string compare).

---

## 2. Why Use Two Pointers? (The Google Interview Perspective)

* **Space Optimization:** The naive approach often involves using HashSets or HashMaps (leading to $O(N)$ auxiliary space). Two pointers usually reduce the space complexity to $O(1)$ auxiliary space.
* **Time Optimization:** Eliminates redundant nested loops, reducing $O(N^2)$ search spaces to $O(N)$ linear scans.

---

## 3. How to Identify Two Pointers Problems

Look for these keywords and properties in the problem description:
1. **"Sorted array/string"** or **"sorted list"** (Almost always a hint for opposite-direction pointers).
2. **"In-place"** operations (e.g., "modify the array in-place with $O(1)$ extra memory").
3. Searching for pairs, triplets, or subarrays that satisfy a specific sum or property.
4. Linked list cycles or finding elements relative to the end (e.g., "remove N-th node from end").

---

## 4. Common Pitfalls & Edge Cases

* **Index Out of Bounds:** Always ensure your pointer increments/decrements are guarded (e.g., `left < right` or `fast < length`).
* **Integer Overflow:** When calculating indices (e.g., `(left + right) / 2`), use `left + (right - left) / 2` to prevent overflow in Java.
* **Duplicate Handling:** In problems like 3Sum, skipping duplicate elements requires careful pointer movement to avoid infinite loops or duplicate results.
* **Odd vs. Even Lengths:** When checking palindromes or finding the middle of a list, test both odd-length and even-length inputs.
