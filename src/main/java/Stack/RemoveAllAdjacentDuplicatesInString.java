package Stack;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 * Easy
 * @author zhuduan
 * 2019/05/23
 */

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c: S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String S = "abbaca";
        System.out.println(removeDuplicates(S));
    }
}
