package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class MinimumFallingPathSumTest {

    @Test
    public void test() {
        int[][] A = new int[][]{
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int minimum = new MinimumFallingPathSum().minFallingPathSum(A);

        Assert.assertEquals(12, minimum);
    }
}
