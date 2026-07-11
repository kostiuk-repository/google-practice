# Medium_04_BoatsToSavePeople — Довідка

## Техніка: Жадібне розбиття + Зустрічні вказівники

**Суть:** Сортуємо масив ваг. Намагаємося згрупувати найважчу людину (right) з найлегшою (left). Якщо їхня сумарна вага в межах ліміту — саджаємо обох (left++, right--). Інакше важка людина пливе сама (right--).

### Концептуальний код
```java
Arrays.sort(people);
int left = 0, right = people.length - 1;
int boats = 0;
while (left <= right) {
    boats++;
    if (people[left] + people[right] <= limit) left++;
    right--;
}
```

**Коли застосовувати:**
- Мінімізація кількості контейнерів фіксованого розміру для парних чи одиночних елементів.

**Складність:**
- **Часова:** O(N log N) через сортування.
- **Просторова:** O(log N) для внутрішнього сортування.

## Вправи (Drills)
1. **01 — Boats with Unlimited Capacity**: Find the minimum number of boats if each boat can carry any number of people, as long as the total weight doesn't exceed limit.
2. **02 — Rescue Boats Exactly Two**: Find minimum boats if each boat MUST carry exactly two people whose weight sum is <= limit. If impossible to pair everyone, return -1.
3. **03 — Rescue Boats for Pre-Sorted Weights**: Find the minimum number of rescue boats (standard rule: max 2 people) when weights are already sorted.
4. **04 — Rescue Boats Max Three People**: Find the minimum rescue boats if each boat can carry at most three people whose total weight is <= limit.
5. **05 — Rescue Boats with Heavy Cost**: Find minimum boats if any person weighing >= heavyThreshold counts as occupying double capacity (i.e. they must sail alone).

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_04_BoatsToSavePeople.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Medium_04_BoatsToSavePeople.java).
