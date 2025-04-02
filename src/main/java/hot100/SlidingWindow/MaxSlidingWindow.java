package hot100.SlidingWindow;
/*
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。

返回 滑动窗口中的最大值 。

 

示例 1：

输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
输出：[3,3,5,5,6,7]
解释：
滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
示例 2：

输入：nums = [1], k = 1
输出：[1]

 */

import java.util.ArrayDeque;
import java.util.Deque;

class MaxSlidingWindow {
    // 单调队列, 队首元素始终是当前窗口的最大值
    // 双端队列 q, 用来存储元素的索引

    // 遍历数组, 分为三个步骤
    // 入队: 维护队列单调性, 移除比当前元素小的尾部元素
    // 出队: 移除越界的队首元素
    // 记录: 记录窗口的最大值

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int [nums.length - k + 1];
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // 入队
            while (!q.isEmpty() && nums[i] >= nums[q.getLast()]) {
                q.removeLast();
            }
            q.addLast(i);
            // 出队
            if (i - q.getFirst() >= k) {
                q.removeFirst();
            }
            // 记录
            if (i >= k - 1) {
                res[i - k + 1] = nums[q.getFirst()];
            }
        }
        return res;
    }    

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
