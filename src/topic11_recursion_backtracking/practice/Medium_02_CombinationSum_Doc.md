# Medium_02_CombinationSum — Довідка

## Техніка: Backtracking / Target Sum with Reusable Elements

**Суть:** Пошук комбінацій чисел, які в сумі дають задане цільове значення. Оскільки елементи можна використовувати багаторазово, рекурсивний перехід не інкрементує індекс початку, але зменшує залишок цільової суми. При перевищенні ліміту рекурсія відсікається.

```java
void backtrack(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
    if (target == 0) {
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = start; i < candidates.length; i++) {
        if (candidates[i] > target) continue; // Prune
        current.add(candidates[i]);
        backtrack(i, candidates, target - candidates[i], current, result);
        current.remove(current.size() - 1);
    }
}
```

**Коли застосовувати:** Пошук комбінацій для набору сум із можливістю багаторазового використання або складнішими обмеженнями на вибір.

**Складність:** O(N^(T/M + 1)) час, O(T/M) пам'ять.

## Drills

1. **Medium_02_01** — Combination Sum II: Знайдіть усі унікальні комбінації в candidates, сума яких дорівнює target. Кожне число з candidates можна використовувати лише один раз.
2. **Medium_02_02** — Combination Sum III: Знайдіть усі можливі комбінації з k чисел, які в сумі дають n, використовуючи числа від 1 до 9 (кожне не більше одного разу).
3. **Medium_02_03** — Combination Sum IV: Дано масив унікальних цілих чисел nums та target. Поверніть кількість можливих комбінацій (з урахуванням порядку), що дають суму target.
4. **Medium_02_04** — Factor Combinations: Числа можна розглядати як добуток їхніх множників. Напишіть функцію, яка знаходить усі можливі комбінації множників для n.
5. **Medium_02_05** — Target Sum: Дано масив nums та target. Додаючи '+' або '-' перед кожним числом, знайдіть кількість способів отримати вираз, рівний target.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_CombinationSum.java.
