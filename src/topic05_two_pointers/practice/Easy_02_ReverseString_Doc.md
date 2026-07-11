# Easy_02_ReverseString — Довідка

## Техніка: Обмін елементів на місці (In-place swap)

**Суть:** Обмін елементів під лівим і правим вказівниками з поступовим рухом вказівників до центру масиву.

### Концептуальний код
```java
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;
    left++;
    right--;
}
```

**Коли застосовувати:**
- Реверс масиву або його частин на місці (in-place) з O(1) додаткової пам'яті.

**Складність:**
- **Часова:** O(N) — N/2 обмінів.
- **Просторова:** O(1) — модифікація на місці.

## Вправи (Drills)
1. **01 — Reverse Subrange**: Reverse elements in a char array between left and right indices (inclusive) in-place.
2. **02 — Reverse Vowels Only**: Reverse only the vowels in a char array in-place, keeping other characters in their positions.
3. **03 — Reverse Words in Sentence**: Reverse the order of characters in each word within a sentence while preserving whitespace.
4. **04 — Reverse Adjacent Pairs**: Reverse adjacent pairs in a char array in-place (swap index 0 and 1, 2 and 3, etc.).
5. **05 — Rotate Array by K**: Rotate the char array to the right by k steps in-place using reverses.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_02_ReverseString.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_02_ReverseString.java).
