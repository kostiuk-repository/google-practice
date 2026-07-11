# Hard_03_AllPossibleFBT — Довідка

## Техніка: Catalan Number Recursion with Memoization

**Суть:** Для генерування всіх Full Binary Trees з n вузлів, n має бути непарним. Корінь забирає 1 вузол. Решту n-1 вузлів ми ділимо між лівим піддеревом (i вузлів) та правим (n-1-i вузлів), де i набуває всіх непарних значень від 1 до n-2.

```java
Map<Integer, List<TreeNode>> memo = new HashMap<>();
public List<TreeNode> allPossibleFBT(int n) {
    if (n % 2 == 0) return new ArrayList<>();
    if (n == 1) {
        List<TreeNode> base = new ArrayList<>();
        base.add(new TreeNode(0));
        return base;
    }
    if (memo.containsKey(n)) return memo.get(n);
    List<TreeNode> res = new ArrayList<>();
    for (int i = 1; i < n; i += 2) {
        List<TreeNode> left = allPossibleFBT(i);
        List<TreeNode> right = allPossibleFBT(n - 1 - i);
        for (TreeNode l : left) {
            for (TreeNode r : right) {
                TreeNode root = new TreeNode(0);
                root.left = l;
                root.right = r;
                res.add(root);
            }
        }
    }
    memo.put(n, res);
    return res;
}
```

**Коли застосовувати:** Генерування всіх можливих структур дерева певного розміру або типу.

**Складність:** Час: O(2^N) або Catalan(N) число дерев, Простір: O(2^N) для збереження результатів.

## Drills

1. **Hard_03_01** — IsFullBinaryTree (Check if the binary tree is a Full Binary Tree (each node has 0 or 2 children)).
2. **Hard_03_02** — CountFBT (Count the number of unique Full Binary Trees with n nodes).
3. **Hard_03_03** — GenerateTrees (Generate all structurally unique BSTs (Binary Search Trees) that store values 1 to n).
4. **Hard_03_04** — NumTrees (Count the number of structurally unique BSTs that store values 1 to n (Catalan number)).
5. **Hard_03_05** — AllPossibleFBTSerialized (Generate all possible Full Binary Trees with n nodes, returning them as serialized pre-order strings).

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_03_AllPossibleFBT.java.
