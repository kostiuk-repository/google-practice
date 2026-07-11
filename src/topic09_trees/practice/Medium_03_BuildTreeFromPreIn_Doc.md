# Medium_03_BuildTreeFromPreIn — Довідка

## Техніка: Preorder-Inorder Partition Recursion

**Суть:** Перший елемент Preorder — це корінь. Шукаємо його в Inorder. Це ділить Inorder на ліву та правим частини, за якими ми визначаємо межі піддерев у Preorder і рекурсивно будуємо ліве та праве піддерево.

```java
int preIndex = 0;
public TreeNode buildTree(int[] preorder, int[] inorder) {
    return build(preorder, inorder, 0, inorder.length - 1);
}
TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {
    if (inStart > inEnd) return null;
    TreeNode root = new TreeNode(preorder[preIndex++]);
    int inIndex = find(inorder, root.val, inStart, inEnd);
    root.left = build(preorder, inorder, inStart, inIndex - 1);
    root.right = build(preorder, inorder, inIndex + 1, inEnd);
    return root;
}
```

**Коли застосовувати:** Реконструкція дерев за результатами обходів.

**Складність:** Час: O(N) з використанням HashMap для пошуку індексів в Inorder, Простір: O(N).

## Drills

1. **Medium_03_01** — BuildTreePostIn (Build a binary tree from Postorder and Inorder traversal arrays).
2. **Medium_03_02** — GetPreorder (Generate the preorder traversal array from given inorder and postorder traversals without explicitly building a TreeNode tree).
3. **Medium_03_03** — BstFromPreorder (Construct a Binary Search Tree (BST) from its preorder traversal).
4. **Medium_03_04** — ConstructFromPrePost (Construct a binary tree from Preorder and Postorder traversals (assuming a full binary tree)).
5. **Medium_03_05** — SortedArrayToBST (Reconstruct a height-balanced BST from a sorted array (inorder traversal of BST)).

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_03_BuildTreeFromPreIn.java.
