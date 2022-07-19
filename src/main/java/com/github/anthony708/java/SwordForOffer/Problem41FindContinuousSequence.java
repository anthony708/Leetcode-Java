package com.github.anthony708.java.SwordForOffer;

import java.util.ArrayList;

/**
 * Created by Anthony on 16/9/13.
 */

/*
    输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class Problem41FindContinuousSequence {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int small = 1;
        int big = 2;
        int middle = (sum + 1) / 2;

        while (small < middle) {
            int curSum = 0;
            for (int i = small; i <= big; i++) {
                curSum += i;
            }
            if (curSum == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                res.add(list);
                curSum -= small;
                small++;
            } else if (sum < curSum) {
                small++;
            } else {
                big++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int sum = 9;
        System.out.println(FindContinuousSequence(sum));
    }
}
