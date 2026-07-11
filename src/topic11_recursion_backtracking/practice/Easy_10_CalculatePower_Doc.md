# Easy_10_CalculatePower — Довідка

## Техніка: Binary Exponentiation

**Суть:** Швидке піднесення до степеня за O(log n) шляхом рекурсивного ділення показника степеня навпіл: `x^n = (x^(n/2))^2` для парних n, та `x * x^(n-1)` для непарних.

```java
double quickPow(double x, long n) {
    if (n == 0) return 1.0;
    if (n < 0) return 1.0 / quickPow(x, -n);
    double half = quickPow(x, n / 2);
    if (n % 2 == 0) return half * half;
    return x * half * half;
}
```

**Коли застосовувати:** Ефективне обчислення великих степенів чисел або матриць, а також у комбінаториці за модулем.

**Складність:** O(log n) час та пам'ять.

## Drills

1. **Easy_10_01** — Calculate Power Modulo M: Рекурсивно обчисліть (base^exp) % m, використовуючи швидке піднесення до степеня.
2. **Easy_10_02** — Recursive Multiplication: Рекурсивно помножте два додатні числа a та b, використовуючи тільки додавання та побітові зсуви.
3. **Easy_10_03** — Count Steps to Reduce to Zero: Поверніть кількість кроків для зменшення числа до нуля. Якщо парне — поділіть на 2, якщо непарне — відніміть 1 (рекурсивно).
4. **Easy_10_04** — Matrix Exponentiation: Дано матрицю 2x2. Обчисліть matrix^n за допомогою рекурсивного швидкого піднесення.
5. **Easy_10_05** — Double Base Exponentiation: Обчисліть x^n, де n може бути від'ємним, обробляючи можливе переповнення типу при n = Integer.MIN_VALUE.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_CalculatePower.java.
