package hot100;

import java.util.HashSet;
import java.util.Set;


/*
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。

 

示例 1:

输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        //用一个 hashSet 存储不重复的字串的字符
        // 用两个指针记录子串的左右边界l, r
        // 每次移动右边界, 观察 hashSet 是否有不重复字符, 记录下这个 hashSet长度
        int res = 0;
        int r = - 1;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                charSet.remove(s.charAt(i - 1));
            }

            // 右边界向右移动
            while (r + 1 < s.length() && !charSet.contains(s.charAt(r + 1))) {
                charSet.add(s.charAt(r + 1));
                r++;
            }
            res = Math.max(res, charSet.size());

        }

        return res;
    }     

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
