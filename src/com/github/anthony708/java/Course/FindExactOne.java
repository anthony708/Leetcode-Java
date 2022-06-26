/*
 * @Author: Anthony
 * @Date: 2022-06-26 17:57:01
 * @LastEditTime: 2022-06-26 17:59:51
 */
package com.github.anthony708.java.Course;

public class FindExactOne {
    //整型数组中找出唯一一个只出现过1次的数
    public static int findExactOne(int[] a) {
        int res = 0;
        for (int n: a) {
            res ^= n;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3,5};
        System.out.println(findExactOne(a));
    }
}
