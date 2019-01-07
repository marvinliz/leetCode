package dynamicprogramming;

import java.util.Arrays;

/**
 * Maximum Length of Pair Chain
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/maximum-length-of-pair-chain/">source</a>
 */
public class MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        if (pairs.length == 1) {
            return 1;
        }

        // 按照pairKey倒序
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        // dp[i] = pairs[i]的最长链
        int[] dp = new int[pairs.length];
        dp[0] = 1;

        for (int i = 1; i < pairs.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                dp[i] = pairs[i][0] > pairs[j][1] ? dp[j] + 1 : dp[i];
            }
        }

        return dp[dp.length - 1];
    }
}
