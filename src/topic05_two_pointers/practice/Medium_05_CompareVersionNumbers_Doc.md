# Medium_05_CompareVersionNumbers — Довідка

## Техніка: Паралельний посимвольний аналіз (Parallel Token Parsing)

**Суть:** Проходимо по обох рядках за допомогою двох вказівників. Виділяємо числові значення ревізій між крапками, порівнюємо їх. Якщо один рядок закінчився, його ревізія вважається рівною 0.

### Концептуальний код
```java
int i = 0, j = 0;
while (i < v1.length() || j < v2.length()) {
    int num1 = 0, num2 = 0;
    while (i < v1.length() && v1.charAt(i) != '.') {
        num1 = num1 * 10 + (v1.charAt(i) - '0');
        i++;
    }
    while (j < v2.length() && v2.charAt(j) != '.') {
        num2 = num2 * 10 + (v2.charAt(j) - '0');
        j++;
    }
    if (num1 < num2) return -1;
    if (num1 > num2) return 1;
    i++; j++;
}
```

**Коли застосовувати:**
- Порівняння ієрархічних версій або кодів без виділення додаткової пам'яті на масиви.

**Складність:**
- **Часова:** O(N + M) — по одному проходу по кожному рядку.
- **Просторова:** O(1) — робота безпосередньо з індексами.

## Вправи (Drills)
1. **01 — Compare Single Revision Parts**: Compare two single revision string parts (e.g. "001" and "1"). Return 0 if equal, -1 if part1 < part2, 1 if part1 > part2.
2. **02 — Count Revision Segments**: Count how many revision segments (separated by '.') are present in a version string.
3. **03 — Get Revision Segment at Index**: Get the index-th revision segment as a string (0-indexed). Return "0" if the index is out of bounds.
4. **04 — Compare At Most 3 Revisions**: Compare version strings that are guaranteed to have at most 3 segments.
5. **05 — Compare Versions with Pre-release Tags**: Compare versions that may contain pre-release tags like "1.0.0-alpha" vs "1.0.0-beta". Revisions after '-' are compared alphabetically.

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_05_CompareVersionNumbers.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Medium_05_CompareVersionNumbers.java).
