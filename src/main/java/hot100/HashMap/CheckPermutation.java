package hot100.HashMap;

/*
 * 给定两个由小写字母组成的字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。

示例 1：

输入: s1 = "abc", s2 = "bca"
输出: true 
示例 2：

输入: s1 = "abc", s2 = "bad"
输出: false

 */

public class CheckPermutation {
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] temp = new int[26];
        for(char c: s1.toCharArray()) {
            temp[c - 'a']++;
        }
        for (char c: s2.toCharArray()) {
            temp[c - 'a']--;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
