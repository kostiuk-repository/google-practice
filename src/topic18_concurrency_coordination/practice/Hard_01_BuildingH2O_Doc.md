# Hard_01_BuildingH2O — Довідка

## Technique: Group Barrier Synchronization

Synchronize hydrogen and oxygen threads so that for every three threads, exactly 2 hydrogen threads and 1 oxygen thread are released to form H2O.

### Code Snippet:
```java
private final CyclicBarrier barrier = new CyclicBarrier(3);
```

## Drills

1. **Hard_01_BuildingH2O_01** — Using two Semaphores (hSem=2, oSem=1) to release correct ratios.\n2. **Hard_01_BuildingH2O_02** — Using a CyclicBarrier(3) to hold molecules until assembly conditions are complete.\n3. **Hard_01_BuildingH2O_03** — Enforcing ratios using ReentrantLock and tracking hydrogen/oxygen count states.\n4. **Hard_01_BuildingH2O_04** — Using a Phaser to handle dynamic thread grouping for molecule assembly phases.\n5. **Hard_01_BuildingH2O_05** — Lock-free grouping via AtomicInteger states and CAS.\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_01_BuildingH2O.java.
