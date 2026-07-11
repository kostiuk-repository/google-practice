# Medium_04_MinSizeSubarraySum — Довідка

## Техніка: Динамічне розсувне вікно (двопокажчиковий пошук мінімальної довжини)

**Суть:** Ми розширюємо вікно праворуч, додаючи елементи до суми. Як тільки сума стає більшою або рівною target, ми намагаємося зменшити вікно зліва (зсуваємо left), оновлюючи мінімальну довжину на кожному кроці, поки сума залишається >= target.

```java
// Динамічний пошук мінімальної довжини вікна
public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;
    for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum >= target) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
```

**Коли застосовувати:** Для пошуку найменшого підмасиву з позитивними числами, сума якого задовольняє умову >= target.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Medium_04_01_MinSizeSubarraySum**: Drill 1/5 for Medium_04_MinSizeSubarraySum — Is there a subarray with sum exactly equal to target? (nums contains non-negative integers)
- **Medium_04_02_MinSizeSubarraySum**: Drill 2/5 for Medium_04_MinSizeSubarraySum — Minimum size subarray sum >= target
- **Medium_04_03_MinSizeSubarraySum**: Drill 3/5 for Medium_04_MinSizeSubarraySum — Maximum size subarray sum <= target
- **Medium_04_04_MinSizeSubarraySum**: Drill 4/5 for Medium_04_MinSizeSubarraySum — Min size subarray sum >= target with negatives allowed
- **Medium_04_05_MinSizeSubarraySum**: Drill 5/5 for Medium_04_MinSizeSubarraySum — Min size subarray sum >= target, elements must not exceed maxVal

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_MinSizeSubarraySum.java.
