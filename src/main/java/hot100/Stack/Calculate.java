package hot100.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Leetcode 227
 * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。

整数除法仅保留整数部分。
 */

public class Calculate {
    public static int calculate(String s) {
        // 加号: 数字压入栈
        // 减号: 数字的相反数入栈
        // 乘除号: 计算数字与栈顶元素计算, 并将结果替换栈顶元素
        int num = 0;
        char op = '+';

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!(Character.isDigit(s.charAt(i))) && s.charAt(i) != ' ' || i == s.length() - 1) {
                switch(op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    default:
                }
                op = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String s = " 3 +  2 / 2 ";
        System.out.println(calculate(s));
    }
}
