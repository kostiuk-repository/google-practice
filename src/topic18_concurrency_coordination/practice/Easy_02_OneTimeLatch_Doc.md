# Easy_02_OneTimeLatch — Довідка

## Technique: CountDownLatch

Coordinate worker threads so that they wait for a central initialization service to complete using CountDownLatch.

### Code Snippet:
```java
private final CountDownLatch latch = new CountDownLatch(1);
```

## Drills

1. **Easy_02_OneTimeLatch_01** — Blocking caller thread via await() until latch reaches zero.\n2. **Easy_02_OneTimeLatch_02** — Catching and processing InterruptedException gracefully inside await tasks.\n3. **Easy_02_OneTimeLatch_03** — Using latch.await(timeout, unit) to unblock callers if services hang.\n4. **Easy_02_OneTimeLatch_04** — Decrementing counts from multiple worker threads.\n5. **Easy_02_OneTimeLatch_05** — Recreating latch counters via ReentrantLock and Condition loops.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_02_OneTimeLatch.java.
