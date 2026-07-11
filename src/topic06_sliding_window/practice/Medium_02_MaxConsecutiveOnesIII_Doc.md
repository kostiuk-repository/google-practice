# Medium_02_MaxConsecutiveOnesIII — Довідка

## Техніка: Динамічне розсувне вікно з лічильником нулів

**Суть:** Ми розширюємо вікно праворуч. Якщо зустрічаємо 0, збільшуємо лічильник нулів. Коли лічильник нулів перевищує k, ми зсуваємо ліву межу вікна праворуч, доки лічильник нулів не стане меншим або рівним k.

```java
// Вікно з підрахунком нулів
public int longestOnes(int[] nums, int k) {
    int left = 0;
    int zeroCount = 0;
    int maxLength = 0;
    for (int right = 0; right < nums.length; right++) {
        if (nums[right] == 0) {
            zeroCount++;
        }
        while (zeroCount > k) {
            if (nums[left] == 0) {
                zeroCount--;
            }
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}
```

**Коли застосовувати:** Для пошуку найдовшої послідовності одиниць із можливістю замінити до k нулів.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Medium_02_01_MaxConsecutiveOnesIII**: Drill 1/5 for Medium_02_MaxConsecutiveOnesIII — Flip at most 1 zero
- **Medium_02_02_MaxConsecutiveOnesIII**: Drill 2/5 for Medium_02_MaxConsecutiveOnesIII — Main Problem
- **Medium_02_03_MaxConsecutiveOnesIII**: Drill 3/5 for Medium_02_MaxConsecutiveOnesIII — Count number of subarrays with at most k zeros
- **Medium_02_04_MaxConsecutiveOnesIII**: Drill 4/5 for Medium_02_MaxConsecutiveOnesIII — Minimum flips to get a subarray of length k of all 1s
- **Medium_02_05_MaxConsecutiveOnesIII**: Drill 5/5 for Medium_02_MaxConsecutiveOnesIII — Max ones with at most k flips and total window length <= threshold

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_MaxConsecutiveOnesIII.java.
