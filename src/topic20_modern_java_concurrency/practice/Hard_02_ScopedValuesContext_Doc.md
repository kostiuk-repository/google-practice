# Hard_02_ScopedValuesContext — Довідка

## Technique: Scoped Values

Transmit security context down execution trees safely and lightweightly using ScopedValues.

### Code Snippet:
```java
private static final ScopedValue<String> USER = ScopedValue.newInstance();
```

## Drills

1. **Hard_02_ScopedValuesContext_01** — Declaring static final ScopedValue references.\n2. **Hard_02_ScopedValuesContext_02** — Binding context values and executing actions using ScopedValue.where().run().\n3. **Hard_02_ScopedValuesContext_03** — Reading bound values via ScopedValue.get() in sub-methods.\n4. **Hard_02_ScopedValuesContext_04** — Shadowing value bindings temporarily inside nested code blocks.\n5. **Hard_02_ScopedValuesContext_05** — Comparing memory footprints of ScopedValue and ThreadLocal when running 100,000 concurrent threads.\n
Solve drills sequentially from 01 to 05. Do not peak at Hard_02_ScopedValuesContext.java.
