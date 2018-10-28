package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Sliding Window Maximum
 *
 * @see <a href="https://leetcode.com/problems/sliding-window-maximum/description/">source</a>
 * @author LiDaQian
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            // 移除不在窗口中的元素
            if (i >= k && queue.peek() <= i - k) {
                queue.poll();
            }
            // 移除窗口中更小的元素
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }
            queue.offer(i);
            if (i >= k - 1) {
                result[index] = nums[queue.peek()];
                index++;
            }
        }
        return result;
    }
}
