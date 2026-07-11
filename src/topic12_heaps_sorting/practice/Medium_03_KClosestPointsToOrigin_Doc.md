# Medium_03_KClosestPointsToOrigin — Довідка

## Техніка: Сортування за відстанню через Max-Heap

**Суть:** Використання Max-Heap розміру K для збереження точок з найменшими відстанями до початку координат.

```java
PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1, p2) -> 
    (p2[0]*p2[0] + p2[1]*p2[1]) - (p1[0]*p1[0] + p1[1]*p1[1])
);
```

**Коли застосовувати:** Коли потрібно знайти K найближчих об'єктів до заданої точки у просторі.

**Складність:** Часова: O(N log K). Просторова: O(K).

## Вправи (Drills)
- [Medium_03_01_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_01_KClosestPointsToOrigin.java) — Обчислити квадрат евклідової відстані до початку координат.
- [Medium_03_02_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_02_KClosestPointsToOrigin.java) — Пошук однієї найближчої точки до початку координат (K=1) за один прохід.
- [Medium_03_03_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_03_KClosestPointsToOrigin.java) — Пошук K найближчих точок до довільної заданої точки target.
- [Medium_03_04_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_04_KClosestPointsToOrigin.java) — Реалізація пошуку K найближчих точок через Max-Heap обмеженого розміру K.
- [Medium_03_05_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_05_KClosestPointsToOrigin.java) — Знаходження K найближчих точок за допомогою QuickSelect.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_03_KClosestPointsToOrigin.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_03_KClosestPointsToOrigin.java).
