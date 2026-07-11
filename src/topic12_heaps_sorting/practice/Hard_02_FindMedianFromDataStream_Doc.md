# Hard_02_FindMedianFromDataStream — Довідка

## Техніка: Дві купи (Min-Heap та Max-Heap) для балансування

**Суть:** Підтримка двох куп: Max-Heap для лівої (меншої) половини чисел та Min-Heap для правої (більшої) половини чисел. Різниця в розмірах куп не повинна перевищувати 1. Це дозволяє знаходити медіану за O(1) часу.

```java
PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<Integer> right = new PriorityQueue<>();
public void addNum(int num) {
    left.offer(num);
    right.offer(left.poll());
    if (left.size() < right.size()) left.offer(right.poll());
}
public double findMedian() {
    return left.size() > right.size() ? left.peek() : (left.peek() + right.peek()) / 2.0;
}
```

**Коли застосовувати:** Коли потрібно постійно обчислювати медіану в потоці чисел, що динамічно додаються.

**Складність:** Часова: O(log N) для додавання, O(1) для читання медіани. Просторова: O(N).

## Вправи (Drills)
- [Hard_02_01_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_01_FindMedianFromDataStream.java) — Обчислити медіану статичного відсортованого масиву.
- [Hard_02_02_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_02_FindMedianFromDataStream.java) — Вставка елемента в динамічний список із збереженням сортування.
- [Hard_02_03_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_03_FindMedianFromDataStream.java) — Пошук моди (найчастішого елемента) в потоці (вважати, що клас зберігає стан).
- [Hard_02_04_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_04_FindMedianFromDataStream.java) — Медіана у рухомому вікні розміру K.
- [Hard_02_05_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_05_FindMedianFromDataStream.java) — Знаходження 75-го перцентиля у потоці даних за допомогою балансу куп.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_02_FindMedianFromDataStream.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_02_FindMedianFromDataStream.java).
