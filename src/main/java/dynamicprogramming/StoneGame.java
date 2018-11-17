package dynamicprogramming;

/**
 * Stone Game
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/stone-game/description/">source</a>
 */
public class StoneGame {

    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        // dp[i][j]代表 在[piles[i], ..., piles[j]]中能挑选石头的最大值
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        for (int d = 1; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                // i=最左端 i+d=最右端
                dp[i][i + d] = Math.max(piles[i] - dp[i + 1][i + d], piles[i + d] - dp[i][i + d - 1]);
            }
        }

        return dp[0][n - 1] > 0;
    }
}
