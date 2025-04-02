package hot100.TwoPointers;

/*
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。


示例 1：

输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
示例 2：

输入：height = [4,2,0,3,2,5]
输出：9
 */

class Trap {
    public int trap(int[] height) {
        //维护双指针 l 和 r, 两个变量 lMax 和 rMax
        // 下标 i 处能接到雨水的量 = Min(lMax[i], rMax[i]) 
        // 双指针向中间移动, 用 height[l] 和 height[r] 更新 lMax 和 rMax
        // 如果 height[l] < height[r], 则 lMax < rMax, 则能接到雨水为 lMax - height[i], l++
        // 如果 height[l] >= height[r], 则 lMax >= rMax, 则能接到雨水为 rMax - height[i], r--
        int res = 0;
        int l = 0, r = height.length - 1;
        int lMax = 0, rMax = 0;
        while (l < r) {
            lMax = Math.max(lMax, height[l]);
            rMax = Math.max(rMax, height[r]);

            if (height[l] < height[r]) {
                res += lMax - height[l];
                l++;
            } else {
                res += rMax - height[r];
                r--;
            }
        }

        return res;
    }    
}
