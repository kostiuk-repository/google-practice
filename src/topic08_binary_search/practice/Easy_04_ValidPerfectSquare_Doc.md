# Easy_04_ValidPerfectSquare — Довідка

## Техніка: Бінарний пошук дійсного квадратного кореня (Valid Perfect Square)

**Суть:** Шукаємо ціле число x у діапазоні від 1 до num, таке що x * x == num. Запобігаємо переповненню типу int за допомогою long або ділення (mid == num / mid).

```java
long left = 1, right = num;
while (left <= right) {
    long mid = left + (right - left) / 2;
    long square = mid * mid;
    if (square == num) return true;
    else if (square < num) left = mid + 1;
    else right = mid - 1;
}
return false;
```

**Коли застосовувати:** Перевірка математичних властивостей (квадрат, куб) без використання бібліотечних функцій.

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Easy_04_ValidPerfectSquare_01** — Valid Perfect Square Base.
2. **Easy_04_ValidPerfectSquare_02** — Floor Square Root.
3. **Easy_04_ValidPerfectSquare_03** — Valid Perfect Cube.
4. **Easy_04_ValidPerfectSquare_04** — Ceiling Square Root.
5. **Easy_04_ValidPerfectSquare_05** — 64-bit Perfect Square Check.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_04_ValidPerfectSquare.java.
