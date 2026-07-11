# Easy_06_DeleteGreatestValue — Довідка

## Техніка: Сортування рядків матриці

**Суть:** Сортування кожного рядка двовимірного масиву (матриці) за зростанням. Після сортування максимальні значення у кожному стовпчику будуть знаходитися на однакових індексах.

```java
for (int[] row : grid) {
    Arrays.sort(row);
}
int sum = 0;
for (int col = 0; col < grid[0].length; col++) {
    int maxVal = 0;
    for (int row = 0; row < grid.length; row++) {
        maxVal = Math.max(maxVal, grid[row][col]);
    }
    sum += maxVal;
}
```

**Коли застосовувати:** Коли потрібно синхронно видаляти найбільші/найменші елементи з кожного рядка матриці.

**Складність:** Часова: O(R * C log C), де R — рядки, C — стовпці. Просторова: O(1) додаткової пам'яті.

## Вправи (Drills)
- [Easy_06_01_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_01_DeleteGreatestValue.java) — Видалити найбільше значення з одного рядка.
- [Easy_06_02_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_02_DeleteGreatestValue.java) — Відсортувати кожен рядок матриці за зростанням.
- [Easy_06_03_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_03_DeleteGreatestValue.java) — Видалити найменші значення в кожному рядку та сумувати мінімуми видалених елементів.
- [Easy_06_04_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_04_DeleteGreatestValue.java) — Видалити найбільші значення по стовпчиках замість рядків.
- [Easy_06_05_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_05_DeleteGreatestValue.java) — Діагональне видалення найбільших елементів.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_06_DeleteGreatestValue.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_06_DeleteGreatestValue.java).
