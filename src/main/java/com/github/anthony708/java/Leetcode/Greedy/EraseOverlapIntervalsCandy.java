package com.github.anthony708.java.LeetCode.Greedy;

import java.util.Arrays;

/*
435. 无重叠区间

给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。

注意:
可以认为区间的终点总是大于它的起点。
区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。


分析: 
每个区间的结尾都要尽量小, 留给其余区间的空间就会大
1. 按照区间结尾排序
2. 选择结尾较小, 和前一个区间不相交的区间

Comparator用法: https://blog.csdn.net/chc960609/article/details/107851544
*/

class EraseOverlapIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        // Arrays.sort(intervals, new Comparator<int [] >(){
        //     public int compare(int [] a1,int [] a2) {
        //         return a1[1] - a2[1];   //升序排列
        //     }
        // });

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}