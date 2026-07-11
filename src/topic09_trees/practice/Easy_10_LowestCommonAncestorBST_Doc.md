# Easy_10_LowestCommonAncestorBST — Довідка

## Техніка: BST Node Placement Property

**Суть:** У BST, якщо значення обох шуканих вузлів менше за поточний, LCA лежить ліворуч. Якщо обидва більше — праворуч. Якщо вони по різні боки (або один з них дорівнює поточному), поточний вузол і є LCA.

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
    if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
    return root;
}
```

**Коли застосовувати:** Пошук спільного предка або точок розділення в BST.

**Складність:** Час: O(H) або O(log N) для збалансованого дерева, Простір: O(H) для стеку.

## Drills

1. **Easy_10_01** — SearchBST (Search for a value in a Binary Search Tree).
2. **Easy_10_02** — FindMinBST (Find the node with the minimum value in a non-empty BST).
3. **Easy_10_03** — LowestCommonAncestorThree (Find the lowest common ancestor of three nodes p, q, and r in a BST).
4. **Easy_10_04** — InorderSuccessor (Find the inorder successor of a node p in a BST).
5. **Easy_10_05** — DistanceBST (Find the distance (number of edges) between two nodes p and q in a BST).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_10_LowestCommonAncestorBST.java.
