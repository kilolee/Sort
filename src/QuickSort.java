/**
 * Created by kilo on 2018/9/16.
 * 快速排序
 */
public class QuickSort {

    public static int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int p = l;
        // arr[l+1...p] < v ; arr[p+1...i) > p;即p位置是最后一个小于v的数值
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < v) {
                p++;
                swap(arr, p, i);
            }
        }
        swap(arr, l, p);
        return p;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     * 递归使用快速排序,对arr[l...r]的范围进行排序
     *
     * @param arr
     * @param l
     * @param r
     */
    private static void sort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int position = partition(arr, l, r);
        //对每个分区递归排序
        sort(arr, l, position - 1);
        sort(arr, position + 1, r);
    }

    public static void sort(int[] arr) {
        int len = arr.length;
        sort(arr, 0, len - 1);
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}

