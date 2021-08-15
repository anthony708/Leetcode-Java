package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/20.
 */
public class JumpFloor {

    // 一只青蛙一次可以跳上1级台阶,也可以跳上2级台阶.求跳上n级台阶有多少种跳法.
    public int JumpFloor1(int target) {
        if (target <= 2) return target;
        int jump1 = 1;
        int jump2 = 2;
        int jumpn = 0;
        for (int i = 3; i <= target; i++) {
            jumpn = jump1 + jump2;
            jump1 = jump2;
            jump2 = jumpn;
        }
        return jumpn;
    }

    //一只青蛙一次可以跳上1级,2级...n级台阶,求跳上n级台阶有多少种跳法.
    public static int JumpFloor2(int target) {
        return 1 << --target;
    }

    public static int jumpFloor22(int target) {
        if (target == 1) {
            return 1;
        } else  {
            return 2 * jumpFloor22(target - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor2(3));
        System.out.println(jumpFloor22(3));
    }
}
