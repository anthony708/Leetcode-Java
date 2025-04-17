    package hot100.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    
    public class MajorityElement {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i: nums) {
                if(map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }

            int majorityCnt = 0;
            int majorityElement = 0;
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if (entry.getValue() > majorityCnt) {
                    majorityCnt = entry.getValue();
                    majorityElement = entry.getKey();
                }
            }

            return majorityElement;
        }

        public int majorityElement_2(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }
    