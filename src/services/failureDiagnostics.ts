import type { ExecutionResult, TestResult } from '../types/runner';

export interface FailureDiagnostic {
  title: string;
  explanation: string;
  question: string;
  expected?: string;
  actual?: string;
}

const rules: Array<{ pattern: RegExp; insight: Omit<FailureDiagnostic, 'expected' | 'actual'> }> = [
  {
    pattern: /embedded-test-coverage|No embedded assertion targets this drill/i,
    insight: { title: 'Для цього дрілу ще немає correctness contract', explanation: 'Компіляція пройшла, але без однозначного прикладу або явного testDrillNN платформа не приписує рішенню правильність.', question: 'Додайте явний assertion у відповідний test class або перевірте результат вручну на прикладах та boundary cases.' },
  },
  {
    pattern: /ArrayIndexOutOfBoundsException|IndexOutOfBoundsException/i,
    insight: { title: 'Індекс вийшов за межі', explanation: 'Код звертається до позиції до перевірки меж або використовує length замість length - 1.', question: 'Що відбувається для empty input, одного елемента й останньої ітерації циклу?' },
  },
  {
    pattern: /NullPointerException/i,
    insight: { title: 'Не оброблено null', explanation: 'Один з об’єктів або вузлів використано до null-check.', question: 'Який найраніший base case може завершити цей шлях?' },
  },
  {
    pattern: /StackOverflowError/i,
    insight: { title: 'Рекурсія не наближається до base case', explanation: 'Стан повторюється або зменшується не на кожній гілці.', question: 'Який параметр строго зменшується перед кожним recursive call?' },
  },
  {
    pattern: /timeout|timed out|deadlock/i,
    insight: { title: 'Виконання не завершилося', explanation: 'Можливий нескінченний цикл, deadlock або очікування умови, яка ніколи не настає.', question: 'Що гарантовано змінюється на кожній ітерації або хто звільняє потрібний lock?' },
  },
  {
    pattern: /ConcurrentModificationException/i,
    insight: { title: 'Колекція змінюється під час обходу', explanation: 'Структурна mutation виконується через колекцію, а не через дозволений iterator/API.', question: 'Чи можна відкласти зміни або використати iterator.remove / concurrent collection?' },
  },
  {
    pattern: /expected exception/i,
    insight: { title: 'Очікуваний error path не спрацював', explanation: 'Метод прийняв невалідний стан замість явної відмови.', question: 'Яку precondition треба перевірити до основного алгоритму?' },
  },
  {
    pattern: /expected:.*but was:/i,
    insight: { title: 'Результат відрізняється від очікуваного', explanation: 'Алгоритм завершився, але порушив інваріант або неправильно обробив boundary case.', question: 'На якому найпершому кроці фактичний стан починає відрізнятися від очікуваного?' },
  },
  {
    pattern: /cannot find symbol|incompatible types|method .* cannot be applied/i,
    insight: { title: 'Помилка типів або сигнатури', explanation: 'javac не може знайти ім’я або зіставити типи аргументів і return value.', question: 'Чи збігається сигнатура методу зі starter code і чи імпортовано потрібний тип?' },
  },
];

export function diagnoseFailure(test: TestResult, result: ExecutionResult): FailureDiagnostic {
  const text = [test.message, result.compileOutput, result.stderr].filter(Boolean).join('\n');
  const match = rules.find((rule) => rule.pattern.test(text));
  const values = text.match(/expected:\s*<([^>]*)>\s*but was:\s*<([^>]*)>/i);
  return {
    ...(match?.insight ?? {
      title: 'Знайдіть перший неправильний стан',
      explanation: 'Тест виявив counterexample. Не виправляйте останній рядок навмання — відтворіть зміну стану крок за кроком.',
      question: 'Який інваріант мав залишатися правильним після кожної ітерації?',
    }),
    expected: values?.[1],
    actual: values?.[2],
  };
}
