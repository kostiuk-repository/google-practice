# Medium_02_VirtualThreadsIO — Довідка

## Technique: Virtual Threads vs Platform Threads

Compare execution efficiency of high numbers of blocking tasks using platform thread pools versus virtual threads.

### Code Snippet:
```java
Executors.newVirtualThreadPerTaskExecutor()
```

## Drills

1. **Medium_02_VirtualThreadsIO_01** — Running blocking tasks using a standard platform thread pool (cached/fixed).\n2. **Medium_02_VirtualThreadsIO_02** — Creating virtual threads manually using Thread.ofVirtual().factory().\n3. **Medium_02_VirtualThreadsIO_03** — Running tasks inside Executors.newVirtualThreadPerTaskExecutor().\n4. **Medium_02_VirtualThreadsIO_04** — Simulating network database latencies using Thread.sleep() to inspect carrier thread offloading.\n5. **Medium_02_VirtualThreadsIO_05** — Benchmarking memory usage and execution time of 10,000 parallel blocking tasks.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_02_VirtualThreadsIO.java.
