# Easy_06_PeakIndexInMountain — Довідка

## Техніка: Пошук локального максимуму в горі (Mountain Array Peak)

**Суть:** Оскільки масив спочатку зростає, а потім спадає, ми порівнюємо nums[mid] з nums[mid + 1]. Якщо nums[mid] < nums[mid + 1], вершина лежить праворуч (left = mid + 1). Якщо nums[mid] > nums[mid + 1], то вершина на mid або ліворуч (right = mid).

```java
int left = 0, right = arr.length - 1;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (arr[mid] < arr[mid + 1]) left = mid + 1;
    else right = mid;
}
return left;
```

**Коли застосовувати:** Масив має форму вершини (mountain) або іншу властивість з одним екстремумом.

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Easy_06_PeakIndexInMountain_01** — Validate Mountain Array.
2. **Easy_06_PeakIndexInMountain_02** — Mountain Peak Value.
3. **Easy_06_PeakIndexInMountain_03** — Peak Finding with Duplicates.
4. **Easy_06_PeakIndexInMountain_04** — Valley Array Minimum Index.
5. **Easy_06_PeakIndexInMountain_05** — Search in Mountain Array.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_06_PeakIndexInMountain.java.
