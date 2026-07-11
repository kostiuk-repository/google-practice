# Easy_07_RemoveElement — Довідка

## Техніка: Двопокажчикова фільтрація (Filter Pointer)

**Суть:** Один вказівник відстежує поточну позицію запису (повільний), а інший сканує масив і вибирає елементи, які не збігаються з фільтрованим значенням (швидкий).

### Концептуальний код
```java
int slow = 0;
for (int fast = 0; fast < nums.length; fast++) {
    if (nums[fast] != val) {
        nums[slow] = nums[fast];
        slow++;
    }
}
return slow;
```

**Коли застосовувати:**
- Видалення елементів, що відповідають певному критерію, in-place.

**Складність:**
- **Часова:** O(N) — один лінійний прохід.
- **Просторова:** O(1) — без додаткового масиву.

## Вправи (Drills)
1. **01 — Remove First Occurrence**: Remove only the first occurrence of val from an array in-place, shifting subsequent elements. Return new length.
2. **02 — Remove Two Values In-Place**: Remove all instances of val1 and val2 from an array in-place. Return the new length.
3. **03 — Remove All Negatives**: Remove all negative numbers from an array in-place, returning the new length.
4. **04 — Remove and Swap with End**: Remove elements matching val by swapping them with the last element of the active array (unordered, minimizes assignments).
5. **05 — Remove Divisible by Three**: Remove all numbers that are divisible by 3 in-place, returning the new length.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_07_RemoveElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_07_RemoveElement.java).
