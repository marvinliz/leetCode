package hash;

import org.junit.Assert;
import org.junit.Test;

/**
 * Valid Anagram
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/description/">source</a>
 * @author LiDaQian
 */
public class ValidAnagramTest {

    @Test
    public void test1() {
        Assert.assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(new ValidAnagram().isAnagram("rat", "car"));
    }

    @Test
    public void test3() {
        Assert.assertFalse(new ValidAnagram().isAnagram("bb", "ac"));
    }
}
