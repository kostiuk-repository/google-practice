# Easy_09_IntersectionTwoArrays — Довідка

## Техніка: Два вказівники на паралельних масивах

**Суть:** Сортуємо обидва масиви. Запускаємо два вказівники. Просуваємо вказівник з меншим елементом. Якщо елементи однакові — додаємо в перетин і рухаємо обидва.

### Концептуальний код
```java
Arrays.sort(nums1);
Arrays.sort(nums2);
int i = 0, j = 0;
List<Integer> list = new ArrayList<>();
while (i < nums1.length && j < nums2.length) {
    if (nums1[i] < nums2[j]) i++;
    else if (nums1[i] > nums2[j]) j++;
    else {
        list.add(nums1[i]);
        i++; j++;
    }
}
```

**Коли застосовувати:**
- Пошук перетину, об'єднання чи різниці двох упорядкованих колекцій.

**Складність:**
- **Часова:** O(N log N + M log M) через сортування, або O(N + M) якщо масиви вже відсортовані.
- **Просторова:** O(min(N, M)) для результату.

## Вправи (Drills)
1. **01 — Intersection with Unique Output**: Find intersection of two arrays. Each element in the result must be unique.
2. **02 — Intersection of Pre-Sorted Arrays**: Find intersection of two pre-sorted arrays (elements can repeat). Optimize to run in O(N + M) time.
3. **03 — Union of Sorted Arrays**: Find union of two sorted arrays, maintaining duplicate counts (e.g. if '2' appears 3 times in A and 2 times in B, it should appear 3 times in the union).
4. **04 — Intersection of Three Sorted Arrays**: Find intersection of three sorted arrays.
5. **05 — Intersection with Frequency Limit**: Find intersection of two sorted arrays, but each element can appear in the intersection at most maxFreq times.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_09_IntersectionTwoArrays.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Easy_09_IntersectionTwoArrays.java).
