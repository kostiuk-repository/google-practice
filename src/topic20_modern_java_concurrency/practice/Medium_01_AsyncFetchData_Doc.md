# Medium_01_AsyncFetchData — Довідка

## Technique: CompletableFuture Pipelines

Write an asynchronous method that queries two remote sources in parallel and combines their results non-blockingly.

### Code Snippet:
```java
f1.thenCombine(f2, (r1, r2) -> r1 + r2);
```

## Drills

1. **Medium_01_AsyncFetchData_01** — Running tasks asynchronously using supplyAsync.\n2. **Medium_01_AsyncFetchData_02** — Transforming future results non-blockingly via thenApply.\n3. **Medium_01_AsyncFetchData_03** — Merging two asynchronous results via thenCombine.\n4. **Medium_01_AsyncFetchData_04** — Handling errors and providing default fallback results via exceptionally.\n5. **Medium_01_AsyncFetchData_05** — Awaiting all elements of a future list concurrently using CompletableFuture.allOf.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_01_AsyncFetchData.java.
