package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    public void test() {
        int[] prices = new int[] {1, 3, 2, 8, 4, 9};
        int fee = 2;

        Assert.assertEquals(8, new BestTimeToBuyAndSellStockWithTransactionFee().maxProfit(prices, fee));
    }
}
