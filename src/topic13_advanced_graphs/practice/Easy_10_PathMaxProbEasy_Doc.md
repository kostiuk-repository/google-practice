# Easy_10_PathMaxProbEasy — Довідка

## Техніка: Оптимізація шляху за ймовірностями (Модифікація Дейкстри)

**Суть:** Замість додавання ваг ребер для пошуку найкоротшого шляху, ми множимо ймовірності для знаходження шляху з максимальною ймовірністю успіху. Використовуємо чергу з пріоритетом (Max-Heap), що вибирає вершину з найбільшою накопиченою ймовірністю.

### Концептуальний приклад
```java
PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
// double[] -> {node, current_prob}
```

**Коли застосовувати:** Коли потрібно знайти шлях у графі, де ребра мають ймовірності переходів (0 <= p <= 1), а цільова метрика — максимізація добутку ймовірностей.

**Складність:** Часова: O(E log V), Просторова: O(V + E) для списку суміжності та heap.

## Тренувальні задачі (Drills)

1. [Easy_10_PathMaxProbEasy_01_PathMaxProbEasy](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy_01_PathMaxProbEasy.java) — Ймовірність через Bellman-Ford: Знаходить максимальну ймовірність шляху за допомогою Bellman-Ford алгоритму.
2. [Easy_10_PathMaxProbEasy_02_PathMaxProbEasy](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy_02_PathMaxProbEasy.java) — Ймовірність через BFS: Знаходить максимальну ймовірність за допомогою SPFA/BFS обходу з оновленням масиву максимальних ймовірностей.
3. [Easy_10_PathMaxProbEasy_03_PathMaxProbEasy](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy_03_PathMaxProbEasy.java) — Ймовірність у списку суміжності: Алгоритм Дейкстри для знаходження максимальної ймовірності, коли граф вже представлений списком суміжності adj (де кожне ребро представлене як double[] {neighbor_node, probability}).
4. [Easy_10_PathMaxProbEasy_04_PathMaxProbEasy](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy_04_PathMaxProbEasy.java) — Ймовірності до всіх вершин: Повертає масив максимальних ймовірностей досягнення всіх вершин графа зі стартової вершини.
5. [Easy_10_PathMaxProbEasy_05_PathMaxProbEasy](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy_05_PathMaxProbEasy.java) — Ймовірність з обмеженням кроків: Знаходить максимальну ймовірність шляху від start до end з обмеженням на кількість проміжних вершин (не більше ніж k кроків).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_10_PathMaxProbEasy.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_10_PathMaxProbEasy.java).
