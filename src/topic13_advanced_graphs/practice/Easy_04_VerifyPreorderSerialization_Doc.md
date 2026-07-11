# Easy_04_VerifyPreorderSerialization — Довідка

## Техніка: Валідація серіалізації дерева через підрахунок ступенів (Degree Counting)

**Суть:** Кожна непуста вершина в бінарному дереві додає 2 вхідних ступені для наступних вузлів (outgoing capacity) і споживає 1 (incoming degree). Пуста вершина '#' тільки споживає 1 ступінь і не додає нових. Починаємо з 1 вільного слоту (для кореня). Якщо в будь-який момент кількість доступних слотів стає меншою за 0, серіалізація невірна. В кінці повинно залишитися рівно 0 слотів.

### Концептуальний приклад
```java
int slots = 1;
for (String node : preorder.split(",")) {
    slots--; // споживаємо 1 слот
    if (slots < 0) return false;
    if (!node.equals("#")) {
        slots += 2; // додаємо 2 нових слоти
    }
}
return slots == 0;
```

**Коли застосовувати:** Для перевірки правильності представлення бінарного дерева в префіксному порядку без реального його відновлення в пам'яті.

**Складність:** Часова: O(N) (де N — кількість вузлів у рядку), Просторова: O(N) або O(1) якщо парсити рядок посимвольно.

## Тренувальні задачі (Drills)

1. [Easy_04_VerifyPreorderSerialization_01_VerifyPreorderSerialization](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization_01_VerifyPreorderSerialization.java) — Підрахунок елементів: Підраховує кількість листків (порожніх вузлів '#') та внутрішніх вузлів у рядку серіалізації.
2. [Easy_04_VerifyPreorderSerialization_02_VerifyPreorderSerialization](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization_02_VerifyPreorderSerialization.java) — Валідація масиву токенів: Перевіряє валідність серіалізації, коли вхідний рядок уже розділений на масив токенів.
3. [Easy_04_VerifyPreorderSerialization_03_VerifyPreorderSerialization](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization_03_VerifyPreorderSerialization.java) — Визначення глибини: Знаходить максимальну глибину дерева на основі серіалізації preorder (якщо вона валідна; якщо ні — повертає -1).
4. [Easy_04_VerifyPreorderSerialization_04_VerifyPreorderSerialization](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization_04_VerifyPreorderSerialization.java) — Реконструкція структури: Замінює всі числові значення у валідній серіалізації на символ 'X' (наприклад, '9,3,#,#' -> 'X,X,#,#'). Якщо серіалізація невалідна, повертає порожній рядок.
5. [Easy_04_VerifyPreorderSerialization_05_VerifyPreorderSerialization](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization_05_VerifyPreorderSerialization.java) — Валідація Postorder: Перевіряє, чи є заданий рядок валідною серіалізації бінарного дерева в постфіксному порядку (Postorder).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_04_VerifyPreorderSerialization.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_04_VerifyPreorderSerialization.java).
