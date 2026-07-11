# Hard_02_SubarraysWithKDifferent — Довідка

## Техніка: Метод двох вказівників «Точно K = Щонайбільше K - Щонайбільше K-1» (Exactly K = At Most K - At Most K-1)

**Суть:**
Знайти кількість підмасивів, що містять **точно** $K$ унікальних елементів, безпосередньо за допомогою одного вікна, що ковзає (sliding window), складно, тому що розширення та звуження вікна не мають простого монотонного зв'язку з умовою "точно $K$".

Проте задача **«знайти кількість підмасивів із щонайбільше $K$ унікальними елементами»** є монотонною і легко вирішується методом ковзного вікна за $O(N)$. 
Для будь-якого вікна `[left, right]` із $\le K$ унікальними елементами, кількість підмасивів, які закінчуються в точці `right` і задовольняють цю умову, дорівнює:
$$\text{count} = \text{right} - \text{left} + 1$$

Математично:
$$\text{Exactly}(K) = \text{AtMost}(K) - \text{AtMost}(K - 1)$$

Отже, запустивши функцію `atMost(K)` та `atMost(K - 1)`, ми можемо знайти точну кількість підмасивів за два проходи ковзного вікна, тобто за лінійний час $O(N)$.

```java
// Загальний шаблон для підрахунку підмасивів із щонайбільше K унікальними елементами
public int atMost(int[] nums, int k) {
    Map<Integer, Integer> counts = new HashMap<>();
    int left = 0, total = 0;
    for (int right = 0; right < nums.length; right++) {
        counts.put(nums[right], counts.getOrDefault(nums[right], 0) + 1);
        while (counts.size() > k) {
            counts.put(nums[left], counts.get(nums[left]) - 1);
            if (counts.get(nums[left]) == 0) {
                counts.remove(nums[left]);
            }
            left++;
        }
        total += right - left + 1;
    }
    return total;
}
```

**Коли застосовувати:**
- У задачах на підрахунок підмасивів або підрядків із точним обмеженням на кількість унікальних елементів, символів, або певних сум (наприклад, підмасиви з точно $K$ парними числами).

**Складність:**
- **Часова складність:** $O(N)$ — два проходи вікна, кожен елемент додається та вилучається з вікна щонайбільше один раз.
- **Просторова складність:** $O(K)$ — для зберігання частоти щонайбільше $K + 1$ елементів у хеш-таблиці.

## Тренування (Drills):

1. **Hard_02_01_SubarraysWithKDifferent (Longest Substring with At Most K Distinct)**: Знайти максимальну довжину підрядка, що містить не більше ніж $K$ різних символів.
2. **Hard_02_02_SubarraysWithKDifferent (Count Subarrays with At Most K Distinct)**: Підрахувати сумарну кількість підмасивів, що містять не більше ніж $K$ різних чисел.
3. **Hard_02_03_SubarraysWithKDifferent (Subarrays with Sum)**: Знайти кількість підмасивів у бінарному масиві, що мають суму одиниць точно $K$.
4. **Hard_02_04_SubarraysWithKDifferent (Count Subarrays with At Least K Distinct)**: Підрахувати кількість підмасивів, що містять щонайменше $K$ різних чисел.
5. **Hard_02_05_SubarraysWithKDifferent (Longest Subarray with Exactly K Distinct)**: Знайти довжину найдовшого підмасиву, який містить точно $K$ унікальних елементів.

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_SubarraysWithKDifferent.java.
