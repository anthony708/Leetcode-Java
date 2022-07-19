package main.java.Array;

/**
 * 485. Max Consevutive Ones
 * Easy
 * @author zhuduan
 * 2019/06/26
 */

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                cur++;
                max = Math.max(max, cur);
            } else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0,1,1,0,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}
