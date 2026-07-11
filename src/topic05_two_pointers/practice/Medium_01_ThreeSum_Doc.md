# Medium_01_ThreeSum — Довідка

## Техніка: Сортування + Фіксація одного елемента + Зустрічні вказівники

**Суть:** Сортуємо масив. Для кожного фіксованого елемента `nums[i]` використовуємо два зустрічні вказівники `left` та `right` на решті масиву, шукаючи пару із сумою `-nums[i]`. Пропускаємо однакові елементи для уникнення дублікатів.

### Концептуальний код
```java
Arrays.sort(nums);
for (int i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] == nums[i-1]) continue;
    int left = i + 1, right = nums.length - 1;
    while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
            res.add(Arrays.asList(nums[i], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left+1]) left++;
            while (left < right && nums[right] == nums[right-1]) right--;
            left++; right--;
        } else if (sum < 0) left++;
        else right--;
    }
}
```

**Коли застосовувати:**
- Пошук трійок або четвірок чисел із фіксованою сумою в несортованому масиві з вимогою відсутності дублікатів.

**Складність:**
- **Часова:** O(N^2) — вкладені два вказівники в лінійний цикл.
- **Просторова:** O(log N) до O(N) для сортування.

## Вправи (Drills)
1. **01 — Two Sum Closest**: Find the values of the two numbers in a sorted array whose sum is closest to target. Return as array of size 2.
2. **02 — 3Sum Closest**: Find three integers in nums such that the sum is closest to target. Return the sum of the three integers.
3. **03 — 3Sum with Duplicates Allowed**: Find all triplets that sum to 0, but you do NOT need to avoid duplicate triplets in the output.
4. **04 — 3Sum Smaller**: Find the number of index triplets i, j, k such that nums[i] + nums[j] + nums[k] < target.
5. **05 — 4Sum**: Given an array, find all unique quadruplets [nums[a], nums[b], nums[c], nums[d]] that sum to target.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_01_ThreeSum.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Medium_01_ThreeSum.java).
