package greedy;

import java.util.Arrays;

/**
 * Boats to Save People
 *
 * @see <a href="https://leetcode.com/problems/boats-to-save-people/">source</a>
 * @author LiDaQian
 */
public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 1) {
            return people[0] > limit ? 1 : -1;
        }

        Arrays.sort(people);
        // 排序后，挑选最大和最小的人上船
        // 如果最大+最小比 limit 大，则选择最大的上船
        // 否则最大和最小上船
        int result = 0;
        for (int low = 0, high = people.length - 1; low <= high; high--) {
            if (people[low] + people[high] <= limit) {
                result++;
                low++;
            } else {
                result++;
            }
        }

        return result;
    }
}
