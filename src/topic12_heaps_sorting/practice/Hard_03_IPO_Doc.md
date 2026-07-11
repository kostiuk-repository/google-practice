# Hard_03_IPO — Довідка

## Техніка: Жадібний вибір з купою та сортуванням

**Суть:** Сортування проектів за стартовим капіталом. Використання Max-Heap для збереження прибутків усіх проектів, які ми можемо дозволити собі з поточним капіталом.

```java
// Projects are sorted by capital requirements
PriorityQueue<Integer> maxProfit = new PriorityQueue<>(Collections.reverseOrder());
// for i in 0..k: add affordable projects, poll max profit project, increase capital w
```

**Коли застосовувати:** Коли є вибір проектів з вимогами до капіталу та прибутком, і потрібно максимізувати капітал за K кроків.

**Складність:** Часова: O(N log N) для сортування. Просторова: O(N).

## Вправи (Drills)
- [Hard_03_01_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_01_IPO.java) — Отримати список індексів проектів, доступних при заданому капіталі w.
- [Hard_03_02_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_02_IPO.java) — Вибір одного найкращого проекту (з найбільшим прибутком) за поточного капіталу w.
- [Hard_03_03_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_03_IPO.java) — Максимізація капіталу за умови, що можна виконати лише 1 проект (k=1).
- [Hard_03_04_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_04_IPO.java) — IPO з урахуванням простих залежностей (проект B вимагає виконання проекту A перед стартом).
- [Hard_03_05_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_05_IPO.java) — IPO, де виконання проекту фактично витрачає капітал (зменшує w на величину вартості проекту costs[i]).

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_03_IPO.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_03_IPO.java).
