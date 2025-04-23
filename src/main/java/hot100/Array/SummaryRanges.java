package hot100.Array;

import java.util.ArrayList;

/*
 * 给定一个  无重复元素 的 有序 整数数组 nums 。

返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。

列表中的每个区间范围 [a,b] 应该按如下格式输出：

"a->b" ，如果 a != b
"a" ，如果 a == b
 */

import java.util.List;

public class SummaryRanges {
    public List<String> summaryRangers(int[] nums) {
        List<String> res = new ArrayList<>();

        // 双指针遍历数组, i和 j 分别代表区间的左右边界
        // j + 1 < n 且 nums[j + 1] = nums[j] + 1时, 指针 j 向右移动; 否则区间 [i, j]已经找到
        // 然后将 i 移到 j+1 的位置

        for (int i = 0, j, n = nums.length; i < n; i = j + 1) {
            j = i;
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }
            res.add(help(nums, i, j));
        }
        return res;
    }

    private String help(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i] + "";
        } else {
            return String.format("%d->%d", nums[i], nums[j]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1,2, 4,5,7};
        SummaryRanges sr = new SummaryRanges();
        List<String> list = sr.summaryRangers(nums);
        for (String str: list) {
            System.out.println(str);
        }
    }
}
