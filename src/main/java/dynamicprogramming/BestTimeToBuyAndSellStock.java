package dynamicprogramming;

/**
 * Best Time to Buy and Sell Stock
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">source</a>
 * @author LiDaQian
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
