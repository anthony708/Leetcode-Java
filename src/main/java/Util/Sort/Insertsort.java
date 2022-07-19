package main.java.Util.Sort;


public class Insertsort {

    //从待插入数组取出第一个数, 插入前面有序的数组

    public static void insertSort(int[] data) {

        if (data.length <= 0) {
            return;
        }

        // 默认第一个数字有序, 从第二个数字开始
        for (int i = 1; i < data.length; i++) {

            int curData = data[i];
            int j = i - 1; //第j个为有序数组最后一个数

            while (j >= 0 && curData < data[j]) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = curData;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[10];
        System.out.print("Original array is: ");
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            data[i] = num;
            System.out.print(num + " ");
        }
        System.out.println();
        insertSort(data);
        System.out.print("After Bubble Sort: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}

