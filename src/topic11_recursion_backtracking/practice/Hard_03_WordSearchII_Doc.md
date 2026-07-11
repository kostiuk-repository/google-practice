# Hard_03_WordSearchII — Довідка

## Техніка: Trie-based Backtracking

**Суть:** Одночасний пошук багатьох слів на сітці. Замість повторного запуску DFS для кожного слова окремо, слова додаються в префіксне дерево (Trie). Під час обходу сітки DFS рухається синхронно по дереву Trie, відсікаючи шляхи, які не утворюють префіксів жодного слова.

```java
void dfs(char[][] board, int r, int c, TrieNode node, List<String> result) {
    char temp = board[r][c];
    TrieNode child = node.children[temp - 'a'];
    if (child == null) return;
    if (child.word != null) {
        result.add(child.word);
        child.word = null; // Avoid duplicate output
    }
    board[r][c] = '#';
    // Recurse neighbors
    board[r][c] = temp;
}
```

**Коли застосовувати:** Пошук великої кількості слів або шаблонів у сітці/тексті, коли префікси можна групувати для оптимізації.

**Складність:** O(R * C * 4^L) час, O(W * L) пам'ять для Trie.

## Drills

1. **Hard_03_01** — Prefix Search in Grid: Рекурсивно перевірте, чи є в сітці шлях із сусідніх клітинок, який формує заданий префікс prefix.
2. **Hard_03_02** — Word Search II with Min Length: Знайдіть усі слова зі словника в сітці, але поверніть лише ті, довжина яких не менша за minLen.
3. **Hard_03_03** — Word Search II with Wildcards: Розв'яжіть задачу Word Search II, де слова можуть містити символ підстановки '?', що підходить до будь-якої літери.
4. **Hard_03_04** — Boggle Game Solver: Розв'яжіть гру Boggle, де слова можуть формуватися переходом до будь-якої з 8 сусідніх клітинок (включаючи діагоналі).
5. **Hard_03_05** — Word Search II with Direction Constraints: Розв'яжіть Word Search II, де шляхи слів можуть змінювати напрямок не більше ніж maxTurns разів.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_WordSearchII.java.
