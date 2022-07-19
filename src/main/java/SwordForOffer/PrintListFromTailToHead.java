package SwordForOffer;

/*
Problem 5
题目描述
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

import Util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> newList = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            newList.add(stack.pop().val);
        }

        return newList;
    }
}
