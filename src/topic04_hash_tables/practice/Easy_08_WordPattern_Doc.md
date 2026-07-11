# Easy_08_WordPattern — Довідка

## Техніка: Two-Way Token Mapping (Bijection + Tokenization)

**Суть:** так само як в ізоморфізмі рядків, тут потрібні ДВІ мапи —
`charToWord` і `wordToChar` — щоб гарантувати взаємно однозначну
відповідність між символами патерну і словами рядка `s`. Додатково
з'являється крок токенізації: `s` треба розбити на слова (наприклад,
`s.split(" ")`) і одразу звірити кількість слів із довжиною патерну —
якщо вони не збігаються, це миттєвий `false`.

```java
String[] words = s.split(" ");
if (words.length != pattern.length()) return false;

Map<Character, String> charToWord = new HashMap<>();
Map<String, Character> wordToChar = new HashMap<>();
for (int i = 0; i < words.length; i++) {
    char c = pattern.charAt(i);
    String w = words[i];
    if (charToWord.containsKey(c) && !charToWord.get(c).equals(w)) return false;
    if (wordToChar.containsKey(w) && wordToChar.get(w) != c) return false;
    charToWord.put(c, w);
    wordToChar.put(w, c);
}
return true;
```

**Коли застосовувати:** перевірка відповідності "структури" (патерну)
довільній послідовності токенів — символів, слів, чисел. Якщо межі
токенів невідомі заздалегідь (немає роздільника) — технікою
доповнюється backtracking для перебору варіантів розбиття.

**Складність:** O(N) час для токенізованого варіанту (N — довжина
патерну/кількість слів); O(N * W^N) у гіршому випадку для варіанту без
роздільника (Word Pattern II), де W — кількість варіантів розбиття.

## Drills

1. **Easy_08_01** — лише одностороннє мапування патерн -> слово (без зворотної перевірки).
2. **Easy_08_02** — повернути саму мапу відповідності, а не boolean.
3. **Easy_08_03** — порахувати, скільки речень зі списку відповідають патерну.
4. **Easy_08_04** — узагальнення юніта патерну із символу на рядок (список токенів замість char).
5. **Easy_08_05** — капстоун: Word Pattern II — рядок s без пробілів, потрібен backtracking для пошуку розбиття.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_08_WordPattern.java.
