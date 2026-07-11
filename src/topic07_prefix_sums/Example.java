package topic07_prefix_sums;


/**
 * Example Problem: Range Sum Query - Immutable
 */
public class Example {
    private int[] prefix;

    public Example(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
