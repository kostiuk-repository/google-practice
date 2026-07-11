# Hard_02_FindDuplicateNumber — Довідка

## Техніка: Floyd's Cycle Detection (Tortoise and Hare)

**Суть:** Оскільки елементи лежать у діапазоні [1, n] для масиву розміром n+1, ми можемо трактувати значення в комірках як вказівники на інші індекси. Наявність дубліката гарантує цикл. Знаходимо перетин повільного та швидкого вказівників, потім точку входу.

### Концептуальний код
```java
int slow = nums[0], fast = nums[0];
do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);
fast = nums[0];
while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}
return slow;
```

**Коли застосовувати:**
- Пошук повторюваного числа у масиві з n+1 чисел без використання додаткової пам'яті та без зміни оригінального масиву.

**Складність:**
- **Часова:** O(N) — лінійний час пошуку циклу.
- **Просторова:** O(1) — робота виключно з індексами.

## Вправи (Drills)
1. **01 — Find Duplicate with HashSet**: Find duplicate using a HashSet (O(N) space).
2. **02 — Find Duplicate by Sorting**: Find duplicate by sorting the array first (O(N log N) time, modifies the array or uses extra space).
3. **03 — Find Duplicate using Array Sign Marking**: Find duplicate by marking visited elements as negative (modifies the array, O(N) time, O(1) space).
4. **04 — Find Duplicate using Binary Search**: Find duplicate using Binary Search on the value range [1, n] (O(N log N) time, O(1) space, read-only).
5. **05 — Find Duplicate using Cycle Detection**: Find duplicate using Floyd's Cycle Detection. Implement the two phases: meeting point and cycle entry point.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_02_FindDuplicateNumber.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Hard_02_FindDuplicateNumber.java).
