package hot100.Stack;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Leetcode 224
 * 
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
 * 
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 * 
 * Example 1:
 * Input: s = "1 + 1"
 * Output: 2
 * 
 * Example 2:
 * Input: s = " 2-1 + 2 "
 * Output: 3
 * 
 * Example 3:
 * Input: s = "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 * 
 * Constraints:
 * - 1 <= s.length <= 3 * 10^5
 * - s consists of digits, '+', '-', '(', ')', and ' '.
 * - s represents a valid expression
 * - '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid)
 * - '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid)
 * - There will be no two consecutive operators in the input
 * - Every number and running calculation will fit in a signed 32-bit integer
 */

public class CalculateII {
    public int calculateII(String s) {
        Deque<Integer> nums = new LinkedList<>(); // store numbers
        Deque<Character> ops = new LinkedList<>(); // store operators
        int n = s.length();
        int num = 0;
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                if (i > 0 && Character.isDigit(s.charAt(i-1))) {
                    nums.push(num);
                    num = 0;
                }
                if (c == '(') {
                    ops.push(c);
                } else if (c == ')') {
                    while (!ops.isEmpty() && ops.peek() != '(') {
                        nums.push(calculate(ops.pop(), nums.pop(), nums.pop()));
                    }
                    ops.pop(); // pop '('
                } else if (c == '+' || c == '-') {
                    while (!ops.isEmpty() && ops.peek() != '(') {
                        nums.push(calculate(ops.pop(), nums.pop(), nums.pop()));
                    }
                    ops.push(c);
                }
            }
        }
        
        if (num != 0 || (n > 0 && Character.isDigit(s.charAt(n-1)))) {
            nums.push(num);
        }
        
        while (!ops.isEmpty()) {
            nums.push(calculate(ops.pop(), nums.pop(), nums.pop()));
        }
        
        return nums.peek();
    }
    
    private int calculate(char op, int b, int a) {
        if (op == '+') return a + b;
        return a - b;
    }
}
