package Stack;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * Medium
 * @author zhuduan
 * 2019/06/05
 */

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] T = {73, 74, 75, 71, 69, 72, 76, 73};
        for (int i: dailyTemperatures(T)) {
            System.out.print(i + " ");
        }
    }
}
