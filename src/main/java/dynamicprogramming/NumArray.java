package dynamicprogramming;

/**
 * Range Sum Query - Immutable
 *
 * @see <a href="https://leetcode.com/problems/range-sum-query-immutable/description/">source</a>
 * @author LiDaQian
 */
public class NumArray {

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
