/*
 * @Author: Anthony
 * @Date: 2021-08-21 18:31:55
 * @LastEditTime: 2021-08-21 19:02:53
 */

package com.github.anthony708.java.LeetCode.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 406. 根据身高重建队列
 * 
 * 假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。
 * 每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
 * 请你重新构造并返回输入数组 people 所表示的队列。
 * 返回的队列应该格式化为数组 queue ，其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）。
 * 
 * 分析:
 * 1. 因为有两个维度, 所以贪心的原则是先固定一个维度, 再确定另一个维度
 * 2. 发现如果按照ki维度, 则无法确定; 则要按照hi维度
 * 3. 先按hi降序将数组排序, 如果hi相同, 则按ki升序 (应用外部比较器)
 * 4. 局部最优：优先按身高高的people的k来插入。插入操作过后的people满足队列属性
 * 
 * 例子: people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
 * 排序过后 people = [[7,0], [7,1], [6,1], [5,0], [5,2], [4,4]]
 * 插入的过程： 插入[7,0]：[[7,0]] 
 *            插入[7,1]：[[7,0],[7,1]] 
 *            插入[6,1]：[[7,0],[6,1],[7,1]] 
 *            插入[5,0]：[[5,0],[7,0],[6,1],[7,1]] 
 *            插入[5,2]：[[5,0],[7,0],[5,2],[6,1],[7,1]] 
 *            插入[4,4]：[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
 */

class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(b[0], a[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        });
        
        LinkedList<int[]> list = new LinkedList<>();
        // 将people的每个元素中 hi 的元素 插入到位置 i 上
        for (int []p: people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[people.length][]);
    }
}