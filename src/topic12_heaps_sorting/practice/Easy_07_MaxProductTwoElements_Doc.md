# Easy_07_MaxProductTwoElements — Довідка

## Техніка: Пошук двох найбільших елементів в один прохід

**Суть:** Знаходження двох найбільших елементів у масиві за один прохід (O(N) часу) за допомогою двох змінних, які оновлюються при зустрічі більшого значення.

```java
int max1 = 0, max2 = 0;
for (int num : nums) {
    if (num > max1) {
        max2 = max1;
        max1 = num;
    } else if (num > max2) {
        max2 = num;
    }
}
return (max1 - 1) * (max2 - 1);
```

**Коли застосовувати:** Коли потрібно знайти два найбільших або найменших значення в масиві без повного сортування.

**Складність:** Часова: O(N) за один прохід. Просторова: O(1) пам'яті.

## Вправи (Drills)
- [Easy_07_01_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_01_MaxProductTwoElements.java) — Знайти найбільший елемент в масиві.
- [Easy_07_02_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_02_MaxProductTwoElements.java) — Знайти два найбільші елементи за один прохід.
- [Easy_07_03_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_03_MaxProductTwoElements.java) — Максимальний добуток елементів на відстані щонайменше K індексів.
- [Easy_07_04_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_04_MaxProductTwoElements.java) — Мінімальний добуток двох елементів (можуть бути від'ємні числа).
- [Easy_07_05_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_05_MaxProductTwoElements.java) — Максимальний добуток трьох елементів виду (x-1)*(y-1)*(z-1).

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_07_MaxProductTwoElements.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_07_MaxProductTwoElements.java).
