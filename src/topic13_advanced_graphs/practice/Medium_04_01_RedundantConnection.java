package topic13_advanced_graphs.practice;

import java.util.*;

public class Medium_04_01_RedundantConnection {

    /**
     * Drill 1/5 for Medium_04_RedundantConnection — Пошук шляху через DFS
     * Technique: Пошук циклу в неорієнтованому графі (Union-Find)
     *
     * Допоміжний DFS метод для перевірки, чи існує вже шлях між вершинами u та v у поточному графі adj.
     */
    public boolean hasCycleDFS(List<List<Integer>> adj, int u, int v, boolean[] visited) {
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
     * Mentor Question: Чому при пошуку циклу в неорієнтованому графі важливо не переходити назад по ребру до безпосереднього батька?
     * 
     * Your Answer: 
     * 
     */
}
