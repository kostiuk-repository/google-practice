# Easy_10_ValidPalindromeII — Довідка

## Техніка: Зустрічні вказівники з розгалуженням

**Суть:** Скануємо рядок з обох кінців. При виявленні першої розбіжності s[left] != s[right] ми перевіряємо, чи є паліндромом підрядок [left+1, right] або підрядок [left, right-1].

### Концептуальний код
```java
int left = 0, right = s.length() - 1;
while (left < right) {
    if (s.charAt(left) != s.charAt(right)) {
        return isPal(s, left + 1, right) || isPal(s, left, right - 1);
    }
    left++; right--;
}
```

**Коли застосовувати:**
- Перевірка паліндромів з можливістю пропуску обмеженої кількості символів.

**Складність:**
- **Часова:** O(N) — перевіряється максимум два підрядки.
- **Просторова:** O(1) — рекурсія або ітерація в межах індексів.

## Вправи (Drills)
1. **01 — Valid Palindrome in Range**: Check if s is a palindrome strictly between indices left and right (inclusive).
2. **02 — Find First Mismatch Index**: Return the left mismatch index when checking if s is a palindrome. Return -1 if s is already a palindrome.
3. **03 — Valid Palindrome with K Deletions**: Check if a string can be a palindrome by deleting at most k characters.
4. **04 — Valid Palindrome II Ignoring Whitespace**: Check if s can be a palindrome after deleting at most one character, ignoring all spaces.
5. **05 — Get Palindrome After One Deletion**: Return the palindrome string formed by deleting at most one character. If not possible, return an empty string.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_10_ValidPalindromeII.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_10_ValidPalindromeII.java).
