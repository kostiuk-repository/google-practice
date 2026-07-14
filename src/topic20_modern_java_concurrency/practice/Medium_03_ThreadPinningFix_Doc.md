# Medium_03_ThreadPinningFix — Довідка

## Technique: Carrier Thread Pinning Fixes

Detect and fix a Carrier Thread Pinning issue resulting from synchronized blocks wrapping blocking I/O calls inside a Virtual Thread.

### Code Snippet:
```java
reentrantLock.lock(); try { Thread.sleep(100); } finally { reentrantLock.unlock(); }
```

## Drills

1. **Medium_03_ThreadPinningFix_01** — Simulating pinning by wrapping long Thread.sleep calls inside a synchronized block.\n2. **Medium_03_ThreadPinningFix_02** — Analyzing JVM logs (-Djdk.tracePinnedThreads=full) to identify pinning stack traces.\n3. **Medium_03_ThreadPinningFix_03** — Replacing synchronized blocks with ReentrantLock to prevent carrier thread locks.\n4. **Medium_03_ThreadPinningFix_04** — Using atomic wrappers or thread-local storage alternatives to remove locks completely.\n5. **Medium_03_ThreadPinningFix_05** — Reviewing external dependencies to bypass pinned blocks.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_03_ThreadPinningFix.java.
