package queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Sliding Window Maximum
 *
 * @see <a href="https://leetcode.com/problems/sliding-window-maximum/description/">source</a>
 * @author LiDaQian
 */
public class SlidingWindowMaximumTest {

    @Test
    public void test1() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

        Assert.assertArrayEquals(new int[]{3, 3, 2, 5}, slidingWindowMaximum.maxSlidingWindow(new int[] {1, 3, 1, 2, 0, 5}, 3));
    }

    @Test
    public void test2() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

        Assert.assertArrayEquals(new int[]{10, 10, 9, 2}, slidingWindowMaximum.maxSlidingWindow(new int[] {9, 10, 9, -7, -4, -8, 2, -6}, 5));
    }
}
