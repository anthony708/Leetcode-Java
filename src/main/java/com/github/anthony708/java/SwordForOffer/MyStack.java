package com.github.anthony708.java.SwordForOffer;

import java.util.Stack;

/**
 * Created by Anthony on 16/5/4.
 */
public class MyStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if (minStack.size() == 0) {
            minStack.push(node);
        } else {
            int temp = minStack.peek();
            if (temp < node) {
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
        int top = stack.peek();
        return top;
    }

    public int min() {
        return minStack.peek();
    }
}
