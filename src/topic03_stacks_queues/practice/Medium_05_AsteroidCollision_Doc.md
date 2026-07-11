# Medium_05_AsteroidCollision — Довідка

## Техніка: Стек для симуляції зіткнень (Collision Resolution Stack)

**Суть:** Ми обробляємо астероїди зліва направо. Праві астероїди (+) просто кладуться в стек. Коли зустрічається лівий астероїд (-), він вступає в колізію з правими астероїдами на вершині стеку, доки не вибухне сам або не знищить їх.

```java
Deque<Integer> stack = new ArrayDeque<>();
for (int ast : asteroids) {
    boolean exploded = false;
    while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
        if (stack.peek() < -ast) {
            stack.pop(); // правий знищено
            continue;
        } else if (stack.peek() == -ast) {
            stack.pop(); // обидва знищено
        }
        exploded = true;
        break;
    }
    if (!exploded) stack.push(ast);
}
```

**Коли застосовувати:** Симуляція фізичних або логічних процесів зустрічних зіткнень, де напрямок і сила визначають виживання елементів.

**Складність:** Часова: O(N), Просторова: O(N).

## Drills

1. **Medium_05_01** — Count total number of explosions.
2. **Medium_05_02** — Mass accumulation upon winning collisions.
3. **Medium_05_03** — Stationary (0 direction) asteroids.
4. **Medium_05_04** — Split collision (half moving right, half left).
5. **Medium_05_05** — Collision resolution with unbreakable barrier safe havens.

Rozв'язуй у порядку 01 → 05, не підглядаючи в Medium_05_AsteroidCollision.java.
