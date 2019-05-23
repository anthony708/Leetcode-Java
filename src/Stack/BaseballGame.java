package Stack;

import java.util.Stack;

/**
 * 682. Baseball Game
 * Easy
 * @author zhuduan
 * 2019/05/23
 */

public class BaseballGame {
    public int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                int tmp = tmp1 + tmp2;
                res += tmp;
                stack.push(tmp2);
                stack.push(tmp1);
                stack.push(tmp);
            } else if (ops[i].equals("D")) {
                int tmp = stack.pop();
                int tmp_d = tmp * 2;
                res += tmp_d;
                stack.push(tmp);
                stack.push(tmp_d);
            } else if (ops[i].equals("C")) {
                int cancel = stack.pop();
                res -= cancel;
            } else {
                int tmp = Integer.parseInt(ops[i]);
                res += tmp;
                stack.push(tmp);
            }
        }
        return res;
    }
}
