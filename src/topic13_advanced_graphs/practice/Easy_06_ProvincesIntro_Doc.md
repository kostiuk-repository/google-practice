# Easy_06_ProvincesIntro — Довідка

## Техніка: Пошук зв'язних компонентів у неорієнтованому графі

**Суть:** Задача полягає у визначенні кількості зв'язних компонентів (провінцій). Граф представлений матрицею суміжності isConnected. Використовуємо обхід у глибину (DFS) або ширину (BFS), щоб відвідати всі вершини в одній компоненті та позначити їх як відвідані.

### Концептуальний приклад
```java
public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    boolean[] visited = new boolean[n];
    int provinces = 0;
    for (int i = 0; i < n; i++) {
        if (!visited[i]) {
            dfs(isConnected, visited, i);
            provinces++;
        }
    }
    return provinces;
}
private void dfs(int[][] isConnected, boolean[] visited, int i) {
    for (int j = 0; j < isConnected.length; j++) {
        if (isConnected[i][j] == 1 && !visited[j]) {
            visited[j] = true;
            dfs(isConnected, visited, j);
        }
    }
}
```

**Коли застосовувати:** Коли граф представлений матрицею суміжності і потрібно знайти загальну кількість ізольованих груп (зв'язних компонентів).

**Складність:** Часова: O(N^2) де N — кількість вершин, Просторова: O(N) для стеку викликів або черги.

## Тренувальні задачі (Drills)

1. [Easy_06_ProvincesIntro_01_ProvincesIntro](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro_01_ProvincesIntro.java) — Допоміжний DFS: Реалізує допоміжну функцію обходу в глибину (DFS) для відвідування всіх зв'язаних вершин.
2. [Easy_06_ProvincesIntro_02_ProvincesIntro](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro_02_ProvincesIntro.java) — Провінції через список суміжності: Знаходить кількість провінцій, якщо граф задано списком суміжності.
3. [Easy_06_ProvincesIntro_03_ProvincesIntro](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro_03_ProvincesIntro.java) — Спільна компонента: Перевіряє, чи належать дві задані вершини одній провінції.
4. [Easy_06_ProvincesIntro_04_ProvincesIntro](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro_04_ProvincesIntro.java) — Розмір найбільшої провінції: Знаходить розмір (кількість вершин) найбільшої провінції в графі.
5. [Easy_06_ProvincesIntro_05_ProvincesIntro](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro_05_ProvincesIntro.java) — Провінції через Union-Find: Знаходить кількість провінцій за допомогою структури даних Union-Find (Disjoint Set Union).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_06_ProvincesIntro.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_06_ProvincesIntro.java).
