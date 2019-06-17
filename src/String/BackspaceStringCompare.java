package String;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return backspaceHelper(S).equals(backspaceHelper(T));
    }

    private static String backspaceHelper(String str) {
        StringBuilder sb =  new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
