# Easy_01_SimpleSubmit — Довідка

## Technique: ExecutorService basic execution

Submit a task to a SingleThreadExecutor, block and fetch the result using Future.get(). Handle executor lifecycle correctly.

### Code Snippet:
```java
Future<String> future = executor.submit(task);
```

## Drills

1. **Easy_01_SimpleSubmit_01** — Running simple background tasks using execute(Runnable).\n2. **Easy_01_SimpleSubmit_02** — Submitting task to pull future result.\n3. **Easy_01_SimpleSubmit_03** — Using awaitTermination for graceful service shutdowns.\n4. **Easy_01_SimpleSubmit_04** — Handling ExecutionExceptions thrown by future tasks.\n5. **Easy_01_SimpleSubmit_05** — Forcing execution timeout limits using Future.get(timeout, unit).\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_01_SimpleSubmit.java.
