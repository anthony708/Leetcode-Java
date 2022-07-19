package main.java.Util.Sort;

import static main.java.Util.Swap.swap;

/**
 * 冒泡排序, 每次从数组底部将两两相近的元素比较, 排序
 *
 * 每次排序中, 找到数组中最小的一个, 直至其露出水面
 * @author zhuduan
 */

public class BubbleSort {

    // 以下是常规的冒泡排序
    // 第一个指针遍历一遍数组, 第二个指针从0遍历到length-1,
    // 每次比较data[j]和data[j+1], 交换
    // 每次都把当次最大的数放到后面

    public static void bubbleSort(int[] data) {
        if (data.length == 0) {
            return;
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    // 以下是改良的冒泡排序
    // 设置一个flag
    // 如果后面是顺序的, 就不需要再遍历了

    public static void bubbleImprove1(int[] data) {
        if (data.length <= 0 ) {
            return;
        }

        boolean flag = true;

        for (int i = 1; i < data.length; i++) {

            // 每次先置为负
            flag = false;
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j+1]) {
                    swap(data, j, j+1);
                    flag = true;
                }

                if (flag = false) {
                    break;
                }
            }
        }

    }


    // 改进的冒泡排序2
    // 设置一个尾指针, 如果后面已经排好了, 每次就不需要再重复比较后面的

    public static void bubbleImprove2(int[] data) {
        if (data.length <= 0 ) {
            return;
        }

        boolean flag = true;
        int lastSwap = data.length - 1;

        for (int i = 1; i < data.length; i++) {

            int curSwap = -1;
            flag = false;
            for (int j = 0; j < lastSwap; j++) {
                if (data[j] > data[j+1]) {
                    swap(data, j, j+1);
                    flag = true;
                    curSwap = j;
                }
            }
            if (flag == false) {
                break;
            }
            lastSwap = curSwap;
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

        //bubbleSort(data);
        //bubbleImprove1(data);
        bubbleImprove2(data);
        System.out.print("After Bubble Sort: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
