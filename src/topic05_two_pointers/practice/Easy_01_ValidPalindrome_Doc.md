# Easy_01_ValidPalindrome — Довідка

## Техніка: Два вказівники (зустрічний рух)

**Суть:** Використання двох вказівників (лівий на початку рядка, правий в кінці), які рухаються назустріч один одному для перевірки симетрії.

### Концептуальний код
```java
int left = 0, right = s.length() - 1;
while (left < right) {
    if (s.charAt(left) != s.charAt(right)) return false;
    left++;
    right--;
}
```

**Коли застосовувати:**
- Перевірка паліндромів.
- Порівняння елементів з обох кінців рядка чи масиву.

**Складність:**
- **Часова:** O(N) — один прохід по рядку.
- **Просторова:** O(1) — константна додаткова пам'ять.

## Вправи (Drills)
1. **01 — Plain Palindrome**: Check if a lowercase-only alphanumeric string is a palindrome. No spaces or punctuation.
2. **02 — Case-Insensitive Palindrome**: Check if a string is a palindrome ignoring case, but assuming no non-alphanumeric characters.
3. **03 — Palindrome Ignoring Whitespace**: Check if a string is a palindrome ignoring whitespace characters (but maintaining case sensitivity).
4. **04 — Subpalindrome Validation**: Check if a substring of s from index left to right (inclusive) is a palindrome.
5. **05 — Palindrome with Custom Skip Character**: Check if a string is a palindrome, ignoring all occurrences of a specific character.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_01_ValidPalindrome.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_01_ValidPalindrome.java).
