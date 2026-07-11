# Easy_08_SquaresOfSortedArray — Довідка

## Техніка: Зустрічні вказівники для порівняння абсолютних значень

**Суть:** Оскільки найбільші за модулем елементи знаходяться на краях масиву (позитивні справа, негативні зліва), мы порівнюємо їхні квадрати і заповнюємо результуючий масив з кінця.

### Концептуальний код
```java
int left = 0, right = nums.length - 1;
int[] res = new int[nums.length];
for (int i = nums.length - 1; i >= 0; i--) {
    if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        res[i] = nums[left] * nums[left];
        left++;
    } else {
        res[i] = nums[right] * nums[right];
        right--;
    }
}
```

**Коли застосовувати:**
- Обчислення монотонної функції від елементів масиву, який містить від'ємні та додатні числа.

**Складність:**
- **Часова:** O(N) — лінійний прохід для заповнення результуючого масиву.
- **Просторова:** O(N) або O(1) додаткової (без урахування вихідного масиву).

## Вправи (Drills)
1. **01 — Squares of Non-Negative Sorted Array**: Given a sorted array of non-negative integers, return their squares in sorted order.
2. **02 — Squares of Negative-Only Sorted Array**: Given a sorted array of negative integers, return their squares in sorted order.
3. **03 — Sorted Absolute Values**: Given a sorted array containing negative and positive integers, return sorted absolute values.
4. **04 — Merge Two Sorted Squares Arrays**: Given two sorted arrays of squares, merge them into one sorted array of squares.
5. **05 — Sorted Cubes of Sorted Array**: Given a sorted array, return sorted cubes of the numbers. Keep in mind that negative numbers cubing yields negative numbers.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_08_SquaresOfSortedArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_08_SquaresOfSortedArray.java).
