# Concurrency Coordination & Classical Sync Patterns - Study Notes

Thread coordination is required when one task depends on the state, results, or milestones of another task.

---

## 1. Wait, Notify, NotifyAll (Low-Level Signaling)
*   These methods belong to `java.lang.Object` and can only be invoked from within `synchronized` blocks.
*   **wait():** Releases the lock on the monitor and puts the thread in `WAITING` state.
*   **notify():** Wakes up one arbitrary thread waiting on the object's monitor.
*   **notifyAll():** Wakes up all threads waiting on the object's monitor.
*   **Spurious Wakeups:** Always invoke `wait()` inside a loop check: `while (!condition) { wait(); }`.

---

## 2. Locks & Conditions (java.util.concurrent.locks)
*   **ReentrantLock:** A flexible alternative to `synchronized` blocks. Features:
    *   *Fairness:* Queued threads get locks in FIFO order.
    *   *Interruptible Locks:* Threads waiting for locks can be interrupted.
    *   *TryLock:* Attempts lock acquisition without blocking indefinitely.
*   **Condition:** Serves as a replacement for `wait()` and `notify()`. Created via `lock.newCondition()`. Allows multiple wait-sets per lock.

---

## 3. High-Level Synchronizers
*   **Semaphore:** Manages a set of permits to restrict concurrent access.
*   **CountDownLatch:** Allows threads to wait until a set of operations completes (non-reuseable count-down mechanism).
*   **CyclicBarrier:** Forces threads to rendezvous at a barrier point. Reusable.
