package linkedlist;

/**
 * Reverse a singly linked list.
 *
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/description/">leetCode</a>
 * @author LiDaQian
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head, prev = null, next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
