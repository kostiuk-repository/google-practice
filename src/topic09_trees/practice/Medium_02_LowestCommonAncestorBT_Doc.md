# Medium_02_LowestCommonAncestorBT — Довідка

## Техніка: Post-Order DFS with bubble up

**Суть:** Для довільного бінарного дерева ми шукаємо p та q рекурсивно. Якщо вузол збігається з p або q, повертаємо його. Якщо ліва та права рекурсії повернули не-null, то поточний вузол є LCA. Інакше прокидаємо вгору той результат, який не є null.

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left != null && right != null) return root;
    return left != null ? left : right;
}
```

**Коли застосовувати:** Пошук найближчого спільного предка в неструктурованому бінарному дереві.

**Складність:** Час: O(N), Простір: O(H).

## Drills

1. **Medium_02_01** — IsAncestor (Return true if p is an ancestor of q in the binary tree).
2. **Medium_02_02** — LowestCommonAncestorPossiblyMissing (Find the LCA of p and q, but return null if either p or q is not actually present in the tree).
3. **Medium_02_03** — LowestCommonAncestorNodes (Find the LCA of a list of nodes in a binary tree).
4. **Medium_02_04** — DistanceBT (Find the distance (number of edges) between two nodes p and q in a general binary tree).
5. **Medium_02_05** — MaxPathSumLCA (Find the maximum sum path between p and q that passes through their LCA).

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_02_LowestCommonAncestorBT.java.
