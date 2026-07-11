# Hard_02_SubarraysKDifferentSums — Довідка

## Техніка: Ковзне вікно з префіксним аналізом (Sliding Window / Two-Pointers for Subarray Counting)

**Суть:** Задача підрахунку підмасивів із рівно `k` різними сумами підмасивів або унікальними характеристиками префіксів. Загальний підхід для підрахунку 'рівно K' полягає у виразі: `exactly(K) = atMost(K) - atMost(K - 1)`. Функція `atMost(K)` реалізується за допомогою ковзного вікна або префіксної мапи.

```java
public int atMostK(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int left = 0, count = 0;
    for (int right = 0; right < nums.length; right++) {
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        while (map.size() > k) {
            map.put(nums[left], map.get(nums[left]) - 1);
            if (map.get(nums[left]) == 0) map.remove(nums[left]);
            left++;
        }
        count += right - left + 1;
    }
    return count;
}
```

**Коли застосовувати:**
- Коли потрібно знайти кількість підмасивів, які мають складну обмежену кількість характеристик.

**Складність:**
- Часова складність: O(N) — лінійний час завдяки ковзному вікну.
- Просторова складність: O(N) — для відстеження унікальних елементів чи сум.

## Вправи (Drills)
1. **01 — At Most K Distinct**: Підрахунок підмасивів з максимум K унікальними префіксами.
2. **02 — Exactly K Distinct**: Підрахунок підмасивів з рівно K унікальними префіксами.
3. **03 — Count Subarrays K Targets**: Підрахунок підмасивів, суми яких входять до списку K цілей.
4. **04 — Subarrays K Different Sums**: Повна реалізація підрахунку підмасивів.
5. **05 — Subarrays Unique Mod K**: Підрахунок підмасивів із унікальними остачами modulo K.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_SubarraysKDifferentSums.java.
