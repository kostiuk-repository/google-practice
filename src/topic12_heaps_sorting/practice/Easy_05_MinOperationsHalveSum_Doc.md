# Easy_05_MinOperationsHalveSum — Довідка

## Техніка: Жадібний вибір максимального елемента через Max-Heap

**Суть:** Для досягнення мінімальної кількості операцій зменшення суми вдвічі, на кожному кроці потрібно вибирати найбільший елемент у масиві, ділити його навпіл і повертати назад у купу.

```java
PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
double sum = 0;
for (int num : nums) {
    maxHeap.offer((double) num);
    sum += num;
}
double target = sum / 2;
int ops = 0;
while (sum > target) {
    double largest = maxHeap.poll();
    double halved = largest / 2.0;
    sum -= halved;
    maxHeap.offer(halved);
    ops++;
}
```

**Коли застосовувати:** Коли потрібно мінімізувати кількість операцій ділення для зменшення суми масиву до певного порогу.

**Складність:** Часова: O(K log N), де K — кількість операцій ділення. Просторова: O(N) для купи.

## Вправи (Drills)
- [Easy_05_01_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_01_MinOperationsHalveSum.java) — Обчислити суму масиву як типу double.
- [Easy_05_02_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_02_MinOperationsHalveSum.java) — Зменшити найбільший елемент вдвічі рівно один раз та повернути нову суму.
- [Easy_05_03_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_03_MinOperationsHalveSum.java) — Зменшити загальну суму масиву на 25% замість 50% за мінімальну кількість операцій.
- [Easy_05_04_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_04_MinOperationsHalveSum.java) — Зменшити суму вдвічі, ділячи навпіл лише парні цілі числа.
- [Easy_05_05_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_05_MinOperationsHalveSum.java) — Зменшити суму вдвічі з обмеженням на те, що кожен оригінальний елемент можна ділити не більше 2 разів.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_05_MinOperationsHalveSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_05_MinOperationsHalveSum.java).
