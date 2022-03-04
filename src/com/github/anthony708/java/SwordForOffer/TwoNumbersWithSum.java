package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/9/13.
 */
/*
    输入一个递增排序的数组和一个数字s, 数组中查找两个数使它们的和恰好是s, 输出一对即可
 */
public class TwoNumbersWithSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers == null || numbers.length == 0) return res;

        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                res[0] = numbers[start];
                res[1] = numbers[end];
                break;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,2,4,7,11,15};
        int target = 15;
        int[] res = twoSum(num, target);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
