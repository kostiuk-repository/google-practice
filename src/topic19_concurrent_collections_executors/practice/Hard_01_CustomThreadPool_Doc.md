# Hard_01_CustomThreadPool — Довідка

## Technique: Deconstruction of Thread Execution Pools

Write your own Thread Pool from scratch using raw Threads and BlockingQueue. Do not use ExecutorService classes.

### Code Snippet:
```java
queue.take().run();
```

## Drills

1. **Hard_01_CustomThreadPool_01** — Designing Worker threads that pool from a shared queue in loops.\n2. **Hard_01_CustomThreadPool_02** — Initializing the pool with fixed sizes of Worker threads.\n3. **Hard_01_CustomThreadPool_03** — Implementing clean pool shutdowns by setting run state variables.\n4. **Hard_01_CustomThreadPool_04** — Blocking task submissions when queue sizes reach their capacity limit.\n5. **Hard_01_CustomThreadPool_05** — Catching task exceptions and reviving worker threads that crash.\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_01_CustomThreadPool.java.
