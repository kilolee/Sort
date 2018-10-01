package selection.heap;

/**
 * Created by kilo on 2018/10/1.
 * 堆排序，利用MaxHeap的插入insert（shiftUp）和取出extractMax（shiftDown），即完成排序操作
 * 时间复杂度O(nlogn)
 */
public class HeapSort1 {
    public static void sort(int[] arr, int n) {
        MaxHeap maxHeap = new MaxHeap(n);
        //将数组元素插入大根堆
        for (int i = 0; i < n; i++) {
            maxHeap.insert(arr[i]);
        }
        //从大根堆中依次取出堆顶元素
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        print(a);
        sort(a, a.length);
        System.out.println("=========最后结果=========");
        print(a);
    }
}
