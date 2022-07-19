/*
 * @Author: Anthony
 * @Date: 2021-08-21 17:07:49
 * @LastEditTime: 2021-08-21 17:46:47
 */
package com.github.anthony708.java.LeetCode.Greedy;

import java.util.Arrays;

/**
 * 452. 用最少数量的箭引爆气球
 * 在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
 * 一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。
 * 我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
 * 给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
 * 
 * 分析: 
 * 1. 按照集合第一个元素排序
 * 2. 一个指针指向集合的end元素, 如果下个集合的start元素比上个集合end的值大, 则说明两个集合无交集, 则count++, 且指针指向下个集合end元素; 
 *                           如果下个集合的start元素比上个集合end的值小, 则说明两个集合有交集, 则count不变.
 */

class FindMinArrowShots {
    public static int findMinArrowShots(int[][] points) {
        // 为防止溢出, lamda表达式改用如下方式实现
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        // 起始count应设为1
        int count = 1;
        int axis = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (axis < points[i][0]) {
                count++;
                axis = points[i][1];
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int [][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}