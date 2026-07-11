# Medium_05_LongestSubstringKDistinct — Довідка

## Техніка: Динамічне розсувне вікно з HashMap

**Суть:** Ми розширюємо вікно праворуч і записуємо символи до HashMap із їхньою кількістю входжень. Якщо розмір HashMap стає більшим за K, ми зсуваємо ліву межу вікна праворуч і зменшуємо лічильники символів. Коли лічильник певного символу стає рівним 0, ми видаляємо його з карти.

```java
// Збереження унікальних символів у HashMap
public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) return 0;
    Map<Character, Integer> map = new HashMap<>();
    int left = 0;
    int maxLen = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        map.put(c, map.getOrDefault(c, 0) + 1);
        while (map.size() > k) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) == 0) {
                map.remove(leftChar);
            }
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```

**Коли застосовувати:** Коли потрібно знайти найдовший підрядок з обмеженням на кількість унікальних символів.

**Складність:** O(N) за часом, O(K) за пам'яттю (для HashMap).

## Вправи

- **Medium_05_01_LongestSubstringKDistinct**: Drill 1/5 for Medium_05_LongestSubstringKDistinct — Longest substring with at most 2 distinct characters
- **Medium_05_02_LongestSubstringKDistinct**: Drill 2/5 for Medium_05_LongestSubstringKDistinct — Main Problem
- **Medium_05_03_LongestSubstringKDistinct**: Drill 3/5 for Medium_05_LongestSubstringKDistinct — Longest substring with exactly k distinct characters
- **Medium_05_04_LongestSubstringKDistinct**: Drill 4/5 for Medium_05_LongestSubstringKDistinct — Count all substrings with at most k distinct characters
- **Medium_05_05_LongestSubstringKDistinct**: Drill 5/5 for Medium_05_LongestSubstringKDistinct — Longest substring with at most k distinct, and each distinct character must appear at least minFreq times

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_05_LongestSubstringKDistinct.java.
