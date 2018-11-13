package String;

import java.util.Stack;

/**
 * #20 Valid Parentheses
 * Easy
 * @author zhuduan
 * 2018/09/12
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c:s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.pop() != c || stack.isEmpty()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
