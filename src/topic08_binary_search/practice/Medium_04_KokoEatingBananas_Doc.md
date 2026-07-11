# Medium_04_KokoEatingBananas — Довідка

## Техніка: Бінарний пошук відповіді (Binary Search on Answer / Koko Eating Bananas)

**Суть:** Шукаємо мінімальну швидкість k на діапазоні [1, max(piles)]. Для кожної швидкості перевіряємо, чи зможе Коко з'їсти всі банани за h годин. Оскільки функція валідації монотонна, ми можемо бінарно звужувати діапазон швидкостей.

```java
int left = 1, right = getMax(piles);
while (left < right) {
    int mid = left + (right - left) / 2;
    if (canEatAll(piles, h, mid)) right = mid;
    else left = mid + 1;
}
return left;
```

**Коли застосовувати:** Шукане значення належить монотонному простору відповідей, і ми маємо швидку функцію перевірки.

**Складність:** Часова складність: O(N log(MaxPiles)). Просторова складність: O(1).

## Drills

1. **Medium_04_KokoEatingBananas_01** — Hours to Eat All.
2. **Medium_04_KokoEatingBananas_02** — Can Eat All Verification.
3. **Medium_04_KokoEatingBananas_03** — Min Eating Speed with Limit.
4. **Medium_04_KokoEatingBananas_04** — Min Eating Speed (Sorted Descending).
5. **Medium_04_KokoEatingBananas_05** — Min Eating Speed with Rest Hours.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_KokoEatingBananas.java.
