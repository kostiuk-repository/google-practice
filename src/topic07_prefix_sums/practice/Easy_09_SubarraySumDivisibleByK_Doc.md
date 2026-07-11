# Easy_09_SubarraySumDivisibleByK — Довідка

## Техніка: Префіксні остачі (Prefix Sums Modulo K)

**Суть:** Пошук кількості підмасивів, сума яких ділиться на `k`. Для цього використовується той факт, що якщо `(Prefix[R] - Prefix[L]) % k == 0`, то `Prefix[R] % k == Prefix[L] % k`. Ми зберігаємо частоти залишків у масиві або мапі.

```java
public int subarraysDivByK(int[] nums, int k) {
    int[] count = new int[k];
    count[0] = 1;
    int prefixMod = 0, result = 0;
    for (int num : nums) {
        prefixMod = (prefixMod + num) % k;
        if (prefixMod < 0) prefixMod += k; // обробка від'ємних чисел
        result += count[prefixMod];
        count[prefixMod]++;
    }
    return result;
}
```

**Коли застосовувати:**
- Коли потрібно знайти підмасиви з сумою, яка задовольняє властивості подільності.

**Складність:**
- Часова складність: O(N + K) або O(N) при використанні мапи.
- Просторова складність: O(K) для масиву остач.

## Вправи (Drills)
1. **01 — Has Prefix Divisible**: Перевірка наявності префіксної суми, що ділиться на K.
2. **02 — Prefix Mods**: Розрахунок масиву префіксних остач.
3. **03 — Short Subarrays**: Пошук коротких підмасивів довжиною <= 3, що діляться на K.
4. **04 — Brute Force Count**: Пошук O(N^2) кількості підмасивів, сума яких кратна K.
5. **05 — Complete Divisible Count**: Оптимальний підрахунок підмасивів.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_SubarraySumDivisibleByK.java.
