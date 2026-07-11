# Easy_09_MergeTrees — Довідка

## Техніка: Recursive Parallel Preorder Traversal

**Суть:** Синхронний обхід двох дерев. Якщо обидва вузли існують, додаємо їхні значення. Якщо один нульовий, повертаємо інший (разом з його піддеревом).

```java
public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null) return root2;
    if (root2 == null) return root1;
    TreeNode merged = new TreeNode(root1.val + root2.val);
    merged.left = mergeTrees(root1.left, root2.left);
    merged.right = mergeTrees(root1.right, root2.right);
    return merged;
}
```

**Коли застосовувати:** Коли потрібно порівняти, об'єднати або виконати операції над двома деревами одночасно.

**Складність:** Час: O(min(N1, N2)), Простір: O(min(H1, H2)).

## Drills

1. **Easy_09_01** — CloneTree (Create a deep copy of the given binary tree).
2. **Easy_09_02** — SumOverlap (Compute the sum of values at positions where both trees have nodes).
3. **Easy_09_03** — IsIdenticalStructure (Check if two binary trees have the exact same structure, ignoring node values).
4. **Easy_09_04** — MergeTreesMax (Merge two binary trees).
5. **Easy_09_05** — MergeTreesSubtract (Merge two trees).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_09_MergeTrees.java.
