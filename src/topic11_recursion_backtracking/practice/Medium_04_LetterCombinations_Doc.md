# Medium_04_LetterCombinations — Довідка

## Техніка: Cartesian Product / Backtracking

**Суть:** Генерація декартового добутку множин символів. Рекурсивна функція будує комбінацію символ за символом, вибираючи для кожної цифри одну з відповідних літер і переходячи до наступної цифри.

```java
void backtrack(int index, String digits, StringBuilder path, List<String> result, String[] mapping) {
    if (index == digits.length()) {
        result.add(path.toString());
        return;
    }
    String letters = mapping[digits.charAt(index) - '0'];
    for (char c : letters.toCharArray()) {
        path.append(c);
        backtrack(index + 1, digits, path, result, mapping);
        path.deleteCharAt(path.length() - 1);
    }
}
```

**Коли застосовувати:** Перебір комбінацій символів відповідно до правил кодування (наприклад, T9, телефонні номери, генерація IP).

**Складність:** O(4^N * N) час, O(N) пам'ять.

## Drills

1. **Medium_04_01** — Letter Combinations of Custom Keypad: Згенеруйте комбінації літер для цифр, використовуючи надану користувацьку карту відображення mapping.
2. **Medium_04_02** — Letter Combinations with Space: Згенеруйте комбінації літер, де також дозволено вставляти пробіли між символами цифр.
3. **Medium_04_03** — Restore IP Addresses: Дано рядок s, що містить лише цифри. Знайдіть всі можливі валідні IP-адреси, які можна отримати вставкою трьох крапок.
4. **Medium_04_04** — Letter Combinations Omitting Even Digits: Згенеруйте комбінації літер для цифр, але повністю проігноруйте парні цифри (2, 4, 6, 8) у вхідному рядку.
5. **Medium_04_05** — Letter Combinations Matching Dictionary: Згенеруйте комбінації літер, але поверніть лише ті, що містяться в наданому списку-словнику dictionary.

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_LetterCombinations.java.
