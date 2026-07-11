# Easy_05_MoveZeroes — Довідка

## Техніка: Розділення масиву (Partition/Read-Write Pointers)

**Суть:** Повільний вказівник відмічає місце для наступного ненульового елемента, швидкий шукає такі елементи і обмінює їх місцями.

### Концептуальний код
```java
int slow = 0;
for (int fast = 0; fast < nums.length; fast++) {
    if (nums[fast] != 0) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
        slow++;
    }
}
```

**Коли застосовувати:**
- Переміщення елементів, що задовольняють умову, в один з кінців масиву із збереженням відносного порядку інших.

**Складність:**
- **Часова:** O(N) — один прохід по масиву.
- **Просторова:** O(1) — обміни виконуються in-place.

## Вправи (Drills)
1. **01 — Move Zeroes to Start**: Move all zeroes to the start of the array, maintaining the relative order of non-zero elements.
2. **02 — Move Target Element to End**: Move all occurrences of a target element to the end of the array, keeping other elements in relative order.
3. **03 — Move Zeroes Unordered**: Move all zeroes to the end. The relative order of non-zero elements does not matter. Minimize write operations.
4. **04 — Partition Even Odd**: Partition array in-place so all even numbers come before odd numbers. Order of elements does not matter.
5. **05 — Move Zeroes and Negatives**: Partition array: negative numbers at start, zeroes at end, and positive numbers in the middle. Relative order does not matter.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_05_MoveZeroes.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_05_MoveZeroes.java).
