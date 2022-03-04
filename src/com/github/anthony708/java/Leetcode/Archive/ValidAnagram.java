package com.github.anthony708.java.LeetCode.Archive;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map map1 = charArrayToMap(s.toCharArray());
        Map map2 = charArrayToMap(t.toCharArray());
        return compareMaps(map1, map2);
    }

    public Map<Character, Integer> charArrayToMap(char[] a) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : a) {
            if(map.get(c) == null) {
                map.put(c, 1);

            } else  {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    public boolean compareMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for(Character c : map1.keySet()) {
            int value1 = map1.get(c);
            if(map2.containsKey(c) && map2.get(c) == value1) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "namgaa";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.print(validAnagram.isAnagram(s, t));
    }
}
