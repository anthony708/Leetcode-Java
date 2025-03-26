package hot100;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 选择一个基准值
            int position = partition(arr, low, high);
            // 左侧和右侧分别递归
            quickSort(arr, low, position - 1);
            quickSort(arr, position + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // 选择最右作为基准值
        int pivot = arr[high];

        // 用来追踪小于基准值元素的位置
        int pointer = low;

        // 比基准值小的数字交换到左边, 比基准值大的数字交换到右边
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pointer);
                pointer++;
            }
        }
        // 最后把基准值放到正确的位置(中间)
        swap(arr, pointer, high);
        return pointer;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,5,1,9,6};
        quickSort(arr, 0, arr.length - 1);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
