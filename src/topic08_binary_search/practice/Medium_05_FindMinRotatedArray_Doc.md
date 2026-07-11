# Medium_05_FindMinRotatedArray — Довідка

## Техніка: Пошук мінімуму в повернутому відсортованому масиві (Find Minimum in Rotated Sorted Array)

**Суть:** Порівнюємо nums[mid] з nums[right]. Якщо nums[mid] > nums[right], мінімум лежить праворуч від mid (left = mid + 1). Якщо nums[mid] < nums[right], то мінімум лежить на mid або ліворуч (right = mid).

```java
int left = 0, right = nums.length - 1;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] > nums[right]) left = mid + 1;
    else right = mid;
}
return nums[left];
```

**Коли застосовувати:** Потрібно знайти точку перегину / мінімум у циклічно зсунутому унікальному масиві.

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Medium_05_FindMinRotatedArray_01** — Find Minimum Element Index.
2. **Medium_05_FindMinRotatedArray_02** — Find Maximum Element Value.
3. **Medium_05_FindMinRotatedArray_03** — Find Minimum in Rotated Descending Array.
4. **Medium_05_FindMinRotatedArray_04** — Find Minimum with Pivot Check Optimization.
5. **Medium_05_FindMinRotatedArray_05** — Find Rotation Count.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_05_FindMinRotatedArray.java.
