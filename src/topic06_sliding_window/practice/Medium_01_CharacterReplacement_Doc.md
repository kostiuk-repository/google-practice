# Medium_01_CharacterReplacement — Довідка

## Техніка: Динамічне розсувне вікно з максимальною частотою

**Суть:** Ми розширюємо правий край вікна, збільшуючи частоту поточного символу. Ми підтримуємо максимальну частоту будь-го символу в поточному вікні (maxFreq). Вікно залишається валідним, якщо його довжина мінус maxFreq не перевищує k. Якщо вікно стає невалідним, ми зсуваємо ліву межу праворуч на 1 крок.

```java
// Динамічне розсувне вікно з масивом частот
public int characterReplacement(String s, int k) {
    int[] count = new int[26];
    int maxCount = 0;
    int left = 0;
    int maxLength = 0;
    for (int right = 0; right < s.length(); right++) {
        maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
        if (right - left + 1 - maxCount > k) {
            count[s.charAt(left) - 'A']--;
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}
```

**Коли застосовувати:** Коли потрібно знайти найдовший підрядок, який можна перетворити на однаковий символ за допомогою не більше ніж k замін.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Medium_01_01_CharacterReplacement**: Drill 1/5 for Medium_01_CharacterReplacement — Longest repeating of a specific character c
- **Medium_01_02_CharacterReplacement**: Drill 2/5 for Medium_01_CharacterReplacement — Main Problem
- **Medium_01_03_CharacterReplacement**: Drill 3/5 for Medium_01_CharacterReplacement — Replacement considering only uppercase English letters
- **Medium_01_04_CharacterReplacement**: Drill 4/5 for Medium_01_CharacterReplacement — Min replacements to make any substring of length L repeat same character
- **Medium_01_05_CharacterReplacement**: Drill 5/5 for Medium_01_CharacterReplacement — Replacement where changing character i has costs[i]

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_CharacterReplacement.java.
