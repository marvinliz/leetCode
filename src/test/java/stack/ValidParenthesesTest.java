package stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        String source = "{[()]}";

        Assert.assertTrue(new ValidParentheses().isValid(source));
    }

    @Test
    public void testIsNotValid() {
        String source = "([)]";

        Assert.assertFalse(new ValidParentheses().isValid(source));
    }
}
