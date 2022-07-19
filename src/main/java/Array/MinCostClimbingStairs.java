package main.java.Array;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int step0 = cost[0];
        int step1 = cost[1];
        int cur = 0;

        for (int i = 2; i < cost.length; i++) {
            cur = Math.min(step0, step1) + cost[i];
            step0 = step1;
            step1 = cur;
        }

        return Math.min(step0, step1);
    }
}
