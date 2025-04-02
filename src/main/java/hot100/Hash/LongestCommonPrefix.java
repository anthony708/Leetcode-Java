package hot100.Hash;

/*
 * 编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
 
示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"
示例 2：
输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。

 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // 纵向扫描
        if (strs == null || strs.length == 0) {
            return "";
        }

        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {

            // 第一步, 先取得第一个 str 的第一个字母
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {

                // 遍历剩下每一个 str, 如果当前字母不相同, 则返回substr
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String res = lcp.longestCommonPrefix(strs);
        System.out.println(res);
    }
}
