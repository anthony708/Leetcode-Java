package main.java.TopInterviewQuestions;

import main.java.Util.ListNode;

/*
    237. Delete Node in a Linked List
    Easy
    2019-08-09
 */

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
