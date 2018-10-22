package queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class MyStackTest {

    @Test
    public void test() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        Assert.assertEquals(2, stack.top());
        Assert.assertEquals(2, stack.pop());
        Assert.assertFalse(stack.empty());
    }
}
