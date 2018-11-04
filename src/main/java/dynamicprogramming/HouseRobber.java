package dynamicprogramming;

/**
 * House Robber
 *
 * @see <a href="https://leetcode.com/problems/house-robber/description/">source</a>
 * @author LiDaQian
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) max1 = Math.max(max1 + nums[i], max2);
            else max2 = Math.max(max2 + nums[i], max1);
        }

        return Math.max(max1, max2);
    }
}
