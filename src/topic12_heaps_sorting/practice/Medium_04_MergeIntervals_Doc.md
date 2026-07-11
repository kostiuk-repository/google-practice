# Medium_04_MergeIntervals — Довідка

## Техніка: Сортування за початком інтервалу

**Суть:** Сортування масиву інтервалів за їхніми початковими точками. Після цього перетин можливий тільки між сусідніми інтервалами, що дозволяє об'єднати їх за один лінійний прохід.

```java
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
List<int[]> merged = new ArrayList<>();
for (int[] interval : intervals) {
    if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
        merged.add(interval);
    } else {
        merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
    }
}
```

**Коли застосовувати:** Коли задано набір часових або числових проміжків, і потрібно об'єднати всі проміжки, які перетинаються.

**Складність:** Часова: O(N log N). Просторова: O(N).

## Вправи (Drills)
- [Medium_04_01_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_01_MergeIntervals.java) — Перевірити, чи перетинаються два окремі інтервали.
- [Medium_04_02_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_02_MergeIntervals.java) — Об'єднати два інтервали, які гарантовано перетинаються.
- [Medium_04_03_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_03_MergeIntervals.java) — Вставка нового інтервалу у відсортований список та злиття за потреби.
- [Medium_04_04_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_04_MergeIntervals.java) — Обчислення загальної довжини покриття після злиття інтервалів (сума довжин неперетинних інтервалів).
- [Medium_04_05_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_05_MergeIntervals.java) — Знаходження перетинів (спільних частин) між двома списками інтервалів.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_04_MergeIntervals.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_04_MergeIntervals.java).
