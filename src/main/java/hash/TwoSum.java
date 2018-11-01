package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * @see <a href="https://leetcode.com/problems/two-sum/description/">source</a>
 * @author LiDaQian
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}