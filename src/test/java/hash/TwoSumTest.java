package hash;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class TwoSumTest {

    @Test
    public void test1() {
        TwoSum twoSum = new TwoSum();

        Assert.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}
