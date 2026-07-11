# Medium_01_NetworkDelayTime — Довідка

## Техніка: Час затримки в мережі (Dijkstra)

**Суть:** Знаходження найкоротших шляхів від одного джерела k до всіх інших вершин у зваженому орієнтованому графі. Якщо якась вершина недосяжна, повертаємо -1. Інакше відповідь — максимальна з відстаней до всіх досяжних вершин.

### Концептуальний приклад
```java
int[] dist = new int[n + 1];
Arrays.fill(dist, Integer.MAX_VALUE);
dist[k] = 0;
```

**Коли застосовувати:** Коли потрібно знайти час, необхідний для поширення сигналу по всій мережі від одного джерела до всіх вузлів.

**Складність:** Часова: O(E log V) з пріоритетною чергою, Просторова: O(V + E) для зберігання графа.

## Тренувальні задачі (Drills)

1. [Medium_01_NetworkDelayTime_01_NetworkDelayTime](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime_01_NetworkDelayTime.java) — Найкоротші шляхи через Дейкстру: Повертає масив найкоротших відстаней від вершини k до всіх вершин від 1 до n. Для недосяжних вершин записує Integer.MAX_VALUE.
2. [Medium_01_NetworkDelayTime_02_NetworkDelayTime](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime_02_NetworkDelayTime.java) — Затримка через Bellman-Ford: Вирішує задачу пошуку максимального часу затримки за допомогою алгоритму Белмана-Форда.
3. [Medium_01_NetworkDelayTime_03_NetworkDelayTime](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime_03_NetworkDelayTime.java) — Затримка через Floyd-Warshall: Вирішує задачу за допомогою алгоритму Флойда-Уоршелла (пошук найкоротших шляхів між усіма парами вершин).
4. [Medium_01_NetworkDelayTime_04_NetworkDelayTime](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime_04_NetworkDelayTime.java) — Затримка у списку суміжності: Вирішує задачу за допомогою алгоритму Дейкстри, коли граф представлений як список суміжності adj (кожен елемент — пара [сусід, вага]).
5. [Medium_01_NetworkDelayTime_05_NetworkDelayTime](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime_05_NetworkDelayTime.java) — Затримка з лімітом переходів: Знаходить час затримки сигналу, якщо він може пройти не більше ніж maxSteps ребер від джерела k до будь-кої вершини.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_01_NetworkDelayTime.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_01_NetworkDelayTime.java).
