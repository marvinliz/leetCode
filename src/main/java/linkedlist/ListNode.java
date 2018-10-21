package linkedlist;

import java.util.Objects;

/**
 * @author LiDaQian
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    public static ListNode generateByArray(int[] array) {
        ListNode head = null, prev = null, cur;
        for (int i : array) {
            cur = new ListNode(i);
            if (head == null) {
                head = cur;
            } else {
                prev.next = cur;
            }
            prev = cur;
        }

        return head;
    }
}
