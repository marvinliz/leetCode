package linkedlist;

/**
 * ReverseNodesInKGroup
 *
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/description/">source</a>
 * @author LiDaQian
 */
public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy, prev = dummy, temp;
        while (true) {
            // 获取需翻转的尾节点
            int count = k;
            while (count > 0 && tail != null) {
                tail = tail.next;
                count--;
            }
            // 如果尾节点是空的，则已经翻转完毕
            if (tail == null) {
                break;
            }
            // 设置下一次循环的头结点
            head = prev.next;
            // 翻转
            // 每循环一次，temp插入至tail.next中
            while(prev.next != tail) {
                temp = prev.next;
                prev.next = temp.next;

                temp.next = tail.next;
                tail.next = temp;
            }

            tail = head;
            prev = head;
        }

        return dummy.next;
    }
}
