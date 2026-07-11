# Medium_02_SearchRotatedArray — Довідка

## Техніка: Пошук у поверненому відсортованому масиві (Search in Rotated Sorted Array)

**Суть:** Масив розбивається на дві частини, одна з яких завжди відсортована. Обчислюємо mid, визначаємо, яка половина (ліва чи права) відсортована, і перевіряємо, чи потрапляє target у межі цієї відсортованої половини.

```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target < nums[mid]) right = mid - 1;
        else left = mid + 1;
    } else {
        if (target > nums[mid] && target <= nums[right]) left = mid + 1;
        else right = mid - 1;
    }
}
return -1;
```

**Коли застосовувати:** Масив був відсортований, а потім повернутий (циклічно зсунутий) на невідому величину.

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Medium_02_SearchRotatedArray_01** — Find Rotation Pivot Index.
2. **Medium_02_SearchRotatedArray_02** — Search Rotated Array Existence.
3. **Medium_02_SearchRotatedArray_03** — Search Rotated Array with Duplicates.
4. **Medium_02_SearchRotatedArray_04** — Search Rotated Descending Array.
5. **Medium_02_SearchRotatedArray_05** — Search in Shifted Array with Known Shift.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_SearchRotatedArray.java.
