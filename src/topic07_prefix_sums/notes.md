# Prefix Sums & Difference Arrays - Study Notes

**Prefix Sum** involves precomputing running cumulative sums of an array. It allows $O(1)$ range sum query answers.
**Difference Array** is a pattern used to perform range updates in $O(1)$ time, which are then compiled in $O(N)$ time.

---

## 1. Prefix Sum Formula
For an array `nums`, let `prefix[i]` be the sum of elements from index `0` to `i-1`.
$$	ext{Sum}(L \dots R) = 	ext{prefix}[R + 1] - 	ext{prefix}[L]$$

---

## 2. Difference Array Formula
For an array `diff`, if we want to add `val` to range `[L, R]` in `nums`:
1. `diff[L] += val`
2. `diff[R + 1] -= val`
To recover the updated array, take the prefix sum of `diff`.
