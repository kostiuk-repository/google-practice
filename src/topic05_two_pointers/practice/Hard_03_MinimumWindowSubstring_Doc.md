# Hard_03_MinimumWindowSubstring — Довідка

## Техніка: Ковзне вікно (Sliding Window / Two Pointers)

**Суть:** Правий вказівник розширює вікно доти, доки воно не міститиме всі шукані символи. Лівий вказівник зсувається вправо, намагаючись мінімізувати довжину вікна, зберігаючи при цьому всі потрібні символи.

### Концептуальний код
```java
int[] map = new int[128];
for (char c : t.toCharArray()) map[c]++;
int counter = t.length(), begin = 0, end = 0, d = Integer.MAX_VALUE, head = 0;
while (end < s.length()) {
    if (map[s.charAt(end++)]-- > 0) counter--;
    while (counter == 0) {
        if (end - begin < d) d = end - (head = begin);
        if (map[s.charAt(begin++)]++ == 0) counter++;
    }
}
return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
```

**Коли застосовувати:**
- Пошук найкоротшого/найдовшого підрядка, що задовольняє певні обмеження по символах.

**Складність:**
- **Часова:** O(N + M) — кожен символ рядка відвідується щонайбільше двічі.
- **Просторова:** O(1) — фіксований розмір алфавіту (наприклад, 128 або 256 символів).

## Вправи (Drills)
1. **01 — Contains All Characters**: Check if string s contains all characters of t (including duplicate counts).
2. **02 — Minimum Window with Distinct Target**: Find the minimum window substring of s containing all characters of t, assuming all characters in t are distinct.
3. **03 — Minimum Window with Ordered Target**: Find the minimum window substring of s containing all characters of t in the exact sequence they appear in t.
4. **04 — Minimum Window Length Only**: Find only the length of the minimum window substring. Return -1 if no such substring exists.
5. **05 — Minimum Window with K Exceptions**: Find the minimum window substring of s containing all but at most k characters of t.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_03_MinimumWindowSubstring.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Hard_03_MinimumWindowSubstring.java).
