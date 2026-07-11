# Easy_10_DesignHashMap — Довідка

## Техніка: Separate Chaining з парами ключ-значення

**Суть:** так само як у `Design HashSet`, використовуємо масив бакетів
зі зв'язними списками, але тепер кожен елемент списку — не просто
ключ, а вузол/пара `(key, value)`. `put` шукає вузол з таким ключем у
відповідному бакеті: якщо знайдено — оновлює значення на місці; якщо
ні — додає новий вузол у кінець списку бакета.

```java
static class Entry {
    int key, value;
    Entry(int k, int v) { key = k; value = v; }
}

private List<Entry>[] buckets = new LinkedList[SIZE];

public void put(int key, int value) {
    int idx = hash(key);
    if (buckets[idx] == null) buckets[idx] = new LinkedList<>();
    for (Entry e : buckets[idx]) {
        if (e.key == key) { e.value = value; return; } // update in place
    }
    buckets[idx].add(new Entry(key, value)); // insert new
}
```

**Коли застосовувати:** будь-яка задача "реалізуй словник/мапу з
нуля" — розуміння внутрішньої будови `HashMap`, важливе для пояснення
складності `O(1)` середнього часу на співбесіді.

**Складність:** O(1) середній час для put/get/remove; O(N) у гіршому
випадку при поганому розподілі хешів.

## Drills

1. **Easy_10_01** — мінімальна версія лише з put/get (без remove) — ізольований під-крок.
2. **Easy_10_02** — додавання getOrDefault(key, default) — параметризація значення-заглушки.
3. **Easy_10_03** — containsKey + keySet() — агрегація по всіх бакетах.
4. **Easy_10_04** — узагальнення типів ключа/значення з int на String.
5. **Easy_10_05** — капстоун: атомарна операція incrementOrInsert за один прохід по бакету.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_DesignHashMap.java.
