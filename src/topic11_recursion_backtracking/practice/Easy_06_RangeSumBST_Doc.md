# Easy_06_RangeSumBST — Довідка

## Техніка: Recursive BST DFS / Pruning

**Суть:** Обхід бінарного дерева пошуку (BST). Завдяки властивості BST (ліве піддерево < вузол < праве піддерево), рекурсивні гілки можна відтинати (pruning), якщо значення поточного вузла виходить за межі діапазону.

```java
int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) return 0;
    if (root.val < low) return rangeSumBST(root.right, low, high);
    if (root.val > high) return rangeSumBST(root.left, low, high);
    return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
}
```

**Коли застосовувати:** Пошук, підрахунок або модифікація елементів у бінарному дереві пошуку в певному діапазоні.

**Складність:** O(log n) в середньому, O(n) в найгіршому час; O(h) пам'ять.

## Drills

1. **Easy_06_01** — Range Count of BST: Рекурсивно порахуйте кількість вузлів у BST, значення яких знаходяться в межах [low, high].
2. **Easy_06_02** — Range Product of BST: Рекурсивно обчисліть добуток значень усіх вузлів у BST, що знаходяться в діапазоні [low, high]. Поверніть 1, якщо вузлів немає.
3. **Easy_06_03** — Closest Value in BST: Дано непорожнє BST та цільове значення типу double. Рекурсивно знайдіть значення у BST, найближче до цільового.
4. **Easy_06_04** — Trim BST: Рекурсивно обріжте BST так, щоб усі його елементи лежали в межах [low, high].
5. **Easy_06_05** — Verify BST Range Property: Рекурсивно перевірте, чи є бінарне дерево правильним BST, передаючи верхню та нижню межі вниз по стеку.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_06_RangeSumBST.java.
