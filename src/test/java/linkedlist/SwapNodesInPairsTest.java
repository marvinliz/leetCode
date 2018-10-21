package linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class SwapNodesInPairsTest {

    @Test
    public void testCase1() {
        ListNode source = ListNode.generateByArray(new int[] {1, 2, 3, 4});
        ListNode result = ListNode.generateByArray(new int[] {2, 1, 4, 3});

        Assert.assertEquals(result, new SwapNodesInPairs().swapPairs(source));
    }
}
