# Hard_02_SplitArrayLargestSum — Довідка

## Техніка: Розподіл масиву на підмасиви з мінімізацією суми (Split Array Largest Sum)

**Суть:** Простір пошуку суми: від max(nums) (найменший можливий максимум для одного елемента) до sum(nums) (якщо k=1). Застосовуємо бінарний пошук відповіді. Для кожного candidateSum перевіряємо, чи можна розбити масив на <= k підмасивів.

```java
int left = maxVal, right = sumVal;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (canSplit(nums, k, mid)) right = mid;
    else left = mid + 1;
}
return left;
```

**Коли застосовувати:** Оптимальне розбиття масиву на k неперервних частин з обмеженнями на суми.

**Складність:** Часова складність: O(N log(Sum - Max)). Просторова складність: O(1).

## Drills

1. **Hard_02_SplitArrayLargestSum_01** — Can Split Verification.
2. **Hard_02_SplitArrayLargestSum_02** — Get Min Possible Max Sum.
3. **Hard_02_SplitArrayLargestSum_03** — Get Max Possible Max Sum.
4. **Hard_02_SplitArrayLargestSum_04** — Split Array (Exactly K check).
5. **Hard_02_SplitArrayLargestSum_05** — Split Array Largest Sum Base Verification.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_SplitArrayLargestSum.java.
