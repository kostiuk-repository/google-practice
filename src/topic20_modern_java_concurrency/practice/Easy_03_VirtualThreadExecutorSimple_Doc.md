# Easy_03_VirtualThreadExecutorSimple — Довідка

## Technique: Virtual Thread Task Runner

Run a batch of concurrent task inputs inside a new Virtual Thread Per Task Executor.

### Code Snippet:
```java
try (var executor = Executors.newVirtualThreadPerTaskExecutor())
```

## Drills

1. **Easy_03_VirtualThreadExecutorSimple_01** — Instantiating an executor service using Executors.newVirtualThreadPerTaskExecutor.\n2. **Easy_03_VirtualThreadExecutorSimple_02** — Submitting task entries and acquiring future hooks.\n3. **Easy_03_VirtualThreadExecutorSimple_03** — Managing execution scopes via auto-close try-with-resources statements.\n4. **Easy_03_VirtualThreadExecutorSimple_04** — Evaluating throughput counts on thousands of short sleep tasks.\n5. **Easy_03_VirtualThreadExecutorSimple_05** — Comparing configuration constraints of platform thread pools against Loom executors.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_03_VirtualThreadExecutorSimple.java.
