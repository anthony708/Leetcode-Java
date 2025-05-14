package hot100.HashMap;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();

        // 首先将数组中所有数进行一个去重, 放到 hashset 中
        for (int num : nums) {
            num_set.add(num);
        }

        int longestConsecutive = 0;

        // 遍历 hashset 中的每一个数, 如果当前数的前一个数不在 hashset 中, 则从当前数开始向后遍历, 直到找到一个不在 hashset 中的数
        // 找到第一个数很重要, 如果不是第一个数则直接跳过, 否则是第一个数则开始找后面的数
        for (int num: num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestConsecutive = Math.max(longestConsecutive, currentStreak);
            }
        }

        return longestConsecutive;
    }
}
