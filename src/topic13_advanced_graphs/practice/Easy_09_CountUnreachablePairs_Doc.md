# Easy_09_CountUnreachablePairs — Довідка

## Техніка: Підрахунок комбінацій недосяжних пар вершин

**Суть:** Кількість недосяжних пар вершин можна обчислити за допомогою комбінаторики. Якщо граф розбивається на компоненти зв'язності розмірами S1, S2,..., Sk, то загальна кількість недосяжних пар дорівнює сумі добутків розмірів компонентів. Або рахується ітеративно: totalPairs += size * remaining.

### Концептуальний приклад
```java
long totalPairs = 0;
long remainingNodes = n;
for (int size : componentSizes) {
    remainingNodes -= size;
    totalPairs += (long) size * remainingNodes;
}
```

**Коли застосовувати:** У неорієнтованому графі для знаходження кількості пар вершин, між якими немає шляху.

**Складність:** Часова: O(V + E) для пошуку компонентів, Просторова: O(V) для зберігання структури графа.

## Тренувальні задачі (Drills)

1. [Easy_09_CountUnreachablePairs_01_CountUnreachablePairs](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs_01_CountUnreachablePairs.java) — Розміри компонентів: Обчислює та повертає список розмірів усіх зв'язніх компонентів графа.
2. [Easy_09_CountUnreachablePairs_02_CountUnreachablePairs](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs_02_CountUnreachablePairs.java) — Підрахунок через BFS: Знаходить кількість недосяжних пар вершин за допомогою BFS для обходу компонентів.
3. [Easy_09_CountUnreachablePairs_03_CountUnreachablePairs](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs_03_CountUnreachablePairs.java) — Підрахунок через Union-Find: Знаходить кількість недосяжних пар вершин за допомогою Union-Find.
4. [Easy_09_CountUnreachablePairs_04_CountUnreachablePairs](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs_04_CountUnreachablePairs.java) — Підрахунок у списку суміжності: Розв'язує задачу, коли граф представлений списком суміжності.
5. [Easy_09_CountUnreachablePairs_05_CountUnreachablePairs](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs_05_CountUnreachablePairs.java) — Зважені недосяжні пари: Кожна вершина має вагу. Недосяжна пара вершин (u, v) має вартість weights[u] * weights[v]. Знайдіть суму вартостей усіх недосяжних пар.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_09_CountUnreachablePairs.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_09_CountUnreachablePairs.java).
