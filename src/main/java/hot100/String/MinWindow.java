package hot100.String;

/*
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。

 

注意：

对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
如果 s 中存在这样的子串，我们保证它是唯一的答案。
 

示例 1：

输入：s = "ADOBECODEBANC", t = "ABC"
输出："BANC"
解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
示例 2：

输入：s = "a", t = "a"
输出："a"
解释：整个字符串 s 是最小覆盖子串。
示例 3:

输入: s = "a", t = "aa"
输出: ""
解释: t 中两个字符 'a' 均应包含在 s 的子串中，
因此没有符合条件的子字符串，返回空字符串。

 */

public class MinWindow {
    public static String minWindow(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int[] cntS = new int[128];
        int[] cntT = new int[128];
        int resL = -1, resR = s.length();

        // 统计 t 中字符出现的次数
        for (int i = 0; i < t.length(); i++) {
            cntT[charT[i]]++;
        }

        // 滑动窗口左指针
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            cntS[charS[r]]++;

            // 如果当前窗口覆盖了 t 的所有字符, 则尝试收缩窗口
            while(isSimple(cntS, cntT)) {
                // 更新子串边界
                if (r - l < resR - resL) {
                    resL = l;
                    resR = r;
                }
                cntS[charS[l]]--;
                l++;
            }
        }
        
        return resL < 0 ? "" : s.substring(resL, resR + 1);
    }

    // 检查 cntS 字符数是否覆盖 cntT 字符数
    public static boolean isSimple(int[] cntS, int[] cntT) {
        for (int i = 'a'; i <= 'z'; i++) {
            if (cntS[i] < cntT[i]) {
                return false;
            }
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            if (cntS[i] < cntT[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minWindow(s, t);
        System.out.println(res);
    }
}
