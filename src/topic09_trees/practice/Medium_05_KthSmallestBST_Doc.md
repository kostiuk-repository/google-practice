# Medium_05_KthSmallestBST — Довідка

## Техніка: Inorder Count Tracking

**Суть:** Оскільки inorder обхід BST відвідує вузли у зростаючому порядку, ми виконуємо inorder обхід (рекурсивно або ітеративно) і ведемо лічильник відвіданих елементів. На k-му елементі повертаємо його значення.

```java
int count = 0;
int result = -1;
public int kthSmallest(TreeNode root, int k) {
    traverse(root, k);
    return result;
}
void traverse(TreeNode root, int k) {
    if (root == null) return;
    traverse(root.left, k);
    count++;
    if (count == k) {
        result = root.val;
        return;
    }
    traverse(root.right, k);
}
```

**Коли застосовувати:** Пошук статистик порядку (мінімум, максимум, медіана, k-й елемент) у впорядкованих структурах.

**Складність:** Час: O(H + k) (може бути оптимізовано до O(H) при ітеративному обході з раннім виходом), Простір: O(H).

## Drills

1. **Medium_05_01** — FindMin (Find the minimum element in a BST).
2. **Medium_05_02** — KthLargest (Find the kth largest element in a BST).
3. **Medium_05_03** — CountLessOrEqual (Count total nodes in a BST that have values less than or equal to x).
4. **Medium_05_04** — KSmallestElements (Retrieve the first k smallest elements in sorted order from a BST).
5. **Medium_05_05** — InorderPredecessor (Find the inorder predecessor of a given key value in a BST).

Розв'язуй у порядку 01 → 05, не підглядаючи в Medium_05_KthSmallestBST.java.
