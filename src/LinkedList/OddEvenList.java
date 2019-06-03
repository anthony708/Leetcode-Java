package LinkedList;

import Util.ListNode;

/**
 * 328. Odd Even Linked List
 * Medium
 * @author zhuduan
 * 2019/05/31
 */

/*
The program should run in O(1) space complexity and O(nodes) time complexity.
 */

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
