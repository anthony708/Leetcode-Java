package Application;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {
    private static final String UTF_8 = "utf-8";
    private static final int Max = 10;

    public static void test() throws UnsupportedEncodingException {
        String str1 = "星期五?/\\|";
        System.out.println("ordinal       :" + str1);
        byte[] encode = Base64.getEncoder().encode(str1.getBytes(UTF_8));
        System.out.println("basic encode  :" + new String(encode, UTF_8));

        String str2 = "5pif5pyf5LqUPy9cfA==";
        byte[] decode = Base64.getDecoder().decode(str2);
        System.out.println("using basic :" + new String(decode, UTF_8));

        byte[] decode1 = Base64.getUrlDecoder().decode(str2);
        System.out.println("using url   :" + new String(decode1, UTF_8));

        byte[] decode2 = Base64.getMimeDecoder().decode(str2);
        System.out.println("using mime  :" + new String(decode2, UTF_8));

        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        String str1 = "星期五?/\\|";
        System.out.println("ordinal       :" + str1);
        // byte[] encode = Base64.getEncoder().encode(str1.getBytes(UTF_8));
        // System.out.println("basic encode  :" + new String(encode, UTF_8));

    }
}