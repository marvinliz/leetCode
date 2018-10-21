package linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class LinkedListCycleTest {

    @Test
    public void testNoCycle() {
        ListNode head = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});

        Assert.assertFalse(new LinkedListCycle().hasCycle(head));
    }

    @Test
    public void testHaveCycle() {
        ListNode head = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});
        head.next.next.next = head.next;

        Assert.assertTrue(new LinkedListCycle().hasCycle(head));
    }
}
