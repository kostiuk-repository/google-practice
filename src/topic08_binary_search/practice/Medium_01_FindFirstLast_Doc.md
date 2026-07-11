# Medium_01_FindFirstLast — Довідка

## Техніка: Пошук першого та останнього входження (Find First and Last Position)

**Суть:** Два окремих бінарних пошуки. Для першого (лівого) входження при nums[mid] == target звужуємо праву межу right = mid - 1, щоб знайти лівіший дублікат. Для правого — left = mid + 1.

```java
int findBound(int[] nums, int target, boolean isFirst) {
    int left = 0, right = nums.length - 1, ans = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            ans = mid;
            if (isFirst) right = mid - 1;
            else left = mid + 1;
        } else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return ans;
}
```

**Коли застосовувати:** Необхідно локалізувати всі дублікати елемента в сортованому масиві.

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Medium_01_FindFirstLast_01** — Find First Occurrence.
2. **Medium_01_FindFirstLast_02** — Find Last Occurrence.
3. **Medium_01_FindFirstLast_03** — Count Total Occurrences.
4. **Medium_01_FindFirstLast_04** — Find First Greater or Equal.
5. **Medium_01_FindFirstLast_05** — Search Range in Descending Array.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_FindFirstLast.java.
