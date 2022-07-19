package String;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * @author zhuduan
 * 2019/06/19
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int max = 0;

        for (char c: s.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();
            }
            queue.add(c);
            max = Math.max(max, queue.size());
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
