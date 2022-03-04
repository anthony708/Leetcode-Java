/*
 * @Author: Anthony
 * @Date: 2021-08-17 23:51:27
 * @LastEditTime: 2021-08-21 17:25:39
 */

package com.github.anthony708.java.LeetCode.Greedy;

/**
 * 605. 种花问题
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
 * 
 * 分析: 找到相邻的0的数量, 需要大于等于3, 则可种花的数目为 (0的数量 + 1) / 2
 * 注意解决边界问题, 即最左边最右边连续两个位置为0
 */

class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int [] newFlowerbed = new int[flowerbed.length + 2];
        newFlowerbed[0] = 0;
        newFlowerbed[flowerbed.length + 2 - 1] = 0;
        for (int i = 0 ; i < flowerbed.length; i++) {
            newFlowerbed[i + 1] = flowerbed[i];
        }

        for (int i = 1; i <= flowerbed.length; i++) {
            if (newFlowerbed[i-1] == 0 && newFlowerbed[i] == 0 && newFlowerbed[i+1] == 0) {
                newFlowerbed[i] = 1;
                n -= 1;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}