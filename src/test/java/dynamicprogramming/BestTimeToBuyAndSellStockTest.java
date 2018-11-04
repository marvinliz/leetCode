package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test() {
        int[] price = new int[] {7,1,5,3,6,4};
        int result = 5;

        Assert.assertEquals(result, new BestTimeToBuyAndSellStock().maxProfit(price));
    }

    @Test
    public void test1() {
        int[] price = new int[] {7,6,4,3,1};
        int result = 0;

        Assert.assertEquals(result, new BestTimeToBuyAndSellStock().maxProfit(price));
    }
}
