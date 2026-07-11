# Easy_08_MinAmountTimeFillCups — Довідка

## Техніка: Жадібний вибір двох найбільших значень

**Суть:** Для мінімізації часу наповнення чашок завжди вибираються дві групи з найбільшою кількістю чашок, щоб наповнювати їх одночасно.

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int a : amount) if (a > 0) maxHeap.offer(a);
int seconds = 0;
while (maxHeap.size() > 1) {
    int first = maxHeap.poll() - 1;
    int second = maxHeap.poll() - 1;
    if (first > 0) maxHeap.offer(first);
    if (second > 0) maxHeap.offer(second);
    seconds++;
}
if (!maxHeap.isEmpty()) seconds += maxHeap.poll();
```

**Коли застосовувати:** Коли потрібно поєднувати та зменшувати два найбільші елементи за крок для мінімізації загальних кроків.

**Складність:** Часова: O(S), де S — загальна сума чашок. Просторова: O(1) додаткової пам'яті.

## Вправи (Drills)
- [Easy_08_01_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_01_MinAmountTimeFillCups.java) — Наповнення чашок по одній (без паралельності).
- [Easy_08_02_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_02_MinAmountTimeFillCups.java) — Зменшити два найбільші елементи масиву одночасно на 1, якщо це можливо.
- [Easy_08_03_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_03_MinAmountTimeFillCups.java) — Наповнення до 3 чашок різних типів одночасно.
- [Easy_08_04_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_04_MinAmountTimeFillCups.java) — Наповнення чашок з кулдауном (не можна наповнювати один тип чашок дві секунди поспіль).
- [Easy_08_05_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_05_MinAmountTimeFillCups.java) — Наповнення чашок для N різних типів (масив довільної довжини).

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_08_MinAmountTimeFillCups.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_08_MinAmountTimeFillCups.java).
