# Google Practice

## Інтерактивна web-платформа

У репозиторії є zero-backend тренажер для всіх 20 тем: 320 основних задач і 1 600 додаткових дрілів, документація з Mermaid/KaTeX, CodeMirror Java editor, Java 21 runner та локальне збереження прогресу.

```powershell
npm install
npm run dev
```

Production-збірка для GitHub Pages: `npm run build`. Деталі архітектури, execution runner-а й deployment: [`docs/platform-architecture.md`](docs/platform-architecture.md).

Повна локальна перевірка перед push:

```powershell
npm run verify
```

Платформа має навчальний Coach із картками розпізнавання задач, прогресивними підказками, самооцінкою впевненості та зрозумілою діагностикою невдалих тестів. Інтерактивні SVG-візуалізації охоплюють масиви, списки, stack/queue, дерева, графи, heap, DP, рекурсію та timeline потоків; на ключових кроках вони просять спочатку передбачити наступний стан.

У Settings доступні три розміри тексту інтерфейсу й документації та окремі 12–20 px для CodeMirror. Java-код у редакторі й навчальних описах має parser-based syntax highlighting. Autocomplete використовує локальний каталог усього офіційного Java 21 API, додає imports і показує сигнатури members; деталі та чесні обмеження описані в [`docs/java21-editor.md`](docs/java21-editor.md).

У Settings можна експортувати/імпортувати код і прогрес. Production-версія встановлюється як PWA та після першого завантаження дозволяє читати матеріали й писати код offline; для виконання Java потрібне підключення до Wandbox або Piston.

### Де шукати дріли

Кожна основна задача має рівно 5 коротших дрілів на ту саму техніку. Вони лежать поруч з основним Java-файлом у `src/topicNN_.../practice/`:

```text
Easy_01_HighestAltitude.java      основна задача
Easy_01_01_HighestAltitude.java  drill 1
Easy_01_02_HighestAltitude.java  drill 2
...
Easy_01_05_HighestAltitude.java  drill 5
```

У web-платформі кількість дрілів показана біля кожної задачі. Над редактором є перемикачі **TASK / D1 / D2 / D3 / D4 / D5** і точний repository path активного файлу, який можна скопіювати одним кліком.

Рівні автоматичної correctness-перевірки й актуальний аудит описані в [`docs/drill-verification.md`](docs/drill-verification.md). Compile-only перевірка не видається за успішно розв’язаний дріл.

## Навчальний посібник

Повний системний курс за всіма 20 темами — з діаграмами, інваріантами, Java-шаблонами, оцінкою складності та картами задач — доступний у [`docs/learning-guide/README.md`](docs/learning-guide/README.md).

Навчальний Java-проєкт із задачами та JUnit 5 тестами. Реалізації знаходяться в
`src/`, тести — у `test/`. Обидва каталоги вже правильно підключені в
`build.gradle`.

## Як запустити тести локально

Усі команди нижче потрібно виконувати в PowerShell із кореня проєкту.

Запуск одного тестового методу:

```powershell
.\gradlew.bat test --tests "topic01_arrays_strings.practice.Easy_02_PlusOneTest.testPlusOne"
```

Запуск одного тестового класу:

```powershell
.\gradlew.bat test --tests "topic01_arrays_strings.practice.Easy_02_PlusOneTest"
```

Запуск усієї навчальної теми, наприклад `topic01_arrays_strings`:

```powershell
.\gradlew.bat test --tests "topic01_arrays_strings.practice.*"
```

У репозиторії один Gradle-модуль `google-practice`, тому запуск усього модуля і
запуск усіх тестів проєкту — це одна команда:

```powershell
.\gradlew.bat test
```

Щоб лише перевірити компіляцію основного коду і тестів, не запускаючи assertions:

```powershell
.\gradlew.bat clean compileTestJava
```

Після запуску HTML-звіт доступний у `build/reports/tests/test/index.html`.

Більшість файлів у `src/` навмисно містять незаповнені реалізації, тому повний
запуск спочатку буде червоним. Це нормально: реалізуйте одну задачу та запускайте
її тестовий клас окремо. Коли всі рішення будуть готові, команда повного запуску
має завершитися з `BUILD SUCCESSFUL`.

Тести задач 1–16 використовують спільні сценарії з
`test/support/PracticeAssertions.java`. Там зібрані приклади, порівняння масивів,
дерев, зв'язаних списків і сценарії для stateful-структур на кшталт Trie та LRU.

## Налаштування IntelliJ IDEA

1. Встановіть JDK 21 (підійде Amazon Corretto, Temurin або Oracle JDK).
2. Закрийте поточний проєкт в IDEA.
3. На стартовому екрані виберіть **Open** і відкрийте саме кореневу папку, де
   лежить `build.gradle`. Якщо IDEA запитає спосіб імпорту, виберіть **Gradle**.
4. Відкрийте **Settings → Build, Execution, Deployment → Build Tools → Gradle**:
   - **Distribution**: `Wrapper`;
   - **Gradle JVM**: `Java 21`;
   - **Build and run using**: `Gradle`;
   - **Run tests using**: `Gradle`.
5. Натисніть кнопку **Reload All Gradle Projects** у вікні Gradle.
6. Перевірте **File → Project Structure → Project SDK**: має бути JDK 21.

Після синхронізації `src/` має позначатися як **Sources Root**, `test/` — як
**Test Sources Root**, а імпорти `org.junit.jupiter.api.*` більше не повинні
підсвічуватися червоним.

Якщо IDEA все ще показує старі помилки:

1. Видаліть модуль проєкту з вікна Gradle, не видаляючи файли з диска.
2. Відкрийте панель Gradle та виберіть **Link Gradle Project** → `build.gradle`.
3. Лише якщо повторний імпорт не допоміг: **File → Invalidate Caches… →
   Invalidate and Restart**, після перезапуску знову виконайте Gradle Reload.

Не додавайте JUnit через **Project Structure → Libraries** вручну: залежність
`org.junit.jupiter:junit-jupiter` уже описана в `build.gradle`, і Gradle керує нею
самостійно.
