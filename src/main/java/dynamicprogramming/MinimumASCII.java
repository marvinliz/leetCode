package dynamicprogramming;

/**
 * Minimum ASCII Delete Sum for Two Strings
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/">source</a>
 */
public class MinimumASCII {

    int[][] dp;

    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length() + 1][s2.length() + 1];
        return dp(s1, s1.length(), s2, s2.length());
    }

    private int dp(String s1, int i, String s2, int j) {
        if (i == 0 && j == 0) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        if (i == 0) {
            return dp[i][j] = dp(s1, i, s2, j - 1) + s2.charAt(j - 1);
        }
        if (j == 0) {
            return dp[i][j] = dp(s1, i - 1, s2, j) + s1.charAt(i - 1);
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = dp(s1, i - 1, s2, j - 1);
        }

        return dp[i][j] = Math.min(
                dp(s1, i - 1, s2, j) + s1.charAt(i - 1),
                dp(s1, i, s2, j - 1) + s2.charAt(j - 1));
    }
}
