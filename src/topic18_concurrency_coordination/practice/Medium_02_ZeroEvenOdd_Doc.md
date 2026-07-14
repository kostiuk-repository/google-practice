# Medium_02_ZeroEvenOdd — Довідка

## Technique: State-Machine Thread Coordination

Coordinate three threads: one outputs '0', one outputs even numbers, and one outputs odd numbers. The combined output must be '01020304...'.

### Code Snippet:
```java
zeroSem.acquire();
```

## Drills

1. **Medium_02_ZeroEvenOdd_01** — Using synchronized state loops and wait/notifyAll.\n2. **Medium_02_ZeroEvenOdd_02** — Using three separate Semaphores (zeroSem=1, evenSem=0, oddSem=0).\n3. **Medium_02_ZeroEvenOdd_03** — Using one ReentrantLock with three separate Condition objects.\n4. **Medium_02_ZeroEvenOdd_04** — Coordinating turns using CyclicBarrier or Phaser.\n5. **Medium_02_ZeroEvenOdd_05** — Coordinating via an AtomicInteger state machine with volatile busy-spin.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_02_ZeroEvenOdd.java.
