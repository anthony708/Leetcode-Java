package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/20.
 */
public class RectCover {
    public int RectCover(int target) {
        if (target <= 0) return 1;
        if (target <= 3) return target;
        int temp1 = 1;
        int temp2 = 2;
        int temp3 = 0;
        for (int i = 3; i <= target; i++) {
            temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;
        }
        return temp3;
    }
}
