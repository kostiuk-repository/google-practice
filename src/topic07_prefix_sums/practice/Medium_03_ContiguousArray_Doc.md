# Medium_03_ContiguousArray — Довідка

## Техніка: Трансформація задачі до нульової суми (Zero-Sum Transformation + Prefix Map)

**Суть:** Пошук найдовшого підмасиву з рівною кількістю 0 та 1. Ми замінюємо кожен 0 на -1. Тоді задача стає еквівалентною пошуку найдовшого підмасиву з сумою рівною 0. Ми зберігаємо першу появу кожної префіксної суми в HashMap.

```java
public int findMaxLength(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int sum = 0, maxLength = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += (nums[i] == 0 ? -1 : 1);
        if (map.containsKey(sum)) {
            maxLength = Math.max(maxLength, i - map.get(sum));
        } else {
            map.put(sum, i);
        }
    }
    return maxLength;
}
```

**Коли застосовувати:**
- Коли потрібно знайти баланс між двома типами елементів (наприклад, 0 та 1, парні та непарні).

**Складність:**
- Часова складність: O(N) — один прохід.
- Просторова складність: O(N) — для зберігання перших позицій префіксних сум.

## Вправи (Drills)
1. **01 — Convert Zeros to Minus Ones**: Перетворення масиву в-місце або створення нового з -1 замість 0.
2. **02 — Longest Subarray Sum Zero**: Пошук найдовшого підмасиву з сумою 0.
3. **03 — Max Length Contiguous**: Повний пошук максимального збалансованого підмасиву.
4. **04 — Count Equal Zero Ones**: Підрахунок загальної кількості збалансованих підмасивів.
5. **05 — Max Length Twice Ones**: Пошук найдовшого підмасиву, де одиниць удвічі більше, ніж нулів.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_03_ContiguousArray.java.
