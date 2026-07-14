# Easy_01_SimpleCompletableFuture — Довідка

## Technique: CompletableFuture basics

Transform an input string asynchronously using CompletableFuture supplyAsync and thenApply. Block and fetch results synchronously.

### Code Snippet:
```java
CompletableFuture.supplyAsync(() -> input).thenApply(String::toUpperCase);
```

## Drills

1. **Easy_01_SimpleCompletableFuture_01** — Instantly returning resolved futures via completedFuture().\n2. **Easy_01_SimpleCompletableFuture_02** — Triggering background operations on default JVM pools.\n3. **Easy_01_SimpleCompletableFuture_03** — Chaining non-blocking functional transformations.\n4. **Easy_01_SimpleCompletableFuture_04** — Blocking caller threads using join() instead of throwing checked exceptions.\n5. **Easy_01_SimpleCompletableFuture_05** — Consuming execution outputs without returning values.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_01_SimpleCompletableFuture.java.
