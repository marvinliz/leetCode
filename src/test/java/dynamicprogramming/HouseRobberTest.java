package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {

    @Test
    public void test() {
        int[] nums = new int[] {2, 1, 1, 2};
        int max = 4;

        Assert.assertEquals(max, new HouseRobber().rob(nums));
    }

    @Test
    public void test1() {
        int[] nums = new int[] {1, 2, 3, 1};
        int max = 4;

        Assert.assertEquals(max, new HouseRobber().rob(nums));
    }
}
