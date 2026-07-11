# Easy_10_NextGreaterElementI — Довідка

## Техніка: Наступний більший елемент з хешуванням (Next Greater Element with Map Lookup)

**Суть:** Використовуємо монотонний стек для знаходження наступного більшого елемента для кожного значення в nums2 і зберігаємо ці пари у HashMap. Потім для кожного запиту з nums1 ми виконуємо O(1) пошук у мапі.

```java
Map<Integer, Integer> map = new HashMap<>();
Deque<Integer> stack = new ArrayDeque<>();
for (int num : nums2) {
    while (!stack.isEmpty() && stack.peek() < num) {
        map.put(stack.pop(), num);
    }
    stack.push(num);
}
```

**Коли застосовувати:** Коли потрібно відповісти на запити пошуку наступного більшого елемента для підмножини масиву.

**Складність:** Часова: O(N + M), Просторова: O(N).

## Drills

1. **Easy_10_01** — Next greater element in a single array.
2. **Easy_10_02** — Next greater element in circular array.
3. **Easy_10_03** — First greater element to the left (previous greater).
4. **Easy_10_04** — Distance to the next greater element.
5. **Easy_10_05** — Second greater element to the right.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_NextGreaterElementI.java.
