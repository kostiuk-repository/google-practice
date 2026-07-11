# Easy_02_SearchInsert — Довідка

## Техніка: Пошук позиції вставки (Search Insert Position)

**Суть:** Два вказівники звужують діапазон. Якщо target знайдено, повертаємо mid. Якщо ні — після завершення циклу left вказуватиме саме на ту позицію, куди слід вставити target, щоб зберегти сортування.

```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return left;
```

**Коли застосовувати:** Масив відсортований, і треба знайти елемент або визначити його позицію вставки за O(log N).

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Easy_02_SearchInsert_01** — Search Insert Existence Check.
2. **Easy_02_SearchInsert_02** — Leftmost Search Insert Position.
3. **Easy_02_SearchInsert_03** — Rightmost Search Insert Position.
4. **Easy_02_SearchInsert_04** — Search Insert In Descending Array.
5. **Easy_02_SearchInsert_05** — Search Insert With Duplicates Count.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_02_SearchInsert.java.
