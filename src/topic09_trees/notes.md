# Trees - Study Notes

A **Tree** is a hierarchical, non-linear data structure. A **Binary Tree** is a tree where each node has at most two children.

---

## 1. Traversals

### A. Depth-First Search (DFS)
* **Pre-order:** Root -> Left -> Right
* **In-order:** Left -> Root -> Right (For BST, this visits nodes in sorted ascending order!)
* **Post-order:** Left -> Right -> Root

### B. Breadth-First Search (BFS / Level Order)
Uses a queue to visit nodes level-by-level.

---

## 2. Binary Search Tree (BST)
A binary tree where for each node:
* All values in the left subtree are smaller than the node value.
* All values in the right subtree are larger than the node value.
