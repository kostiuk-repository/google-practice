# Medium_04_DesignCircularQueue — Довідка

## Техніка: Кільцевий буфер на основі масиву (Array-based Ring Buffer)

**Суть:** Використання фіксованого масиву з двома вказівниками (`head` і `tail`) та лічильником розміру `size` для уникнення неоднозначності між порожнім та повним станом. Індекси оновлюються за допомогою остачі від ділення: `(index + 1) % capacity`.

```java
class MyCircularQueue {
    int[] queue;
    int head = 0, tail = -1, size = 0, capacity;
    
    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[k];
    }
    public boolean enQueue(int value) {
        if (isFull()) return false;
        tail = (tail + 1) % capacity;
        queue[tail] = value;
        size++;
        return true;
    }
}
```

**Коли застосовувати:** Розробка буферів фіксованого розміру, черг повідомлень з обмеженням пам'яті (наприклад, у мережевих картах або потокових системах).

**Складність:** Усі операції O(1) за часом та O(K) за простором.

## Drills

1. **Medium_04_01** — Design Circular Deque (двобічна черга).
2. **Medium_04_02** — Dynamic capacity Growable Circular Queue.
3. **Medium_04_03** — Circular Queue with running average tracking in O(1).
4. **Medium_04_04** — Circular Queue using linked nodes.
5. **Medium_04_05** — Expiring Circular Queue with elements expiring by TTL.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_DesignCircularQueue.java.
