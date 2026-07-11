# Binary Search - Study Notes

**Binary Search** is an $O(\log N)$ algorithm for finding elements in a sorted space. Google interviewers love it because it can also be applied to **non-array spaces** (e.g. searching on answer ranges).

---

## 1. Classical Array Binary Search
```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

---

## 2. Binary Search on Answer
Instead of checking values in a sorted array, we search for the optimal parameter in a valid range of outputs (e.g., Koko Eating Bananas).
* **Condition:** Monotonic property (if $X$ is valid, then all values greater/smaller than $X$ are also valid).
