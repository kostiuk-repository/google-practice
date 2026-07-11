package topic06_sliding_window;


import java.util.HashMap;
import java.util.Map;

/**
 * Example Problem: Longest Substring Without Repeating Characters
 */
public class Example {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            if (charIndexMap.containsKey(rChar)) {
                left = Math.max(left, charIndexMap.get(rChar) + 1);
            }
            charIndexMap.put(rChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
