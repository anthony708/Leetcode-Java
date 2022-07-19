package com.github.anthony708.java.SwordForOffer;

import java.util.LinkedList;

/**
 * Created by Anthony on 16/7/21.
 */
public class QueuesToStack {
    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();

    public void push(int value) {
        queue1.addLast(value);
    }

    public int pop() {
        int queueSize = queue1.size() + queue2.size();
        if (queueSize != 0) {
            if (!queue1.isEmpty()) {
                putN_1ToAnotherQueue();
                return queue1.removeFirst();
            } else {
                putN_1ToAnotherQueue();
                return queue2.removeFirst();
            }
        } else {
            System.out.println("The stack is empty.");
            return -1;
        }
    }

    public void putN_1ToAnotherQueue() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.addLast(queue1.removeFirst());
            }
        } else if (!queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.addLast(queue2.removeFirst());
            }
        }
    }

    public static void main(String[] args) {
        QueuesToStack method = new QueuesToStack();
        method.push(1);
        method.push(2);
        method.push(3);
        method.push(4);
        System.out.println(method.pop());
        System.out.println(method.pop());
        method.push(5);
        method.push(6);
        System.out.println(method.pop());
        System.out.println(method.pop());
        System.out.println(method.pop());
        System.out.println(method.pop());
        System.out.println(method.pop());
    }
}
