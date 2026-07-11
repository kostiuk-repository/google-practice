# Medium_02_DailyTemperatures — Довідка

## Техніка: Монотонно спадний стек для пошуку відстані до наступного більшого (Monotonic Decreasing Stack)

**Суть:** Стек зберігає індекси днів з монотонно спадними температурами. Коли поточна температура більша за температуру на вершині стеку, ми виштовхуємо індекс і записуємо різницю індексів як час очікування.

```java
int[] result = new int[temperatures.length];
Deque<Integer> stack = new ArrayDeque<>();
for (int i = 0; i < temperatures.length; i++) {
    while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        int prevIdx = stack.pop();
        result[prevIdx] = i - prevIdx;
    }
    stack.push(i);
}
```

**Коли застосовувати:** Пошук індексної відстані до наступного більшого/меншого елемента в масиві.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Medium_02_01** — Days to colder temperature.
2. **Medium_02_02** — Warmest temperature in future.
3. **Medium_02_03** — Circular daily temperatures.
4. **Medium_02_04** — Days to wait with minimum delta temperature d.
5. **Medium_02_05** — Daily temperatures with a maximum wait time.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_DailyTemperatures.java.
