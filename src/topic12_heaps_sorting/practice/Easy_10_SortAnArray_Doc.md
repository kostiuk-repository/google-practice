# Easy_10_SortAnArray — Довідка

## Техніка: Сортування купою (Heap Sort) або інші ефективні алгоритми

**Суть:** Перетворення вхідного масиву на купу (heapify) та послідовне вилучення максимального елемента з кінця масиву для досягнення відсортованого стану in-place.

```java
public void heapSort(int[] nums) {
    int n = nums.length;
    for (int i = n / 2 - 1; i >= 0; i--) heapify(nums, n, i);
    for (int i = n - 1; i > 0; i--) {
        int temp = nums[0];
        nums[0] = nums[i];
        nums[i] = temp;
        heapify(nums, i, 0);
    }
}
```

**Коли застосовувати:** Коли потрібно відсортувати масив in-place з гарантованою часовою складністю O(N log N) та O(1) додаткової пам'яті.

**Складність:** Часова: O(N log N). Просторова: O(1) для in-place версії.

## Вправи (Drills)
- [Easy_10_01_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_01_SortAnArray.java) — Реалізація класичного сортування вставками (Insertion Sort).
- [Easy_10_02_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_02_SortAnArray.java) — Реалізувати крок heapify для піддерева з коренем i у масиві розміру n.
- [Easy_10_03_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_03_SortAnArray.java) — Сортування лише парних чисел у масиві із збереженням оригінальних позицій непарних.
- [Easy_10_04_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_04_SortAnArray.java) — Реалізація 3-way partition (алгоритм голландського прапора) для QuickSort.
- [Easy_10_05_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_05_SortAnArray.java) — Сортування масиву рядків за їхньою довжиною за допомогою купи.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_10_SortAnArray.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_10_SortAnArray.java).
