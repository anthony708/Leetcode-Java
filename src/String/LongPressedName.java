package String;

/**
 * 925. Long Pressed Name
 * Easy
 * @author zhuduan
 * 2019/06/17
 */

public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 1;

        if (name.toCharArray()[0] != typed.toCharArray()[0]) {
            return false;
        }
        for (int j = 1; j < typed.length(); j++) {
            if (i < name.length() && name.toCharArray()[i] == typed.toCharArray()[j]) {
                i++;
            } else if (typed.toCharArray()[j] != typed.toCharArray()[j - 1]) {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "laiden", typed = "laiden";
        System.out.println(isLongPressedName(name, typed));
    }
}
