# Easy_07_MinValuePositiveStep — Довідка

## Техніка: Покрокові накопичувальні суми (Step-by-Step Cumulative Sums)

**Суть:** Знаходження мінімального стартового значення `startValue` такого, щоб кожна проміжна сума `startValue + sum(nums[0...i])` була більше або дорівнювала 1. Для цього обчислюють мінімальну префіксну суму `minPrefixSum`. Тоді `startValue = 1 - minPrefixSum` (або `1`, якщо `minPrefixSum` позитивна).

```java
public int minStartValue(int[] nums) {
    int minPrefix = 0;
    int current = 0;
    for (int num : nums) {
        current += num;
        minPrefix = Math.min(minPrefix, current);
    }
    return 1 - minPrefix;
}
```

**Коли застосовувати:**
- Коли система зазнає покрокових змін і має мінімальний поріг безпеки, який не можна перетинати.

**Складність:**
- Часова складність: O(N) — один прохід.
- Просторова складність: O(1) — O(1) додаткової пам'яті.

## Вправи (Drills)
1. **01 — Step Sums**: Розрахунок проміжних сум для стартового значення.
2. **02 — Min Prefix Sum**: Знаходження мінімального значення префіксної суми.
3. **03 — Min Start Value**: Пошук стартового значення для порогу 1.
4. **04 — Min Start Value with Threshold**: Стартове значення для довільного порогу.
5. **05 — Min Start Value with One Skip**: Стартове значення з можливістю пропустити один крок.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_07_MinValuePositiveStep.java.
