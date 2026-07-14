# Medium_04_ParallelArraySumPool — Довідка

## Technique: Fork-Join Framework

Sum the elements of a huge array concurrently using ForkJoinPool and RecursiveTask.

### Code Snippet:
```java
left.fork(); return right.compute() + left.join();
```

## Drills

1. **Medium_04_ParallelArraySumPool_01** — Declaring a RecursiveTask class and defining its baseline task threshold.\n2. **Medium_04_ParallelArraySumPool_02** — Splitting subtasks using fork() and retrieving outcomes with join().\n3. **Medium_04_ParallelArraySumPool_03** — Executing tasks in the default ForkJoinPool.commonPool().\n4. **Medium_04_ParallelArraySumPool_04** — Running calculations inside a custom configured ForkJoinPool.\n5. **Medium_04_ParallelArraySumPool_05** — Tuning task split thresholds to balance divide-and-conquer overhead.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_04_ParallelArraySumPool.java.
