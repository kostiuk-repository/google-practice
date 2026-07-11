# Easy_08_CheckIfExist — Довідка

## Техніка: Пошук пар за допомогою сортування та бінарного пошуку (Check If N and Its Double Exist)

**Суть:** Сортуємо масив. Для кожного елемента arr[i] бінарним пошуком шукаємо 2 * arr[i]. Враховуємо нулі та від'ємні числа.

```java
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
    int target = 2 * arr[i];
    int idx = binarySearch(arr, target);
    if (idx >= 0 && idx != i) return true;
}
return false;
```

**Коли застосовувати:** Перевірка наявності пар чисел у несортованому масиві з можливістю сортування.

**Складність:** Часова складність: O(N log N). Просторова складність: O(1).

## Drills

1. **Easy_08_CheckIfExist_01** — Search for Double Value.
2. **Easy_08_CheckIfExist_02** — Check Double Exist in Sorted Array.
3. **Easy_08_CheckIfExist_03** — Check Triple Exist.
4. **Easy_08_CheckIfExist_04** — Check Half Exist Safely.
5. **Easy_08_CheckIfExist_05** — Check Double Exist O(N).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_08_CheckIfExist.java.
