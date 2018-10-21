package linkedlist;

/**
 * LinkedListCycle
 *
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/description/">leetCode</a>
 * @author LiDaQian
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
