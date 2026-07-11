# Hard_03_FindMinRotatedArrayII — Довідка

## Техніка: Пошук мінімуму в повернутому масиві з дублікатами (Find Minimum in Rotated Sorted Array II)

**Суть:** Подібно до версії I, порівнюємо nums[mid] з nums[right]. Але якщо nums[mid] == nums[right], ми не можемо визначити напрямок. Тоді ми просто зменшуємо right на 1 (right--), що дає найгірший час O(N) у разі суцільних дублікатів, але зберігає коректність.

```java
int left = 0, right = nums.length - 1;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] > nums[right]) left = mid + 1;
    else if (nums[mid] < nums[right]) right = mid;
    else right--;
}
return nums[left];
```

**Коли застосовувати:** Знаходження мінімуму у повернутому масиві, де дозволено дублювання елементів.

**Складність:** Часова складність: O(log N) у середньому, O(N) у найгіршому випадку. Просторова складність: O(1).

## Drills

1. **Hard_03_FindMinRotatedArrayII_01** — Find Minimum Element Index with Duplicates.
2. **Hard_03_FindMinRotatedArrayII_02** — Check If Minimum is Duplicated.
3. **Hard_03_FindMinRotatedArrayII_03** — Find Maximum Element with Duplicates.
4. **Hard_03_FindMinRotatedArrayII_04** — Find Minimum in Rotated Descending Array with Duplicates.
5. **Hard_03_FindMinRotatedArrayII_05** — Find Rotation Count with Duplicates.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_FindMinRotatedArrayII.java.
