package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Kth Largest Element in a Stream
 *
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/description/">source</>
 * @author LiDaQian
 */
public class KthLargest {

    final Queue<Integer> queue;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.queue = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }

        return queue.peek();
    }
}
