package hot100.String;

import java.util.HashMap;
import java.util.Map;

/*
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。

回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。

回文串不一定是字典当中的单词。

 

示例1：

输入："tactcoa"
输出：true（排列有"tacocat"、"atcocta"，等等）
 */

public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                cnt++;
            }
            if (cnt > 1) {
                return false;
            }
        }
        return true;
    }
}
