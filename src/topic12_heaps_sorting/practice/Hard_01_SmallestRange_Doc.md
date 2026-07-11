# Hard_01_SmallestRange — Довідка

## Техніка: K-Way Merge за допомогою Min-Heap

**Суть:** Використання мін-купи для одночасного проходу по K відсортованих списках. На кожному кроці ми підтримуємо поточне вікно значень, що містить по одному елементу з кожного списку, та оновлюємо мінімальний знайдений інтервал.

```java
PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
int max = Integer.MIN_VALUE;
for (int i = 0; i < nums.size(); i++) {
    minHeap.offer(new Element(nums.get(i).get(0), i, 0));
    max = Math.max(max, nums.get(i).get(0));
}
```

**Коли застосовувати:** Коли потрібно знайти мінімальний діапазон, який містить хоча б одне число з кожного з кількох відсортованих списків.

**Складність:** Часова: O(N log K), де N — кількість елементів, K — кількість списків. Просторова: O(K) для купи.

## Вправи (Drills)
- [Hard_01_01_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_01_SmallestRange.java) — Знайти мінімальний та максимальний елемент серед перших елементів K списків.
- [Hard_01_02_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_02_SmallestRange.java) — Пошук найменшого діапазону для двох відсортованих списків.
- [Hard_01_03_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_03_SmallestRange.java) — Знаходження абсолютного мінімального значення серед усіх списків.
- [Hard_01_04_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_04_SmallestRange.java) — Пошук найменшого діапазону з можливістю пропустити один список.
- [Hard_01_05_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_05_SmallestRange.java) — Пошук найменшого діапазону, що охоплює принаймні M списків з K.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_01_SmallestRange.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Hard_01_SmallestRange.java).
