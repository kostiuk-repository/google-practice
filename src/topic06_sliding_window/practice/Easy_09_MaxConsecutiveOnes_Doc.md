# Easy_09_MaxConsecutiveOnes — Довідка

## Техніка: Однопрохідне сканування з лічильником

**Суть:** Ми проходимо по масиву та підтримуємо лічильник поточних послідовних одиниць. Коли зустрічаємо 1, збільшуємо лічильник. Коли зустрічаємо 0, скидаємо лічильник. Одночасно оновлюємо глобальний максимум.

```java
// Однопрохідне накопичення максимуму
public int findMaxConsecutiveOnes(int[] nums) {
    int maxConsec = 0;
    int current = 0;
    for (int num : nums) {
        if (num == 1) {
            current++;
            maxConsec = Math.max(maxConsec, current);
        } else {
            current = 0;
        }
    }
    return maxConsec;
}
```

**Коли застосовувати:** Для знаходження найдовшої неперервної послідовності елементів, що задовольняють просту локальну умову.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Easy_09_01_MaxConsecutiveOnes**: Drill 1/5 for Easy_09_MaxConsecutiveOnes — Check if all elements are 1
- **Easy_09_02_MaxConsecutiveOnes**: Drill 2/5 for Easy_09_MaxConsecutiveOnes — Find max consecutive ones
- **Easy_09_03_MaxConsecutiveOnes**: Drill 3/5 for Easy_09_MaxConsecutiveOnes — Max consecutive ones with at most one 0 flipped
- **Easy_09_04_MaxConsecutiveOnes**: Drill 4/5 for Easy_09_MaxConsecutiveOnes — Max consecutive ones with at most k flips
- **Easy_09_05_MaxConsecutiveOnes**: Drill 5/5 for Easy_09_MaxConsecutiveOnes — Longest subarray of 1s after deleting one element

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_MaxConsecutiveOnes.java.
