# 12. Купи та сортування

[← Індекс](README.md) · Код: [`src/topic12_heaps_sorting`](../../src/topic12_heaps_sorting)

## 1. Чому не завжди треба сортувати все

Сортування дає повний порядок за `O(n log n)`. Але якщо потрібно лише:

- k-й найбільший;
- top k;
- найменший серед поточних кандидатів;
- динамічний median;
- наступна подія за priority;

повний порядок містить зайву інформацію. Heap підтримує лише найважливіший край partial order.

## 2. Binary heap усередині масиву

Min-heap має властивість `parent <= children`. Він часто зберігається в масиві:

```text
tree:             2
                /   \
               5     3
              / \   /
             9   7  8

array: [2,5,3,9,7,8]
```

Для індексу `i`:

- parent `(i-1)/2`;
- left `2*i+1`;
- right `2*i+2`.

Insert додає в кінець і sift-up — `O(log n)`. Poll міняє root з останнім, видаляє хвіст і sift-down — `O(log n)`. Peek — `O(1)`. Побудова heap bottom-up — `O(n)`, хоча n окремих inserts дали б `O(n log n)`.

Java `PriorityQueue` є min-heap:

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Comparator.reverseOrder());
```

Для об’єктів comparator має визначати потрібний priority. Не пишіть `(a,b)->b.value-a.value`: subtraction може overflow; використовуйте `Integer.compare(b.value,a.value)`.

## 3. Kth largest і правило «heap протилежного краю»

Щоб зберігати k найбільших, використовуємо **min-heap** розміру k. Чому не max-heap? Треба швидко викидати найменший серед поточних переможців.

```text
nums=[3,2,1,5,6,4], k=2

add 3: [3]
add 2: [2,3]
add 1: [1,3,2] → remove 1 → [2,3]
add 5: [2,3,5] → remove 2 → [3,5]
add 6: ... remove 3 → [5,6]
add 4: ... remove 4 → [5,6]

heap root=5 → 2-й largest
```

Кожен елемент робить `O(log k)`, разом `O(n log k)`, memory `O(k)`.

Для k найменших — max-heap size k. Корисна фраза: **вершина має бути елементом, який ми готові викинути наступним**.

## 4. Top K Frequent

Спершу frequency map `value→count`, потім:

- min-heap size k за frequency: `O(n log k)`;
- bucket array, де index=frequency: `O(n)` time і `O(n)` memory;
- sort unique entries: `O(u log u)`.

Вибір залежить від constraints, бажаної простоти й tie rules. Heap не зобов’язаний повертати top k у відсортованому порядку; якщо output order важливий, треба poll у правильному порядку або досортувати k результатів.

## 5. K Closest Points

Відстані порівнюються за квадратом `x*x+y*y`; корінь не потрібен, бо sqrt монотонний. Для великих координат використовуйте `long`.

Підходи:

- max-heap size k — `O(n log k)`, не змінює input;
- sort усіх — `O(n log n)`, найпростіше;
- quickselect — average `O(n)`, in-place, worst `O(n²)` без захисту.

На співбесіді спершу запропонуйте надійний heap, потім обговоріть quickselect як trade-off.

## 6. Last Stone Weight як симуляція priority

На кожному кроці потрібні два найбільших — max-heap. Poll `y`, poll `x`; якщо різні, додати `y-x`. Heap тут не оптимізує статичний top k, а підтримує динамічний набір після кожної події.

Сигнал: умова буквально повторює «кожного разу вибрати найменший/найбільший, змінити й повернути результат».

## 7. K-way merge

Є k відсортованих джерел. Heap містить по одному **поточному** елементу з кожного. Poll global minimum, а з того самого джерела додати наступний.

```text
A: 1,4,7
B: 2,5
C: 3,6

heap starts: 1(A),2(B),3(C)
poll 1 → add 4(A)
poll 2 → add 5(B)
poll 3 → add 6(C)
...
```

Heap size не перевищує k, для N total elements час `O(N log k)`.

### Smallest Range Covering K Lists

Heap дає поточний minimum, окрема змінна зберігає maximum серед k кандидатів. Поточний range `[min,max]` покриває по одному елементу кожного list. Щоб потенційно звузити, можна просунути лише list, який дав minimum. Коли один list закінчився, повного покриття більше не буде.

## 8. Median from Data Stream: два heaps

Розділіть числа на дві половини:

- `lower` — max-heap нижчої половини;
- `upper` — min-heap верхньої;
- кожне lower value ≤ кожного upper;
- розміри відрізняються не більше ніж на 1.

При insert число спочатку потрапляє у відповідну половину, потім вершина переноситься для balance.

```text
stream: 5 → lower=[5], median=5
add 2  → lower=[2], upper=[5], median=3.5
add 10 → upper=[5,10], lower=[2], median=5
add 4  → lower=[4,2], upper=[5,10], median=4.5
```

Median read `O(1)`, insert `O(log n)`, memory `O(n)`. Для парної кількості `(a+b)/2.0`; додавайте як `long` або діліть окремо, щоб уникнути int overflow.

## 9. Sorting: яку гарантію купуємо

Сортування часто перетворює глобальну задачу на локальну:

- дублікати стають поруч;
- intervals можна merge одним scan;
- two pointers отримують монотонність;
- greedy отримує правильний порядок рішень.

### Основні алгоритми

| Алгоритм | Час | Extra memory | Stable | Коментар |
|---|---|---|---|---|
| insertion sort | `O(n²)` | `O(1)` | так | добрий для малих/майже sorted |
| merge sort | `O(n log n)` | `O(n)` | так | гарантований час |
| quicksort | average `O(n log n)`, worst `O(n²)` | stack average `O(log n)` | ні | швидкий in-place на практиці |
| heap sort | `O(n log n)` | `O(1)` | ні | гарантований, гірша locality |
| counting sort | `O(n+range)` | `O(range)` | може бути | лише малий integer range |

У Java `Arrays.sort(int[])` та `Arrays.sort(Object[])` мають різні реалізації/властивості; не покладайтеся на stability primitive sort, коли це не частина контракту.

## 10. Merge Intervals

Після сортування за start поточний interval може перекриватися лише з останнім merged interval.

```text
input sorted: [1,3], [2,6], [8,10], [9,12]

[1,3] + [2,6]  → [1,6]
[8,10] окремо  → [1,6], [8,10]
[9,12] overlap → [1,6], [8,12]
```

Якщо `next.start <= current.end`, overlap; `current.end=max(...)`. Інакше current завершений. Чи `[1,2]` і `[2,3]` зливаються, залежить від того, inclusive межі чи напіввідкриті — це треба уточнити.

## 11. Task Scheduler

Найчастіша задача з frequency `fMax` створює `fMax-1` проміжків між своїми копіями. Кожен проміжок має містити принаймні `cooldown` позицій:

```text
A _ _ A _ _ A   для A×3, n=2
```

Lower bound skeleton length:

```text
(fMax-1)*(n+1) + countOfTasksWithMaxFreq
```

Якщо інших tasks багато, idle не потрібні, і відповідь не менша за total tasks. Тому max із двох.

Heap simulation за rounds теж коректна й легше адаптується до складніших правил, але формула швидша та потребує доказу.

## 12. IPO: два різні порядки

Projects мають required capital і profit. Треба в кожен із k кроків вибрати найбільший profit серед доступних.

1. Відсортувати projects за capital.
2. Поки capital requirement ≤ current capital, додавати profit у max-heap.
3. Якщо heap empty — більше нічого зробити не можна.
4. Poll max profit і збільшити capital.

Sort відповідає на «що вже стало доступним», heap — «що найкраще серед доступного». Така комбінація часто зустрічається в scheduling.

## 13. Як вибрати між sort, heap і quickselect

| Потреба | Кандидат |
|---|---|
| увесь результат у порядку | sort |
| top k, k набагато менше n | heap size k |
| один k-th у mutable array | quickselect |
| online inserts + repeated min/max | heap |
| repeated median | two heaps |
| merge k sorted streams | heap of heads |
| integer frequencies в малому діапазоні | bucket/counting |

Не заявляйте heap автоматично через слово «largest». Якщо потрібен лише один максимум у статичному масиві, звичайний scan `O(n)` простіший.

## Heap як частковий порядок

Priority queue потрібна, коли багато разів треба найменший/найбільший поточний елемент, але повний порядок зайвий. Java `PriorityQueue` — min-heap; max-heap створюйте через comparator, уникаючи `b-a` через overflow.

```mermaid
flowchart TD
    A[Потрібен порядок] --> B{Усі елементи відсортувати?}
    B -->|так| C[sorting O(n log n)]
    B -->|ні, top k| D[heap size k: O(n log k)]
    B -->|потокова медіана| E[two heaps]
    B -->|k sorted streams| F[k-way merge]
```

## Top K

Для k найбільших тримайте min-heap розміру `k`: вершина — найслабший із переможців. Після додавання понад `k` видаліть minimum. Час `O(n log k)`, пам’ять `O(k)`. Quickselect дає очікуване `O(n)`, але складніший і змінює масив.

## K-way merge

Heap містить по одному поточному кандидату з кожного sorted source. Після вилучення елемента додайте його наступника. Це основа Merge K Lists і Smallest Range: додатково відстежуйте поточний максимум, а мінімум дає heap.

## Two heaps для медіани

Max-heap `lower` і min-heap `upper`; усі `lower ≤ upper`, різниця розмірів ≤ 1. Після вставки відновіть порядок і баланс. Медіана — вершина більшої купи або середнє вершин; суму робіть у `long`/`double` без overflow.

## Interval sorting

Merge intervals: сортування за start, підтримка останнього об’єднаного інтервалу. Якщо `next.start ≤ current.end`, розширити end; інакше завершити current. Потрібно узгодити, чи дотичні межі перекриваються.

## Greedy scheduling

Task Scheduler: частоти задач задають нижню межу `(maxFreq-1)·(n+1)+countMax`; відповідь — максимум цієї межі та загальної кількості задач. Heap simulation потрібна, якщо треба відтворити розклад або правила складніші.

IPO використовує два порядки: проєкти за потрібним капіталом і max-heap прибутків доступних проєктів. На кожному кроці додайте всі доступні, виберіть найвигідніший.

## Сортування

- Stable: рівні ключі зберігають порядок.
- In-place не означає `O(1)` stack memory для recursive quicksort.
- Merge sort: гарантовано `O(n log n)`, додаткова пам’ять `O(n)`.
- Quicksort: average `O(n log n)`, worst `O(n²)`; random pivot знижує ризик.
- Counting/bucket придатні, коли діапазон/частоти обмежені.

## Карта задач

| Метод | Задачі |
|---|---|
| Базовий heap | KthLargest, LastStoneWeight, RelativeRanks, HalveSum, FillCups, TakeGifts |
| Sort/greedy | MakeArrayZero, DeleteGreatestValue, MaxProduct, SortArray, MergeIntervals, TaskScheduler |
| Top K | KthLargestElement, TopKFrequent, KClosest |
| K-way/range | SmallestRange |
| Two heaps | MedianFromDataStream |
| Availability + heap | IPO |

## Пастки

- Переплутати min-heap і max-heap для top K.
- Comparator `b-a` переповнюється; використовуйте `Integer.compare(b,a)`.
- Вважати heap iteration відсортованою.
- Зберігати всі `n`, коли достатньо heap `k`.
- Не визначити tie-breaker для відтворюваного результату.
