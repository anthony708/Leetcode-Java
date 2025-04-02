package hot100.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。

 

示例 1:

输入: s = "cbaebabacd", p = "abc"
输出: [0,6]
解释:
起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 示例 2:

输入: s = "abab", p = "ab"
输出: [0,1,2]
解释:
起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。

 */

class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        // 构造一个与 p 长度相同的滑动窗口, 并且窗口中字母数量和 p 中相同时, 则符合条件
        if (s.length() < p.length()) {
            return null;
        }

        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            res.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + p.length()) - 'a']++;

            if (Arrays.equals(pCount, sCount)) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
