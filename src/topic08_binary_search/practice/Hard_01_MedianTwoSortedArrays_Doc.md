# Hard_01_MedianTwoSortedArrays — Довідка

## Техніка: Бінарний пошук розділення для медіани двох масивів (Median of Two Sorted Arrays)

**Суть:** Ми розділяємо обидва масиви так, щоб ліва частина обох містила половину від загальної кількості елементів і всі вони були меншими за елементи правої частини. Бінарний пошук проводиться по точці поділу меншого масиву.

```java
// logic partitions elements:
// A[x-1], A[x] vs B[y-1], B[y] where y = halfLen - x
```

**Коли застосовувати:** Знаходження медіани або k-го елемента об'єднання двох сортованих масивів за сублінійний час.

**Складність:** Часова складність: O(log(min(M, N))). Просторова складність: O(1).

## Drills

1. **Hard_01_MedianTwoSortedArrays_01** — Median of Single Sorted Array.
2. **Hard_01_MedianTwoSortedArrays_02** — Find Kth Smallest Element.
3. **Hard_01_MedianTwoSortedArrays_03** — Median of Equal Length Sorted Arrays.
4. **Hard_01_MedianTwoSortedArrays_04** — Median of Two Sorted Descending Arrays.
5. **Hard_01_MedianTwoSortedArrays_05** — Median of Two Sorted Arrays Base Check.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_MedianTwoSortedArrays.java.
