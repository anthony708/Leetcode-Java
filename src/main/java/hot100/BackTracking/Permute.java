package hot100.BackTracking;

import java.util.ArrayList;

/*
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

 

示例 1：

输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
示例 2：

输入：nums = [0,1]
输出：[[0,1],[1,0]]
示例 3：

输入：nums = [1]
输出：[[1]]

 */

import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        backtrack(res, l, nums);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> l, int[] nums) {
        if (l.size() == nums.length) {
            res.add(new ArrayList<Integer>(l));
        }

        for (int i = 0; i < nums.length; i++) {
            if (!l.contains(nums[i])) {
                l.add(nums[i]);
                backtrack(res, l, nums);
                l.remove(l.size() - 1);
            }
        }
    }
}
