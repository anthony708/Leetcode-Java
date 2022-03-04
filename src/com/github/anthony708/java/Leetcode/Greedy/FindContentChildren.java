package com.github.anthony708.java.LeetCode.Greedy;

import java.util.Arrays;

/*
455. 分发饼干
假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。

对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。

2021/08/15
分析: 运用贪心的想法, 即每个孩子用大于他胃口的最小饼干满足他, 孩子的顺序和饼干的顺序都从小到大排列
1. 需要对g和s从小到大排序
2. 两个指针分别指向g和s的下标, 依次向后遍历, 如果有孩子和饼干满足条件则计数加1
3. 直到所有孩子被遍历完或者所有饼干被遍历完

*/

class FindContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while (i <= g.length - 1 && j <= s.length - 1) {
            if (g[i] <= s[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] g = {1,2,3};
        int [] s = {1,1};
        
        System.out.println(findContentChildren(g, s));
    }
}