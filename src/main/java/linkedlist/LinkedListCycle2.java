package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * LinkedListCycleTwo
 *
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/description/">leetCode</a>
 * @author LiDaQian
 */
public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (set.contains(node)) {
                return node;
            }
            set.add(node);
            node = node.next;
        }

        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        ListNode q = getQ(head);
        ListNode p = head;
        while (p != null && q != null && p.next != null && q.next != null) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }

        return q;
    }

    private ListNode getQ(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
    }
}
