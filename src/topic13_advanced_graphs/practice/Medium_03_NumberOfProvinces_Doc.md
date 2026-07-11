# Medium_03_NumberOfProvinces — Довідка

## Техніка: Зв'язні компоненти в матриці суміжності

**Суть:** Ми рахуємо кількість незалежних груп зв'язності в неорієнтованому графі, який представлено матрицею суміжності isConnected. Використовуємо DFS, BFS або Union-Find.

### Концептуальний приклад
```java
// Ідентичний алгоритм пошуку зв'язних компонентів
// isConnected[i][j] == 1
```

**Коли застосовувати:** Коли потрібно згрупувати вершини неорієнтованого графа в незалежні кластери.

**Складність:** Часова: O(N^2), Просторова: O(N).

## Тренувальні задачі (Drills)

1. [Medium_03_NumberOfProvinces_01_NumberOfProvinces](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces_01_NumberOfProvinces.java) — Провінції через DFS: Знаходить кількість провінцій за допомогою DFS.
2. [Medium_03_NumberOfProvinces_02_NumberOfProvinces](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces_02_NumberOfProvinces.java) — Провінції через BFS: Знаходить кількість провінцій за допомогою BFS.
3. [Medium_03_NumberOfProvinces_03_NumberOfProvinces](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces_03_NumberOfProvinces.java) — Провінції через Union-Find: Знаходить кількість провінцій за допомогою структури Union-Find.
4. [Medium_03_NumberOfProvinces_04_NumberOfProvinces](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces_04_NumberOfProvinces.java) — Списки груп провінцій: Повертає список груп, де кожна група містить індекси міст, що входять в одну провінцію.
5. [Medium_03_NumberOfProvinces_05_NumberOfProvinces](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces_05_NumberOfProvinces.java) — Провінції після додавання зв'язку: Повертає нову кількість провінцій після додавання одного додаткового ребра між містами p1 та p2.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_03_NumberOfProvinces.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_03_NumberOfProvinces.java).
