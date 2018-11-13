package String;

import java.util.HashMap;
import java.util.Map;

/**
 * #205 Isomorphic Strings
 * Easy
 * @author zhuduan
 * 2018/11/12
 */

public class WordPattern {
   public static boolean workPattern(String pattern, String str) {
       Map<Character, String> map = new HashMap<>();
       String[] s = str.split(" ");

       if (pattern.length() != str.length()) return false;

       for (int i = 0; i < pattern.length(); i++) {
           if (map.containsKey(pattern.charAt(i))) {
               if (!map.get(pattern.charAt(i)).equals(s[i])) return false;
           }
               map.put(pattern.charAt(i), s[i]);
       }
       return true;
   }

   public static void main(String[] args) {
       String pattern = "abba";
       String str = "dog cat cat dog";
       System.out.print(workPattern(pattern, str));
   }
}
