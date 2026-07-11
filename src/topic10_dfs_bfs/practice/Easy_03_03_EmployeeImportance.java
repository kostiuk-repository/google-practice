package topic10_dfs_bfs.practice;

import java.util.List;

public class Easy_03_03_EmployeeImportance {

    // Local stand-in for the undefined "Employee" type referenced by
    // Easy_03_EmployeeImportance, unique to this drill file.
    static class EmployeeD3 {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public EmployeeD3(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    /**
     * Drill 3/5 for Easy_03_EmployeeImportance — Maximum Importance in Subtree
     * Technique: same id -> employee map + DFS down "subordinates" edges as
     * Easy_03_EmployeeImportance, but the aggregate changes from SUM to MAX — track the best
     * importance value seen so far across the traversal instead of accumulating a running
     * total.
     *
     * Given a list of employees and a starting id, return the highest single importance value
     * found among that employee and all of their subordinates (direct and indirect).
     *
     * Example:
     * Input: employees = [(1, imp=5, subs=[2,3]), (2, imp=9, subs=[]), (3, imp=3, subs=[])],
     * id = 1
     * Output: 9
     * Explanation: importance values in the subtree are 5, 9, 3 — the maximum is 9.
     */
    public int maxImportanceInSubtree(List<EmployeeD3> employees, int id) {
        // TODO: Implement your solution here.
        return 0;
    }
}
