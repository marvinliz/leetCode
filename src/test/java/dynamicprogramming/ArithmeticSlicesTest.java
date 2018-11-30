package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class ArithmeticSlicesTest {

    @Test
    public void test() {
        int[] A = new int[] {1, 2, 3, 4};

        Assert.assertEquals(3, new ArithmeticSlices().numberOfArithmeticSlices(A));
    }

    @Test
    public void test1() {
        int[] A = new int[] {1, 2, 3, 4, 5, 6};

        Assert.assertEquals(10, new ArithmeticSlices().numberOfArithmeticSlices(A));
    }
}
