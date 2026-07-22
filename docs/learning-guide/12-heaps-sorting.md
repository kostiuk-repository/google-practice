# 12. Купи та сортування

[← Індекс](README.md) · Код: [`src/topic12_heaps_sorting`](../../src/topic12_heaps_sorting)

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

