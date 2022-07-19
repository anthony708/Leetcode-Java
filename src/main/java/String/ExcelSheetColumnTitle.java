package String;

/**
 * #168 Excel Sheet Column Title
 * Easy
 * @author zhuduan
 * 2018/10/10
 */

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            sb.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }
}
