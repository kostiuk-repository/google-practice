# Hard_02_AlienDictionary — Довідка

## Техніка: Топологічне сортування / Словник іншопланетян (Kahn's / DFS)

**Суть:** Потрібно визначити порядок символів в іншопланетному алфавіті на основі відсортованого списку слів. Ми порівнюємо сусідні слова для знаходження першого відмінного символу, що створює орієнтоване ребро char1 -> char2. Далі запускаємо топологічне сортування (алгоритм Кана через in-degree або DFS з визначенням циклів).

### Концептуальний приклад
```java
for (int i = 0; i < words.length - 1; i++) {
    String w1 = words[i], w2 = words[i+1];
    // Порівняння символів...
}
```

**Коли застосовувати:** Коли задано частковий порядок елементів (правила пріоритетів), і необхідно побудувати повний лінійний порядок або виявити цикл.

**Складність:** Часова: O(C) де C — сумарна довжина всіх слів, Просторова: O(V + E) де V <= 26, E <= N.

## Тренувальні задачі (Drills)

1. [Hard_02_AlienDictionary_01_AlienDictionary](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary_01_AlienDictionary.java) — Побудова графа символів: Будує граф суміжності (Adjacency List) літер на основі порівняння сусідніх слів у словнику. Якщо виявлено неможливе сортування (наприклад, 'abc' перед 'ab'), повертає null.
2. [Hard_02_AlienDictionary_02_AlienDictionary](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary_02_AlienDictionary.java) — Виявлення циклів у графі літер: Визначає, чи містить орієнтований граф залежностей символів хоча б один цикл (використовуючи 3-колірне розфарбування DFS).
3. [Hard_02_AlienDictionary_03_AlienDictionary](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary_03_AlienDictionary.java) — Топологічне сортування через DFS: Виконує топологічне сортування графа літер за допомогою алгоритму DFS (пост-ордер стек) та перевірки на цикли. Якщо знайдено цикл, повертає порожній рядок.
4. [Hard_02_AlienDictionary_04_AlienDictionary](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary_04_AlienDictionary.java) — Словник іншопланетян через BFS: Повністю вирішує задачу 'Alien Dictionary', використовуючи алгоритм Кана (BFS з підрахунком вхідних ступенів).
5. [Hard_02_AlienDictionary_05_AlienDictionary](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary_05_AlienDictionary.java) — Пошук усіх валідних алфавітів: Знаходить усі можливі валідні послідовності літер алфавіту (якщо топологічне сортування неоднозначне через наявність незалежних вершин).


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_02_AlienDictionary.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Hard_02_AlienDictionary.java).
