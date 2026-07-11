# Medium_02_CourseScheduleII — Довідка

## Техніка: Топологічне сортування (Kahn's / DFS)

**Суть:** Потрібно побудувати послідовність вивчення курсів на основі заданих передумов. Це класична задача топологічного сортування орієнтованого графа. Якщо в графі є цикл, повернути порожній масив.

### Концептуальний приклад
```java
int[] inDegree = new int[numCourses];
List<List<Integer>> adj = new ArrayList<>();
// Ініціалізація та побудова графа
```

**Коли застосовувати:** Коли задано відношення часткового порядку (залежності) і потрібно знайти лінійний порядок виконання завдань без циклів.

**Складність:** Часова: O(V + E), Просторова: O(V + E) для графа.

## Тренувальні задачі (Drills)

1. [Medium_02_CourseScheduleII_01_CourseScheduleII](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII_01_CourseScheduleII.java) — Обчислення вхідних ступенів: Обчислює та повертає вхідні ступені для кожного курсу на основі передумов.
2. [Medium_02_CourseScheduleII_02_CourseScheduleII](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII_02_CourseScheduleII.java) — Перевірка можливості завершення: Перевіряє, чи можна взагалі закінчити всі курси (тобто чи не містить граф циклів).
3. [Medium_02_CourseScheduleII_03_CourseScheduleII](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII_03_CourseScheduleII.java) — Топологічний порядок через BFS: Знаходить порядок курсів за допомогою алгоритму Кана (BFS).
4. [Medium_02_CourseScheduleII_04_CourseScheduleII](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII_04_CourseScheduleII.java) — Топологічний порядок через DFS: Знаходить порядок курсів за допомогою алгоритму DFS та перевірки на цикли.
5. [Medium_02_CourseScheduleII_05_CourseScheduleII](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII_05_CourseScheduleII.java) — Всі можливі порядки курсів: Знаходить всі можливі валідні послідовності вивчення курсів (якщо топологічне сортування неоднозначне).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_02_CourseScheduleII.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Medium_02_CourseScheduleII.java).
