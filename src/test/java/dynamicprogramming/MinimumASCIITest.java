package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Minimum ASCII Delete Sum for Two Strings
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/">source</a>
 */
public class MinimumASCIITest {

    @Test
    public void test() {
        String s1 = "sea";
        String s2 = "eat";

        Assert.assertEquals(231, new MinimumASCII().minimumDeleteSum(s1, s2));
    }

    @Test
    public void test1() {
        String s1 = "delete";
        String s2 = "leet";

        Assert.assertEquals(403, new MinimumASCII().minimumDeleteSum(s1, s2));
    }

    @Test
    public void test2() {
        String s1 = "a";
        String s2 = "at";

        Assert.assertEquals(116, new MinimumASCII().minimumDeleteSum(s1, s2));
    }
}
