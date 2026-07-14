# Multithreading Basics & Thread Safety - Study Notes

Multithreading is the ability of a CPU to execute multiple threads of execution concurrently within a single process.

---

## 1. Thread vs Process
*   **Process:** An execution environment that has its own private address space, memory segment (Heap, Metaspace), and system resources.
*   **Thread:** The smallest unit of execution within a process. All threads of a process share its Heap and system resources, but each thread has its own private Stack, Program Counter (PC), and local variables.

---

## 2. Thread Creation in Java
1.  **Extending Class Thread:**
    ```java
    class MyThread extends Thread {
        @Override
        public void run() {
            // Task implementation
        }
    }
    new MyThread().start();
    ```
2.  **Implementing Runnable (Recommended):**
    ```java
    Runnable task = () -> {
        // Task implementation
    };
    new Thread(task).start();
    ```
3.  **Implementing Callable<V> (For tasks returning results):**
    ```java
    Callable<Integer> task = () -> 42;
    // Typically executed via ExecutorService
    ```

---

## 3. Java Memory Model (JMM) & Happens-Before
The JMM defines the rules of visibility, atomicity, and instruction ordering across threads.
*   **Volatile:** The `volatile` keyword guarantees:
    1.  **Visibility:** Reads and writes to a volatile variable are done directly to/from main memory (RAM), bypassing CPU registers and caches.
    2.  **Instruction Reordering Prevention:** Restricts the compiler and CPU from reordering memory operations around volatile reads/writes.
*   **Happens-Before Relationship:** A set of rules guaranteeing that memory writes by one thread are visible to another thread.

---

## 4. Synchronized (Intrinsic Locks)
*   **Synchronized Blocks and Methods:** Lock the monitor associated with an object. Only one thread can execute code synchronized on the same monitor at a time.
*   Every Java object has an intrinsic monitor (stored in its object header Mark Word).
