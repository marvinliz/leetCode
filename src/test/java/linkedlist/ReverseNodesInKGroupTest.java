package linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class ReverseNodesInKGroupTest {

    @Test
    public void testKIs2() {
        ListNode source = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});
        ListNode result = ListNode.generateByArray(new int[] {2, 1, 4, 3, 5});

        Assert.assertEquals(result, new ReverseNodesInKGroup().reverseKGroup(source, 2));
    }

    @Test
    public void testKIs3() {
        ListNode source = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});
        ListNode result = ListNode.generateByArray(new int[] {3, 2, 1, 4, 5});

        Assert.assertEquals(result, new ReverseNodesInKGroup().reverseKGroup(source, 3));

    }
}
