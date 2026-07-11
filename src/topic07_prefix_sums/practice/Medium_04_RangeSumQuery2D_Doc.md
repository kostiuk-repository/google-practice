# Medium_04_RangeSumQuery2D — Довідка

## Техніка: Двовимірні інтервальні префіксні суми (2D Immutable Prefix Sums)

**Суть:** Розрахунок і використання 2D префіксної матриці `P`. Для будь-якої прямокутної області від `(row1, col1)` до `(row2, col2)` сума елементів дорівнює: `P[row2+1][col2+1] - P[row1][col2+1] - P[row2+1][col1] + P[row1][col1]`.

```java
public class NumMatrix {
    private int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                dp[r+1][c+1] = matrix[r][c] + dp[r][c+1] + dp[r+1][c] - dp[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1] - dp[row1][col2+1] - dp[row2+1][col1] + dp[row1][col1];
    }
}
```

**Коли застосовувати:**
- При багаторазових швидких O(1) запитах сум підматриць на статичній 2D сітці.

**Складність:**
- Часова складність: O(R * C) для ініціалізації, O(1) для кожного запиту.
- Просторова складність: O(R * C) для збереження префіксної матриці.

## Вправи (Drills)
1. **01 — Prefix Sum 2x2**: Розрахунок префіксної матриці для маленького розміру 2x2.
2. **02 — Query Single Element**: Відновлення значення клітинки через префіксну матрицю.
3. **03 — Basic Region Sum**: Сума регіону за готовою префіксною матрицею.
4. **04 — One-Based Range Sum**: Розрахунок суми з 1-базовою індексацією префіксів.
5. **05 — Region Sum Safe**: Запити з автоматичним обмеженням координат по межах матриці.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_RangeSumQuery2D.java.
