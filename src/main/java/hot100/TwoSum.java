package hot100;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum_1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target- nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum_2(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
