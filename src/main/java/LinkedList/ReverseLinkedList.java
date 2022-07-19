package LinkedList;

import Util.ListNode;

/**
 * #206 Reverse Linked List
 * Easy
 * @author zhuduan
 * 2018/09/27
 */

public class ReverseLinkedList {

    // Iterative method
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode node = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }

    // Recursive method:
    public ListNode reverseList2(ListNode head) {
        if (head == null) return head;
        ListNode next = head.next;
        head.next = null;
        return recursive(head, next);
    }

    private ListNode recursive(ListNode head, ListNode next) {
        if (next == null) return head;
        ListNode temp = next.next;
        next.next = head;
        return recursive(next, temp);
    }
}
