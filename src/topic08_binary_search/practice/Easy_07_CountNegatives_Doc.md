# Easy_07_CountNegatives — Довідка

## Техніка: Пошук у двовимірній сортованій матриці (Count Negatives in Sorted Matrix)

**Суть:** Кожен рядок/стовпчик відсортовані. Ми можемо застосувати бінарний пошук для першого негативного елемента в кожному рядку. Оптимально — лінійний прохід O(M+N) з верхнього правого чи нижнього лівого кута.

```java
int count = 0;
for (int[] row : grid) {
    int left = 0, right = row.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (row[mid] < 0) right = mid - 1;
        else left = mid + 1;
    }
    count += (row.length - left);
}
return count;
```

**Коли застосовувати:** Пошук значень у 2D матриці з сортуванням по рядках та стовпчиках.

**Складність:** Часова складність: O(M log N) для рядкового бінарного пошуку або O(M + N) для оптимального.

## Drills

1. **Easy_07_CountNegatives_01** — Count Negatives in Single Row.
2. **Easy_07_CountNegatives_02** — Row-by-Row Negative Count.
3. **Easy_07_CountNegatives_03** — Count Positives in Grid.
4. **Easy_07_CountNegatives_04** — Column-by-Column Negative Count.
5. **Easy_07_CountNegatives_05** — Count Negatives Optimal O(M+N).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_07_CountNegatives.java.
