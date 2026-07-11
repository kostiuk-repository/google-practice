# Medium_04_RedundantConnection — Довідка

## Техніка: Пошук циклу в неорієнтованому графі (Union-Find)

**Суть:** Ми маємо граф, який починався як дерево, але до нього додали одне зайве ребро, що утворило цикл. Нам потрібно знайти та повернути це ребро (те, яке з'являється в списку останнім і утворює цикл). Структура Union-Find є ідеальною для цього.

### Концептуальний приклад
```java
int[] parent = new int[n + 1];
for (int i = 1; i <= n; i++) parent[i] = i;
// find(u) == find(v) -> cycle!
```

**Коли застосовувати:** Визначення ребра, що замикає цикл у неорієнтованому графі при побудові дерева.

**Складність:** Часова: O(N * alpha(N)) майже лінійна, Просторова: O(N).

## Тренувальні задачі (Drills)

1. [Medium_04_RedundantConnection_01_RedundantConnection](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection_01_RedundantConnection.java) — Пошук шляху через DFS: Допоміжний DFS метод для перевірки, чи існує вже шлях між вершинами u та v у поточному графі adj.
2. [Medium_04_RedundantConnection_02_RedundantConnection](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection_02_RedundantConnection.java) — Зайвий зв'язок через DFS: Знаходить зайве ребро за допомогою перевірки зв'язності через DFS для кожного нового ребра.
3. [Medium_04_RedundantConnection_03_RedundantConnection](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection_03_RedundantConnection.java) — Зайвий зв'язок через Union-Find: Вирішує базову задачу за допомогою класичного Union-Find.
4. [Medium_04_RedundantConnection_04_RedundantConnection](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection_04_RedundantConnection.java) — Оптимізація Find з Path Compression: Реалізує функцію знаходження представника (find) з оптимізацією стиснення шляху (path compression).
5. [Medium_04_RedundantConnection_05_RedundantConnection](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection_05_RedundantConnection.java) — Зайвий зв'язок в орієнтованому дереві: Вирішує складнішу задачу для орієнтованого графа (Redundant Connection II), де вершина може мати два вхідні зв'язки або утворюватися цикл.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_04_RedundantConnection.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_04_RedundantConnection.java).
