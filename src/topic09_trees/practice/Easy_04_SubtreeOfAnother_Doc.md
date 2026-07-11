# Easy_04_SubtreeOfAnother — Довідка

## Техніка: For-Every-Node Search + Matching Helper

**Суть:** комбінація двох прийомів — (1) обхід КОЖНОГО вузла дерева
root (traversal) і (2) на кожному вузлі запуск допоміжної функції
порівняння двох дерев (matching helper на кшталт isSameTree з
Easy_02). Якщо helper повертає true хоч для одного вузла — знайдено.

```java
boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) return false;
    if (isSameTree(root, subRoot)) return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}
boolean isSameTree(TreeNode a, TreeNode b) { /* як в Easy_02 */ }
```

**Коли застосовувати:** "чи міститься структура X десь у дереві Y" —
пошук патерну, підрахунок збігів, найглибший/наймілкіший збіг. Ключова
ознака: потрібно ПЕРЕБРАТИ всі вузли-кандидати і на кожному застосувати
окрему перевірку.

**Складність:** O(N * M) час у гіршому випадку (N вузлів у root, M —
розмір subRoot, для кожного кандидата повне порівняння), O(H) пам'яті
на стек.

## Drills

1. **Easy_04_01** — лише пошук значення (traversal без matching helper).
2. **Easy_04_02** — підрахунок кількості точних збігів замість одного boolean.
3. **Easy_04_03** — збіг лише за формою (структурою), значення ігноруються.
4. **Easy_04_04** — пошук збігу обмежений лише листками root.
5. **Easy_04_05** — найменша глибина, на якій знайдено збіг (лічильник глибини через рекурсію).

Розв'язуй у порядку 01 → 05, не підглядаючи в Easy_04_SubtreeOfAnother.java.
