# Medium_04_ValidateBST — Довідка

## Техніка: Recursive Range Constraint passing

**Суть:** Коректність BST не можна перевірити лише порівнянням вузла з його безпосередніми дітьми. Потрібно передавати допустимі межі (low, high) зверху вниз. Для лівого піддерева верхня межа оновлюється значенням батька, для правого — нижня.

```java
public boolean isValidBST(TreeNode root) {
    return validate(root, null, null);
}
boolean validate(TreeNode node, Integer low, Integer high) {
    if (node == null) return true;
    if ((low != null && node.val <= low) || (high != null && node.val >= high)) return false;
    return validate(node.left, low, node.val) && validate(node.right, node.val, high);
}
```

**Коли застосовувати:** Перевірка властивостей впорядкованості або ієрархічних обмежень у деревах.

**Складність:** Час: O(N), Простір: O(H).

## Drills

1. **Medium_04_01** — IsValidBSTInRange (Validate if a BST is valid and all its values fall within the range [minVal, maxVal]).
2. **Medium_04_02** — IsStrictlyIncreasing (Auxiliary check: Given a list of integers, verify if it is strictly increasing).
3. **Medium_04_03** — FindMinMax (Find the minimum and maximum values in a valid BST).
4. **Medium_04_04** — IsValidBSTIterative (Check if a binary tree is a valid BST using an iterative inorder traversal (using stack)).
5. **Medium_04_05** — LargestBSTSubtree (Find the size (number of nodes) of the largest BST subtree in a given binary tree).

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_04_ValidateBST.java.
