package main.java.Array;

/**
 *
 * 1. Two Sum
 * Easy
 * @author zhuduan
 * 2019/06/19
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,7,6,10};
        int target = 9;
        int[] res = twoSum(nums, target);
        for (int n: res) {
            System.out.println(n);
        }
    }
}
