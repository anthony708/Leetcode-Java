package hot100.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String str: strs) {
            String sortedString = sortedString(str);
            if (map.containsKey(sortedString(str))) {
                map.get(sortedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedString, list);
            }
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }   
    
    public String sortedString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
