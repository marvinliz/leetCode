package linkedlist;

/**
 * SwapNodesInPairs
 *
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/description/">leetCode</a>
 * @author LiDaQian
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        pre.next = head;
        while (pre.next != null && pre.next.next != null) {
            ListNode a = pre.next;
            ListNode b = a.next;

            ListNode temp = b.next;
            pre.next = b;
            b.next = a;
            a.next = temp;
            pre = a;
        }

        return dummy.next;
    }
}
