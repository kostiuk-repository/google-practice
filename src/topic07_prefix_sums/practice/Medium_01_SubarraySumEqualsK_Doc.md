# Medium_01_SubarraySumEqualsK — Довідка

## Техніка: Префіксні суми та хеш-мапа (Prefix Sums + Hash Map / Two Sum style)

**Суть:** Підрахунок кількості підмасивів із сумою `k`. Ми підтримуємо поточну префіксну суму `sum` та зберігаємо частоти всіх попередніх префіксних сум у HashMap. Для поточного значення `sum` кількість підмасивів, що закінчуються тут і мають суму `k`, дорівнює частоті префіксної суми `sum - k` у нашій мапі.

```java
public int subarraySum(int[] nums, int k) {
    int count = 0, sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : nums) {
        sum += num;
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
}
```

**Коли застосовувати:**
- Коли потрібно знайти загальну кількість підмасивів з певною сумою, особливо при наявності від'ємних чисел у масиві.

**Складність:**
- Часова складність: O(N) — лінійний прохід.
- Просторова складність: O(N) — для збереження частот префіксних сум.

## Вправи (Drills)
1. **01 — Count Prefix Sums Equals K**: Рахує префіксні суми рівні `k`.
2. **02 — Find First Subarray Sum K**: Знаходить межі першого підмасиву з сумою `k`.
3. **03 — Subarray Sum**: Загальний алгоритм підрахунку підмасивів із сумою `k`.
4. **04 — Subarray Sum Positive**: Оптимізована версія для позитивних чисел.
5. **05 — Subarray Sum With One Update**: Кількість підмасивів із сумою `k` після одного оновлення в масиві.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_SubarraySumEqualsK.java.
