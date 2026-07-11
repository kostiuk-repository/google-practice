package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Easy_03_02_EmployeeImportance {

    // Local stand-in for the undefined "Employee" type referenced by
    // Easy_03_EmployeeImportance, unique to this drill file.
    static class EmployeeD2 {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public EmployeeD2(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    /**
     * Drill 2/5 for Easy_03_EmployeeImportance — Total Importance via BFS
     * Technique: the same id -> employee map lookup and "sum importance across the whole
     * reporting subtree" goal as Easy_03_EmployeeImportance, but traversed with an explicit
     * queue (BFS) instead of recursion (DFS) — mirrors the technique in iterative form.
     *
     * Given a list of employees (each with an id, an importance value, and a list of direct
     * subordinate ids) and a starting id, return the total importance value of that employee
     * plus all of their subordinates (direct and indirect), computed using BFS.
     *
     * Example:
     * Input: employees = [(1, imp=5, subs=[2,3]), (2, imp=3, subs=[]), (3, imp=3, subs=[])],
     * id = 1
     * Output: 11
     * Explanation: 5 (employee 1) + 3 (employee 2) + 3 (employee 3) = 11.
     */
    public int getTotalImportanceBFS(List<EmployeeD2> employees, int id) {
        // TODO: Implement your solution here.
        return 0;
    }
}
