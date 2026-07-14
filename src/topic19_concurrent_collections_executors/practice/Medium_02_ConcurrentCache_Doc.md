# Medium_02_ConcurrentCache — Довідка

## Technique: Concurrent Maps & Cache stampede prevention

Implement a thread-safe cache using concurrent collections. Prevent duplicate computation of the same key when accessed concurrently.

### Code Snippet:
```java
return cache.computeIfAbsent(key, k -> provider.get());
```

## Drills

1. **Medium_02_ConcurrentCache_01** — Wrapping a default HashMap using Collections.synchronizedMap.\n2. **Medium_02_ConcurrentCache_02** — Using ConcurrentHashMap.putIfAbsent to prevent cache overwrites.\n3. **Medium_02_ConcurrentCache_03** — Using ConcurrentHashMap.computeIfAbsent to atomically generate cache elements without racing providers.\n4. **Medium_02_ConcurrentCache_04** — Implementing cache key expirations via time-to-live attributes.\n5. **Medium_02_ConcurrentCache_05** — Adding concurrent key counters using LongAdder inside the cache map.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_02_ConcurrentCache.java.
