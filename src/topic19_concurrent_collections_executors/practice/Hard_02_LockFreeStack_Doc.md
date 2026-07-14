# Hard_02_LockFreeStack — Довідка

## Technique: Non-blocking Algorithms (CAS)

Implement a thread-safe, lock-free Treiber Stack using AtomicReference and Compare-And-Swap (CAS) instructions.

### Code Snippet:
```java
head.compareAndSet(oldHead, newHead)
```

## Drills

1. **Hard_02_LockFreeStack_01** — Creating a thread-safe stack using standard synchronized methods.\n2. **Hard_02_LockFreeStack_02** — Creating an immutable Node helper structure.\n3. **Hard_02_LockFreeStack_03** — Implementing push(value) via atomic CAS loop attempts.\n4. **Hard_02_LockFreeStack_04** — Implementing pop() via atomic CAS loop updates.\n5. **Hard_02_LockFreeStack_05** — Comparing LockFreeStack vs SynchronizedStack throughput under thread contention.\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_02_LockFreeStack.java.
