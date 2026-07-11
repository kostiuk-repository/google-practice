# Easy_08_PathSum — Довідка

## Техніка: DFS Preorder Path Tracking

**Суть:** DFS обхід згори вниз, де ми передаємо залишкову суму `targetSum - root.val` дочірнім вузлам. Коли досягаємо листа, перевіряємо, чи дорівнює залишкова сума нулю.

```java
public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    if (root.left == null && root.right == null) return targetSum == root.val;
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
}
```

**Коли застосовувати:** Будь-які задачі на перевірку або накопичення властивостей вздовж шляхів від кореня до листів дерева.

**Складність:** Час: O(N), Простір: O(H).

## Drills

1. **Easy_08_01** — PathSumToAnyNode (Check if there exists a path starting from root and ending at ANY node (not necessarily a leaf) summing to targetSum).
2. **Easy_08_02** — CountPathSum (Count the number of root-to-leaf paths that sum to targetSum).
3. **Easy_08_03** — MaxPathSum (Get the maximum root-to-leaf path sum in the tree).
4. **Easy_08_04** — GetPathSumList (Return the list of values on the first root-to-leaf path that sums to targetSum).
5. **Easy_08_05** — CountDownwardPaths (Count paths that sum to targetSum, where paths must go downwards (parent to child) but can start and end at any node).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_08_PathSum.java.
