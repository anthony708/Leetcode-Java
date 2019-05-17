package LinkedList;

import Util.ListNode;

/**
 * 876. Middle of the Linked List
 * Medium
 * @author zhuduan
 * 2019/05/17
 */

public class MiddleofTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode step = head;
        ListNode step2 = head;
        while (step2.next != null && step2 != null) {
            step2 = step2.next.next;
            step = step.next;
        }
        return step;
    }
}
