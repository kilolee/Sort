package selection.heap;

/**
 * Created by kilo on 2018/10/1.
 * 借助我们的heapify过程创建堆
 * 时间复杂度O(nlogn)，但是比HeapSort1性能更优, 因为创建堆的性能更优（heapify的时间复杂度为O(logn)）
 */
public class HeapSort2 {
    public static void sort(int[] arr, int n) {
        MaxHeap maxHeap = new MaxHeap(arr, n);
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
