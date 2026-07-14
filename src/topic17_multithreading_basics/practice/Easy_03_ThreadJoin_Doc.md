# Easy_03_ThreadJoin — Довідка

## Technique: Thread Lifecycle Coordination

Design a class that runs two threads sequentially. Ensure the second thread starts only after the first has completed, using join().

### Code Snippet:
```java
t1.join();
```

## Drills

1. **Easy_03_ThreadJoin_01** — Basic thread creation and execution using Runnable instances.\n2. **Easy_03_ThreadJoin_02** — Blocking the caller thread until the target thread finishes via join().\n3. **Easy_03_ThreadJoin_03** — Using timed join(timeout) to prevent hanging forever if a thread deadlocks.\n4. **Easy_03_ThreadJoin_04** — Correctly catching and handling InterruptedException during thread join.\n5. **Easy_03_ThreadJoin_05** — Checking the life status of the thread (isAlive) after join has unblocked.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_03_ThreadJoin.java.
