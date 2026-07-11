# Hard_02_BinaryTreeMaxPathSum — Довідка

## Техніка: Post-Order Path Combination with Global Accumulator

**Суть:** У кожному вузлі ми обчислюємо максимальний шлях вниз ліворуч та праворуч. Якщо сума від'ємна, ми ігноруємо її (беремо 0). Оновлюємо глобальний максимум значенням `left + right + node.val`. Повертаємо `node.val + max(left, right)` для продовження шляху вище.

```java
int max = Integer.MIN_VALUE;
public int maxPathSum(TreeNode root) {
    helper(root);
    return max;
}
int helper(TreeNode node) {
    if (node == null) return 0;
    int left = Math.max(0, helper(node.left));
    int right = Math.max(0, helper(node.right));
    max = Math.max(max, left + right + node.val);
    return node.val + Math.max(left, right);
}
```

**Коли застосовувати:** Пошук оптимального шляху в ієрархічних структурах, де шлях може проходити через будь-який вузол-транзит.

**Складність:** Час: O(N), Простір: O(H).

## Drills

1. **Hard_02_01** — MaxRootToLeafPathSum (Return the maximum path sum starting from the root and ending at any leaf node).
2. **Hard_02_02** — MaxPathSumPositive (Calculate the max path sum from any node to any node in a tree where all node values are strictly positive).
3. **Hard_02_03** — MaxLeafToLeafPathSum (Find the maximum path sum between any two leaf nodes in a binary tree).
4. **Hard_02_04** — LongestConsecutive (Find the length of the longest consecutive sequence path (parent to child, incrementing by 1)).
5. **Hard_02_05** — MaxDownwardPathSum (Find the maximum path sum starting at any node and going downwards only (not necessarily to leaf)).

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_02_BinaryTreeMaxPathSum.java.
