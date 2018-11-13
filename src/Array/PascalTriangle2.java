package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * #119 Merge Sorted Array
 * Easy
 * @author zhuduan
 * 2018/09/11
 */

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i - 1; j > 0; j--) {
                list.set(j, list.get(j-1)+list.get(j));
            }
        }
        return list;
    }
}
