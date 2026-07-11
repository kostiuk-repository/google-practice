# Easy_06_MergeSortedArray — Довідка

## Техніка: Злиття з кінця (Reverse Merge)

**Суть:** Порівняння елементів з кінців масивів та запис найбільшого з них у вільні комірки в кінці першого масиву. Це запобігає затиранню корисних даних.

### Концептуальний код
```java
int i = m - 1, j = n - 1, k = m + n - 1;
while (j >= 0) {
    if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
    } else {
        nums1[k--] = nums2[j--];
    }
}
```

**Коли застосовувати:**
- Об'єднання двох відсортованих масивів на місці (in-place), коли перший масив має достатній резерв пам'яті в кінці.

**Складність:**
- **Часова:** O(M + N) — лінійний прохід по обох масивах.
- **Просторова:** O(1) — не створює додаткових масивів.

## Вправи (Drills)
1. **01 — Merge Two Sorted Arrays**: Merge two sorted arrays into a new sorted array. (Standard merge step from Merge Sort).
2. **02 — Merge Sorted Arrays Backward**: Helper drill: Merge elements from nums1 (first m elements) and nums2 (n elements) starting from the back.
3. **03 — Merge Three Sorted Arrays**: Merge three sorted arrays into a new sorted array. Use two pointers ideas iteratively.
4. **04 — Merge Sorted with Duplicates Removed**: Merge two sorted arrays into a new sorted array, removing any duplicate values.
5. **05 — In-Place Merge without Extra Space**: Merge nums2 into nums1 in-place. If nums1's size is exactly m and nums2 is n, but there's no trailing padding, how would you merge?

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_06_MergeSortedArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_06_MergeSortedArray.java).
