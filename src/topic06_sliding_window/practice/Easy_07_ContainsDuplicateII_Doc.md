# Easy_07_ContainsDuplicateII — Довідка

## Техніка: Розсувне вікно фіксованого розміру з хеш-множиною

**Суть:** Замість того, щоб порівнювати всі пари елементів (O(N^2)), ми підтримуємо вікно розміром не більше ніж k+1. Використовуючи хеш-множину (HashSet) для збереження елементів поточного вікна, ми можемо перевірити наявність дубліката за O(1). Коли вікно перевищує розмір k, ми видаляємо найлівіший елемент.

```java
// Підтримка ковзного HashSet розміру k
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        if (i > k) {
            set.remove(nums[i - k - 1]);
        }
        if (!set.add(nums[i])) {
            return true;
        }
    }
    return false;
}
```

**Коли застосовувати:** Коли потрібно знайти повторювані елементи, які розташовані один від одного на відстані не більше k.

**Складність:** O(N) за часом (один прохід, операції з HashSet за O(1)), O(min(N, k)) за пам'яттю.

## Вправи

- **Easy_07_01_ContainsDuplicateII**: Drill 1/5 for Easy_07_ContainsDuplicateII — Standard Duplicate Check
- **Easy_07_02_ContainsDuplicateII**: Drill 2/5 for Easy_07_ContainsDuplicateII — Find first duplicate pair indices
- **Easy_07_03_ContainsDuplicateII**: Drill 3/5 for Easy_07_ContainsDuplicateII — Contains Nearby Duplicate
- **Easy_07_04_ContainsDuplicateII**: Drill 4/5 for Easy_07_ContainsDuplicateII — Nearby values with diff <= t
- **Easy_07_05_ContainsDuplicateII**: Drill 5/5 for Easy_07_ContainsDuplicateII — Max distance between duplicate elements within k

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_07_ContainsDuplicateII.java.
