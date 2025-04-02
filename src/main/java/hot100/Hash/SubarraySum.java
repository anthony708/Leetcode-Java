package hot100.Hash;

import java.util.HashMap;
import java.util.Map;

/*
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。

子数组是数组中元素的连续非空序列。

 

示例 1：

输入：nums = [1,1,1], k = 2
输出：2
示例 2：

输入：nums = [1,2,3], k = 3
输出：2

 */

class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        // 前缀和: 对于数组中的位置 j, 它的前缀和 pre[j] 是从第一个元素到第 j 个元素之和
        // 那么, 从第(i + 1) 到第 j 个元素的子数组之和, 可以用 pre[j] - pre[i] 表示

        // 使用 map 来存前缀和, 和每个前缀和出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // 初始化前缀和为0 的次数 1


        // 在逐渐遍历的过程中, 逐步增加 pre, 并且检查 pre - k是否在 map 中
        // pre - k的意义在于, 之前某个点的前缀和是 pre - k, 当前的累计和是 pre, 因此从那个点到当前的子数组之和恰好是 k ( pre - (pre - k) = k)
        // 因此, 没找到一个 pre - k存在于 map 中, 则计数 count 加上对应的次数
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int res = subarraySum(nums, k);
        System.out.println(res);
    }
}
