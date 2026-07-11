# Easy_06_LongestNiceSubstring — Довідка

## Техніка: Розділяй і володарюй (Divide and Conquer) або Розсувне вікно з фіксованою кількістю унікальних символів

**Суть:** Рядок є 'гарним' (nice), якщо для кожного символу в ньому присутні як його мала, так і велика літери. Якщо ми знаходимо символ, для якого немає відповідної пари іншого регістру, то цей символ не може бути частиною будь-якого гарного підрядка. Відповідно, ми можемо розділити рядок по цьому символу та рекурсивно шукати гарний підрядок у лівій та правій частинах.

```java
// Рекурсивне розділення по символу без пари
public String longestNiceSubstring(String s) {
    if (s.length() < 2) return "";
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) set.add(c);
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
            continue;
        }
        String left = longestNiceSubstring(s.substring(0, i));
        String right = longestNiceSubstring(s.substring(i + 1));
        return left.length() >= right.length() ? left : right;
    }
    return s;
}
```

**Коли застосовувати:** Коли валідність вікна/рядка залежить від глобальної умови (наявності пар обох регістрів), і розділення по невалідних символах природно зменшує простір пошуку.

**Складність:** O(N^2) у найгіршому випадку для рекурсії, або O(26 * N) = O(N) при використанні методу розсувного вікна з фіксованою кількістю унікальних символів (від 1 до 26).

## Вправи

- **Easy_06_01_LongestNiceSubstring**: Drill 1/5 for Easy_06_LongestNiceSubstring — Check if string is nice
- **Easy_06_02_LongestNiceSubstring**: Drill 2/5 for Easy_06_LongestNiceSubstring — Length of longest nice substring
- **Easy_06_03_LongestNiceSubstring**: Drill 3/5 for Easy_06_LongestNiceSubstring — First nice substring of fixed length k
- **Easy_06_04_LongestNiceSubstring**: Drill 4/5 for Easy_06_LongestNiceSubstring — Longest nice substring with at most maxUnique distinct character types
- **Easy_06_05_LongestNiceSubstring**: Drill 5/5 for Easy_06_LongestNiceSubstring — Main Capstone

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_06_LongestNiceSubstring.java.
