package hot100;

import java.util.*;

/*
给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的所有字母得到的一个新单词。



示例 1:

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
示例 2:

输入: strs = [""]
输出: [[""]]
示例 3:

输入: strs = ["a"]
输出: [["a"]]


提示：

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] 仅包含小写字母
 */


class GroupAnagrams {
    /*
    思路是map 用来存放符合 str 字符串(已排序)的所有数组, 是 hashmap, value用来放 strs的真实值
    第一次遍历, 将 hashmap 分好组, 第二次遍历 hashmap 输出异位词的所有组合
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String str : strs) {
            String sortStr = sortChar(str);

            if (map.containsKey(sortStr)) {
                map.get(sortStr).add(str);
            } else {
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(sortStr, l);
            }
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;

    }

    public String sortChar(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
