package com.github.anthony708.java.utils;

/**
 * Created by Anthony on 16/11/3.
 */
public class Main {


    public boolean isSPYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isCorrectMonth(int month, int day) {
        if (month < 0 || month > 12) {
            return false;
        }
        if ((month == 1 && day <= 31) || (month == 2 && day <= 29) || (month == 3 && day <= 31)
                || (month == 4 && day <= 30) || (month == 5 && day <= 31) || (month == 6 && day <= 30) ||
                (month == 7 && day <= 31) || (month == 8 && day <= 31) || (month == 9 && day <= 30) ||
                (month == 10 && day <= 31) || (month == 11 && day <= 30) || (month == 12 && day <= 31) ) {
            return true;
        } else {
            return false;
        }
    }

    public int minusDate(int year1, int month1, int day1, int year2, int month2, int day2) {
        if (year1 < 0 || year2 < 0) {
            return -1;
        }
        if (isCorrectMonth(month1, day1) && !isCorrectMonth(month2, day2)) {
            return -1;
        }

        // year1为大年, year2为小年
        if (year1 < year2) {
            swap(year1, year2);
            swap(month1, month2);
            swap(day1, day2);
        }

        // 遍历中间年
        int result = 0;
        for (int i = year2; i < year1; i++) {
            if (isSPYear(i)) {
                result += 366;
            } else {
                result += 365;
            }
        }
        int[] monthNomal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
        int[] monthSP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
        // 减去小年前面的日子
        if (isSPYear(year2) && month2 > 2) {
            for (int i = 1; i < month2; i++) {
                result -= monthSP[i];
            }
            result -= day2;
        } else {
            for (int i = 1; i < month2; i++) {
                result -= monthNomal[i];
            }
            result -= day2;
        }

        // 加上大年前面的日子
        if (isSPYear(year1) && month1 > 2) {
            for (int i = 1; i < month1; i++) {
                result += monthSP[i];
            }
            result += day1;
        } else {
            for (int i = 1; i < month1; i++) {
                result += monthNomal[i];
            }
            result += day2;
        }
        return result;
    }

    public void swap ( int b, int c) {
        int temp = b;
        b = c;
        c = temp;
    }
}
