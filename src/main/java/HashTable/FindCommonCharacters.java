package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Easy
 * @author zhuduan
 * 2019/05/30
 */

public class FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (String str: A) {
            int[] cnt = new int[26];
            for (char c: str.toCharArray()) {
                cnt[c - 'a']++;
            }
            for (int i = 0; i < cnt.length; i++) {
                arr[i] = Math.min(arr[i], cnt[i]);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            while ((arr[c - 'a']--) > 0) {
                list.add("" + c);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String [] A = {"bella", "label", "roller"};
        List<String> list = commonChars(A);
        for (String str: list) {
            System.out.print(str + " ");
        }
    }
}
