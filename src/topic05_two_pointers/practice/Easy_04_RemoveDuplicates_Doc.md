# Easy_04_RemoveDuplicates — Довідка

## Техніка: Швидкий та повільний вказівники (Read & Write Pointers)

**Суть:** Повільний вказівник відстежує позицію для перезапису унікальних елементів, швидкий вказівник сканує масив.

### Концептуальний код
```java
int slow = 0;
for (int fast = 1; fast < nums.length; fast++) {
    if (nums[fast] != nums[slow]) {
        slow++;
        nums[slow] = nums[fast];
    }
}
return slow + 1;
```

**Коли застосовувати:**
- Модифікація масиву in-place, видалення дублікатів чи фільтрація елементів у відсортованому масиві.

**Складність:**
- **Часова:** O(N) — один прохід швидким вказівником.
- **Просторова:** O(1) — робота повністю in-place.

## Вправи (Drills)
1. **01 — Remove Element Value**: Remove all instances of val from array in-place, return the new length. Order of remaining elements can be changed.
2. **02 — Remove Duplicates Keep Two**: Remove duplicates from sorted array such that each unique element appears at most twice. Return new length.
3. **03 — Move Duplicates to End**: Move duplicates in a sorted array to the end and return count of unique elements. Order of unique elements must be maintained.
4. **04 — Remove Duplicates from Sorted Array**: Classic remove duplicates. Modify sorted array in-place to keep only unique elements. Return new length.
5. **05 — Remove Duplicates with K Matches**: Modify sorted array in-place to keep each unique element at most k times. Return new length.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_04_RemoveDuplicates.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_04_RemoveDuplicates.java).
