package topic16_bit_manipulation_math;


/**
 * Example: Single Number (using XOR)
 */
public class Example {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
