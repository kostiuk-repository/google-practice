# Hard_01_TrappingRainWater — Довідка

## Техніка: Зустрічні вказівники з біжучими максимумами

**Суть:** Висота води над стовпчиком обмежена найменшим із максимальних бар'єрів ліворуч та праворуч. Рухаючи вказівники назустріч, ми порівнюємо лівий та правий стовпчики. Зсуваємо вказівник з меншим значенням, оскільки він лімітує об'єм води.

### Концептуальний код
```java
int left = 0, right = height.length - 1;
int leftMax = 0, rightMax = 0, ans = 0;
while (left < right) {
    if (height[left] < height[right]) {
        if (height[left] >= leftMax) leftMax = height[left];
        else ans += leftMax - height[left];
        left++;
    } else {
        if (height[right] >= rightMax) rightMax = height[right];
        else ans += rightMax - height[right];
        right--;
    }
}
```

**Коли застосовувати:**
- Обчислення об'єму води чи площ под кривими, обмеженими двосторонніми бар'єрами.

**Складність:**
- **Часова:** O(N) — один прохід по масиву.
- **Просторова:** O(1) — без додаткових масивів.

## Вправи (Drills)
1. **01 — Left Maximum Array**: Given heights, return an array where leftMax[i] is the maximum height from index 0 to i.
2. **02 — Right Maximum Array**: Given heights, return an array where rightMax[i] is the maximum height from index i to length-1.
3. **03 — Trap Water with Extra Memory**: Calculate trapped rain water using precomputed leftMax and rightMax arrays (O(N) space).
4. **04 — Trap Water with Constant Space**: Calculate trapped rain water using two pointers to achieve O(1) space.
5. **05 — Trap Water with Slanted Roof**: Calculate trapped water, but the roof is slanted. A constant 'slant' factor is subtracted from the effective water height at each step (e.g. water = Math.max(0, min(leftMax, rightMax) - height[i] - slant)).

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Hard_01_TrappingRainWater.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Hard_01_TrappingRainWater.java).
