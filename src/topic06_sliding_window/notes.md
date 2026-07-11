# Sliding Window - Study Notes

The **Sliding Window** pattern is used to perform a required operation on a specific window size of a given buffer (array, list, or string). It optimizes search times by avoiding recalculating overlapping parts of adjacent windows.

---

## 1. Types of Sliding Window

### A. Fixed Size Window
The size of the window `K` is constant. We slide it across the array by adding one element from the right and removing one element from the left.
* **Initialization:** Calculate the result for the first window of size `K`.
* **Traversal:** `for (int i = K; i < N; i++)`
  * Add `nums[i]`
  * Remove `nums[i - K]`

### B. Variable Size Window (Dynamic Window)
The size of the window grows or shrinks dynamically depending on constraints.
* **Traversal:** Standard two-pointer loop:
  * Expand the window by moving `right` pointer.
  * While the window violates the constraint, shrink the window from the left by moving `left` pointer.

---

## 2. Common Identification Triggers
* Finding the longest/shortest substring or subarray that satisfies a condition.
* Problems involving contiguous subsegments (subarrays/substrings).
* The input is typically linear (arrays, strings).

---

## 3. Key Google Interview Tips
* Be very careful about off-by-one errors when computing the window length: `Length = right - left + 1`.
* Always analyze both space and time complexity. Time complexity is $O(N)$ because the left and right pointers each traverse the array at most once (even with nested loops!).
