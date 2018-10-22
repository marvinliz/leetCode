package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement Stack using Queues
 *
 * @see <a href="https://leetcode.com/problems/implement-stack-using-queues/description/">source</a>
 * @author LiDaQian
 */
public class MyStack {

    private Queue<Integer> stack;
    private Queue<Integer> temp;

    /** Initialize your data structure here. */
    public MyStack() {
        stack = new LinkedList<>();
        temp = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (!stack.isEmpty()) {
            Integer element = stack.poll();
            temp.offer(element);
        }
        stack.offer(x);
        while (!temp.isEmpty()) {
            Integer element = temp.poll();
            stack.offer(element);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return stack.poll();
    }

    /** Get the top element. */
    public int top() {
        return stack.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
