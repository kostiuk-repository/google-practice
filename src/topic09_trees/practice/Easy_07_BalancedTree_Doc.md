# Easy_07_BalancedTree — Довідка

## Техніка: Post-Order Bottom-Up Height Check

**Суть:** Замість повторного обчислення висоти піддерев для кожного вузла (що дає O(N^2)), ми виконуємо обхід знизу вгору. Рекурсивна функція повертає висоту, якщо дерево збалансоване, або -1 при виявленні дисбалансу, що миттєво піднімається вгору.

```java
int checkHeight(TreeNode root) {
    if (root == null) return 0;
    int left = checkHeight(root.left);
    if (left == -1) return -1;
    int right = checkHeight(root.right);
    if (right == -1) return -1;
    if (Math.abs(left - right) > 1) return -1;
    return Math.max(left, right) + 1;
}
```

**Коли застосовувати:** Коли потрібно валідувати структурний баланс або глибину дерева, і будь-яка локальна помилка робить усю гілку недійсною.

**Складність:** Час: O(N), Простір: O(H) для рекурсивного стеку.

## Drills

1. **Easy_07_01** — MaxDepthOfTree (Get the maximum depth of a binary tree (the number of nodes along the longest path from the root node down to the farthest leaf node)).
2. **Easy_07_02** — MinDepthOfTree (Get the minimum depth of a binary tree (the number of nodes along the shortest path from the root node down to the nearest leaf node)).
3. **Easy_07_03** — IsRootBalanced (Check if the heights of the left and right subtrees of the root node differ by at most 1).
4. **Easy_07_04** — IsPerfectlyBalanced (Check if a binary tree is perfectly balanced (all leaves are at the exact same depth)).
5. **Easy_07_05** — BalancedMaxDepth (Find the maximum depth of the tree if it is balanced, otherwise return -1).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_07_BalancedTree.java.
