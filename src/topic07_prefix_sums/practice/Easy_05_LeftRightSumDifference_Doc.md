# Easy_05_LeftRightSumDifference — Довідка

## Техніка: Ліво-праві накопичувальні суми (Left and Right Accumulators)

**Суть:** Розподіл суми елементів на дві частини для кожного індексу: суму елементів зліва (leftSum) та суму елементів справа (rightSum). Може бути реалізована за допомогою предобчислення або з використанням однієї загальної суми для O(1) додаткової пам'яті.

```java
public int[] leftRightDifference(int[] nums) {
    int totalSum = 0;
    for (int num : nums) totalSum += num;
    
    int leftSum = 0;
    int[] answer = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        int rightSum = totalSum - leftSum - nums[i];
        answer[i] = Math.abs(leftSum - rightSum);
        leftSum += nums[i];
    }
    return answer;
}
```

**Коли застосовувати:**
- Коли для кожного елемента масиву потрібно знати сумарну характеристику лівої та правої частин.

**Складність:**
- Часова складність: O(N) — два проходи по масиву.
- Просторова складність: O(1) додаткової пам'яті (якщо не рахувати результат).

## Вправи (Drills)
1. **01 — Left Sums**: Обчислення лівих сум для кожного індексу.
2. **02 — Right Sums**: Обчислення правих сум для кожного індексу.
3. **03 — Absolute Difference**: Різниця лівих і правих сум.
4. **04 — Left Right Product Difference**: Різниця лівих і правих добутків.
5. **05 — In-Place Difference**: Реалізація з O(1) додаткової пам'яті.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_05_LeftRightSumDifference.java.
