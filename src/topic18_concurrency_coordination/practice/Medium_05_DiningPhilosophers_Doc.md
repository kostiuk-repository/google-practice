# Medium_05_DiningPhilosophers — Довідка

## Technique: Deadlock Avoidance

Coordinate five philosophers sitting around a table with five chopsticks. Avoid circular waits and prevent deadlocks.

### Code Snippet:
```java
int left = philosopher;
```

## Drills

1. **Medium_05_DiningPhilosophers_01** — Breaking deadlock via resource ordering (always picking the lower-indexed chopstick first).\n2. **Medium_05_DiningPhilosophers_02** — Limiting dining concurrency to at most 4 philosophers using a Semaphore.\n3. **Medium_05_DiningPhilosophers_03** — Using tryLock() to acquire chopsticks, releasing the first chopstick if the second is unavailable.\n4. **Medium_05_DiningPhilosophers_04** — Using a central Monitor object that decides who can dine based on chopstick availability.\n5. **Medium_05_DiningPhilosophers_05** — Passing resource requests into a single-threaded queue loop to allocate forks dynamically.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_05_DiningPhilosophers.java.
