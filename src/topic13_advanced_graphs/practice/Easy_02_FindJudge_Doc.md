# Easy_02_FindJudge — Довідка

## Техніка: Пошук судді міста через ступені вершин (In-Degree / Out-Degree)

**Суть:** Суддя міста не довіряє нікому (вихідний ступінь 0) і йому довіряють усі інші n-1 жителів (вхідний ступінь n-1). Ми можемо підрахувати чисту різницю або окремо ступені для кожного жителя за допомогою масиву рахунків (score/degree array).

### Концептуальний приклад
```java
int[] trustScores = new int[n + 1];
for (int[] relation : trust) {
    trustScores[relation[0]]--; // вихідне ребро
    trustScores[relation[1]]++; // вхідне ребро
}
for (int i = 1; i <= n; i++) {
    if (trustScores[i] == n - 1) return i;
}
```

**Коли застосовувати:** Коли потрібно знайти вершину в орієнтованому графі, яка є глобальним стоком (sink), тобто вхідний ступінь дорівнює n-1, а вихідний — 0.

**Складність:** Часова: O(V + E) де V = n, E = довжина trust; Просторова: O(V) для зберігання ступенів.

## Тренувальні задачі (Drills)

1. [Easy_02_FindJudge_01_FindJudge](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge_01_FindJudge.java) — Перевірка кандидата: Перевіряє, чи відповідає конкретний кандидат критеріям судді міста.
2. [Easy_02_FindJudge_02_FindJudge](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge_02_FindJudge.java) — Суддя у списку суміжності: Знаходить суддю міста, якщо відношення довіри задано списком суміжності.
3. [Easy_02_FindJudge_03_FindJudge](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge_03_FindJudge.java) — Суддя у матриці суміжності: Знаходить суддю міста, якщо матриця довіри задана у вигляді матриці суміжності n x n (де trustMatrix[i][j] == 1 означає, що i довіряє j).
4. [Easy_02_FindJudge_04_FindJudge](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge_04_FindJudge.java) — Кількість популярних осіб: Рахує кількість кандидатів, які не довіряють нікому і яким довіряють принаймні половина мешканців.
5. [Easy_02_FindJudge_05_FindJudge](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge_05_FindJudge.java) — Найбільш довірена особа: Знаходить особу, якій довіряє найбільша кількість людей (максимальний in-degree), навіть якщо вона сама комусь довіряє.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_02_FindJudge.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_02_FindJudge.java).
