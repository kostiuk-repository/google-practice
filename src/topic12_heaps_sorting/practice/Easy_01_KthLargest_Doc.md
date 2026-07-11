# Easy_01_KthLargest — Довідка

## Техніка: Min-Heap для пошуку K-го найбільшого елемента

**Суть:** Використання мін-купи (Min-Heap) обмеженого розміру K для збереження K найбільших елементів, що надходять у потоці. Нові елементи додаються до купи, і якщо розмір купи перевищує K, найменший елемент видаляється (poll). Вершина купи завжди містить K-й найбільший елемент.

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) {
        minHeap.poll();
    }
}
int kthLargest = minHeap.peek();
```

**Коли застосовувати:** Коли потрібно знайти K-й найбільший або найменший елемент у динамічному потоці даних або великому масиві за O(N log K) часу та O(K) додаткової пам'яті.

**Складність:** Часова: O(N log K), де N — кількість елементів. Просторова: O(K) для збереження купи.

## Вправи (Drills)
- [Easy_01_01_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_01_KthLargest.java) — Знайти K-й найбільший елемент у статичному масиві за допомогою Min-Heap.
- [Easy_01_02_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_02_KthLargest.java) — Знайти K-й найменший елемент у статичному масиві за допомогою Max-Heap.
- [Easy_01_03_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_03_KthLargest.java) — Пошук 3-го найбільшого елемента в потоці (фіксований розмір купи K = 3).
- [Easy_01_04_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_04_KthLargest.java) — Обчислити середнє значення топ-K елементів у потоці.
- [Easy_01_05_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_05_KthLargest.java) — Перевірити, чи нове число входить до топ-K найбільших елементів.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_01_KthLargest.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_01_KthLargest.java).
