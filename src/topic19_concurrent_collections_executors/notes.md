# Executors, Concurrent Collections & CAS - Study Notes

To scale programs, manual thread management (`new Thread()`) must be replaced by structured pools, threads caches, and lock-free APIs.

---

## 1. Thread Pools & Executors
Creating OS-level threads is expensive (typically allocating 1MB stack memory per thread). Thread pools decouple task submission from task execution by recycling threads.
*   **Executor:** Simple interface exposing a single `execute(Runnable)` method.
*   **ExecutorService:** Adds life-cycle controls, task submission (`submit()`, which yields a `Future`), and shutdown.
*   **ThreadPoolExecutor:** A customizable pool built around these core parameters:
    *   `corePoolSize`: Minimum active threads kept in the pool.
    *   `maximumPoolSize`: Upper limit of concurrent threads.
    *   `keepAliveTime`: Inactivity time before non-core threads are destroyed.
    *   `workQueue`: The queue holding tasks waiting for thread availability.

---

## 2. Concurrent Collections
Traditional wrappers (like `Collections.synchronizedList`) serialise all operations, locking the entire collection.
*   **ConcurrentHashMap:** Optimises concurrency by partitioning the map. Readers are mostly non-blocking, and writes lock individual bins.
*   **CopyOnWriteArrayList:** Write operations copy the underlying backing array, rendering reads extremely fast and lock-free. Useful for read-heavy arrays.
*   **BlockingQueue:** Inter-thread communication queues that block operations when full or empty.

---

## 3. CAS (Compare-And-Swap) & Atomic Variables
Non-blocking (lock-free) structures exploit hardware CPU support for atomic CAS instructions.
*   **CAS:** Performs atomic comparison and update: if memory matches expectation, update value.
*   **AtomicInteger, AtomicReference:** Implement lock-free operations using CAS loop updates.
