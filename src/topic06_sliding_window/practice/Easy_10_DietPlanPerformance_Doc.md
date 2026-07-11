# Easy_10_DietPlanPerformance — Довідка

## Техніка: Розсувне вікно фіксованого розміру з підсумовуванням

**Суть:** Ми рахуємо суму елементів у кожному вікні розміру k. Замість повторного додавання всіх k елементів на кожному кроці, ми додаємо новий елемент, який входить у вікно праворуч, і віднімаємо старий елемент, який виходить з вікна ліворуч.

```java
// Підтримка ковзної суми розміру k
public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
    int points = 0;
    int sum = 0;
    for (int i = 0; i < calories.length; i++) {
        sum += calories[i];
        if (i >= k) {
            sum -= calories[i - k];
        }
        if (i >= k - 1) {
            if (sum < lower) points--;
            else if (sum > upper) points++;
        }
    }
    return points;
}
```

**Коли застосовувати:** Коли потрібно аналізувати суми або інші агреговані метрики у всіх підмасивах фіксованої довжини k.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Easy_10_01_DietPlanPerformance**: Drill 1/5 for Easy_10_DietPlanPerformance — Calculate point for single sum
- **Easy_10_02_DietPlanPerformance**: Drill 2/5 for Easy_10_DietPlanPerformance — Sum of first k elements
- **Easy_10_03_DietPlanPerformance**: Drill 3/5 for Easy_10_DietPlanPerformance — Diet Plan Performance
- **Easy_10_04_DietPlanPerformance**: Drill 4/5 for Easy_10_DietPlanPerformance — Maximum sum of any window of size k
- **Easy_10_05_DietPlanPerformance**: Drill 5/5 for Easy_10_DietPlanPerformance — Find subarray of size k that gets targetPoints in single window

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_DietPlanPerformance.java.
