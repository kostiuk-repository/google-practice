# Easy_02_SpawnVirtualThread — Довідка

## Technique: Virtual Thread creation

Spawn, execute and wait for a lightweight virtual thread using Thread Java 21+ factory APIs.

### Code Snippet:
```java
Thread.startVirtualThread(task);
```

## Drills

1. **Easy_02_SpawnVirtualThread_01** — Spawning immediate executing virtual threads via Thread.startVirtualThread.\n2. **Easy_02_SpawnVirtualThread_02** — Configuring names and settings using Thread.ofVirtual().start().\n3. **Easy_02_SpawnVirtualThread_03** — Creating unstarted virtual threads and starting them manually.\n4. **Easy_02_SpawnVirtualThread_04** — Spawning platform threads to verify class names and OS bindings.\n5. **Easy_02_SpawnVirtualThread_05** — Asserting executing thread profiles using Thread.currentThread().isVirtual().\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_02_SpawnVirtualThread.java.
