package hot100;

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。



示例 1:

输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
示例 2:

输入: nums = [0]
输出: [0]

 */

class MoveZeros {
    public void moveZeros_1(int[] nums) {
        // 采用双指针, 左边指针l指向已经处理好的数组尾部, 右边指针r指向待处理数组头部
        // 右指针右移, 每次遇到非零数, 则左右交换, 左指针右移

        int n = nums.length;
        int l = 0, r = 0;
        while (r < n) {
            if (nums[r] != 0) {
                swapNum(nums, l, r);
                l++;
            }
            r++;
        }
    }

    public void swapNum(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeros_2(int[] nums) {
        // 采用单次遍历, 如果遇到非0 的数则保留, 直到结束, 再最后补 0

        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cur] = nums[i];
                cur += 1;
            }
        }

        for (int i = cur; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
