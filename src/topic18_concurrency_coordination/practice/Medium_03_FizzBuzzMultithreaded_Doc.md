# Medium_03_FizzBuzzMultithreaded — Довідка

## Technique: Multi-Condition Thread Dispatching

Coordinate four threads printing 'fizz' (divisible by 3), 'buzz' (divisible by 5), 'fizzbuzz' (divisible by 15), or the number itself.

### Code Snippet:
```java
notifyAll();
```

## Drills

1. **Medium_03_FizzBuzzMultithreaded_01** — Using synchronized(this) and notifyAll() loops.\n2. **Medium_03_FizzBuzzMultithreaded_02** — Using a ReentrantLock with a shared Condition object.\n3. **Medium_03_FizzBuzzMultithreaded_03** — Using individual Semaphores to wake up the correct thread for each turn.\n4. **Medium_03_FizzBuzzMultithreaded_04** — Lock-free coordination using atomic state checks and volatile spins.\n5. **Medium_03_FizzBuzzMultithreaded_05** — Using a CyclicBarrier to synchronize execution loops across all four threads.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_03_FizzBuzzMultithreaded.java.
