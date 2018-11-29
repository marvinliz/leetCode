package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class PalindromicSubstringsTest {

    @Test
    public void test() {
        String s = "abc";

        Assert.assertEquals(3, new PalindromicSubstrings().countSubstrings(s));
    }

    @Test
    public void test1() {
        String s = "aaa";

        Assert.assertEquals(6, new PalindromicSubstrings().countSubstrings(s));
    }

    @Test
    public void test2() {
        String s = "fdsklf";

        Assert.assertEquals(6, new PalindromicSubstrings().countSubstrings(s));
    }
}
