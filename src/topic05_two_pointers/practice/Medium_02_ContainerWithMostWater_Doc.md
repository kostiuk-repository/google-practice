# Medium_02_ContainerWithMostWater — Довідка

## Техніка: Зустрічні вказівники з жадібним зсувом

**Суть:** Починаємо з вказівників на обох кінцях масиву. Висота обмежується меншим із двох стовпчиків. Щоб збільшити площу при зменшенні ширини, ми повинні зсувати вказівник, який вказує на меншу висоту.

### Концептуальний код
```java
int left = 0, right = height.length - 1;
int maxArea = 0;
while (left < right) {
    int w = right - left;
    int h = Math.min(height[left], height[right]);
    maxArea = Math.max(maxArea, w * h);
    if (height[left] < height[right]) left++;
    else right--;
}
```

**Коли застосовувати:**
- Пошук найбільшої площі прямокутника, обмеженого двома лініями на осі X.

**Складність:**
- **Часова:** O(N) — кожен стовпчик відвідується один раз.
- **Просторова:** O(1) — константна пам'ять.

## Вправи (Drills)
1. **01 — Max Area Between Adjacent**: Find the maximum area between two adjacent vertical lines. (Width between adjacent lines is always 1).
2. **02 — Max Area with Sorted Heights**: Find the maximum area if the height array was sorted in non-decreasing order.
3. **03 — Max Area with Fixed Left Wall**: Find the maximum area of a container starting specifically at index left.
4. **04 — Max Area with Width Constraint**: Find the maximum area container such that the distance between the two walls (width) is at most maxK.
5. **05 — 3-Wall Container**: Find the maximum area formed by a 3-wall container where the height is determined by the minimum of all 3 walls. Area = (right - left) * min(h[left], h[mid], h[right]).

---
Розв'язуй у порядку 01 → 05, не підглядаючи в [Medium_02_ContainerWithMostWater.java](file:///C:/Users/kosti/Projects/google-practice/src/topic05_two_pointers/practice/Medium_02_ContainerWithMostWater.java).
