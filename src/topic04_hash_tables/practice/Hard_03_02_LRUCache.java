package topic04_hash_tables.practice;

import java.util.*;

public class Hard_03_02_LRUCache {

    public static class Node {
        public int key, val;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    /**
     * Drill 2/5 for Hard_03_LRUCache — Map to Node Lookup
     * Technique: hash map referencing
     *
     * Implement MapTracker to store key-node associations.
     */
    public static class MapTracker {
        public Map<Integer, Node> map = new HashMap<>();
        
        public int getNodeValue(int key) {
            // TODO: Return value of the node if exists, else -1
            return 0;
        }
        
        public void updateNodeValue(int key, int value) {
            // TODO: Update node's value if it exists, otherwise do nothing
        }
        
        public void addNode(int key, int value) {
            // TODO: Put new Node into map
        }
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
     * Mentor Question: How does storing Node references (instead of just values) 
     * in the HashMap enable O(1) deletion from the Doubly Linked List?
     * 
     * Your Answer: 
     * 
     */
}
