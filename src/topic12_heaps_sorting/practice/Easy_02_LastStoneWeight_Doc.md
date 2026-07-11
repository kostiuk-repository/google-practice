# Easy_02_LastStoneWeight — Довідка

## Техніка: Симуляція гри через Max-Heap

**Суть:** Використання Max-Heap для вибору двох найважчих об'єктів на кожному кроці та їх взаємодії (зіткнення). Процес повторюється, доки в купі не залишиться один елемент або купа не стане порожньою.

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int stone : stones) maxHeap.offer(stone);
while (maxHeap.size() > 1) {
    int y = maxHeap.poll();
    int x = maxHeap.poll();
    if (y != x) maxHeap.offer(y - x);
}
return maxHeap.isEmpty() ? 0 : maxHeap.peek();
```

**Коли застосовувати:** Коли потрібно багаторазово вибирати та видаляти два максимальні елементи і додавати результат їхньої різниці назад у структуру даних.

**Складність:** Часова: O(N log N), де N — кількість каменів. Просторова: O(N) для збереження всіх каменів у купі.

## Вправи (Drills)
- [Easy_02_01_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_01_LastStoneWeight.java) — Отримати два найважчих камені з купи.
- [Easy_02_02_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_02_LastStoneWeight.java) — Симуляція, де камені розбиваються лише якщо вони однакової ваги.
- [Easy_02_03_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_03_LastStoneWeight.java) — Підрахунок каменів, що залишилися після операцій, якщо камені втрачають вагу, але не зникають, поки не досягнуть 0.
- [Easy_02_04_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_04_LastStoneWeight.java) — Симуляція зіткнення, де залишок становить y - x + 1.
- [Easy_02_05_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_05_LastStoneWeight.java) — Жадібна симуляція зіткнення з вибором каменів за іншою евристикою.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_02_LastStoneWeight.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_02_LastStoneWeight.java).
