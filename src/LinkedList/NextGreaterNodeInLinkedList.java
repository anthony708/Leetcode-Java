package LinkedList;

import Util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 1019. Next Greater Node In Linked List
 * Medium
 * @author zhuduan
 * 2019/05/17
 */

public class NextGreaterNodeInLinkedList {
    public int[] nextLargeNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }
        int[] res = new int[list.size()];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < res.length; i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                res[stack.peek()] = list.get(i);
            }
            stack.push(list.get(i));
        }
        return res;
    }
}
