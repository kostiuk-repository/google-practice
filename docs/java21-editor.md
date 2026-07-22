# Java 21 editor: підсвітка, imports та autocomplete

Редактор залишається повністю client-side і придатним для GitHub Pages. Для базової Java-граматики використовується Lezer parser із `@codemirror/lang-java`; той самий parser підсвічує fenced-блоки `java` у навчальних Markdown-файлах.

## Локальний Java 21 API catalog

Файл `public/java21-api.json` згенерований з офіційних search indexes Java SE 21 & JDK 21. Поточна версія містить:

- 4 719 документованих типів;
- 51 207 constructors, methods і fields;
- package та qualified name кожного типу;
- посилання на офіційну Java 21 API documentation.

Каталог завантажується лише під час першого autocomplete або import-check і після цього кешується браузером/service worker. Оновити його можна командою:

```powershell
npm run refresh:java-api
```

Джерела генератора:

- `https://docs.oracle.com/en/java/javase/21/docs/api/type-search-index.js`;
- `https://docs.oracle.com/en/java/javase/21/docs/api/member-search-index.js`;
- `https://docs.oracle.com/en/java/javase/21/docs/api/package-search-index.js`.

## Що вміє autocomplete

`Ctrl+Space` або звичайне введення пропонує:

- snippets для `for`, `foreach`, `if`, `switch`, `try`, collections та інших частих конструкцій;
- усі типи з офіційного Java 21 API з package і documentation link;
- повні qualified names усередині рядка `import`;
- members після `Type.` або змінної, тип якої можна однозначно знайти у поточному файлі;
- автоматичне додавання `import` під час вибору стандартного типу поза import-секцією.

Найчастіші packages (`java.lang`, `java.util`, `java.util.concurrent`, `java.time`, `java.io`, `java.nio`) мають вищий пріоритет, але варіанти з однаковими назвами не приховуються.

## Що перевіряється до javac

Локальний linter знаходить:

- синтаксичні error nodes Java parser-а;
- import без `;`;
- duplicate imports;
- зайвий explicit import із `java.lang`;
- type/package, якого немає в офіційному Java 21 API;
- використаний стандартний тип без import, із quick fix **Add import**;
- неоднозначну назву, наприклад типи з однаковим simple name у різних packages.

Project types і сторонні dependencies позначаються warning, а не безумовною помилкою: остаточну семантичну перевірку робить `javac` після **Run code/tests**.

## Межа zero-backend рішення

Це не повний Java Language Server. Без classpath, symbol solver і компілятора браузер не може на 100% вивести generic type, overload resolution, успадковані members або зовнішні dependencies. Тому локальні підказки прискорюють написання коду, а `javac` у Wandbox/Piston залишається джерелом істини для imports, типів і Java semantics.
