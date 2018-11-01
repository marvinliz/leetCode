package array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class ThreeSumTest {

    @Test
    public void test() {
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        Integer[][] result = new Integer[][] {
                {-1, -1, 2},
                {-1, 0, 1}
        };

        Assert.assertArrayEquals(result[0], new ThreeSum().threeSum(nums).get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(result[1], new ThreeSum().threeSum(nums).get(1).toArray(new Integer[]{}));
    }

    @Test
    public void test1() {
        int[] nums = new int[] {1, -1, -1, 0};
        Integer[][] result = new Integer[][] {
                {-1, 0, 1}
        };

        Assert.assertArrayEquals(result[0], new ThreeSum().threeSum(nums).get(0).toArray(new Integer[]{}));
    }
}
