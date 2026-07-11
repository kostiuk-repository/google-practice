# Hard_02_SlidingWindowMaximum — Довідка

## Техніка: Двобічна черга для монотонного вікна (Monotonic Queue / Deque)

**Суть:** Ми підтримуємо Deque індексів, де значення елементів завжди зберігаються у спадному порядку. Перед додаванням нового елемента ми видаляємо з кінця Deque усі елементи, які менші за нього. Також ми видаляємо з початку Deque індекси, що вийшли за межі поточного вікна.

```java
Deque<Integer> dq = new ArrayDeque<>();
int[] result = new int[nums.length - k + 1];
for (int i = 0; i < nums.length; i++) {
    if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.pollFirst();
    while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
    dq.offerLast(i);
    if (i >= k - 1) result[i - k + 1] = nums[dq.peekFirst()];
}
```

**Коли застосовувати:** Пошук екстремумів (максимумів або мінімумів) у кожному ковзному вікні фіксованого розміру за O(N).

**Складність:** Часова: O(N), Просторова: O(K).

## Drills

1. **Hard_02_01** — Sliding window minimum.
2. **Hard_02_02** — Sliding window difference (Max - Min).
3. **Hard_02_03** — Longest subarray within absolute limit.
4. **Hard_02_04** — Sliding window maximum with stride s.
5. **Hard_02_05** — Sliding window maximum with dynamic window sizes.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_SlidingWindowMaximum.java.
