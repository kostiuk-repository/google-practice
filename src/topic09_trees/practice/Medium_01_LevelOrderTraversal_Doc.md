# Medium_01_LevelOrderTraversal — Довідка

## Техніка: BFS queue traversal

**Суть:** Обхід дерева по рівнях з використанням черги (Queue). Для розділення рівнів ми фіксуємо розмір черги перед початком обробки кожного рівня.

```java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        int size = q.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode curr = q.poll();
            level.add(curr.val);
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        res.add(level);
    }
    return res;
}
```

**Коли застосовувати:** Коли потрібно згрупувати вузли за глибиною, знайти найкоротшу відстань або обробити дерево рівень за рівнем.

**Складність:** Час: O(N), Простір: O(W) де W — максимальна ширина дерева (до N/2).

## Drills

1. **Medium_01_01** — AverageOfLevels (Return the average value of nodes on each level of the tree).
2. **Medium_01_02** — LevelOrderBottom (Return the bottom-up level order traversal of a binary tree).
3. **Medium_01_03** — RightSideView (Return the right side view of the tree (nodes visible when looking at the tree from the right side)).
4. **Medium_01_04** — ZigzagLevelOrder (Return the zigzag level order traversal of a binary tree (alternating left-to-right and right-to-left)).
5. **Medium_01_05** — MaxLevelSum (Find the level (1-indexed) with the maximum sum of node values).

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_01_LevelOrderTraversal.java.
