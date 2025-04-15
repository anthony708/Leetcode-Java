package hot100.Array;

import java.util.Stack;

/*
 * 部分翻转数组, 如给一个数组 nums = [1,2,3,4,5,6,7,8] 和 k=3, 按照 k 的长度翻转为[3,2,1,6,5,4,8,7]
 */

public class PartialReverseArray {
    public int[] partialReverseArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) return null;
        
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int end = Math.min(i + k - 1, nums.length - 1);

            Stack<Integer> stack = new Stack<>();
            for (int j = start; j <= end; j++) {
                stack.push(nums[j]);
            }

            for (int j = start; j <= end; j++) {
                nums[j] = stack.pop();
            }
        }

        return nums;
    }
}
