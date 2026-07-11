package topic10_dfs_bfs.practice;

import java.util.List;

public class Easy_03_05_EmployeeImportance {

    // Local stand-in for the undefined "Employee" type referenced by
    // Easy_03_EmployeeImportance, unique to this drill file.
    static class EmployeeD5 {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public EmployeeD5(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    /**
     * Drill 5/5 for Easy_03_EmployeeImportance — Combined Importance of Multiple Teams (capstone)
     * Technique: combine the id -> employee map + DFS-sum-importance technique from
     * Easy_03_EmployeeImportance with a shared visited set across MULTIPLE starting ids — since
     * two given team leads might share overlapping subordinates, each employee's importance
     * must be counted only once in the combined total, exactly like avoiding double-counting a
     * cell reached from two different flood-fill sources.
     *
     * Given a list of employees and a list of starting ids, return the total importance of the
     * union of all employees reachable (as themselves or as a subordinate, direct or indirect)
     * from ANY of the given starting ids, counting each distinct employee's importance exactly
     * once even if they are reachable from more than one starting id.
     *
     * Example:
     * Input: employees = [(1, imp=5, subs=[3]), (2, imp=4, subs=[3]), (3, imp=2, subs=[])],
     * ids = [1, 2]
     * Output: 11
     * Explanation: reachable set is {1, 3} union {2, 3} = {1, 2, 3}; employee 3 is shared but
     * counted once: 5 + 4 + 2 = 11.
     */
    public int combinedImportance(List<EmployeeD5> employees, List<Integer> ids) {
        // TODO: Implement your solution here.
        return 0;
    }
}
