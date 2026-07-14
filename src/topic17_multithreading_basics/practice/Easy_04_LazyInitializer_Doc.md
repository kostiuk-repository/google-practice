# Easy_04_LazyInitializer — Довідка

## Technique: Safe Object Publication (Lazy Initialization)

Implement a thread-safe Singleton pattern using lazy initialization.

### Code Snippet:
```java
private static volatile Helper instance;
```

## Drills

1. **Easy_04_LazyInitializer_01** — Creating a standard thread-unsafe lazy initialization Singleton.\n2. **Easy_04_LazyInitializer_02** — Using a synchronized method to serialize access to the initialization logic.\n3. **Easy_04_LazyInitializer_03** — Using double-checked locking with volatile field to avoid synchronization overhead.\n4. **Easy_04_LazyInitializer_04** — Using the Initialization-on-demand holder idiom for lazy, thread-safe, lock-free creation.\n5. **Easy_04_LazyInitializer_05** — Using eager initialization via a static final field, delegating thread safety to the ClassLoader.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_04_LazyInitializer.java.
