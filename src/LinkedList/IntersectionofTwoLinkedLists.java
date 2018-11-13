package LinkedList;

import Util.ListNode;

/**
 * #21 Intersection of Two Linked Lists
 * Easy
 * @author zhuduan
 * 2018/09/20
 */

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }
        while (lengthA < lengthB) {
            headB = headB.next;
            lengthB--;
        }

        while (headA != null && headB != null) {
            if (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return headA;
    }

    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
