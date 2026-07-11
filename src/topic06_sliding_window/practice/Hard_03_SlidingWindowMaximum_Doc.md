# Hard_03_SlidingWindowMaximum — Довідка

## Техніка: Монотонна деку (Monotonic Deque)

**Суть:** Для знаходження максимуму у кожному вікні розміру k за лінійний час ми підтримуємо двобічну чергу (Deque) індексів елементів. Ми зберігаємо індекси так, щоб значення елементів за цими індексами у черзі були монотонно спадними. Коли ми додаємо новий елемент, ми видаляємо з кінця черги всі елементи, які менші за новий.

```java
// Робота з монотонною декою
public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null || nums.length == 0) return new int[0];
    int n = nums.length;
    int[] result = new int[n - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
        if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
            deque.pollFirst();
        }
        while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
            deque.pollLast();
        }
        deque.offerLast(i);
        if (i >= k - 1) {
            result[i - k + 1] = nums[deque.peekFirst()];
        }
    }
    return result;
}
```

**Коли застосовувати:** Коли потрібно знайти мінімум/максимум у всіх ковзних вікнах фіксованого або змінного розміру за лінійний час.

**Складність:** O(N) за часом, O(k) за пам'яттю.

## Вправи

- **Hard_03_01_SlidingWindowMaximum**: Drill 1/5 for Hard_03_SlidingWindowMaximum — Max element in first window of size k
- **Hard_03_02_SlidingWindowMaximum**: Drill 2/5 for Hard_03_SlidingWindowMaximum — Main Problem (sliding window maximum)
- **Hard_03_03_SlidingWindowMaximum**: Drill 3/5 for Hard_03_SlidingWindowMaximum — Sliding window minimum
- **Hard_03_04_SlidingWindowMaximum**: Drill 4/5 for Hard_03_SlidingWindowMaximum — Max sliding window using PriorityQueue
- **Hard_03_05_SlidingWindowMaximum**: Drill 5/5 for Hard_03_SlidingWindowMaximum — Max difference between max and min in any window of size k

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_SlidingWindowMaximum.java.
