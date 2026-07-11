# Hard_01_SerializeDeserialize — Довідка

## Техніка: DFS Preorder Traversal with Sentinel Markers

**Суть:** Перетворення дерева в рядок здійснюється шляхом preorder обходу. Порожні піддерева (null) записуються як спеціальний маркер (наприклад, '#'). Десеріалізація зчитує токени по черзі та рекурсивно відновлює структуру.

```java
public String serialize(TreeNode root) {
    if (root == null) return "#";
    return root.val + "," + serialize(root.left) + "," + serialize(root.right);
}
int idx = 0;
public TreeNode deserialize(String data) {
    String[] arr = data.split(",");
    idx = 0;
    return build(arr);
}
TreeNode build(String[] arr) {
    if (arr[idx].equals("#")) {
        idx++;
        return null;
    }
    TreeNode root = new TreeNode(Integer.parseInt(arr[idx++]));
    root.left = build(arr);
    root.right = build(arr);
    return root;
}
```

**Коли застосовувати:** Серіалізація, передача по мережі, збереження структури деревоподібних даних.

**Складність:** Час: O(N), Простір: O(N) для збереження рядка/масиву токенів.

## Drills

1. **Hard_01_01** — SerializeDeserializeBFS (Serialize and deserialize a binary tree using BFS (Level Order)).
2. **Hard_01_02** — SerializeDeserializeBST (Compactly serialize and deserialize a BST using its preorder traversal).
3. **Hard_01_03** — CountNodesInSerialized (Count the number of non-null nodes in a serialized DFS string without reconstructing the tree).
4. **Hard_01_04** — SerializeDeserializeStructure (Serialize and deserialize only the structure of the binary tree (ignore node values, use '1' for nodes and '0' for null)).
5. **Hard_01_05** — SerializeDeserializeEscaped (Serialize and deserialize a binary tree where node values can contain commas or the null marker itself, requiring escaping).

Розв'язуй у порядку 01 → 05, не підглядаючи в Hard_01_SerializeDeserialize.java.
