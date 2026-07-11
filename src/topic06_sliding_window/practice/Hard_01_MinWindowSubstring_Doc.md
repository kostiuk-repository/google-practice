# Hard_01_MinWindowSubstring — Довідка

## Техніка: Розсувне вікно для пошуку мінімального покриття

**Суть:** Ми підтримуємо частоти символів рядка t у HashMap (або масиві частот). Рухаємо правий покажчик, додаючи символи у вікно. Коли вікно містить усі символи з t (кількість сформованих символів дорівнює кількості унікальних символів у t), ми намагаємося звузити вікно, зсуваючи лівий покажчик, поки умови задовольняються.

```java
// Пошук мінімального вікна покриття
public String minWindow(String s, String t) {
    if (s.length() < t.length()) return "";
    Map<Character, Integer> target = new HashMap<>();
    for (char c : t.toCharArray()) target.put(c, target.getOrDefault(c, 0) + 1);
    Map<Character, Integer> window = new HashMap<>();
    int left = 0, minLeft = -1, minLen = Integer.MAX_VALUE;
    int formed = 0, required = target.size();
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        window.put(c, window.getOrDefault(c, 0) + 1);
        if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
            formed++;
        }
        while (formed == required) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                minLeft = left;
            }
            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar) - 1);
            if (target.containsKey(leftChar) && window.get(leftChar) < target.get(leftChar)) {
                formed--;
            }
            left++;
        }
    }
    return minLeft == -1 ? "" : s.substring(minLeft, minLeft + minLen);
}
```

**Коли застосовувати:** Для пошуку найменшого підрядка, який містить усі символи іншого рядка в будь-кому порядку.

**Складність:** O(|S| + |T|) за часом, O(|S| + |T|) за пам'яттю.

## Вправи

- **Hard_01_01_MinWindowSubstring**: Drill 1/5 for Hard_01_MinWindowSubstring — Verify s contains all characters of t
- **Hard_01_02_MinWindowSubstring**: Drill 2/5 for Hard_01_MinWindowSubstring — Main Problem
- **Hard_01_03_MinWindowSubstring**: Drill 3/5 for Hard_01_MinWindowSubstring — Min window with t containing no duplicate characters
- **Hard_01_04_MinWindowSubstring**: Drill 4/5 for Hard_01_MinWindowSubstring — Length of min window
- **Hard_01_05_MinWindowSubstring**: Drill 5/5 for Hard_01_MinWindowSubstring — Min window containing t as a subsequence (order matters)

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_MinWindowSubstring.java.
