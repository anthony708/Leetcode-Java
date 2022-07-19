package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<Integer,String> map = new HashMap<>();
    String host;

    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        map.put(key, longUrl);
        return host + key;
    }

    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace(host, ""));
        return map.get(key);
    }

    public static void main(String[] args) {
        String url = "http://www.baid.com/";
        Codec codec = new Codec();
        codec.host = "baidu/";
        System.out.println(codec.encode(url));
        System.out.println(codec.decode(codec.encode(url)));
    }
}
