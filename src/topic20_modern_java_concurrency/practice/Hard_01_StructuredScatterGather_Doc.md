# Hard_01_StructuredScatterGather — Довідка

## Technique: Structured Concurrency

Design a scatter-gather API client. If any subtask fails, automatically cancel all remaining parallel subtasks.

### Code Snippet:
```java
try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>())
```

## Drills

1. **Hard_01_StructuredScatterGather_01** — Declaring StructuredTaskScope inside a try-with-resources statement.\n2. **Hard_01_StructuredScatterGather_02** — Forking subtasks into the scope via scope.fork().\n3. **Hard_01_StructuredScatterGather_03** — Awaiting all tasks and propagating exceptions using ShutdownOnFailure.\n4. **Hard_01_StructuredScatterGather_04** — Returning the fastest successful subtask result using ShutdownOnSuccess.\n5. **Hard_01_StructuredScatterGather_05** — Verifying that remaining sibling tasks receive interrupts when a failure shuts down the scope.\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_01_StructuredScatterGather.java.
