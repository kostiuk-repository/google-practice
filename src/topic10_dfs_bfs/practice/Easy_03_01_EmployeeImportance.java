package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Easy_03_01_EmployeeImportance {

    // Local stand-in for the undefined "Employee" type referenced by
    // Easy_03_EmployeeImportance, unique to this drill file.
    static class EmployeeD1 {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public EmployeeD1(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    /**
     * Drill 1/5 for Easy_03_EmployeeImportance — Count Subordinates
     * Technique: build an id -> employee HashMap (the same lookup structure needed by
     * Easy_03_EmployeeImportance) and DFS down the "subordinates" edges from a given id — but
     * here we only count how many employees are reachable, isolating the traversal shape from
     * the importance-summing aggregate.
     *
     * Given a list of employees (each with an id and a list of direct subordinate ids) and a
     * starting id, return the total number of subordinates (direct and indirect) that report
     * up to that employee, NOT including the employee themselves.
     *
     * Example:
     * Input: employees = [(1, imp=5, subs=[2,3]), (2, imp=3, subs=[]), (3, imp=3, subs=[4]),
     *                      (4, imp=1, subs=[])], id = 1
     * Output: 3
     * Explanation: employee 1 has subordinates 2, 3, and (through 3) 4 — three in total.
     */
    public int countSubordinates(List<EmployeeD1> employees, int id) {
        // TODO: Implement your solution here.
        return 0;
    }
}
