# Medium_05_MinCostConnectPoints — Довідка

## Техніка: Побудова мінімального кістякового дерева (MST - Kruskal / Prim)

**Суть:** Потрібно з'єднати всі точки з мінімальною сумарною вартістю, яка визначається як Мангеттенська відстань. Це класична задача пошуку мінімального кістякового дерева (MST). Може бути розв'язана алгоритмом Краскала (сортування ребер та Union-Find) або алгоритмом Пріма (Min-Heap).

### Концептуальний приклад
```java
int dist = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
// Manhattan distance
```

**Коли застосовувати:** Знаходження найдешевшого способу зв'язати всі вершини зваженого графа в єдину мережу без циклів.

**Складність:** Часова: O(N^2 log N) або O(N^2), Просторова: O(N^2) або O(N).

## Тренувальні задачі (Drills)

1. [Medium_05_MinCostConnectPoints_01_MinCostConnectPoints](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints_01_MinCostConnectPoints.java) — Мангеттенська відстань: Обчислює Мангеттенську відстань між двома точками на площині.
2. [Medium_05_MinCostConnectPoints_02_MinCostConnectPoints](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints_02_MinCostConnectPoints.java) — З'єднання точок через Краскала: Будує MST за допомогою алгоритму Краскала (сортування всіх можливих ребер та Union-Find).
3. [Medium_05_MinCostConnectPoints_03_MinCostConnectPoints](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints_03_MinCostConnectPoints.java) — З'єднання точок через Пріма: Будує MST за допомогою алгоритму Пріма (жадібний вибір найближчої непід'єднаної точки).
4. [Medium_05_MinCostConnectPoints_04_MinCostConnectPoints](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints_04_MinCostConnectPoints.java) — Зв'язність при обмеженні довжини: Перевіряє, чи можна об'єднати всі точки в один зв'язний граф, використовуючи лише ребра з довжиною <= maxEdgeLen.
5. [Medium_05_MinCostConnectPoints_05_MinCostConnectPoints](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints_05_MinCostConnectPoints.java) — MST з існуючими безкоштовними ребрами: Знаходить мінімальну додаткову вартість з'єднання всіх точок, якщо деякі ребра вже прокладені (мають вартість 0).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_05_MinCostConnectPoints.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_05_MinCostConnectPoints.java).
