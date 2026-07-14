# Modern Java Concurrency & Virtual Threads - Study Notes

Modern Java simplifies asynchronous execution and concurrency via lightweight threads and non-blocking frameworks.

---

## 1. CompletableFuture (Asynchronous Programming)
Unlike classic `Future.get()`, which blocks threads during retrieval, `CompletableFuture` lets you design non-blocking pipelines:
*   `supplyAsync(Supplier)` — Runs a task asynchronously in the common pool.
*   `thenApply(Function)` — Transforms results asynchronously.
*   `thenCombine(CompletableFuture, BiFunction)` — Combines results of two parallel futures.
*   `exceptionally(Function)` — Falls back to defaults upon execution errors.

---

## 2. Virtual Threads (Project Loom - Java 21+)
Traditional Java Threads (Platform Threads) are wrappers of OS threads. They are heavy (~1MB stack) and finite.
*   **Virtual Threads:** Lightweight, JVM-managed threads requiring only a few bytes. You can run millions concurrently.
*   **Under the Hood (Carrier Threads):** JVM maps virtual threads onto a few platform threads (Carrier Threads). When a virtual thread blocks on I/O, JVM unmounts it, using the carrier thread to execute other virtual threads.
*   **Thread Pinning:** Sticking a virtual thread to a carrier thread. Occurs inside `synchronized` blocks or native code. Use `ReentrantLock` instead of `synchronized` to avoid this.

---

## 3. Structured Concurrency (Java 21+)
Treats groups of subtasks as a single unit:
*   `StructuredTaskScope` ensures that if one task fails, remaining tasks are automatically cancelled, eliminating thread leaks.
*   `ShutdownOnFailure` — Cancels scope on first error.
*   `ShutdownOnSuccess` — Returns the first successful subtask result (fastest wins).

---

## 4. Scoped Values (Java 21+)
A lightweight, immutable replacement for `ThreadLocal`. Enables sharing data across methods without parameter overhead. Highly optimized for millions of virtual threads.
