package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class NumArrayTest {

    @Test
    public void test() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        Assert.assertEquals(1, numArray.sumRange(0, 2));
        Assert.assertEquals(-1, numArray.sumRange(2, 5));
        Assert.assertEquals(-3, numArray.sumRange(0, 5));
    }
}
