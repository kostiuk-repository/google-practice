# Hard_02_SubarraysKDifferent — Довідка

## Техніка: Комбінація розсувних вікон (Exact(K) = AtMost(K) - AtMost(K-1))

**Суть:** Знайти кількість підмасивів з рівно K різними елементами безпосередньо через розсувне вікно складно, оскільки вікно не є монотонним. Проте, кількість підмасивів з щонайбільше K різними елементами є монотонною функцією. Тому ми розраховуємо atMost(K) - atMost(K-1).

```java
// exact(K) = atMost(K) - atMost(K-1)
public int subarraysWithKDistinct(int[] nums, int k) {
    return atMostK(nums, k) - atMostK(nums, k - 1);
}

private int atMostK(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    int left = 0, ans = 0;
    for (int right = 0; right < nums.length; right++) {
        if (count.getOrDefault(nums[right], 0) == 0) k--;
        count.put(nums[right], count.getOrDefault(nums[right], 0) + 1);
        while (k < 0) {
            count.put(nums[left], count.get(nums[left]) - 1);
            if (count.get(nums[left]) == 0) k++;
            left++;
        }
        ans += right - left + 1;
    }
    return ans;
}
```

**Коли застосовувати:** Коли потрібно порахувати кількість підмасивів з точною кількістю унікальних елементів.

**Складність:** O(N) за часом, O(K) за пам'яттю.

## Вправи

- **Hard_02_01_SubarraysKDifferent**: Drill 1/5 for Hard_02_SubarraysKDifferent — Count subarrays with at most k distinct integers
- **Hard_02_02_SubarraysKDifferent**: Drill 2/5 for Hard_02_SubarraysKDifferent — Main Problem (subarrays with exactly k distinct)
- **Hard_02_03_SubarraysKDifferent**: Drill 3/5 for Hard_02_SubarraysKDifferent — Subarrays with strictly less than k distinct elements
- **Hard_02_04_SubarraysKDifferent**: Drill 4/5 for Hard_02_SubarraysKDifferent — Subarrays with at least k distinct integers
- **Hard_02_05_SubarraysKDifferent**: Drill 5/5 for Hard_02_SubarraysKDifferent — Longest subarray with exactly k distinct integers

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_SubarraysKDifferent.java.
