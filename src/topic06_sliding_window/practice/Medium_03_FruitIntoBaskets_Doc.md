# Medium_03_FruitIntoBaskets — Довідка

## Техніка: Динамічне розсувне вікно з обмеженням на кількість унікальних елементів (K = 2)

**Суть:** Задача еквівалентна пошуку найдовшого підмасиву, що містить щонайбільше два унікальних значення. Ми розширюємо вікно праворуч і підтримуємо частоту кожного типу фруктів у кошиках за допомогою HashMap або масиву. Якщо кількість унікальних типів стає більшою за 2, ми звужуємо вікно зліва.

```java
// Збереження фруктів у карті (максимум 2 типи)
public int totalFruit(int[] fruits) {
    Map<Integer, Integer> basket = new HashMap<>();
    int left = 0;
    int maxFruit = 0;
    for (int right = 0; right < fruits.length; right++) {
        basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
        while (basket.size() > 2) {
            basket.put(fruits[left], basket.get(fruits[left]) - 1);
            if (basket.get(fruits[left]) == 0) {
                basket.remove(fruits[left]);
            }
            left++;
        }
        maxFruit = Math.max(maxFruit, right - left + 1);
    }
    return maxFruit;
}
```

**Коли застосовувати:** Коли потрібно знайти максимальну довжину підмасиву з обмеженням на кількість різних типів елементів.

**Складність:** O(N) за часом, O(1) за пам'яттю.

## Вправи

- **Medium_03_01_FruitIntoBaskets**: Drill 1/5 for Medium_03_FruitIntoBaskets — Longest subarray with at most 1 type of fruit
- **Medium_03_02_FruitIntoBaskets**: Drill 2/5 for Medium_03_FruitIntoBaskets — Main problem (at most 2 types)
- **Medium_03_03_FruitIntoBaskets**: Drill 3/5 for Medium_03_FruitIntoBaskets — Generalize to 3 baskets
- **Medium_03_04_FruitIntoBaskets**: Drill 4/5 for Medium_03_FruitIntoBaskets — Is there a subarray with at most 2 fruit types that has at least minFruit elements? Return its start index or -1 if none
- **Medium_03_05_FruitIntoBaskets**: Drill 5/5 for Medium_03_FruitIntoBaskets — Longest subarray with at most k fruit types

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_03_FruitIntoBaskets.java.
