package hot100.BackTracking;

/*
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。

 

示例 1：

输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
示例 2：

输入：nums = [0]
输出：[[],[0]]

 */

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> l = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return res;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            res.add(new ArrayList<Integer>(l));
            return;
        }
        l.add(nums[cur]);
        dfs(cur + 1, nums);
        l.remove(l.size() - 1);
        dfs(cur + 1, nums);
    }
}
