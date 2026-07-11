# Easy_09_SumOfAllSubsetXORTotals — Довідка

## Техніка: Recursive Subset Generation / Backtracking

**Суть:** Генерація підмножин через рекурсивний вибір. Для кожного елемента масиву приймається рішення: або включити його до поточної підмножини, або пропустити, після чого рекурсивно опрацьовується наступний елемент.

```java
int subsetXOR(int[] nums, int index, int currentXOR) {
    if (index == nums.length) return currentXOR;
    int include = subsetXOR(nums, index + 1, currentXOR ^ nums[index]);
    int exclude = subsetXOR(nums, index + 1, currentXOR);
    return include + exclude;
}
```

**Коли застосовувати:** Задачі, які вимагають обчислення певної метрики по всіх можливих підмножинах (power set).

**Складність:** O(2^n) час, O(n) пам'ять.

## Drills

1. **Easy_09_01** — Sum of All Subset Sums: Рекурсивно обчисліть суму сум усіх підмножин заданого масиву.
2. **Easy_09_02** — Count Subsets with Sum Equals K: Дано масив цілих чисел. Рекурсивно порахуйте кількість підмножин, сума яких дорівнює k.
3. **Easy_09_03** — Sum of All Subset Product Totals: Обчисліть суму добутків елементів усіх підмножин. Добуток порожньої підмножини дорівнює 0.
4. **Easy_09_04** — Max Subset XOR: Рекурсивно знайдіть максимальну суму XOR серед усіх можливих підмножин масиву.
5. **Easy_09_05** — Subset Sum with Bitwise OR: Рекурсивно обчисліть суму побітових OR всіх підмножин заданого масиву.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_SumOfAllSubsetXORTotals.java.
