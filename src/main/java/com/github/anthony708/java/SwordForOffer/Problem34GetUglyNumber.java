package com.github.anthony708.java.SwordForOffer;

import java.util.ArrayList;

/**
 * Created by Anthony on 16/6/13.
 */

/*
    把只包含因子2、3和5的数称作丑数（Ugly Number）。
    例如6、8都是丑数，但14不是，因为它包含因子7。
    习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

public class Problem34GetUglyNumber {

    // 时间复杂度高
    public static int GetUglyNumber_Solution1(int index) {
        if (index <= 0)  return 0;
        int n = 0;
        int number = 0;
        while (n < index) {
            number++;
            if (isUglyNumber(number)) {
                n++;
            }
        }
        return number;
    }
    public static boolean isUglyNumber(int number) {
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return number == 1;
    }

    public static int GetUglyNumber_Solution2(int index) {
        if (index <= 0) return 0;

        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        list.add(1);
        int min = 0;
        int m2 = 0, m3 = 0, m5 = 0;

        while (count < index) {
            min = getMin(list.get(m2) * 2, list.get(m3) * 3, list.get(m5) * 5);
            count++;
            list.add(min);
            if (min == list.get(m2) * 2) m2++;
            if (min == list.get(m3) * 3) m3++;
            if (min == list.get(m5) * 5) m5++;
        }
        return list.get(index - 1);
    }
    public static int getMin(int number1, int number2, int number3) {
        int min = (number1 < number2) ? number1 : number2;
        min = (min < number3) ? min : number3;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution2(3));
    }
}
