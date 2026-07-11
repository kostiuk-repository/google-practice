# Hard_01_NQueens — Довідка

## Техніка: Backtracking / Chessboard Constraint Satisfaction

**Суть:** Розстановка фігур (ферзів) на дошці з перевіркою обмежень. Послідовно для кожного рядка вибирається колонка. Щоб швидко перевіряти загрози по вертикалях та діагоналях, використовуються структури для відстеження зайнятих ліній, з очищенням стану при поверненні.

```java
void backtrack(int r, int n, boolean[] cols, boolean[] d1, boolean[] d2, List<List<String>> result, char[][] board) {
    if (r == n) {
        result.add(construct(board));
        return;
    }
    for (int c = 0; c < n; c++) {
        int id1 = r - c + n;
        int id2 = r + c;
        if (cols[c] || d1[id1] || d2[id2]) continue;
        board[r][c] = 'Q'; cols[c] = d1[id1] = d2[id2] = true;
        backtrack(r + 1, n, cols, d1, d2, result, board);
        board[r][c] = '.'; cols[c] = d1[id1] = d2[id2] = false;
    }
}
```

**Коли застосовувати:** Задачі комбінаторного пошуку на сітці зі складними взаємними обмеженнями між об'єктами.

**Складність:** O(N!) час, O(N) пам'ять.

## Drills

1. **Hard_01_01** — N-Queens II: Поверніть загальну кількість різних рішень для задачі n-queens.
2. **Hard_01_02** — Rook Placements: Розставте n тур на шахівниці n x n так, щоб вони не атакували одна одну. Поверніть усі рішення.
3. **Hard_01_03** — N-Queens on Custom Board: Розв'яжіть задачу N-Queens на дошці n x n, де деякі клітинки є заблокованими для розміщення (blocked[r][c] == true).
4. **Hard_01_04** — N-Kings Placements: Розставте n королів на шахівниці n x n так, щоб вони не атакували один одного. Поверніть усі рішення.
5. **Hard_01_05** — Super Queens Placements: Розставте n Супер-ферзів (які б'ють як звичайні ферзі ТА як коні) на дошці n x n. Поверніть усі рішення.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_NQueens.java.
