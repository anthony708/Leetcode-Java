package main.java.LinkedList;

import main.java.Util.ListNode;

/**
 * 141. Linked List Cycle
 * Easy
 * @author zhuduan
 * 2019/04/28
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }
}
