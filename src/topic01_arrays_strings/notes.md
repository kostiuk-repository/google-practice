# Arrays & Strings - Study Notes

Arrays and Strings are the most fundamental, contiguous data structures. In Google interviews, they are frequently used as the baseline for checking code readability, understanding memory constraints, and analyzing time/space complexity.

---

## 1. Arrays: Core Concepts

An **array** is a collection of elements of the same type stored in contiguous memory locations.

* **Memory Layout:** Because it is contiguous, the address of any element at index `i` is calculated as:
  $$\text{Address}(A[i]) = \text{BaseAddress} + (i \times \text{SizeOfElement})$$
  This mathematical formula is why array indexing starts at `0` and allows **$O(1)$ random access**.
* **Key Time Complexities:**
  * Access: $O(1)$
  * Search: $O(N)$ (unsorted) or $O(\log N)$ (sorted, using Binary Search)
  * Insertion: $O(N)$ (worst case, inserting at the beginning requires shifting elements)
  * Deletion: $O(N)$ (shifting elements)

### Dynamic Arrays (e.g., `ArrayList` in Java)
Under the hood, a dynamic array has a fixed capacity. When it runs out of space:
1. It allocates a new, larger array (usually double the current size: $2 \times$ capacity).
2. It copies all elements from the old array to the new array.
3. It frees/garbage collects the old array.
* **Amortized Time Complexity:** Although copying takes $O(N)$, it happens rarely. The average cost of insertion at the end remains **amortized $O(1)$**.

---

## 2. Strings: Core Concepts (Java Specifics)

In Java, a **String** is an object that wraps a `char[]` array (or `byte[]` in modern Java versions).

* **Immutability:** String objects are immutable. Once created, they cannot be modified.
  * **Why?** Security, thread-safety, and optimization (caching hash codes, String Pool).
  * **Interview Warning:** Modifying a string in a loop (e.g., `s += char`) creates a new string object each time, leading to $O(N^2)$ time complexity.
* **StringBuilder:** Use `StringBuilder` (not thread-safe, faster) or `StringBuffer` (thread-safe, slower) for mutable string operations. It uses a dynamic char array under the hood, making append operations amortized $O(1)$.

---

## 3. Key Concepts to Master

1. **Subarrays vs. Subsequences vs. Subsets:**
   * **Subarray:** Contiguous elements of the array (e.g., `[2,3]` in `[1,2,3,4]`).
   * **Subsequence:** Non-contiguous but ordered elements (e.g., `[1,3]` in `[1,2,3,4]`).
   * **Subset:** Any selection of elements, order does not matter (e.g., `[3,1]` is a subset of `[1,2,3,4]`).
2. **Matrix Manipulation (2D Arrays):**
   * Stored as array of arrays.
   * Traversals: Row-by-row, column-by-column, diagonal, spiral.
3. **Prefix Sum / Suffix Sum:**
   * Precomputing running sums to answer range query questions in $O(1)$ time.

---

## 4. Google Interview Strategy & Tips

* **Ask Clarifying Questions:**
  * "Are we dealing with ASCII or Unicode characters?" (ASCII is 128/256 characters; Unicode can have over 1 million, which changes array sizes for character frequency counting).
  * "Can the array contain negative numbers?"
  * "Is the array sorted?"
  * "Can we modify the input array in-place, or do we need to return a new one?"
* **Edge Cases to Check:**
  * Empty array / empty string (`null` or length `0`).
  * Array of size 1.
  * Duplicate elements.
  * Integer overflow (when summing elements).
