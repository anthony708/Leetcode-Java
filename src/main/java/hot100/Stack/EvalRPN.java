package hot100.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。

请你计算该表达式。返回一个表示表达式值的整数。

 * 逆波兰表达式：

逆波兰表达式是一种后缀表达式，所谓后缀就是指算符写在后面。

平常使用的算式则是一种中缀表达式，如 ( 1 + 2 ) * ( 3 + 4 ) 。
该算式的逆波兰表达式写法为 ( ( 1 2 + ) ( 3 4 + ) * ) 。
逆波兰表达式主要有以下两个优点：

去掉括号后表达式无歧义，上式即便写成 1 2 + 3 4 + * 也可以依据次序计算出正确结果。
适合用栈操作运算：遇到数字则入栈；遇到算符则取出栈顶两个数字进行计算，并将结果压入栈中
 */

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        // 遇到操作数, 则操作数入栈
        // 遇到操作符, 则将两个操作数出栈, 使用操作符对两个操作数进行运算, 运算结果重新入栈
        Deque<Integer> deque = new ArrayDeque<>();
        int length = tokens.length;

        for (int i = 0; i < length; i++) {
            String token = tokens[i];
            if (isNumber(token)) {
                deque.add(Integer.parseInt(token));
            } else {
                int num2 = deque.pop();
                int num1 = deque.pop();
                switch(token) {
                    case "+":
                        deque.push(num2 + num1);
                        break;
                    case "-":
                        deque.push(num1  - num2);
                        break;
                    case "*":
                        deque.push(num1 * num2);
                        break;
                    case "/":
                        deque.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return deque.pop();
    }

    private static boolean isNumber(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(new EvalRPN().evalRPN(tokens));
    }
}
