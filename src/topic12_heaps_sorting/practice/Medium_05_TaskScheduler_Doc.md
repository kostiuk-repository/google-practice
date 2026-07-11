# Medium_05_TaskScheduler — Довідка

## Техніка: Жадібний вибір частот та кулдауни

**Суть:** Для планування задач із обмеженням на кулдаун (охолодження) використовується жадібний підхід: на кожному кроці виконується задача з найбільшою залишком частоти, яка не знаходиться на кулдауні.

```java
// PriorityQueue for frequencies, cooling queue for tasks in cooldown
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
// process elements incrementing time and tracking cooldowns
```

**Коли застосовувати:** Коли потрібно розставити завдання з обмеженням на мінімальний інтервал між однаковими завданнями так, щоб мінімізувати загальний час виконання.

**Складність:** Часова: O(N). Просторова: O(1) додаткової пам'яті.

## Вправи (Drills)
- [Medium_05_01_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_01_TaskScheduler.java) — Підрахунок частот завдань (для символів A-Z).
- [Medium_05_02_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_02_TaskScheduler.java) — Планування завдань при кулдауні N=1.
- [Medium_05_03_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_03_TaskScheduler.java) — Отримати черговості виконання без кулдауну (N=0) у вигляді рядка.
- [Medium_05_04_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_04_TaskScheduler.java) — Обчислення лише кількості порожніх (idle) слотів, які будуть потрібні.
- [Medium_05_05_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_05_TaskScheduler.java) — Отримати повну послідовність виконання завдань (включаючи 'idle').

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_05_TaskScheduler.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_05_TaskScheduler.java).
