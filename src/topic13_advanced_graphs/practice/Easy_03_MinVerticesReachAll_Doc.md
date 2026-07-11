# Easy_03_MinVerticesReachAll — Довідка

## Техніка: Мінімальна підмножина вершин для досяжності (Джерела в DAG)

**Суть:** В орієнтованому ациклічному графі (DAG) будь-яка вершина з вхідним ступенем 0 (джерело / source) не може бути досягнута з жодної іншої вершини. Отже, вона обов'язково повинна входити до мінімального набору вершин для досяжності всього графа. Всі інші вершини мають вхідний ступінь > 0 і можуть бути досягнуті з якогось джерела.

### Концептуальний приклад
```java
int[] inDegree = new int[n];
for (List<Integer> edge : edges) {
    inDegree[edge.get(1)]++;
}
List<Integer> result = new ArrayList<>();
for (int i = 0; i < n; i++) {
    if (inDegree[i] == 0) result.add(i);
}
```

**Коли застосовувати:** Коли потрібно знайти мінімальну множину стартових точок у DAG, щоб обійти всі вершини.

**Складність:** Часова: O(V + E), Просторова: O(V).

## Тренувальні задачі (Drills)

1. [Easy_03_MinVerticesReachAll_01_MinVerticesReachAll](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll_01_MinVerticesReachAll.java) — Перевірка повноти досяжності: Перевіряє, чи дійсно задана множина стартових вершин може досягти всіх інших вершин графа.
2. [Easy_03_MinVerticesReachAll_02_MinVerticesReachAll](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll_02_MinVerticesReachAll.java) — Підрахунок джерел: Рахує загальну кількість вершин з нульовим вхідним ступенем.
3. [Easy_03_MinVerticesReachAll_03_MinVerticesReachAll](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll_03_MinVerticesReachAll.java) — Пошук джерел з масивом ребер: Розв'язує базову задачу, коли список ребер представлено масивом int[][] замість списку списків.
4. [Easy_03_MinVerticesReachAll_04_MinVerticesReachAll](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll_04_MinVerticesReachAll.java) — Недосяжні вершини: Знаходить список усіх вершин, які неможливо досягти, якщо почати обхід з однієї заданої вершини startNode.
5. [Easy_03_MinVerticesReachAll_05_MinVerticesReachAll](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll_05_MinVerticesReachAll.java) — Пошук джерел з циклами: Знаходить мінімальний набір вершин для досяжності графа, який може містити цикли (потрібно повернути хоча б по одній вершині з кожної компоненти сильної зв'язності, яка не має вхідних ребер ззовні).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_03_MinVerticesReachAll.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_03_MinVerticesReachAll.java).
