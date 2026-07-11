# Hard_03_CorporateFlightBookings — Довідка

## Техніка: 1D Масив різниць / Інтервальні оновлення (Difference Array Range Update)

**Суть:** Виконання інтервальних запитів додавання за O(1) за допомогою масиву різниць `diff`. Для кожного бронювання `[start, end, seats]` ми виконуємо: `diff[start] += seats` та `diff[end + 1] -= seats`. Після обробки всіх запитів робимо префіксну суму для отримання остаточної кількості місць на кожному рейсі.

```java
public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] diff = new int[n + 2];
    for (int[] b : bookings) {
        int first = b[0];
        int last = b[1];
        int seats = b[2];
        diff[first] += seats;
        diff[last + 1] -= seats;
    }
    int[] result = new int[n];
    int current = 0;
    for (int i = 1; i <= n; i++) {
        current += diff[i];
        result[i - 1] = current;
    }
    return result;
}
```

**Коли застосовувати:**
- Коли дано велику кількість запитів додавання значень на відрізках масиву, і нам потрібен підсумковий стан масиву після всіх запитів.

**Складність:**
- Часова складність: O(N + B), де B — кількість бронювань, N — кількість рейсів.
- Просторова складність: O(N) для різницевого масиву.

## Вправи (Drills)
1. **01 — Apply Single Booking**: Додавання одного бронювання до різницевого масиву.
2. **02 — Reconstruct Passengers**: Відновлення масиву з масиву різниць.
3. **03 — Flight Bookings Complete**: Повна реалізація за допомогою різницевого масиву.
4. **04 — Bookings with Multiplier**: Бронювання з коефіцієнтом масштабування.
5. **05 — Seat Count at Flight**: Отримання значення місць для одного конкретного рейсу.

---
**CAPSTONE**
Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_CorporateFlightBookings.java.
