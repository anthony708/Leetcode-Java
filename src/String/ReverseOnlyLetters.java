package String;

import java.util.Stack;

/**
 * 917. Reverse Only Letters
 * Easy
 * @author zhuduan
 * 2019/06/25
 */

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c: S.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                stack.push(c);
            }
        }

        for (char c: S.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                sb.append(stack.pop());
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
