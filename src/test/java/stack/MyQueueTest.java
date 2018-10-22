package stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class MyQueueTest {

    @Test
    public void test() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        Assert.assertEquals(1, queue.peek());
        Assert.assertEquals(1, queue.pop());
        Assert.assertFalse(queue.empty());
    }
}
