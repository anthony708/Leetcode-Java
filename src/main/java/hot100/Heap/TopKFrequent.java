package hot100.Heap;

import java.util.ArrayList;

/*
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。

 

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // 桶排序
        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int num = entry.getKey();
            int value = entry.getValue();

            if (buckets[value] == null) {
                buckets[value] = new ArrayList<>();
            }
            buckets[value].add(num);
        }

        // 对应结果输出, 从高频到低频
        List<Integer> resList = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && resList.size() < k; i--) {
            if (buckets[i] != null) {
                resList.addAll(buckets[i]);
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }

        return res;
    }
}
