# Medium_01_PrintFooBarAlternately — Довідка

## Technique: Alternating Thread Signaling

Design a class that coordinates two threads printing 'foo' and 'bar' alternately, producing the pattern: 'foobarfoobar...'.

### Code Snippet:
```java
private Semaphore s1 = new Semaphore(1);
```

## Drills

1. **Medium_01_PrintFooBarAlternately_01** — Alternating output using synchronized wait and notify with a state flag.\n2. **Medium_01_PrintFooBarAlternately_02** — Alternating output using two Semaphores (fooSem starting with 1 permit, barSem starting with 0).\n3. **Medium_01_PrintFooBarAlternately_03** — Alternating output using ReentrantLock and Condition await/signal.\n4. **Medium_01_PrintFooBarAlternately_04** — Aligning thread phases using a CyclicBarrier.\n5. **Medium_01_PrintFooBarAlternately_05** — Exchanging execution tokens between threads using two BlockingQueues.\n
Solve drills sequentially from 01 to 05. Do not peak at Medium_01_PrintFooBarAlternately.java.
