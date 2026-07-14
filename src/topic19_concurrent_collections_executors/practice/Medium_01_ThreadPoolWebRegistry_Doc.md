# Medium_01_ThreadPoolWebRegistry — Довідка

## Technique: ExecutorService & ThreadPool tuning

Design a request registry that handles incoming HTTP requests concurrently using ExecutorService. Handle queue size limits and cleanups.

### Code Snippet:
```java
ThreadPoolExecutor executor = new ThreadPoolExecutor(...);
```

## Drills

1. **Medium_01_ThreadPoolWebRegistry_01** — Running tasks concurrently using Executors.newFixedThreadPool.\n2. **Medium_01_ThreadPoolWebRegistry_02** — Awaiting tasks and managing exceptions via Future.get().\n3. **Medium_01_ThreadPoolWebRegistry_03** — Configuring ThreadPoolExecutor with a custom bounded ArrayBlockingQueue to prevent OOM.\n4. **Medium_01_ThreadPoolWebRegistry_04** — Writing a custom RejectedExecutionHandler to log or fall back when queue is exhausted.\n5. **Medium_01_ThreadPoolWebRegistry_05** — Using ScheduledExecutorService to schedule periodic cleanup tasks.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_01_ThreadPoolWebRegistry.java.
