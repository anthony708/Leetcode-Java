package main.java.Array;

import java.util.Arrays;

/**
 * 1051. Height Checker
 * Easy
 * @author zhuduan
 * 2019/05/29
 */

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int res = 0;
        int [] newHeights = heights.clone();
        Arrays.sort(newHeights);
        for (int i = 0; i < heights.length; i++) {
            if (newHeights[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}
