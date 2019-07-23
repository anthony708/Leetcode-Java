package String;

import java.util.Stack;

/**
 * 1106. Parsing A Boolean Expression
 * Hard
 * @author zhuduan
 * 2019/07/18
 */

public class ParsingABooleanExpression {
    public boolean parseBooleanExpr(String expression) {
        int length = expression.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = expression.charAt(i);
            if (c == ')') {
                boolean trueFlag = false;
                boolean falseFlag = false;
                while (stack.peek() != '(') {
                    if (stack.pop() == 't') {
                        trueFlag = true;
                    } else {
                        falseFlag = true;
                    }
                }

                stack.pop();

                char oper = stack.pop();
                if (oper == '&') {
                    stack.push(falseFlag ? 'f' : 't');
                } else if (oper == '|') {
                    stack.push(trueFlag ? 't' : 'f');
                } else {
                    stack.push(trueFlag ? 'f' : 't');
                }

            } else if (c != ',') {
                stack.push(c);
            }
        }

        return stack.pop() == 't';
    }

    public static void main(String[] args) {
        ParsingABooleanExpression parsingABooleanExpression = new ParsingABooleanExpression();
        String expression = "|(&(t,f,t),!(t))";
        System.out.println(parsingABooleanExpression.parseBooleanExpr(expression));
    }

}
