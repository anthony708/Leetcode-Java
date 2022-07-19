/*
 * @Author: Anthony
 * @Date: 2021-08-21 17:48:09
 * @LastEditTime: 2021-08-21 18:09:19
 */

package com.github.anthony708.java.LeetCode.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 763. 划分字母区间
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
 * 
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 
 * 分析: 1. 统计每个字符最后出现的位置
 * 2. 遍历字符串, 找到字符出现的最远位置, 如果最远下标和当前下标相等, 则找到了分割点
 */

class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        Arrays.fill(map, 0);

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<Integer>();
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, map[s.charAt(i) - 'a']);
            if (i == right) {
                list.add(right - left + 1);
                left = i + 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
}