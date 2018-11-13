package Stack;

import java.util.Stack;

/**
 * #155 Min Stack
 * Easy
 * @author zhuduan
 * 2018/10/10
 */

public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        if (x < min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
