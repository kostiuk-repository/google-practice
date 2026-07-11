# Easy_09_TakeGiftsFromRichest — Довідка

## Техніка: Симуляція з Max-Heap

**Суть:** Використання Max-Heap для вибору купи з найбільшою кількістю подарунків на кожному кроці, заміни її значення на округлений вниз квадратний корінь та повернення назад у купу.

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int gift : gifts) maxHeap.offer(gift);
for (int i = 0; i < k; i++) {
    int maxGift = maxHeap.poll();
    maxHeap.offer((int) Math.sqrt(maxGift));
}
long total = 0;
while (!maxHeap.isEmpty()) total += maxHeap.poll();
```

**Коли застосовувати:** Коли потрібно багаторазово оновлювати найбільший елемент за допомогою нелінійної функції.

**Складність:** Часова: O(N + K log N). Просторова: O(N).

## Вправи (Drills)
- [Easy_09_01_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_01_TakeGiftsFromRichest.java) — Знайти найбільшу купу подарунків у масиві.
- [Easy_09_02_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_02_TakeGiftsFromRichest.java) — Замінити найбільшу купу на її квадратний корінь in-place.
- [Easy_09_03_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_03_TakeGiftsFromRichest.java) — Симуляція з діленням купи навпіл (цілочисельне ділення) замість квадратного кореня.
- [Easy_09_04_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_04_TakeGiftsFromRichest.java) — Підрахунок кількості куп, які стали меншими або рівними 1 після K операцій.
- [Easy_09_05_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_05_TakeGiftsFromRichest.java) — Симуляція з обмеженням на мінімальний поріг t для проведення операції.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_09_TakeGiftsFromRichest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_09_TakeGiftsFromRichest.java).
