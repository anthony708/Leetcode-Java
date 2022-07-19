package com.github.anthony708.java.LeetCode.Archive;

import java.util.Stack;

/**
 * Created by Anthony on 16/1/13.
 */
public class MyStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if (minStack.size() == 0) {
            minStack.push(node);
        } else {
            int temp = minStack.peek();
            if (temp > node) {
                minStack.push(node);
            } else {
                minStack.push(temp);
            }
        }
        stack.push(node);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if (minStack.isEmpty()) {
            return 0;
        }
        return minStack.peek();
    }
}
