# Medium_03_IntervalListIntersections — Довідка

## Техніка: Два вказівники на списках інтервалів

**Суть:** Порівнюємо інтервали під вказівниками `i` та `j`. Перетин існує, якщо `start = max(s1, s2) <= end = min(e1, e2)`. Просуваємо вказівник того списку, інтервал якого закінчується раніше.

### Концептуальний код
```java
int i = 0, j = 0;
List<int[]> res = new ArrayList<>();
while (i < firstList.length && j < secondList.length) {
    int start = Math.max(firstList[i][0], secondList[j][0]);
    int end = Math.min(firstList[i][1], secondList[j][1]);
    if (start <= end) res.add(new int[]{start, end});
    if (firstList[i][1] < secondList[j][1]) i++;
    else j++;
}
```

**Коли застосовувати:**
- Обчислення перетину або об'єднання двох списків відсортованих та неперетинних інтервалів.

**Складність:**
- **Часова:** O(M + N) — лінійний прохід по обох списках.
- **Просторова:** O(M + N) для збереження результату.

## Вправи (Drills)
1. **01 — Intersect Two Intervals**: Intersect two single intervals a = [start1, end1] and b = [start2, end2]. Return the intersection interval, or empty array if they don't overlap.
2. **02 — Do Intervals Overlap**: Given a sorted list of intervals, check if any intervals overlap with each other.
3. **03 — Merge Overlapping Intervals**: Given a list of intervals, merge all overlapping intervals.
4. **04 — Union of Sorted Interval Lists**: Find the union of two sorted lists of disjoint intervals. Merge overlapping parts.
5. **05 — Intersection with Length Filter**: Find intersection of two interval lists, but only keep intersections that have a length of at least minLength.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_03_IntervalListIntersections.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Medium_03_IntervalListIntersections.java).
