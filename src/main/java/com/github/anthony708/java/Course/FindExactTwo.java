package com.github.anthony708.java.Course;

public class FindExactTwo {
    //整型数组中找出唯二个只出现过1次的数
    public static int[] findExactTwo(int[] a) {
        int tempTwo = 0;
        for (int n: a) {
            tempTwo ^= n;  // 先找到唯二两个数的异或
        }

        int rightOne = tempTwo & (~tempTwo + 1);  // 求出tempTwo在哪一位上不为0
        int exactOne = 0;
        for (int n: a) {
            if ((n & rightOne) == 0) {     // 唯二这两个数在这一位上一定不同, 因此能区分开两个数
                exactOne ^= n;
            }
        }
        int x = exactOne ^ tempTwo;
        int y = x ^ tempTwo;
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,5};
        int[] b = findExactTwo(a);
        for (int n: b)
        System.out.println(n);
    }
}
