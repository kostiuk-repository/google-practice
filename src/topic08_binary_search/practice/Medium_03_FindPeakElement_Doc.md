# Medium_03_FindPeakElement — Довідка

## Техніка: Пошук пікового елемента (Find Peak Element)

**Суть:** Шукаємо будь-який елемент, який строго більший за сусідів. За допомогою бінарного пошуку дивимось на nums[mid] та nums[mid + 1]. Якщо mid росте вгору праворуч, пік лежить праворуч. Якщо падає вниз праворуч — пік ліворуч.

```java
int left = 0, right = nums.length - 1;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] < nums[mid + 1]) left = mid + 1;
    else right = mid;
}
return left;
```

**Коли застосовувати:** Масив несортований, але сусідні елементи не рівні, і потрібно знайти хоча б один локальний максимум за O(log N).

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Medium_03_FindPeakElement_01** — Is Element a Peak Helper.
2. **Medium_03_FindPeakElement_02** — Find Local Minimum.
3. **Medium_03_FindPeakElement_03** — Find First Peak Element.
4. **Medium_03_FindPeakElement_04** — Find Peak in Boundary Subsegment.
5. **Medium_03_FindPeakElement_05** — Find Peak with Duplicates Allowed.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_03_FindPeakElement.java.
