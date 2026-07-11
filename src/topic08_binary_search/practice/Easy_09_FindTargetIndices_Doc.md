# Easy_09_FindTargetIndices — Довідка

## Техніка: Пошук цільових індексів після сортування (Find Target Indices)

**Суть:** Сортуємо масив. Потім бінарним пошуком знаходимо ліву та праву межі цільового значення. Усі індекси між ними додаємо в результат. Інший варіант — лінійний підрахунок кількості елементів, менших за target, та елементів, рівних target.

```java
Arrays.sort(nums);
List<Integer> result = new ArrayList<>();
int first = findFirst(nums, target);
if (first == -1) return result;
int last = findLast(nums, target);
for (int i = first; i <= last; i++) {
    result.add(i);
}
return result;
```

**Коли застосовувати:** Знаходження всіх входжень target у сортованому масиві.

**Складність:** Часова складність: O(N log N) для сортування + O(log N) для пошуку. Або O(N) без сортування.

## Drills

1. **Easy_09_FindTargetIndices_01** — Target Indices for Pre-Sorted Array.
2. **Easy_09_FindTargetIndices_02** — Count Elements Less Than Target.
3. **Easy_09_FindTargetIndices_03** — Count Elements Equal to Target.
4. **Easy_09_FindTargetIndices_04** — Target Indices Using Count Sort Idea.
5. **Easy_09_FindTargetIndices_05** — Target Indices Boundary Range.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_FindTargetIndices.java.
