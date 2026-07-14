# Easy_02_ThreadSafeCounter — Довідка

## Technique: State Mutation Protection

Implement a thread-safe counter class that can be updated concurrently by multiple threads without data loss.

### Code Snippet:
```java
private final LongAdder adder = new LongAdder();
```

## Drills

1. **Easy_02_ThreadSafeCounter_01** — Demonstrating data races and race conditions when multiple threads increment an unsynchronized counter.\n2. **Easy_02_ThreadSafeCounter_02** — Using synchronized methods to enforce mutual exclusion and visibility.\n3. **Easy_02_ThreadSafeCounter_03** — Using lock-free AtomicInteger for efficient atomic operations.\n4. **Easy_02_ThreadSafeCounter_04** — Using ReentrantLock to guard mutable counter state.\n5. **Easy_02_ThreadSafeCounter_05** — Using LongAdder to minimize contention overhead in high-throughput environments.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_02_ThreadSafeCounter.java.
