package Array;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Easy
 * @author zhuduan
 * 2019/07/01
 */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int key = Math.abs(nums[i]) - 1;

            if (nums[key] > 0) {
                nums[key] = -nums[key];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;

    }
}
