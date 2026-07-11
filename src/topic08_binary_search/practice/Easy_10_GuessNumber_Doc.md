# Easy_10_GuessNumber — Довідка

## Техніка: Гра в угадування чисел (Guess Number Higher or Lower)

**Суть:** Бінарний пошук на відомому діапазоні [1, n]. Використовуємо API-функцію guess(mid), яка повертає 0 (знайдено), -1 (число менше), або 1 (число більше).

```java
int left = 1, right = n;
while (left <= right) {
    int mid = left + (right - left) / 2;
    int res = guess(mid);
    if (res == 0) return mid;
    else if (res < 0) right = mid - 1;
    else left = mid + 1;
}
return -1;
```

**Коли застосовувати:** Пошук невідомого значення через інтерактивний фідбек (інтерактивний бінарний пошук).

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Easy_10_GuessNumber_01** — Guess Number Recursive Solution.
2. **Easy_10_GuessNumber_02** — Guess Number on Arbitrary Range.
3. **Easy_10_GuessNumber_03** — Guess Number Ternary Search.
4. **Easy_10_GuessNumber_04** — Guess Number Inverted API.
5. **Easy_10_GuessNumber_05** — Guess Number Infinite Upper Bound.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_GuessNumber.java.
