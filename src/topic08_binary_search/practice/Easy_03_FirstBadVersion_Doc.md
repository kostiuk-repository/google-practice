# Easy_03_FirstBadVersion — Довідка

## Техніка: Пошук лівої межі переходу (First Bad Version)

**Суть:** Шукаємо перше значення, для якого функція isBadVersion(v) повертає true. Оскільки всі наступні теж bad, звужуємо діапазон: якщо mid є bad, то перша погана версія лежить на mid або ліворуч (right = mid), інакше праворуч (left = mid + 1).

```java
int left = 1, right = n;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (isBadVersion(mid)) right = mid;
    else left = mid + 1;
}
return left;
```

**Коли застосовувати:** Потрібно знайти точку переходу у монотонній послідовності булевих значень (false, false, ..., true, true).

**Складність:** Часова складність: O(log N). Просторова складність: O(1).

## Drills

1. **Easy_03_FirstBadVersion_01** — First Bad Version Base Case.
2. **Easy_03_FirstBadVersion_02** — Last Good Version.
3. **Easy_03_FirstBadVersion_03** — First Bad Version In Range.
4. **Easy_03_FirstBadVersion_04** — Last Bad Version Inverted.
5. **Easy_03_FirstBadVersion_05** — First Bad Version Infinite Stream.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_03_FirstBadVersion.java.
