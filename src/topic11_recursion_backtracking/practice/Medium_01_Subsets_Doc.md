# Medium_01_Subsets — Довідка

## Техніка: Backtracking for Power Set Generation

**Суть:** Систематичний обхід дерева вибору для формування всіх підмножин. Під час рекурсії поточний стан (тимчасовий список) модифікується (додається елемент), викликається рекурсія для наступних індексів, а після повернення вибір скасовується (backtrack).

```java
void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);
        backtrack(i + 1, nums, current, result);
        current.remove(current.size() - 1);
    }
}
```

**Коли застосовувати:** Задачі пошуку всіх можливих комбінацій, підмножин чи перестановок елементів.

**Складність:** O(2^n * n) час, O(n) пам'ять.

## Drills

1. **Medium_01_01** — Subsets II: Дано масив nums, який може містити дублікати. Поверніть усі можливі підмножини без повторень.
2. **Medium_01_02** — Combinations: Дано два числа n та k. Поверніть всі можливі комбінації з k чисел, вибраних з діапазону [1, n].
3. **Medium_01_03** — Generate Binary Strings of Length N: Рекурсивно згенеруйте всі можливі бінарні рядки довжини n у лексикографічному порядку.
4. **Medium_01_04** — Letter Subsequences: Дано рядок. Рекурсивно поверніть усі його підпослідовності (підмножини символів) у вигляді списку.
5. **Medium_01_05** — Partition to K Equal Sum Subsets: Дано масив nums та число k. Перевірте, чи можна розділити його на k непорожніх підмножин із рівними сумами.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_Subsets.java.
