# Easy_05_Sqrt — Довідка

## Техніка: Цілочисельний квадратний корінь (Integer Square Root)

**Суть:** Пошук найбільшого цілого r, для якого r * r <= x. Діапазон пошуку [1, x]. Для уникнення overflow використовуємо порівняння mid <= x / mid.

```java
if (x < 2) return x;
int left = 1, right = x / 2, ans = 0;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (mid <= x / mid) {
        ans = mid;
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}
return ans;
```

**Коли застосовувати:** Обчислення цілої частини квадратного кореня без сторонніх бібліотек.

**Складність:** Часова складність: O(log X). Просторова складність: O(1).

## Drills

1. **Easy_05_Sqrt_01** — Integer Sqrt Base Case.
2. **Easy_05_Sqrt_02** — Floating Point Sqrt.
3. **Easy_05_Sqrt_03** — Sqrt with Offset.
4. **Easy_05_Sqrt_04** — Next Perfect Sqrt.
5. **Easy_05_Sqrt_05** — Integer Fourth Root.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_05_Sqrt.java.
