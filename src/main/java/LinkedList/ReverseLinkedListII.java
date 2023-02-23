package main.java.LinkedList;

import main.java.Util.ListNode;

import java.util.Stack;

/**
 * 92. Reverse Linked List II
 * Medium
 * @author zhuduan
 * 2019/04.28
 */

/* 反转链表从m到n的一部分
    Step1: 找到m节点的位置, 设置一个dummy节点指向head
    Step2: 进行反转直到n点, 每读到一个节点就插入m之前的位置
*/

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        for (int i = 0; i < m; i++) {
            pre = pre.next;
        }

        ListNode temp = pre.next;

        Stack<ListNode> stack = new Stack<>();

        for (int i = 0; i <= n - m; i++) {
            stack.push(temp);
            temp = temp.next;
        }

        ListNode post = temp;

        ListNode result = stack.pop();
        temp = result;

        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        pre.next = result;
        temp.next = post;
        return dummy.next;
    }
}
