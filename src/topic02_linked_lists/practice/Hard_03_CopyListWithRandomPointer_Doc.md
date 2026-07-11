# Hard_03_CopyListWithRandomPointer — Довідка

## Техніка: Вплетення та Розплетення (Weaving and Unweaving without Map)

**Суть:** глибоке копіювання списку зі складними перехресними посиланнями (`random`) без додаткової пам'яті ($O(1)$ space).
Це досягається у три кроки:
1. **Вплетення (Weaving):** копіюємо кожен вузол та вставляємо його безпосередньо після оригіналу: `A -> A' -> B -> B' -> ...`
2. **Копіювання випадкових посилань:** для кожного оригінального вузла `curr` копія `curr.next` отримує випадкове посилання: `curr.next.random = curr.random.next` (якщо `curr.random` не `null`).
3. **Розплетення (Unweaving):** розділяємо оригінальний та скопійований списки, відновлюючи зв'язки `next` для обох.

```java
if (head == null) return null;

// 1. Вплетення
Node curr = head;
while (curr != null) {
    Node copy = new Node(curr.val);
    copy.next = curr.next;
    curr.next = copy;
    curr = copy.next;
}

// 2. Копіювання random посилань
curr = head;
while (curr != null) {
    if (curr.random != null) {
        curr.next.random = curr.random.next;
    }
    curr = curr.next.next;
}

// 3. Розплетення
curr = head;
Node copyHead = head.next;
Node copyCurr = copyHead;

while (curr != null) {
    curr.next = curr.next.next;
    if (copyCurr.next != null) {
        copyCurr.next = copyCurr.next.next;
    }
    curr = curr.next;
    copyCurr = copyCurr.next;
}
return copyHead;
```

**Коли застосовувати:** копіювання або клонування складних графів зв'язків (наприклад, списки з переходами, дерева зі зворотними посиланнями), коли використання `Map` заборонено обмеженнями на пам'ять.

**Складність:** O(N) час, O(1) додаткової пам'яті (за винятком пам'яті під саму копію).

## Drills

1. **Hard_03_01** — глибоке копіювання звичайного лінійного списку без випадкових посилань.
2. **Hard_03_02** — створення відображення `Map<Node, Node>` оригінальних вузлів на їхні копії без зв'язків.
3. **Hard_03_03** — перший етап in-place алгоритму: вплетення (інтерлівінг) копій у вихідний список.
4. **Hard_03_04** — другий етап in-place алгоритму: встановлення посилань `random` для копій в інтерлівінг-структурі.
5. **Hard_03_05** — капстоун: третій етап in-place алгоритму: розділення (розплетення) оригінального та скопійованого списків.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_CopyListWithRandomPointer.java.
