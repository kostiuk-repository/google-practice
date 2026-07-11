# Easy_03_TwoSumSorted — Довідка

## Техніка: Зустрічні вказівники на відсортованому масиві

**Суть:** Один вказівник стартує на початку, інший в кінці. Порівнюємо суму елементів під ними з цільовим значенням target. Якщо сума замала — збільшуємо лівий вказівник, якщо завелика — зменшуємо правий.

### Концептуальний код
```java
int left = 0, right = nums.length - 1;
while (left < right) {
    int sum = nums[left] + nums[right];
    if (sum == target) return new int[]{left, right};
    else if (sum < target) left++;
    else right--;
}
```

**Коли застосовувати:**
- Пошук пари елементів із заданою сумою у відсортованому масиві.

**Складність:**
- **Часова:** O(N) — лінійний сканування масиву.
- **Просторова:** O(1) — лише два індекси-вказівники.

## Вправи (Drills)
1. **01 — Has Two Sum Zero**: Check if there exist two elements in a sorted array that sum to exactly 0.
2. **02 — Two Sum Indices (0-Indexed)**: Find the 0-indexed indices of two elements in a sorted array that sum to target. Return {-1, -1} if no such pair exists.
3. **03 — Count Pairs Less Than Target**: Count pairs in a sorted array whose sum is strictly less than target.
4. **04 — Closest Two Sum**: Find the pair of elements in a sorted array whose sum is closest to target. Return their values as an array of size 2.
5. **05 — Two Sum with Different Arrays**: Find indices of one element from arr1 and one from arr2 (both sorted) that sum to target. Return {idx1, idx2}.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_03_TwoSumSorted.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_03_TwoSumSorted.java).
