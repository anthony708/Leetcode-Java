package hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HelloWorld {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // hashmap key表示 数组元素的值, value 表示数组下标

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if ((i - hashMap.get(nums[i])) <= k) {
                    return true;
                }  
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
