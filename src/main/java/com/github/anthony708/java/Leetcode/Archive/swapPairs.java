package com.github.anthony708.java.LeetCode.Archive;

/**
 * Created by Anthony on 15/12/4.
 */
public class swapPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairsNonIteraive(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode curNode = fakeHead;
        while (curNode.next != null && curNode.next.next != null) {
            ListNode first = curNode.next;
            ListNode second = curNode.next.next;
            first.next = second.next;
            curNode.next = second;
            curNode.next.next = first;
            curNode = curNode.next.next;
        }
        return fakeHead.next;
    }

    public ListNode swapPairsIterative(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode cur =  head.next;
        head.next = swapPairsIterative(head.next.next);
        cur.next = head;
        return cur;
    }
}
