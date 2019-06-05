package Stack;

/**
 * 921. Minimum Add to Make Parentheses Valid
 * Medium
 * @author zhuduan
 * 2019/06/05
 */

public class MinimumAddtoMakeParenthesesValid {
    public static int midAddToMakeValid(String S) {
        int left = 0, right = 0;
        for (char c: S.toCharArray()) {
            if (right == 0 && c == ')') {
                left++;
            } else {
                right += c == '(' ? 1 : -1;
            }
        }
        return left + right;
    }

    public static void main(String[] args) {
        String S = ")((()((";
        System.out.println(midAddToMakeValid(S));
    }
}
