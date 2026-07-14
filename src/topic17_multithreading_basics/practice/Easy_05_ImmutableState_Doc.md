# Easy_05_ImmutableState — Довідка

## Technique: Lock-Free Safety (Immutability)

Design an immutable state container class that can be safely shared across threads without locks.

### Code Snippet:
```java
this.tags = List.copyOf(tags);
```

## Drills

1. **Easy_05_ImmutableState_01** — Showing data exposure issues when a class exposes public mutable fields.\n2. **Easy_05_ImmutableState_02** — Marking all fields final and private to protect them from modification.\n3. **Easy_05_ImmutableState_03** — Using deep copying or ImmutableList.copyOf() to prevent modification of nested collections.\n4. **Easy_05_ImmutableState_04** — Using Java Records (introduced in Java 16) to write clean, default immutable structures.\n5. **Easy_05_ImmutableState_05** — Writing a safe read-only wrapper around a mutable state class.\n
Solve drills sequentially from 01 to 05. Do not peak at Easy_05_ImmutableState.java.
