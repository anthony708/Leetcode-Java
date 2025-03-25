package hot100;

public class MaxHeapSort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // 构建大根堆 ( 从最后一个非叶子节点开始调整)
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 逐个提取堆顶元素(最大值) 并且调整堆
        for (int i = n - 1; i > 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    /**
     * 调整堆（大根堆化）
     * @param arr 待调整数组
     * @param heapSize 当前堆的大小
     * @param i 当前要调整的节点索引
     */
    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, heapSize, largest);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {4,6,3,5,9};
        heapSort(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
