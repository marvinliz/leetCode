package linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class LinkedListCycle2Test {

    @Test
    public void testNoCycle() {
        ListNode head = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});

        Assert.assertNull(new LinkedListCycle2().detectCycle(head));
        Assert.assertNull(new LinkedListCycle2().detectCycle2(head));
    }

    @Test
    public void testHaveCycle() {
        ListNode head = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});
        head.next.next.next = head.next;

        Assert.assertEquals(head.next, new LinkedListCycle2().detectCycle(head));
        Assert.assertEquals(head.next, new LinkedListCycle2().detectCycle2(head));
    }
}
