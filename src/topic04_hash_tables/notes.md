# Hash Tables - Study Notes

A **Hash Table** (or Hash Map) is a data structure that maps keys to values for highly efficient lookup operations. It is the single most useful tool in an interviewer's toolkit for reducing time complexity from $O(N^2)$ or $O(N \log N)$ to $O(N)$.

---

## 1. Core Concepts & Mechanics

### How Hash Tables Work
1. **Hash Function:** Takes a key and maps it to an integer (hash code).
2. **Bucket Array:** The hash code is mapped to an index in an underlying array:
   $$\text{Index} = \text{HashCode(Key)} \pmod{\text{ArrayLength}}$$
3. **Collision Resolution:** When two keys map to the same index.
   * **Separate Chaining (Java's `HashMap`):** Each bucket contains a linked list (or balanced red-black tree in Java 8+ if the bucket grows large) of entries.
   * **Open Addressing:** Finding another open slot in the array (Linear Probing, Quadratic Probing, Double Hashing).

### Time & Space Complexities
* **Insert / Delete / Search:** $O(1)$ average time, $O(N)$ worst-case (if all keys collide into the same bucket).
* **Space:** $O(N)$ to store $N$ keys.

---

## 2. HashMap vs. HashSet

* **HashMap:** Stores Key-Value pairs. Keys must be unique.
* **HashSet:** Stores unique elements only. Under the hood, Java implements `HashSet` using a `HashMap` where the value is a dummy constant object.

---

## 3. Key Interview Patterns

### A. Frequency Map
Counting occurrences of characters or numbers.
* **Template:**
  ```java
  Map<Character, Integer> counts = new HashMap<>();
  for (char c : s.toCharArray()) {
      counts.put(c, counts.getOrDefault(c, 0) + 1);
  }
  ```

### B. Tracking "Seen" Elements (Complement Search)
Using a Set or Map to remember elements we have visited to find relationships in $O(1)$ lookup time (e.g., Two Sum).

### C. Prefix Sum + HashMap (Subarray Problems)
For finding subarrays that sum to `k`:
Store running prefix sums in a HashMap: `Map<PrefixSum, Frequency>`. If `currentPrefixSum - k` exists in the map, a subarray summing to `k` exists.

---

## 4. Google Interview Strategy & Tips

* **Objects as Keys:**
  * In Java, if you use a custom object as a key in a `HashMap`, you **must override both `equals()` and `hashCode()`** methods. If you don't, two objects with the exact same values will be treated as separate keys.
* **Space-Time Tradeoff:**
  * Interviewers will often ask: "Can you optimize the space complexity?" If you used a HashMap (O(N) space), they might want you to sort the array and use Two Pointers instead to achieve O(1) space, at the cost of O(N log N) time.
* **Load Factor and Rehashing:**
  * When the number of elements exceeds `Capacity * LoadFactor` (default load factor is `0.75`), the table capacity doubles, and all elements are rehashed. This operation takes $O(N)$ time but is amortized to $O(1)$ per insertion.
