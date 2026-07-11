# Easy_03_RelativeRanks — Довідка

## Техніка: Сортування за допомогою купи або індексів

**Суть:** Сортування елементів зі збереженням їхніх початкових індексів, щоб призначити текстові ранги відповідно до їхнього місця.

```java
PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
for (int i = 0; i < score.length; i++) {
    maxHeap.offer(new int[]{score[i], i});
}
String[] result = new String[score.length];
int rank = 1;
while (!maxHeap.isEmpty()) {
    int[] pair = maxHeap.poll();
    int index = pair[1];
    if (rank == 1) result[index] = "Gold Medal";
    else if (rank == 2) result[index] = "Silver Medal";
    else if (rank == 3) result[index] = "Bronze Medal";
    else result[index] = String.valueOf(rank);
    rank++;
}
```

**Коли застосовувати:** Коли потрібно упорядкувати елементи за значеннями, але результат записати в масив за оригінальними індексами.

**Складність:** Часова: O(N log N) для сортування/купи. Просторова: O(N) для збереження індексів.

## Вправи (Drills)
- [Easy_03_01_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_01_RelativeRanks.java) — Повернути відсортовані оригінальні індекси за спаданням значень.
- [Easy_03_02_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_02_RelativeRanks.java) — Призначити прості числові ранги від 1 до N (без медалей).
- [Easy_03_03_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_03_RelativeRanks.java) — Визначення відносних рангів для найменших значень (з кінця).
- [Easy_03_04_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_04_RelativeRanks.java) — Групове рангування: топ 20% отримують 'Elite', наступні 30% — 'Pro', інші — 'Amateur'.
- [Easy_03_05_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_05_RelativeRanks.java) — Рангування з урахуванням однакових балів (ties), які ділять одне місце.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_03_RelativeRanks.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_03_RelativeRanks.java).
