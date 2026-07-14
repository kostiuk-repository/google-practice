# Medium_03_ReadWriteSafeRegistry — Довідка

## Technique: Optimistic Locking & Read-Write Segregation

Design a configuration database optimized for high read ratios and low write frequency. Use ReadWriteLocks and StampedLocks.

### Code Snippet:
```java
long stamp = lock.tryOptimisticRead();
```

## Drills

1. **Medium_03_ReadWriteSafeRegistry_01** — Locking read/write methods globally via synchronized blocks.\n2. **Medium_03_ReadWriteSafeRegistry_02** — Using ReentrantReadWriteLock to allow concurrent reads and single writes.\n3. **Medium_03_ReadWriteSafeRegistry_03** — Using StampedLock with pessimistic read and write locks.\n4. **Medium_03_ReadWriteSafeRegistry_04** — Implementing lock-free optimistic reading with StampedLock validate methods.\n5. **Medium_03_ReadWriteSafeRegistry_05** — Upgrading optimistic stamps to write stamps inside conditional blocks.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_03_ReadWriteSafeRegistry.java.
