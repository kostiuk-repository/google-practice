# Easy_10_CheckIfSubarraySumExist — Довідка

## Техніка: Префіксні залишки з індексацією (Indexed Prefix Remainder Map)

**Суть:** Для визначення існування підмасиву довжиною від 2 елементів, сума якого кратна `target`, ми зберігаємо перший індекс зустрічі кожного залишку префіксної суми в HashMap. Якщо залишок зустрічається знову на індексі `i`, а перший індекс був `j`, і `i - j >= 2`, то потрібний підмасив знайдено.

```java
public boolean checkSubarraySum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        int rem = target == 0 ? sum : sum % target;
        if (rem < 0) rem += Math.abs(target);
        if (map.containsKey(rem)) {
            if (i - map.get(rem) >= 2) return true;
        } else {
            map.put(rem, i);
        }
    }
    return false;
}
```

**Коли застосовувати:**
- Коли є додаткова умова на довжину підмасиву, сума якого має певну властивість подільності.

**Складність:**
- Часова складність: O(N) — один прохід з пошуком у хеш-мапі за O(1).
- Просторова складність: O(min(N, K)) для зберігання остач.

## Вправи (Drills)
1. **01 — Check Prefix Sum Equals Target**: Перевірити, чи є хоча б одна префіксна сума, яка дорівнює `target`.
2. **02 — Check Subarray Sum**: Існування підмасиву довжиною >= 2 з сумою кратною `target`.
3. **03 — Check Prefix Difference Multiple**: Перевірити, чи є два префікси, різниця яких кратна `target`.
4. **04 — Check Subarray Sum Exactly Target**: Перевірити, чи є підмасив довжиною >= 2 з сумою точно `target`.
5. **05 — Check Subarray Sum Negative**: Перевірити кратність для від'ємних чисел і від'ємного `target`.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_CheckIfSubarraySumExist.java.
