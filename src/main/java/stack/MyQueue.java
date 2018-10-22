package stack;

import java.util.Stack;

/**
 * Implement Queue using Stacks
 *
 * @see <a href="https://leetcode.com/problems/implement-queue-using-stacks/description/">source</a>
 * @author LiDaQian
 */
public class MyQueue {

    private Stack<Integer> queue;
    private Stack<Integer> temp;

    /** Initialize your data structure here. */
    public MyQueue() {
        queue = new Stack<>();
        temp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!queue.isEmpty()) {
            temp.push(queue.pop());
        }
        queue.push(x);
        while (!temp.isEmpty()) {
            queue.push(temp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue.pop();
    }

    /** Get the front element. */
    public int peek() {
        return queue.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

}
