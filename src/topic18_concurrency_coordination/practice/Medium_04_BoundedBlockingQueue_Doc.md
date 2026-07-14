# Medium_04_BoundedBlockingQueue — Довідка

## Technique: Custom Thread-Safe Collections

Design a Bounded Blocking Queue that blocks enqueue when full, and blocks dequeue when empty, without standard queue helper collections.

### Code Snippet:
```java
private final Condition notFull = lock.newCondition();
```

## Drills

1. **Medium_04_BoundedBlockingQueue_01** — Using synchronized lock wrapper on a LinkedList with wait/notifyAll.\n2. **Medium_04_BoundedBlockingQueue_02** — Using a ReentrantLock with 'notFull' and 'notEmpty' Conditions.\n3. **Medium_04_BoundedBlockingQueue_03** — Using Semaphores to track empty and full slots combined with a mutex.\n4. **Medium_04_BoundedBlockingQueue_04** — A spin-lock based blocking queue using volatile array references.\n5. **Medium_04_BoundedBlockingQueue_05** — Implementing the bounded blocking queue by delegating to a standard ArrayBlockingQueue.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_04_BoundedBlockingQueue.java.
