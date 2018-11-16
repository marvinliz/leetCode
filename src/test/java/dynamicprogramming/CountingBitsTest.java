package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class CountingBitsTest {

    @Test
    public void test() {
        int[] answer = new int[] {0, 1, 1, 2, 1, 2};

        Assert.assertArrayEquals(answer, new CountingBits().countBits(answer.length - 1));
    }
}
