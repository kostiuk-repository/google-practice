# Easy_04_MakeArrayZero — Довідка

## Техніка: Використання множини для підрахунку унікальних значень

**Суть:** Кількість операцій віднімання мінімального ненульового елемента для зведення всього масиву до нуля дорівнює кількості унікальних позитивних чисел у масиві.

```java
Set<Integer> uniquePositives = new HashSet<>();
for (int num : nums) {
    if (num > 0) {
        uniquePositives.add(num);
    }
}
return uniquePositives.size();
```

**Коли застосовувати:** Коли операція віднімання мінімуму застосовується до всіх елементів одночасно, і потрібно знайти загальну кількість таких кроків.

**Складність:** Часова: O(N) для проходу по масиву. Просторова: O(N) для збереження унікальних елементів у HashSet.

## Вправи (Drills)
- [Easy_04_01_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_01_MakeArrayZero.java) — Знайти мінімальний ненульовий елемент в масиві.
- [Easy_04_02_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_02_MakeArrayZero.java) — Відняти задане число x від усіх ненульових елементів (не допускаючи негативних значень) та повернути кількість ненульових.
- [Easy_04_03_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_03_MakeArrayZero.java) — Кількість кроків для зведення до нуля, якщо віднімати можна лише від парних чисел.
- [Easy_04_04_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_04_MakeArrayZero.java) — Максимальна кількість кроків, якщо ми можемо віднімати будь-яке значення, менше або рівне мінімальному позитивному.
- [Easy_04_05_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_05_MakeArrayZero.java) — Мінімум операцій для зведення до нуля при обмеженнях на вибір індексів.

---
### CAPSTONE
Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_04_MakeArrayZero.java](file:///C:/Users/kosti/Projects/google-practice/src/topic12_heaps_sorting/practice/Easy_04_MakeArrayZero.java).
