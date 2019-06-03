package BinarySearch;

/**
 * 981. Time Based Key-Value Store
 * Medium
 * @author zhuduan
 * 2019/06/03
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    Map<String, List<Data>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<Data>());
        }
        map.get(key).add(new Data(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        return binarySearch(map.get(key), timestamp);
    }

    private String binarySearch(List<Data> list, int time) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).time == time) {
                return list.get(mid).val;
            } else if (list.get(mid).time < time) {
                if (list.get(mid + 1).time > time) {
                    return list.get(mid).val;
                }
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return list.get(l).time <= time ? list.get(l).val : "";
    }
}

class Data {
    String val;
    int time;
    Data(String val, int time) {
        this.val = val;
        this.time = time;
    }
}
