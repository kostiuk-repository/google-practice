export interface LearningPattern {
  tool: string;
  signals: string[];
  avoidWhen: string[];
  complexity: string;
  hints: string[];
}

const patterns: Record<string, LearningPattern> = {
  topic01_arrays_strings: {
    tool: 'Linear scan / in-place array processing',
    signals: ['Потрібен один прохід', 'Відповідь для i залежить від сусідніх або вже пройдених значень', 'Умова згадує in-place або O(1) extra space'],
    avoidWhen: ['Потрібен швидкий пошук довільних пар — перевірте hash map', 'Дані природно утворюють зв’язки — можливо, це graph'],
    complexity: 'Зазвичай O(n) time · O(1) або O(n) space',
    hints: ['Назвіть значення кожної змінної стану одним реченням.', 'Сформулюйте, що вже правильно після обробки індексів [0, i).', 'Перевірте empty input і останній валідний індекс length - 1.', 'Запишіть один цикл, який оновлює стан лише з поточного елемента.'],
  },
  topic02_linked_lists: {
    tool: 'Pointer rewiring / slow & fast pointers',
    signals: ['Вузли мають next', 'Треба змінити порядок без масиву', 'Пошук середини, циклу або k-го вузла'],
    avoidWhen: ['Потрібен випадковий доступ за індексом', 'Значення важливіші за зв’язки між вузлами'],
    complexity: 'Зазвичай O(n) time · O(1) space',
    hints: ['Намалюйте next до і після однієї операції.', 'Збережіть next до того, як переписувати посилання.', 'Перевірте null, один вузол і два вузли.', 'Сформулюйте, яка частина списку вже перебудована.'],
  },
  topic03_stacks_queues: {
    tool: 'Stack / queue / deque',
    signals: ['Потрібен останній незакритий елемент', 'Порядок LIFO або FIFO', 'Next greater, дужки, рівні BFS'],
    avoidWhen: ['Потрібен довільний пошук за ключем', 'Достатньо двох числових pointers'],
    complexity: 'O(n) time · O(n) space',
    hints: ['Визначте, що саме означає один елемент структури.', 'Запишіть умову pop/poll до додавання нового елемента.', 'Не використовуйте Stack у новому Java-коді — краще ArrayDeque.', 'Перевірте порожню структуру перед peek/pop.'],
  },
  topic04_hash_tables: {
    tool: 'HashMap / HashSet frequency or lookup',
    signals: ['Потрібен lookup за O(1)', 'Пари, дублікати, частоти', 'Треба пам’ятати вже побачене'],
    avoidWhen: ['Потрібен відсортований порядок', 'Ключі мають малий щільний числовий діапазон — масив може бути простішим'],
    complexity: 'У середньому O(n) time · O(n) space',
    hints: ['Сформулюйте: key — це …, value — це …', 'Вирішіть, перевіряти complement до чи після insert.', 'Використайте getOrDefault/merge для частот.', 'Перевірте дублікати й повторне використання того самого індексу.'],
  },
  topic05_two_pointers: {
    tool: 'Two pointers',
    signals: ['Sorted array або симетрія', 'Пара елементів', 'In-place read/write scan'],
    avoidWhen: ['Рух pointer-а не дозволяє безпечно відкинути кандидатів', 'Несортовані дані й потрібні початкові індекси'],
    complexity: 'O(n) time · O(1) space',
    hints: ['Виберіть семантику left і right.', 'Для кожного руху поясніть, які кандидати відкидаються.', 'Запишіть умову зупинки до тіла циклу.', 'Перевірте зустріч pointers і дублікати.'],
  },
  topic06_sliding_window: {
    tool: 'Sliding window',
    signals: ['Неперервний subarray/substring', 'Найдовший/найкоротший валідний фрагмент', 'Кожен елемент входить і виходить один раз'],
    avoidWhen: ['Фрагмент не є неперервним', 'Від’ємні значення руйнують потрібну монотонність суми'],
    complexity: 'O(n) time · O(k) або O(1) space',
    hints: ['Визначте точну умову валідності вікна.', 'Right розширює; while має відновлювати валідність.', 'Оновлюйте відповідь у правильний момент: до або після shrink.', 'Перевірте empty window і k=0.'],
  },
  topic07_prefix_sums: {
    tool: 'Prefix sum / prefix state',
    signals: ['Багато range queries', 'Сума/баланс на префіксі', 'Subarray condition можна виразити різницею префіксів'],
    avoidWhen: ['Масив часто змінюється — потрібні Fenwick/segment tree', 'Потрібен лише один простий scan'],
    complexity: 'O(n) preprocessing · O(1) query · O(n) space',
    hints: ['Визначте prefix[0] як порожній префікс.', 'Запишіть формулу range через два prefix значення.', 'Для subarray sum зберігайте раніше побачені prefix sums.', 'Перевірте межі left=0 і right=n-1.'],
  },
  topic08_binary_search: {
    tool: 'Binary search on a monotonic space',
    signals: ['Sorted data', 'Монотонний predicate F…F T…T', 'Minimum feasible або maximum feasible'],
    avoidWhen: ['Немає монотонності', 'Лінійний scan простіший і n мале без повторних запитів'],
    complexity: 'O(log n) time · O(1) space',
    hints: ['Визначте, що саме лежить у [lo, hi].', 'Оберіть inclusive або half-open інтервал і не змішуйте їх.', 'Сформулюйте половину, яку можна гарантовано відкинути.', 'Обчислюйте mid як lo + (hi - lo) / 2.'],
  },
  topic09_trees: {
    tool: 'DFS / BFS on a tree',
    signals: ['Ієрархія parent-child', 'Відповідь залежить від піддерев', 'Рівні або найкоротша відстань від root'],
    avoidWhen: ['Є довільні цикли — це graph', 'Потрібен lookup за ключем без обходу'],
    complexity: 'O(n) time · O(h) DFS або O(w) BFS space',
    hints: ['Сформулюйте значення, яке повертає рекурсія для одного вузла.', 'Base case майже завжди починається з node == null.', 'Розділіть local contribution і результати дітей.', 'Для level order використайте queue з розміром поточного рівня.'],
  },
  topic11_recursion_backtracking: {
    tool: 'Recursion / backtracking state tree',
    signals: ['Усі комбінації/перестановки', 'Вибір → дослідити → скасувати', 'Задача природно ділиться на менші копії'],
    avoidWhen: ['Є багато повторних підзадач — додайте memo/DP', 'Глибина може переповнити stack'],
    complexity: 'Залежить від кількості станів; часто експоненційна',
    hints: ['Назвіть параметри, що повністю описують стан.', 'Запишіть base case до recursive case.', 'Після recursive call скасуйте mutation.', 'Відсікайте гілку одразу, коли вона вже не може дати відповідь.'],
  },
  topic10_dfs_bfs: {
    tool: 'Graph DFS / BFS / topological traversal',
    signals: ['Довільні зв’язки', 'Reachability, компоненти, найкоротший шлях', 'Prerequisites або dependencies'],
    avoidWhen: ['Структура гарантовано дерево без циклів', 'Потрібна weighted shortest path — простого BFS недостатньо'],
    complexity: 'O(V + E) time · O(V) space',
    hints: ['Визначте вершини та ребра до написання коду.', 'Позначайте visited до enqueue/recursive call.', 'Для shortest unweighted path використайте BFS.', 'Перевірте disconnected graph і self-loop.'],
  },
  topic12_heaps_sorting: {
    tool: 'Heap / priority queue / sorting',
    signals: ['Потрібні top-k або поточний minimum/maximum', 'Порядок спрощує лінійний scan', 'Потік значень, де повне сортування зайве'],
    avoidWhen: ['Потрібен lookup довільного елемента', 'Існує O(n) bucket/counting рішення з малим діапазоном'],
    complexity: 'Heap O(log k) operation · sorting O(n log n)',
    hints: ['Визначте, який елемент має бути на вершині heap.', 'Для top-k часто зберігайте heap лише розміру k.', 'Перевірте comparator і tie-breaker.', 'Не обчислюйте comparator через subtraction через overflow.'],
  },
  topic13_advanced_graphs: {
    tool: 'Dijkstra / topological order / weighted graph algorithms',
    signals: ['Weighted shortest path', 'Dependencies з напрямком', 'Потрібен порядок або minimum frontier'],
    avoidWhen: ['Усі ваги однакові — вистачить BFS', 'Є negative edges — звичайний Dijkstra некоректний'],
    complexity: 'Часто O((V + E) log V)',
    hints: ['Визначте directed/undirected і значення ваги.', 'Для Dijkstra з heap пропускайте stale entries.', 'Для topological order рахуйте indegree.', 'Перевірте disconnected vertices, cycle і unreachable target.'],
  },
  topic14_dynamic_programming: {
    tool: 'Dynamic programming',
    signals: ['Повторні підзадачі', 'Вибір із оптимальними substructure', 'Count/min/max для prefix, index або capacity'],
    avoidWhen: ['Стан ніколи не повторюється', 'Greedy choice має короткий доказ'],
    complexity: 'Кількість станів × переходи',
    hints: ['Сформулюйте dp[state] звичайним реченням.', 'Запишіть base cases до transition.', 'Перелічіть усі попередні стани, з яких приходимо.', 'Оптимізуйте пам’ять лише після правильної table-версії.'],
  },
  topic15_advanced_data_structures: {
    tool: 'Trie / Union-Find / Fenwick / Segment Tree',
    signals: ['Prefix queries', 'Динамічні компоненти', 'Багато update + range query'],
    avoidWhen: ['Достатньо HashMap або prefix sums', 'Немає повторних операцій, що окупають структуру'],
    complexity: 'Залежить від структури; часто O(log n) operation',
    hints: ['Спочатку випишіть API структури.', 'Визначте інваріант внутрішнього масиву/вузлів.', 'Перевірте index convention: 0-based назовні, часто 1-based всередині.', 'Протестуйте послідовність операцій, а не лише одну.'],
  },
  topic16_bit_manipulation_math: {
    tool: 'Bit operations / mathematical invariant',
    signals: ['Parity, powers of two, XOR cancellation', 'Обмежена пам’ять', 'Потрібні окремі біти'],
    avoidWhen: ['Бітовий трюк робить код менш доведеним без виграшу', 'Можливе signed shifting непередбачене умовою'],
    complexity: 'O(n) або O(number of bits) · O(1) space',
    hints: ['Запишіть числа у двійковому вигляді на малому прикладі.', 'Пригадайте x ^ x = 0 і x ^ 0 = x.', 'Для power of two перевірте n > 0.', 'Уточніть signed/unsigned shift і можливий overflow.'],
  },
  topic17_multithreading_basics: {
    tool: 'Thread lifecycle / happens-before coordination',
    signals: ['Кілька потоків змінюють або спостерігають стан', 'Потрібен порядок виконання', 'Race condition або visibility'],
    avoidWhen: ['Задачу простіше виконати послідовно', 'Busy-wait без явної вимоги'],
    complexity: 'Оцінюйте safety, liveness і contention, не лише Big-O',
    hints: ['Назвіть shared mutable state.', 'Запишіть необхідний happens-before зв’язок.', 'Перевірте atomicity окремо від visibility.', 'Тестуйте багато повторів і timeout.'],
  },
  topic18_concurrency_coordination: {
    tool: 'synchronized / Lock / condition',
    signals: ['Критична секція з інваріантом', 'Кілька умов очікування', 'Потрібен контроль lock acquisition'],
    avoidWhen: ['Достатньо immutable state або atomic variable', 'Lock утримується під час повільного I/O'],
    complexity: 'Правильність + contention + deadlock risk',
    hints: ['Зафіксуйте, який lock захищає кожне поле.', 'Тримайте критичну секцію мінімальною.', 'await завжди перевіряйте у while.', 'Перевірте єдиний глобальний порядок кількох locks.'],
  },
  topic19_concurrent_collections_executors: {
    tool: 'Concurrent collections / ExecutorService',
    signals: ['Спільна колекція', 'Пул задач замість ручних threads', 'Потрібен Future або bounded parallelism'],
    avoidWhen: ['Зовнішня compound operation все одно не atomic', 'Executor не закривається'],
    complexity: 'Оцінюйте throughput, queue growth і blocking',
    hints: ['Оберіть atomic API на кшталт compute/merge.', 'Відділіть task від policy виконання.', 'Завжди визначте shutdown strategy.', 'Не виконуйте blocking work у невідповідному pool.'],
  },
  topic20_modern_java_concurrency: {
    tool: 'CompletableFuture / virtual threads / structured concurrency',
    signals: ['Багато незалежних I/O операцій', 'Композиція async stages', 'Потрібне структуроване lifetime management'],
    avoidWhen: ['CPU-bound робота без обмеження parallelism', 'Async chain приховує простий послідовний flow'],
    complexity: 'Оцінюйте concurrency limit, cancellation і failure propagation',
    hints: ['Визначте, де саме виникає concurrency.', 'Не блокуйте common pool довгим I/O без усвідомленої policy.', 'Продумайте exception і cancellation path.', 'Для virtual threads не додавайте штучний thread pool без потреби.'],
  },
};

export function getLearningPattern(topicId: string) {
  return patterns[topicId] ?? patterns.topic01_arrays_strings;
}
