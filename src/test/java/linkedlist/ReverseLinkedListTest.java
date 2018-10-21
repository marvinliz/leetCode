package linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class ReverseLinkedListTest {

    @Test
    public void testCase1() {
        ListNode source = ListNode.generateByArray(new int[] {1, 2, 3, 4, 5});
        ListNode reverse = ListNode.generateByArray(new int[] {5, 4, 3, 2, 1});

        Assert.assertEquals(reverse, new ReverseLinkedList().reverseList(source));
    }
}
