# Easy_08_TimeNeededToBuyTickets — Довідка

## Техніка: Моделювання черги та математичний розрахунок за один прохід (One-pass Calculation)

**Суть:** Замість повної симуляції черги (яка може бути повільною), ми можемо математично обчислити внесок кожної особи в загальний час. Особи перед k куплять максимум min(tickets[i], tickets[k]) квитків, а особи після k — min(tickets[i], tickets[k] - 1).

```java
int time = 0;
for (int i = 0; i < tickets.length; i++) {
    if (i <= k) {
        time += Math.min(tickets[i], tickets[k]);
    } else {
        time += Math.min(tickets[i], tickets[k] - 1);
    }
}
```

**Коли застосовувати:** В задачах про кругове обслуговування черги, коли потрібно дізнатися час завершення конкретного елемента.

**Складність:** Часова: O(N), Просторова: O(1).

## Drills

1. **Easy_08_01** — Tickets array state after t seconds.
2. **Easy_08_02** — Count full passes before k finishes.
3. **Easy_08_03** — Queue simulation with a VIP customer at index v.
4. **Easy_08_04** — Total time required for all queue members.
5. **Easy_08_05** — Dynamic batch capacity per person.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Easy_08_TimeNeededToBuyTickets.java.
