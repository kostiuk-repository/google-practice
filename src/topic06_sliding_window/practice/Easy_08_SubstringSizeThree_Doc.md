# Easy_08_SubstringSizeThree — Довідка

## Техніка: Розсувне вікно фіксованого розміру (ширина 3)

**Суть:** Для перевірки підрядків фіксованого розміру (у даному випадку 3) ми можемо безпосередньо порівняти 3 символи у поточному вікні. Оскільки розмір дуже малий, перевірка унікальності займає O(1). Ми переміщуємо вікно на один символ вправо на кожному кроці.

```java
// Перевірка трійок у циклі
public int countGoodSubstrings(String s) {
    int count = 0;
    for (int i = 0; i < s.length() - 2; i++) {
        char a = s.charAt(i);
        char b = s.charAt(i + 1);
        char c = s.charAt(i + 2);
        if (a != b && b != c && a != c) {
            count++;
        }
    }
    return count;
}
```

**Коли застосовувати:** Коли розмір шуканого підрядка є невеликим і фіксованим (наприклад, 3).

**Складність:** O(N) за часом, O(1) додаткової пам'яті.

## Вправи

- **Easy_08_01_SubstringSizeThree**: Drill 1/5 for Easy_08_SubstringSizeThree — Verify size 3 string has distinct characters
- **Easy_08_02_SubstringSizeThree**: Drill 2/5 for Easy_08_SubstringSizeThree — Main Problem
- **Easy_08_03_SubstringSizeThree**: Drill 3/5 for Easy_08_SubstringSizeThree — Generalize to size k
- **Easy_08_04_SubstringSizeThree**: Drill 4/5 for Easy_08_SubstringSizeThree — Fixed size window with at most maxDistinct distinct characters
- **Easy_08_05_SubstringSizeThree**: Drill 5/5 for Easy_08_SubstringSizeThree — Longest unique substring of any size

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_08_SubstringSizeThree.java.
