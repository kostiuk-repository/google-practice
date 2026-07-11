# Easy_03_SymmetricTree — Довідка

## Техніка: Mirror-Pair Recursion

**Суть:** симетричність дерева перевіряється допоміжною функцією, яка
порівнює ДВА піддерева як дзеркала одне одного: `left.val == right.val`,
а потім рекурсивно `left.left` з `right.right` і `left.right` з
`right.left` (протилежні, не однакові, пари дітей).

```java
boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return t1.val == t2.val
        && isMirror(t1.left, t2.right)
        && isMirror(t1.right, t2.left);
}
boolean isSymmetric(TreeNode root) {
    return root == null || isMirror(root.left, root.right);
}
```

**Коли застосовувати:** будь-яка задача про симетричність, дзеркальність
або "чи виглядає ліва половина як відображення правої" — по суті це
Synchronized Two-Tree Recursion (як в Easy_02_SameTree), але з
СХРЕЩЕНИМ порівнянням дітей замість прямого.

**Складність:** O(N) час у гіршому випадку (весь обхід, якщо дерево
дійсно симетричне), O(H) пам'яті на стек рекурсії.

## Drills

1. **Easy_03_01** — виносимо isMirror(t1, t2) як окремий метод для ДВОХ незалежних дерев.
2. **Easy_03_02** — перевірка симетричності лише форми (структури), без значень.
3. **Easy_03_03** — симетричність, обмежена глибиною maxDepth (бюджет рекурсії).
4. **Easy_03_04** — підрахунок кількості неспівпадаючих дзеркальних пар замість boolean.
5. **Easy_03_05** — та сама перевірка, але ІТЕРАТИВНО через чергу пар вузлів.

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_03_SymmetricTree.java.
