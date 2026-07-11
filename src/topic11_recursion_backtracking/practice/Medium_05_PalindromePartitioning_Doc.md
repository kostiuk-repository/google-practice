# Medium_05_PalindromePartitioning — Довідка

## Техніка: Backtracking / String Partitioning

**Суть:** Розбиття рядка на підрядки, кожен з яких задовольняє певну умову (наприклад, є паліндромом). Алгоритм перебирає всі можливі довжини першого підрядка, перевіряє його валідність, і якщо він підходить, рекурсивно розбиває залишок рядка.

```java
void partition(int start, String s, List<String> path, List<List<String>> result) {
    if (start == s.length()) {
        result.add(new ArrayList<>(path));
        return;
    }
    for (int end = start + 1; end <= s.length(); end++) {
        String sub = s.substring(start, end);
        if (isPalindrome(sub)) {
            path.add(sub);
            partition(end, s, path, result);
            path.remove(path.size() - 1);
        }
    }
}
```

**Коли застосовувати:** Розбиття рядків чи послідовностей на змістовні частини із перевіркою властивостей частин.

**Складність:** O(N * 2^N) час, O(N) пам'ять.

## Drills

1. **Medium_05_01** — Palindrome Partitioning Count: Порахуйте кількість способів розділити заданий рядок на підрядки-паліндроми.
2. **Medium_05_02** — Partition String into Unique Substrings: Знайдіть усі способи розділити рядок на унікальні підрядки (без однакових підрядків у межах одного розбиття).
3. **Medium_05_03** — Palindrome Partitioning II (Min Cuts): Поверніть мінімальну кількість розрізів, необхідних для розбиття рядка s на підрядки-паліндроми.
4. **Medium_05_04** — Partition String into K Palindromes: Перевірте, чи можна розбити рядок на рівно k підрядків-паліндромів.
5. **Medium_05_05** — Palindrome Partitioning with Min Length: Знайдіть усі розбиття на паліндроми, де кожен підрядок має довжину щонайменше minLen.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_05_PalindromePartitioning.java.
