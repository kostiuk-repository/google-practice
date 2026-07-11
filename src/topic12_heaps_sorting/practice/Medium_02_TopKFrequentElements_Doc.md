# Medium_02_TopKFrequentElements — Довідка

## Техніка: HashMap + Min-Heap або Bucket Sort

**Суть:** Підрахунок частот елементів за допомогою HashMap, після чого вибір топ-K елементів за допомогою Min-Heap розміру K або Bucket Sort за лінійний час.

```java
Map<Integer, Integer> count = new HashMap<>();
for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);
PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
for (int n : count.keySet()) {
    heap.add(n);
    if (heap.size() > k) heap.poll();
}
```

**Коли застосовувати:** Коли потрібно знайти найбільш часто зустрічувані елементи у наборі даних.

**Складність:** Часова: O(N log K) з купою, або O(N) з Bucket Sort. Просторова: O(N).

## Вправи (Drills)
- [Medium_02_01_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_01_TopKFrequentElements.java) — Побудова карти частот елементів масиву.
- [Medium_02_02_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_02_TopKFrequentElements.java) — Сортування усього масиву за спаданням частоти елементів.
- [Medium_02_03_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_03_TopKFrequentElements.java) — Топ-K найчастіших слів з алфавітним сортуванням при однаковій частоті.
- [Medium_02_04_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_04_TopKFrequentElements.java) — Пошук топ-K елементів через Bucket Sort за O(N).
- [Medium_02_05_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_05_TopKFrequentElements.java) — Топ-K найчастіших елементів у динамічному потоці з оновленням частот.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_02_TopKFrequentElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_02_TopKFrequentElements.java).
