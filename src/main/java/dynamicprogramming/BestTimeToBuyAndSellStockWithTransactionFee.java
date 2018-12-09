package dynamicprogramming;

/**
 * Best Time to Buy and Sell Stock with Transaction Fee
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/">source</a>
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int maxEarned = 0;
        int cost = -prices[0];

        // 总体思路是用了贪心，如果卖是赚钱的就赚，如果买是赚钱的就买
        for (int i = 1; i < prices.length; i++) {
            // 是否选择卖出
            maxEarned = Math.max(maxEarned, cost + prices[i] - fee);
            // 是否选择买入
            cost = Math.max(cost, maxEarned - prices[i]);
        }

        return maxEarned;
    }
}
