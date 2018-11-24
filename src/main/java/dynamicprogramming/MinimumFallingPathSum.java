package dynamicprogramming;

/**
 * Minimum Falling Path Sum
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/minimum-falling-path-sum/description/">source</a>
 */
public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] A) {
        int[][] minimumArray = new int[A.length][A.length];

        int minimum = Integer.MAX_VALUE;
        // 当前阶段的最小值 = 当前值 + 下一阶段的最小值
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = 0; j < A.length; j++) {
                if (i == A.length - 1) {
                    minimumArray[i][j] = A[i][j];
                } else {
                    if (j == 0) {
                        minimumArray[i][j] = A[i][j] + Math.min(minimumArray[i + 1][j], minimumArray[i + 1][j + 1]);
                    } else if (j == A.length - 1) {
                        minimumArray[i][j] = A[i][j] + Math.min(minimumArray[i + 1][j], minimumArray[i + 1][j - 1]);
                    } else {
                        minimumArray[i][j] = A[i][j] + Math.min(Math.min(minimumArray[i + 1][j], minimumArray[i + 1][j - 1]), minimumArray[i + 1][j + 1]);
                    }
                }
                if (i == 0) {
                    minimum = Math.min(minimumArray[i][j], minimum);
                }
            }
        }

        return minimum;
    }
}
