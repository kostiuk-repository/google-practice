# Easy_03_SemaphorePermit — Довідка

## Technique: Semaphore access control

Restrict access to a shared resource using a Semaphore with a fixed number of permits.

### Code Snippet:
```java
private final Semaphore semaphore = new Semaphore(3);
```

## Drills

1. **Easy_03_SemaphorePermit_01** — Acquiring a permit and releasing it inside try-finally blocks.\n2. **Easy_03_SemaphorePermit_02** — Attempting permit acquisition with timeout limits to avoid blocking.\n3. **Easy_03_SemaphorePermit_03** — Acquiring multiple permits at once for heavy operations.\n4. **Easy_03_SemaphorePermit_04** — Inspecting available permits and queued threads metrics.\n5. **Easy_03_SemaphorePermit_05** — Configuring fair semaphores to prevent thread starvation.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_03_SemaphorePermit.java.
