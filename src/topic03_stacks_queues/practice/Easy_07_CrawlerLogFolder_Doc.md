# Easy_07_CrawlerLogFolder — Довідка

## Техніка: Симуляція глибини вкладеності (Depth Tracking)

**Суть:** Замість повної структури стеку ми можемо використовувати простий лічильник глибини, який збільшується при переході в підпапку і зменшується (не нижче 0) при переході на рівень вгору. Це мінімізує використання пам'яті до O(1).

```java
int depth = 0;
for (String log : logs) {
    if (log.equals("../")) {
        depth = Math.max(0, depth - 1);
    } else if (!log.equals("./")) {
        depth++;
    }
}
```

**Коли застосовувати:** Коли нам потрібно лише відстежувати глибину ієрархії без збереження назв пройдених вузлів.

**Складність:** Часова: O(N), Просторова: O(1).

## Drills

1. **Easy_07_01** — Simple logs without './'.
2. **Easy_07_02** — Reconstruct canonical path.
3. **Easy_07_03** — Track maximum depth reached.
4. **Easy_07_04** — Validate path safety (never go above root).
5. **Easy_07_05** — Double jump optimization (../../).

Rozв'язуй у порядку 01 → 05, не підглядаючи в Easy_07_CrawlerLogFolder.java.
