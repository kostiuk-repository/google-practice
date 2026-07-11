# Easy_08_CommonAncestors — Довідка

## Техніка: Пошук предків у DAG за допомогою відстеження батьківських зв'язків

**Суть:** Для пошуку спільних предків двох вершин у DAG ми будуємо карту предків для кожної вершини. Спочатку знаходимо всі вершини, які є предками (прямими або непрямими) першого вузла, записуючи їх у Set. Потім піднімаємось вгору від другого вузла і перевіряємо перетин множин.

### Концептуальний приклад
```java
Map<Integer, List<Integer>> parentMap = new HashMap<>();
for (int[] pair : parentChildPairs) {
    parentMap.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
}
```

**Коли застосовувати:** Коли потрібно знайти спільні генеалогічні джерела або залежності для двох вузлів у DAG.

**Складність:** Часова: O(V + E) для пошуку предків, Просторова: O(V) для мапи зв'язків.

## Тренувальні задачі (Drills)

1. [Easy_08_CommonAncestors_01_CommonAncestors](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors_01_CommonAncestors.java) — Список предків: Знаходить множину всіх предків (прямих і непрямих) для однієї вершини.
2. [Easy_08_CommonAncestors_02_CommonAncestors](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors_02_CommonAncestors.java) — Перший спільний предок: Знаходить найближчого спільного предка (першого знайденого при підйомі вгору) для двох вершин. Якщо спільного предка немає, повертає -1.
3. [Easy_08_CommonAncestors_03_CommonAncestors](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors_03_CommonAncestors.java) — Вершини з 0 або 1 батьком: Знаходить усі вершини, які мають рівно 0 або 1 батька.
4. [Easy_08_CommonAncestors_04_CommonAncestors](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors_04_CommonAncestors.java) — Перевірка зв'язку предок-нащадок: Перевіряє, чи є вершина ancestor предком для descendant.
5. [Easy_08_CommonAncestors_05_CommonAncestors](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors_05_CommonAncestors.java) — Найдовша гілка предків: Знаходить довжину найдовшого шляху від заданої вершини вгору до будь-якого предка-джерела (який не має батьків).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_08_CommonAncestors.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_08_CommonAncestors.java).
