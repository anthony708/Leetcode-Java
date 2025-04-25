package hot100.String;

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
    public static String longestCommonPrefix(String[] strs) {
        // 纵向遍历, 依次遍历每个字符串, 更新公共最长前缀
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c || i == strs[j].length()) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        // String[] strs = {"dog", "racecar", "car"}; 
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
