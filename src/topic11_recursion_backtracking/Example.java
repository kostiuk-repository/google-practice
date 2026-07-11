package topic11_recursion_backtracking;


import java.util.ArrayList;
import java.util.List;

/**
 * Example Problem: Permutations
 */
public class Example {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), results);
        return results;
    }
    
    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current)); // Make copy
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) continue; // Element already selected
            current.add(nums[i]);
            backtrack(nums, current, results);
            current.remove(current.size() - 1); // Undo choice
        }
    }
}
