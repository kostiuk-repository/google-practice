# Medium_01_EvaluateRPN — Довідка

## Техніка: Стек для обчислення постфіксних виразів (RPN Evaluation Stack)

**Суть:** При читанні RPN-виразу зліва направо ми кладемо операнди в стек. Коли зустрічаємо оператор, ми дістаємо два останні операнди, застосовуємо оператор і кладемо результат назад у стек. В кінці у стеку залишиться єдиний результат.

```java
Deque<Integer> stack = new ArrayDeque<>();
for (String token : tokens) {
    if (isOperator(token)) {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(apply(token, a, b));
    } else {
        stack.push(Integer.parseInt(token));
    }
}
```

**Коли застосовувати:** Обчислення або валідація математичних виразів, записаних у постфіксній або префіксній формі.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Medium_01_01** — Infix to Postfix (RPN) conversion.
2. **Medium_01_02** — Evaluate Prefix (Polish) Notation.
3. **Medium_01_03** — RPN with ternary conditional operator.
4. **Medium_01_04** — RPN evaluation with variables lookup map.
5. **Medium_01_05** — Postfix expression syntax validation.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_EvaluateRPN.java.
