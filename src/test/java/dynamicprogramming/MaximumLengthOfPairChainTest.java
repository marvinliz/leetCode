package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class MaximumLengthOfPairChainTest {

    @Test
    public void test() {
        int[][] pairs = new int[][] {
                {1, 2}, {2, 3}, {3, 4}
        };

        Assert.assertEquals(2, new MaximumLengthOfPairChain().findLongestChain(pairs));
    }

    @Test
    public void testUnSort() {
        int[][] pairs = new int[][] {
                {3, 4}, {2, 3}, {1, 2}
        };

        Assert.assertEquals(2, new MaximumLengthOfPairChain().findLongestChain(pairs));
    }
}
