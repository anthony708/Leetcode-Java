package com.github.anthony708.java.Leetcode.Archive;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length == 0) {
            return res;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                int first = mid;
                while ((first - 1) >= 0 && nums[first-1] == target) {
                    first--;
                }
                int last = mid;
                while ((last + 1) <= nums.length - 1 && nums[last+1] == target) {
                    last++;
                }
                return new int[]{first,last};
            } else if (target < nums[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

