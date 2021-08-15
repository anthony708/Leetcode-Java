package com.github.anthony708.java.Leetcode.Archive;

import java.util.Stack;

/**
 * Created by Anthony on 16/1/13.
 */
public class MyQueue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stackIn.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!stackOut.isEmpty()) {
            stackOut.pop();
        } else {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
                stackOut.pop();
            }
        }
    }

    // Get the front element.
    public int peek() {
        if (!stackOut.isEmpty()) {
            return stackOut.peek();
        } else {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
            return stackOut.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if (stackIn.isEmpty() && stackOut.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
