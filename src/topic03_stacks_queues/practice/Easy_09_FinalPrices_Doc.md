# Easy_09_FinalPrices — Довідка

## Техніка: Монотонний стек для пошуку наступного меншого (Next Smaller Element via Monotonic Stack)

**Суть:** Ми підтримуємо стек індексів елементів у зростаючому (монотонно неспадному) порядку. Коли ми зустрічаємо елемент, менший за вершину стеку, це означає, що ми знайшли наступний менший елемент для вершини. Ми дістаємо індекси зі стеку і застосовуємо знижку.

```java
Deque<Integer> stack = new ArrayDeque<>();
for (int i = 0; i < prices.length; i++) {
    while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
        int idx = stack.pop();
        prices[idx] -= prices[i];
    }
    stack.push(i);
}
```

**Коли застосовувати:** Коли для кожного елемента масиву потрібно швидко знайти перший менший (або більший) елемент праворуч/ліворуч.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Easy_09_01** — Next smaller element indices.
2. **Easy_09_02** — Double discount logic (two next smaller elements).
3. **Easy_09_03** — Next greater element discount.
4. **Easy_09_04** — Previous smaller element (discount from left).
5. **Easy_09_05** — Next smaller discount with sliding window distance limit.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_FinalPrices.java.
