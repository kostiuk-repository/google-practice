package topic10_dfs_bfs.practice;

import java.util.List;

public class Easy_03_04_EmployeeImportance {

    // Local stand-in for the undefined "Employee" type referenced by
    // Easy_03_EmployeeImportance, unique to this drill file.
    static class EmployeeD4 {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public EmployeeD4(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    /**
     * Drill 4/5 for Easy_03_EmployeeImportance — Management Depth
     * Technique: same id -> employee map + DFS down "subordinates" edges as
     * Easy_03_EmployeeImportance, but each recursive call now also tracks how many levels deep
     * it has descended, and the aggregate becomes the maximum depth reached instead of a sum
     * of importance values — the same shape as computing a tree's height via DFS.
     *
     * Given a list of employees and a starting id, return the number of management levels
     * below that employee — i.e. the length of the longest chain of subordinates starting from
     * that employee (an employee with no subordinates has depth 0).
     *
     * Example:
     * Input: employees = [(1, imp=5, subs=[2]), (2, imp=3, subs=[3]), (3, imp=3, subs=[])],
     * id = 1
     * Output: 2
     * Explanation: 1 -> 2 -> 3 is a chain of length 2 below employee 1.
     */
    public int managementDepth(List<EmployeeD4> employees, int id) {
        // TODO: Implement your solution here.
        return 0;
    }
}
