# Hard_03_SwimInRisingWater — Довідка

## Техніка: Плавання в підйомній воді (Dijkstra / Binary Search / Union-Find)

**Суть:** Потрібно знайти шлях від (0,0) до (n-1, n-1) на сітці, який мінімізує максимальну висоту клітинки на шляху. Задача вирішується алгоритмом Дейкстри (Min-Heap), Union-Find (сортування клітинок) або Binary Search по часу.

### Концептуальний приклад
```java
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
// state: {r, c, elevation}
```

**Коли застосовувати:** Пошук шляху на сітці з мінімізацією максимальної вартості переходу, де вартість залежить виключно від значень вершин.

**Складність:** Часова: O(N^2 log N), Просторова: O(N^2).

## Тренувальні задачі (Drills)

1. [Hard_03_SwimInRisingWater_01_SwimInRisingWater](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater_01_SwimInRisingWater.java) — Досяжність при рівні води: Перевіряє, чи можна пропливти від старту до фінішу за заданий час time (тобто чи існує шлях, де всі вершини мають висоту <= time).
2. [Hard_03_SwimInRisingWater_02_SwimInRisingWater](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater_02_SwimInRisingWater.java) — Час плавання через Binary Search: Вирішує задачу за допомогою бінарного пошуку по діапазону часу [grid[0][0], N*N-1] та перевірки зв'язності.
3. [Hard_03_SwimInRisingWater_03_SwimInRisingWater](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater_03_SwimInRisingWater.java) — Час плавання через Дейкстру: Знаходить мінімальний час плавання за допомогою модифікованого алгоритму Дейкстри.
4. [Hard_03_SwimInRisingWater_04_SwimInRisingWater](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater_04_SwimInRisingWater.java) — Час плавання через Union-Find: Знаходить відповідь за допомогою структури даних Union-Find. Сортуємо всі клітинки за висотою та об'єднуємо сусідні клітинки по одній, поки старт і фініш не опиняться в одному наборі.
5. [Hard_03_SwimInRisingWater_05_SwimInRisingWater](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater_05_SwimInRisingWater.java) — Плавання з витратою енергії: Плавання, де кожен крок споживає 1 одиницю енергії, але кожна клітинка з водою відновлює енергію пропорційно її глибині. Знайдіть мінімальний рівень води, при якому можна досягти кінця без повної втрати енергії.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_03_SwimInRisingWater.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_03_SwimInRisingWater.java).
