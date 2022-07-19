package main.java.TopInterviewQuestions;

/*
    46. Permutations
    Medium
    2019-08-07
 */

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int start, int[] nums, List<Integer> current, List<List<Integer>> res) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>(current);
            res.add(current);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            current.add(nums[start]);

            dfs(start + 1, nums, current, res);
            current.remove(current.size() - 1);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permutation permutation = new Permutation();
        for (List<Integer> list: permutation.permute(nums)) {
            for (int i: list) {
                System.out.print(i + ' ');
            }
            System.out.println();
        }
    }
}
