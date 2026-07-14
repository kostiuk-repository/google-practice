# Easy_01_PrintInOrder — Довідка

## Technique: Basic Synchronization (synchronized, volatile)

Suppose we have a class PrintInOrder. Three threads will receive different tasks.
Thread A will call first(), Thread B will call second(), and Thread C will call third().
Design a mechanism to guarantee that first() is executed first, second() is executed second, and third() is executed third.

### Code Snippet:
```java
private volatile int state = 1;
```

## Drills

1. **Easy_01_PrintInOrder_01** — Coordinating threads using a volatile state variable and active waiting (busy spin).\n2. **Easy_01_PrintInOrder_02** — Coordinating threads using synchronized blocks with wait() and notifyAll().\n3. **Easy_01_PrintInOrder_03** — Coordinating threads using AtomicInteger as a state machine.\n4. **Easy_01_PrintInOrder_04** — Coordinating threads using Semaphore permits to regulate execution order.\n5. **Easy_01_PrintInOrder_05** — Coordinating threads using CountDownLatch to block dependent steps.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_01_PrintInOrder.java.
