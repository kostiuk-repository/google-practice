package topic10_dfs_bfs.practice;

import java.util.List;
import java.util.ArrayList;

public class Medium_04_CourseSchedule {

        /**
     * Problem: Course Schedule
     *
     * There are a total of numCourses courses you have to take, labeled from 0 to
     * numCourses - 1. You are given an array prerequisites where prerequisites[i] =
     * [a_i, b_i] indicates that you must take course b_i first if you want to take
     * course a_i.
     *
     *   - For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
     *
     * Return true if you can finish all courses. Otherwise, return false.
     *
     * Example 1:
     * Input: numCourses = 2, prerequisites = [[1,0]]
     * Output: true
     * Explanation: There are a total of 2 courses to take.
     * To take course 1 you should have finished course 0. So it is possible.
     *
     * Example 2:
     * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
     * Output: false
     * Explanation: There are a total of 2 courses to take.
     * To take course 1 you should have finished course 0, and to take course 0 you
     * should also have finished course 1. So it is impossible.
     *
     * Constraints:
     *
     *   - 1 <= numCourses <= 2000
     *   - 0 <= prerequisites.length <= 5000
     *   - prerequisites[i].length == 2
     *   - 0 <= a_i, b_i < numCourses
     *   - All the pairs prerequisites[i] are unique.
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO: Implement your solution here.
        return false;
    }

    /* 
     * =========================================================================
     * MENTEE QUESTION REGION
     * =========================================================================
     * Your Question: 
     * 
     */

    /* 
     * =========================================================================
     * MENTOR QUESTION TO MENTEE
     * =========================================================================
     * Mentor Question: How does cycle detection in a Directed Acyclic Graph (DAG) translate to checking course scheduling feasibility?
     * 
     * Your Answer: 
     * 
     */
}
