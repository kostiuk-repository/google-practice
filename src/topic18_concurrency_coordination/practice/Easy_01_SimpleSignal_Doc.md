# Easy_01_SimpleSignal — Довідка

## Technique: Basic wait/notify Coordination

Design a basic signaling coordinator where one thread waits on a condition using wait(), and another thread triggers notify() to wake it up.

### Code Snippet:
```java
synchronized(lock) { while(!flag) lock.wait(); }
```

## Drills

1. **Easy_01_SimpleSignal_01** — Checking execution variables under synchronized block locks.\n2. **Easy_01_SimpleSignal_02** — Designing wait checks inside a while loop to bypass spurious wakeups.\n3. **Easy_01_SimpleSignal_03** — Re-implementing basic signaling using ReentrantLock and Condition await/signal.\n4. **Easy_01_SimpleSignal_04** — Implementing one-time signaling using a CountDownLatch.\n5. **Easy_01_SimpleSignal_05** — Using a binary Semaphore to trigger signals between threads.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_01_SimpleSignal.java.
