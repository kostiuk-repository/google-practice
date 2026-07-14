package topic04_hash_tables.practice;

import java.util.LinkedList;
import java.util.List;

public class Easy_10_DesignHashMap {

    /**
     * Problem: Design HashMap
     * 
     * Design a HashMap without using any built-in hash table libraries.
     * 
     * Implement the MyHashMap class:
     * - MyHashMap() initializes the object with an empty map.
     * - void put(int key, int value) inserts a (key, value) pair into the HashMap. 
     *   If the key already exists in the map, update the corresponding value.
     * - int get(int key) returns the value to which the specified key is mapped, 
     *   or -1 if this map contains no mapping for the key.
     * - void remove(key) removes the key and its corresponding value if the map 
     *   contains the mapping for the key.
     */
    static class MyHashMap {
        // TODO: Define key-value pair node and bucket array (Separate Chaining).

        public MyHashMap() {
            
        }
        
        public void put(int key, int value) {
            // TODO: Implement
        }
        
        public int get(int key) {
            // TODO: Implement
            return 0;
        }
        
        public void remove(int key) {
            // TODO: Implement
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
     * Mentor Question: In your `MyHashMap` implementation, what internal data structure 
     * represents the entries inside a bucket (e.g. a Key-Value pair class)? 
     * How do you update the value if a key already exists rather than adding a duplicate?
     * 
     * Your Answer: 
     * 
     */
}
