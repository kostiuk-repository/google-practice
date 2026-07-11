# Easy_07_BipartiteCheck — Довідка

## Техніка: Розфарбовування графа у два кольори (Bipartite Graph Check)

**Суть:** Граф є дводольним (bipartite), якщо його вершини можна розділити на дві незалежні множини так, що кожне ребро з'єднує вершину з однієї множини з вершиною з іншої. Це еквівалентно можливості розфарбувати граф у 2 кольори без конфліктів суміжних вершин.

### Концептуальний приклад
```java
int[] colors = new int[graph.length];
for (int i = 0; i < graph.length; i++) {
    if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
        return false;
    }
}
```

**Коли застосовувати:** Перевірка, чи не містить граф циклів непарної довжини.

**Складність:** Часова: O(V + E), Просторова: O(V) для масиву кольорів.

## Тренувальні задачі (Drills)

1. [Easy_07_BipartiteCheck_01_BipartiteCheck](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck_01_BipartiteCheck.java) — Допоміжне фарбування DFS: Допоміжний рекурсивний DFS метод для розфарбовування однієї зв'язної компоненти.
2. [Easy_07_BipartiteCheck_02_BipartiteCheck](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck_02_BipartiteCheck.java) — Дводольність через список суміжності: Перевіряє дводольність графа, заданого списком суміжності.
3. [Easy_07_BipartiteCheck_03_BipartiteCheck](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck_03_BipartiteCheck.java) — Отримання долей: Повертає масив розфарбування (0 або 1 для кожної вершини). Якщо граф не є дводольним, повертає порожній масив.
4. [Easy_07_BipartiteCheck_04_BipartiteCheck](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck_04_BipartiteCheck.java) — Дводольність через BFS: Реалізує перевірку дводольності графа за допомогою обходу в ширину (BFS).
5. [Easy_07_BipartiteCheck_05_BipartiteCheck](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck_05_BipartiteCheck.java) — Дводольність з петлями та ізолятами: Перевіряє дводольність для графа, який може містити ізольовані вершини та петельні ребра (self-loops).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_07_BipartiteCheck.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_07_BipartiteCheck.java).
