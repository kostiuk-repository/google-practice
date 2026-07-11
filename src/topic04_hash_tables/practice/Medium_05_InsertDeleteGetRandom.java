package topic04_hash_tables.practice;

import java.util.*;

public class Medium_05_InsertDeleteGetRandom {

    /**
     * Problem: Insert Delete GetRandom O(1)
     * 
     * Implement the RandomizedSet class:
     * - RandomizedSet() Initializes the RandomizedSet object.
     * - boolean insert(int val) Inserts an item val into the set if not present. 
     *   Returns true if the item was not present, false otherwise.
     * - boolean remove(int val) Removes an item val from the set if present. 
     *   Returns true if the item was present, false otherwise.
     * - int getRandom() Returns a random element from the current set of elements. 
     *   Each element must have the same probability of being returned.
     * 
     * Constraint: You must implement the functions of the class such that each function 
     * works in average O(1) time complexity.
     */
    static class RandomizedSet {
        // TODO: Define a Map for O(1) value-to-index mapping and a List for O(1) random retrieval.

        public RandomizedSet() {
            
        }
        
        public boolean insert(int val) {
            // TODO: Implement
            return false;
        }
        
        public boolean remove(int val) {
            // TODO: Implement
            return false;
        }
        
        public int getRandom() {
            // TODO: Implement
            return 0;
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
     * Mentor Question: A HashSet allows O(1) insert and delete, but does not support O(1) 
     * random retrieval because set elements are not indexed contiguously. 
     * An ArrayList allows O(1) random retrieval (via random index generation) and O(1) insertion, 
     * but removal takes O(N) due to element shifting.
     * Explain how combining a HashMap and an ArrayList allows you to delete an element in O(1) time 
     * by swapping the element to be deleted with the *last* element in the list.
     * 
     * Your Answer: 
     * 
     */
}
