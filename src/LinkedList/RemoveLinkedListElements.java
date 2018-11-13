package LinkedList;

import Util.ListNode;

/**
 * #203 Remove Linked List Elements
 * Easy
 * @author zhuduan
 * 2018/09/20
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode curList = head;
        while (curList != null && curList.next != null) {
            if (curList.next.val == val) {
                curList.next = curList.next.next;
            } else {
                curList = curList.next;
            }
        }
        return head;
    }
}
