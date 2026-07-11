package topic13_advanced_graphs;


import java.util.*;

/**
 * Example: Course Schedule II (Topological Sort)
 */
public class Example {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }
        
        int[] order = new int[numCourses];
        int idx = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            order[idx++] = curr;
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }
        
        return idx == numCourses ? order : new int[0];
    }
}
