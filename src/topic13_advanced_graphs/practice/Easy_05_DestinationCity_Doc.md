# Easy_05_DestinationCity — Довідка

## Техніка: Пошук кінцевої вершини за допомогою Set

**Суть:** Кінцеве місто — це місто, яке має вихідний ступінь 0. Ми можемо зібрати всі стартові міста (звідки є вильоти) у Set. Потім проходимо по всіх містах призначення і перевіряємо, якого з них немає в нашому Set.

### Концептуальний приклад
```java
Set<String> startCities = new HashSet<>();
for (List<String> path : paths) {
    startCities.add(path.get(0));
}
for (List<String> path : paths) {
    if (!startCities.contains(path.get(1))) {
        return path.get(1);
    }
}
```

**Коли застосовувати:** Коли граф є лінійним ланцюгом або деревом шляхів, і потрібно знайти унікальний стік (вершину без вихідних ребер).

**Складність:** Часова: O(N) (де N — кількість шляхів), Просторова: O(N) для збереження міст.

## Тренувальні задачі (Drills)

1. [Easy_05_DestinationCity_01_DestinationCity](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity_01_DestinationCity.java) — Перевірка кінцевої точки: Перевіряє, чи є задане місто кінцевим (не має вихідних ребер).
2. [Easy_05_DestinationCity_02_DestinationCity](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity_02_DestinationCity.java) — Пошук у масиві: Знаходить кінцеве місто, коли вхідний масив представлений у вигляді String[][].
3. [Easy_05_DestinationCity_03_DestinationCity](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity_03_DestinationCity.java) — Пошук усіх початкових міст: Повертає набір усіх міст, з яких починаються маршрути (мають вихідні ребра, але не мають вхідних).
4. [Easy_05_DestinationCity_04_DestinationCity](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity_04_DestinationCity.java) — Кінець найдовшого маршруту: Знаходить кінцеве місто найдовшого шляху в графі (у випадку, якщо граф містить кілька розгалужених шляхів).
5. [Easy_05_DestinationCity_05_DestinationCity](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity_05_DestinationCity.java) — Відтворення всього маршруту: Відтворює повний маршрут від самого початкового пункту до кінцевого міста у вигляді впорядкованого списку.


---
**CAPSTONE:** Розв'язуй у порядку 01 → 05, не підглядаючи в [Easy_05_DestinationCity.java](file:///C:/Users/kosti/Projects/google-practice/src/topic13_advanced_graphs/practice/Easy_05_DestinationCity.java).
