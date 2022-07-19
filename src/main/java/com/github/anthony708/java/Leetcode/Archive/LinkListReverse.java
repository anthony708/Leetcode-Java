package com.github.anthony708.java.LeetCode.Archive;

/**
 * Created by Anthony on 15/11/19.
 */
public class LinkListReverse {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
