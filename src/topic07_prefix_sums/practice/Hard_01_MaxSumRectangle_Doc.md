# Hard_01_MaxSumRectangle — Довідка

## Техніка: 2D Пошук підматриць та 1D TreeSet префіксів (2D Submatrix Reduction + 1D Range Search)

**Суть:** Для пошуку прямокутника з максимальною сумою <= `k` ми фіксуємо ліву та праву межі стовпчиків `col1` та `col2`. Об'єднуємо рядки між ними в одновимірний масив сум `rowSums`. Задача зводиться до пошуку 1D підмасиву з максимальною сумою <= `k`, що вирішується за допомогою TreeSet префіксних сум за O(R log R).

```java
public int maxSumSubmatrix(int[][] matrix, int k) {
    int R = matrix.length, C = matrix[0].length;
    int max = Integer.MIN_VALUE;
    for (int c1 = 0; c1 < C; c1++) {
        int[] rowSums = new int[R];
        for (int c2 = c1; c2 < C; c2++) {
            for (int r = 0; r < R; r++) {
                rowSums[r] += matrix[r][c2];
            }
            TreeSet<Integer> set = new TreeSet<>();
            set.add(0);
            int prefix = 0;
            for (int val : rowSums) {
                prefix += val;
                Integer target = set.ceiling(prefix - k);
                if (target != null) {
                    max = Math.max(max, prefix - target);
                }
                set.add(prefix);
            }
        }
    }
    return max;
}
```

**Коли застосовувати:**
- Пошук оптимальних за сумою прямокутників у 2D матриці за наявності обмежень зверху (менше або дорівнює K).

**Складність:**
- Часова складність: O(C^2 * R log R) або O(R^2 * C log C) — вибір меншої розмірності для зовнішніх циклів.
- Просторова складність: O(R) або O(C) для зберігання сум рядків/стовпців.

## Вправи (Drills)
1. **01 — Max Sum Subarray <= K**: Пошук 1D підмасиву з сумою <= K.
2. **02 — Row Range Sums**: Обчислити суми елементів у рядках між стовпцями col1 та col2.
3. **03 — Max Sum Submatrix No Limit**: Пошук прямокутника з максимальною сумою без обмежень (Кадан).
4. **04 — Max Sum Submatrix Complete**: Повний алгоритм пошуку прямокутника <= K.
5. **05 — Max Sum Square Submatrix**: Пошук оптимального квадрата з сумою <= K.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_MaxSumRectangle.java.
