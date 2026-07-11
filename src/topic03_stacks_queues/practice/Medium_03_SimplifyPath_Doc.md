# Medium_03_SimplifyPath — Довідка

## Техніка: Стек для симуляції каталогу (Directory State Stack)

**Суть:** Ми розділяємо шлях символом '/' і обробляємо кожен токен: ім'я папки кладеться в стек, '..' виштовхує верхній елемент (якщо стек не порожній), а '.' або порожні токени ігноруються. В кінці об'єднуємо елементи стеку через '/'.

```java
Deque<String> stack = new ArrayDeque<>();
for (String dir : path.split("/")) {
    if (dir.equals("..")) {
        if (!stack.isEmpty()) stack.pop();
    } else if (!dir.equals(".") && !dir.isEmpty()) {
        stack.push(dir);
    }
}
// побудова результату зворотною ітерацією
```

**Коли застосовувати:** В задачах моделювання файлової системи, історії дій користувача (Undo/Redo) або вкладених контекстів.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Medium_03_01** — Count directory depth only.
2. **Medium_03_02** — Windows style path simplification with drive letters.
3. **Medium_03_03** — Resolve relative path relative to current working directory.
4. **Medium_03_04** — Simplify path with '*' acting as general Undo.
5. **Medium_03_05** — Longest common ancestor of two canonical paths.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Medium_03_SimplifyPath.java.
