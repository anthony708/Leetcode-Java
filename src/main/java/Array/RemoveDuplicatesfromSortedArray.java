package Array;

/**
 *
 * #26 Remove Duplicates from Sorted Array
 * Easy
 * @author zhuduan
 * 2018/09/10
 */

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] != nums[i]) {
                nums[result] = nums[i+1];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {1,2,2,4,5,5,5};
        System.out.print(removeDuplicates(nums));
    }
}
