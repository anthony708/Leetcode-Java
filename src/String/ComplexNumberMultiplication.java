package String;

/**
 * 537. Complex Number Multiplication
 * Medium
 * @author zhuduan
 * 2019/06/17
 */

public class ComplexNumberMultiplication {
    public static String complexNumberMultiply(String a, String b) {

        int ax = Integer.valueOf(a.split("\\+")[0]);
        int ay = Integer.valueOf(a.split("\\+")[1].replace("i", ""));
        int bx = Integer.valueOf(b.split("\\+")[0]);
        int by = Integer.valueOf(b.split("\\+")[1].replace("i", ""));

        return String.valueOf(ax * bx + ay * by * -1) + "+" + String.valueOf(ax * by + ay * bx) + "i";

    }

    public static void main(String[] args) {
        String a = "1+1i";
        String b = "1+1i";

        System.out.println(complexNumberMultiply(a, b));
    }
}
