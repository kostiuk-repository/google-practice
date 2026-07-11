# DFS & BFS (Graph Search) - Study Notes

**DFS** (Depth-First Search) and **BFS** (Breadth-First Search) are the two primary ways to search grids, matrices, and general graphs.

---

## 1. Graph DFS vs. BFS

| Aspect | DFS (Depth-First Search) | BFS (Breadth-First Search) |
| :--- | :--- | :--- |
| **Structure** | Stack (or Call Stack Recursion) | Queue |
| **Direction** | Goes as deep as possible before backtracking | Visits all neighbors at current distance first |
| **Optimal Path** | No guarantee for shortest path | Guarantees shortest path in unweighted graphs |
| **Space** | $O(H)$ (Height of recursion tree) | $O(W)$ (Width of graph level) |

---

## 2. Grid Traversal Template (DFS)
```java
public void dfs(int[][] grid, int r, int c, boolean[][] visited) {
    if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || visited[r][c]) return;
    visited[r][c] = true;
    dfs(grid, r + 1, c, visited);
    dfs(grid, r - 1, c, visited);
    dfs(grid, r, c + 1, visited);
    dfs(grid, r, c - 1, visited);
}
```
