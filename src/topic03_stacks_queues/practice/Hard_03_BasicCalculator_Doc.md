# Hard_03_BasicCalculator — Довідка

## Техніка: Стек станів для вкладених дужок (Context Stack for Nested Parentheses)

**Суть:** Ми обчислюємо вираз зліва направо за допомогою накопичуваного результату та поточного знаку. При зустрічі '(' ми зберігаємо поточний результат і знак у стек і скидаємо їх. При зустрічі ')' ми дістаємо попередній знак і результат зі стеку та об'єднуємо їх з обчисленим значенням дужок.

```java
int res = 0, sign = 1;
Deque<Integer> stack = new ArrayDeque<>();
// при '('
stack.push(res);
stack.push(sign);
res = 0; sign = 1;
// при ')'
res = res * stack.pop() + stack.pop();
```

**Коли застосовувати:** Парсинг та обчислення виразів з вкладеними структурами (дужки, блоки коду, вкладені функції).

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Hard_03_01** — Simple calculator (no parentheses).
2. **Hard_03_02** — Calculator II (mul/div support).
3. **Hard_03_03** — Calculator III (all standard operations and parentheses).
4. **Hard_03_04** — Calculator with unary operators.
5. **Hard_03_05** — Calculator with custom precedence.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_BasicCalculator.java.
