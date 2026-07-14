# Easy_02_SafeListWrite — Довідка

## Technique: CopyOnWriteArrayList

Avoid ConcurrentModificationException by using CopyOnWriteArrayList to iterate and modify a list concurrently.

### Code Snippet:
```java
List<String> list = new CopyOnWriteArrayList<>();
```

## Drills

1. **Easy_02_SafeListWrite_01** — Demonstrating ConcurrentModificationException inside array modification loops.\n2. **Easy_02_SafeListWrite_02** — Locking array references during traversal loops.\n3. **Easy_02_SafeListWrite_03** — Eliminating read locks using CopyOnWriteArrayList structures.\n4. **Easy_02_SafeListWrite_04** — Iterating over Collections.synchronizedList safely using manual sync blocks.\n5. **Easy_02_SafeListWrite_05** — Evaluating execution overheads of COW structures under write stress.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_02_SafeListWrite.java.
