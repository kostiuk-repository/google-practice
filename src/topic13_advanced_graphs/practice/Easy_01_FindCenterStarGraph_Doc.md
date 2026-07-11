# Easy_01_FindCenterStarGraph — Довідка

## Техніка: Знаходження центру зіркоподібного графа

**Суть:** У зіркоподібному графі з n вершинами існує рівно одна центральна вершина, яка має ступінь n-1, а всі інші вершини мають ступінь 1. Через це будь-які два ребра графа обов'язково містять центральну вершину як спільний елемент.

### Концептуальний приклад
```java
int u1 = edges[0][0], v1 = edges[0][1];
int u2 = edges[1][0], v2 = edges[1][1];
int center = (u1 == u2 || u1 == v2) ? u1 : v1;
```

**Коли застосовувати:** Коли граф за умовою є зіркоподібним (star graph) і потрібно знайти його центр за мінімальний час O(1).

**Складність:** Часова: O(1) (достатньо перевірити два ребра), Просторова: O(1).

## Тренувальні задачі (Drills)

1. [Easy_01_FindCenterStarGraph_01_FindCenterStarGraph](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph_01_FindCenterStarGraph.java) — Перевірка центру: Перевіряє, чи є задана вершина центром зіркоподібного графа.
2. [Easy_01_FindCenterStarGraph_02_FindCenterStarGraph](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph_02_FindCenterStarGraph.java) — Центр у списку суміжності: Знаходить центр графа, заданого списком суміжності.
3. [Easy_01_FindCenterStarGraph_03_FindCenterStarGraph](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph_03_FindCenterStarGraph.java) — Валідація зірки: Перевіряє, чи є задане дерево з n вершин зіркоподібним графом.
4. [Easy_01_FindCenterStarGraph_04_FindCenterStarGraph](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph_04_FindCenterStarGraph.java) — Центр з додатковим листком: Знаходить центр зіркоподібного графа, до якого додали одне зайве ребро на периферії (зв'язали один листок з іншим листком).
5. [Easy_01_FindCenterStarGraph_05_FindCenterStarGraph](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph_05_FindCenterStarGraph.java) — Орієнтований стік-центр: Знаходить стік-центр в орієнтованій зірці, де всі ребра спрямовані до центру.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_01_FindCenterStarGraph.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_01_FindCenterStarGraph.java).
