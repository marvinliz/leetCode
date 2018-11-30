package dynamicprogramming;

/**
 * Arithmetic Slices
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/arithmetic-slices/description/">source</a>
 */
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        int count = 0;
        int[] countArray = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                countArray[i] = 1 + countArray[i - 1];
                count += countArray[i];
            }
        }

        return count;
    }
}
