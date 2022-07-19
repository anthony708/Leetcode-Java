package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/25.
 */
public class Power {
    public double Power(double base, int exponent) {
        double result = 0.0;
        if (equal(base, 0.0) && exponent < 0) {
            System.out.println("0的负数次幂无意义");
        }
        if (equal(exponent, 0)) {
            return 1.0;
        }
        if (exponent < 0) {
            result = powerWithExponent(1.0/base, -exponent);
        } else {
            result = powerWithExponent(base, exponent);
        }
        return result;
    }

    private double powerWithExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }


    //递归实现
//    private double powerWithUnsignedExponent(double base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        }
//        if (exponent == 1) {
//            return base;
//        }
//        double result = powerWithUnsignedExponent(base, exponent >> 1);
//        result *= result;
//        if (exponent & 0x1 == 1) {
//            result *= base;
//        }
//        return result;
//    }

    // 判断两个double型数据
    private boolean equal(double num1, double num2) {
        if (num1 - num2 > -0.0000001 && num1 - num2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }
}
