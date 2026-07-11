# Hard_01_LargestRectangleInHistogram — Довідка

## Техніка: Монотонно зростаючий стек для пошуку меж (Monotonic Stack for Boundary Expansion)

**Суть:** Для кожного стовпчика ми хочемо знайти найбільший прямокутник, де цей стовпчик є найнижчим. Для цього нам потрібні перший менший стовпчик ліворуч та праворуч. Ми використовуємо монотонно зростаючий стек індексів. Коли ми бачимо менший стовпчик, ми виштовхуємо елементи зі стеку та обчислюємо площу.

```java
Deque<Integer> stack = new ArrayDeque<>();
int maxArea = 0;
for (int i = 0; i <= heights.length; i++) {
    int h = (i == heights.length) ? 0 : heights[i];
    while (!stack.isEmpty() && heights[stack.peek()] > h) {
        int height = heights[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        maxArea = Math.max(maxArea, height * width);
    }
    stack.push(i);
}
```

**Коли застосовувати:** Знаходження максимальної прямокутної області під гістограмою або в матриці.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Hard_01_01** — Boundary indices finding (previous/next smaller).
2. **Hard_01_02** — Maximal Rectangle in 2D binary matrix.
3. **Hard_01_03** — Largest square in histogram.
4. **Hard_01_04** — Largest rectangle with minimum height constraint.
5. **Hard_01_05** — Largest rectangle in circular histogram.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_LargestRectangleInHistogram.java.
