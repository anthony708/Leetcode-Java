package com.github.anthony708.java.LeetCode.Greedy;

import java.util.Arrays;

/*
135. 分发糖果
老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。

你需要按照以下要求，帮助老师给这些孩子分发糖果：
每个孩子至少分配到 1 个糖果。
评分更高的孩子必须比他两侧的邻位孩子获得更多的糖果。

2021/08/15
分析: 
三次遍历
1. 每个孩子糖果数设为1
2. 第一次从左向右遍历, 若右边孩子评分较高, 则右边孩子糖果数 = 左边孩子糖果数 +1
3. 第二次从右向左遍历, 若左边孩子评分较高, 则左边孩子糖果数 = 右边孩子糖果数 +1 ()
*/

class Candy {
    public static int candy(int[] ratings) {
        int [] candies = new int [ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i + 1] > ratings[i]) {
                candies[i + 1] = candies[i] + 1;
            }
        }

        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
            }
        }

        int candyCount = 0;
        for (int i: candies) {
            candyCount += i;
        }
        return candyCount;
    }

    public static void main(String[] args) {
        int [] ratings = {1, 3, 2, 2, 1};
        System.out.println(candy(ratings));
    }
}