package hot100.TwoPointers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum_2 {
    public List<List<Integer>> threeSumTarget(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // 跳过重复的 nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // 剪枝: 最小和已超过 target
            int minSum = nums[i] + nums[i+1] + nums[i+2];
            if (minSum > target) break;

            // 剪枝: 当前 i 对应的最大和不满足 target
            int maxSum = nums[i] + nums[n-2] + nums[n-1];
            if (maxSum < target) continue;

            // 双指针
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 跳过重复的 left 和 right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
