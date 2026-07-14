# Easy_03_AtomicIncrement — Довідка

## Technique: AtomicInteger operations

Perform lock-free atomic numeric increments and Compare-And-Swap (CAS) values using AtomicInteger.

### Code Snippet:
```java
atomic.updateAndGet(x -> x * 2);
```

## Drills

1. **Easy_03_AtomicIncrement_01** — Atomically incrementing value and retrieving the outcome.\n2. **Easy_03_AtomicIncrement_02** — Atomically decrementing values.\n3. **Easy_03_AtomicIncrement_03** — Writing custom CAS loops via compareAndSet.\n4. **Easy_03_AtomicIncrement_04** — Updating states with updateAndGet() and functional mappings.\n5. **Easy_03_AtomicIncrement_05** — Managing array updates concurrently using AtomicIntegerArray.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_03_AtomicIncrement.java.
