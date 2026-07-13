package topic15_advanced_data_structures.practice;

public class Medium_04_DesignAddSearchWords {

        /**
     * Problem: Design Add and Search Words Data Structure
     *
     * Design a data structure that supports adding new words and finding if a string
     * matches any previously added string.
     *
     * Implement the WordDictionary class:
     *
     *   - WordDictionary() Initializes the object.
     *   - void addWord(word) Adds word to the data structure, it can be matched later.
     *   - bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
     *
     * Example:
     * Input
     * ["WordDictionary","addWord","addWord","addWord","search","search","search","sear
     * ch"]
     * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
     * Output
     * [null,null,null,null,false,true,true,true]
     *
     * Explanation
     * WordDictionary wordDictionary = new WordDictionary();
     * wordDictionary.addWord("bad");
     * wordDictionary.addWord("dad");
     * wordDictionary.addWord("mad");
     * wordDictionary.search("pad"); // return False
     * wordDictionary.search("bad"); // return True
     * wordDictionary.search(".ad"); // return True
     * wordDictionary.search("b.."); // return True
     *
     * Constraints:
     *
     *   - 1 <= word.length <= 25
     *   - word in addWord consists of lowercase English letters.
     *   - word in search consist of '.' or lowercase English letters.
     *   - There will be at most 2 dots in word for search queries.
     *   - At most 10^4 calls will be made to addWord and search.
     */
    public boolean search(String word) {
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
     * Mentor Question: Як обробити символ '.' ( wildcard) у запиті пошуку в Trie за допомогою DFS?
     * 
     * Your Answer: 
     * 
     */
}
