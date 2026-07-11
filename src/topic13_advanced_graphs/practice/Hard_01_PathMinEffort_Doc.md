# Hard_01_PathMinEffort — Довідка

## Техніка: Шлях з мінімальним зусиллям (Dijkstra / Binary Search)

**Суть:** Зусилля шляху визначається як максимальна абсолютна різниця висот між двома сусідніми комірками на шляху. Ми шукаємо шлях від (0,0) до (rows-1, cols-1), який мінімізує це максимальне зусилля. Це вирішується через модифіковану Дейкстру або Binary Search по значенню зусилля разом з перевіркою зв'язності через DFS/BFS.

### Концептуальний приклад
```java
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
// state: {row, col, max_diff_so_far}
```

**Коли застосовувати:** Пошук шляху на 2D-сітці, де вартість шляху визначається мінімаксним значенням (мінімізацією максимального ребра на шляху).

**Складність:** Часова: O(R * C log(R * C)) для Дейкстри, Просторова: O(R * C).

## Тренувальні задачі (Drills)

1. [Hard_01_PathMinEffort_01_PathMinEffort](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort_01_PathMinEffort.java) — Перевірка зв'язності при зусиллі: Перевіряє, чи існує шлях від лівого верхнього до правого нижнього кута сітки з максимальним зусиллям на будь-якому переході не більше ніж maxEffort.
2. [Hard_01_PathMinEffort_02_PathMinEffort](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort_02_PathMinEffort.java) — Мінімальне зусилля через Binary Search: Знаходить мінімальне зусилля за допомогою бінарного пошуку по діапазону можливих значень зусилля [0, 10^6] та перевірки зв'язності.
3. [Hard_01_PathMinEffort_03_PathMinEffort](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort_03_PathMinEffort.java) — Мінімальне зусилля через Дейкстру: Реалізує знаходження мінімального зусилля за допомогою алгоритму Дейкстри.
4. [Hard_01_PathMinEffort_04_PathMinEffort](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort_04_PathMinEffort.java) — Мінімальне зусилля з лімітом кроків: Знаходить мінімальне зусилля шляху, який містить не більше ніж k кроків (переходів).
5. [Hard_01_PathMinEffort_05_PathMinEffort](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort_05_PathMinEffort.java) — Мінімальне зусилля з перешкодами: Знаходить мінімальне зусилля шляху, де деякі клітинки повністю заблоковані (obstacles[i][j] == 1).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_01_PathMinEffort.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_01_PathMinEffort.java).
