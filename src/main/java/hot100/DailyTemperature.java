package hot100;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。

 

示例 1:

输入: temperatures = [73,74,75,71,69,72,76,73]
输出: [1,1,4,2,1,1,0,0]
示例 2:

输入: temperatures = [30,40,50,60]
输出: [1,1,1,0]
示例 3:

输入: temperatures = [30,60,90]
输出: [1,1,0]

 */

public class DailyTemperature {
    public int[] dailyTemperature(int[] temperatures) {
        // 单调栈, 存储下标
        // 正向遍历数组, 对于当前元素 temperatures[i], 如果栈为空则将 i 进栈; 
        // 如果栈不为空则比较栈顶元素 temperatures[prevIndex] 和 当前温度 temperatures[i]
        // 如果当前温度较大, 则将 prevIndex 移除, 将 i - prevIndex 更新为对应天数
        // 此时即将进栈的 i 对应的 temperatures[i] 一定是 temperatures[prevIndex] 右边第一个比它大的元素
        Deque<Integer> stack = new LinkedList<>();
        // 维护一个 res 数组
        int[] res = new int [temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while( !stack.isEmpty() && temp > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        DailyTemperature dt = new DailyTemperature();
        int[] res = dt.dailyTemperature(temperatures);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
