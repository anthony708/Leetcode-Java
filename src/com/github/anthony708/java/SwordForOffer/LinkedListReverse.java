package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/11.
 */

import com.github.anthony708.java.utils.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class LinkedListReverse {

    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<ListNode> stack = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            ListNode head = listNode;
            while (head != null) {
                stack.push(head);
                head = head.next;
            }
            while (!stack.isEmpty()) {
                list.add(stack.pop().val);
            }
            return list;
        }

        public void printListFromTailToHeadRecursively(ListNode listNode) {
            ListNode head = listNode;
            if (listNode != null) {
                if (listNode.next != null) {
                    printListFromTailToHeadRecursively(listNode.next);
                }
                System.out.println(listNode.val);
            }
        }

    }
}
