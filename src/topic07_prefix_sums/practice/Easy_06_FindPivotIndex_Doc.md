# Easy_06_FindPivotIndex — Довідка

## Техніка: Пошук індексу балансу (Pivot / Equilibrium Index)

**Суть:** Пошук елемента, у якого сума лівої частини дорівнює сумі правої частини. Використовує формулу: `leftSum == totalSum - leftSum - nums[i]`.

```java
public int pivotIndex(int[] nums) {
    int total = 0;
    for (int x : nums) total += x;
    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (leftSum == total - leftSum - nums[i]) {
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
}
```

**Коли застосовувати:**
- Коли потрібно знайти індекс розділення масиву на рівні за сумою частини.

**Складність:**
- Часова складність: O(N) — лінійний прохід.
- Просторова складність: O(1) — без додаткової пам'яті.

## Вправи (Drills)
1. **01 — Target Left Sum**: Знайти перший індекс із лівою сумою рівною `target`.
2. **02 — Compute Left Sums**: Обчислення лівих сум.
3. **03 — Basic Pivot Index**: Знаходження індексу балансу зліва направо.
4. **04 — Rightmost Pivot Index**: Знаходження індексу балансу справа наліво.
5. **05 — Circular Pivot Index**: Пошук півоту в круговому масиві.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_06_FindPivotIndex.java.
