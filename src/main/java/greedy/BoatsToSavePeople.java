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

        int result = 0;
        for (int i = 0, j = people.length - 1; i <= j;) {
            if (people[i] + people[j] <= limit) {
                result++;
                i++;
                j--;
            } else {
                result++;
                j--;
            }
        }

        return result;
    }
}
