package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Anthony on 16/7/20.
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode pHead = listNode;
        while (pHead != null) {
            stack.push(pHead.val);
            pHead = pHead.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public ArrayList<Integer> PrintListRecursively(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

        printRecursive(listNode, list);
        return list;
    }
    public void printRecursive(ListNode listNode, ArrayList<Integer> out) {
        if (listNode != null) {
            if (listNode.next != null) {
                PrintListRecursively(listNode.next);
            }
            out.add(listNode.val);
        }
    }
}
