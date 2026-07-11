# Medium_02_SubarraySumDivisibleByK — Довідка

## Техніка: Префіксні суми modulo K та Хеш-мапа (Prefix Sums Modulo K with Map)

**Суть:** Підрахунок кількості підмасивів, сума яких кратна `k`. Ми зберігаємо частоту кожної остачі від ділення префіксних сум на `k`. Якщо поточна остача дорівнює `r`, то будь-який раніше зустрінутий префікс із тією ж остачею утворює підмасив з сумою, кратною `k`.

```java
public int subarraysDivByK(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int sum = 0, count = 0;
    for (int num : nums) {
        sum += num;
        int rem = sum % k;
        if (rem < 0) rem += k;
        if (map.containsKey(rem)) {
            count += map.get(rem);
        }
        map.put(rem, map.getOrDefault(rem, 0) + 1);
    }
    return count;
}
```

**Коли застосовувати:**
- Пошук кількості підмасивів з кратними сумами в загальному випадку (з довільними числами).

**Складність:**
- Часова складність: O(N) — один прохід.
- Просторова складність: O(min(N, K)) — для зберігання частот остач.

## Вправи (Drills)
1. **01 — Mod Frequencies**: Отримати мапу частот остач префіксних сум.
2. **02 — Count Pairs Same Remainder**: Розрахунок кількості пар з однаковими остачами.
3. **03 — Subarrays Divisible by K**: Повний лінійний підрахунок підмасивів.
4. **04 — Longest Subarray Divisible by K**: Знайти максимальну довжину підмасиву, кратного K.
5. **05 — Subarrays Divisible by K Range**: Кількість підмасивів кратного K у межах довжин `[L, R]`.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_SubarraySumDivisibleByK.java.
