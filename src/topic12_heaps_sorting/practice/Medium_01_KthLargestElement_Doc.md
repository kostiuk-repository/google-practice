# Medium_01_KthLargestElement — Довідка

## Техніка: QuickSelect або Min-Heap розміру K

**Суть:** Пошук K-го найбільшого елемента. Може бути реалізований за допомогою Min-Heap розміру K за O(N log K) або через QuickSelect (алгоритм швидкого вибору) за середній час O(N).

```java
// QuickSelect partition step
int pivot = nums[pivotIndex];
swap(nums, pivotIndex, right);
int storeIndex = left;
for (int i = left; i < right; i++) {
    if (nums[i] < pivot) {
        swap(nums, storeIndex, i);
        storeIndex++;
    }
}
swap(nums, storeIndex, right);
```

**Коли застосовувати:** Коли потрібно знайти K-й за величиною елемент у несортованому масиві без повного сортування.

**Складність:** Часова: O(N) в середньому для QuickSelect, O(N log K) для купи. Просторова: O(1) для QuickSelect.

## Вправи (Drills)
- [Medium_01_01_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_01_KthLargestElement.java) — Розділити масив навколо опорного елемента (partition) та повернути його фінальний індекс.
- [Medium_01_02_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_02_KthLargestElement.java) — Пошук K-го найбільшого елемента через Min-Heap.
- [Medium_01_03_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_03_KthLargestElement.java) — Пошук K-го найбільшого елемента в матриці з відсортованими рядками.
- [Medium_01_04_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_04_KthLargestElement.java) — Пошук K-го найбільшого унікального елемента (ігноруючи дублікати).
- [Medium_01_05_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_05_KthLargestElement.java) — Повна реалізація QuickSelect для пошуку K-го найбільшого елемента.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_01_KthLargestElement.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Medium_01_KthLargestElement.java).
