package merge;

import java.util.Arrays;

/**
 * Created by kilo on 2018/9/18.
 * 归并排序
 */
public class MergeSort {

    /**
     * 将arr[l,mid]和arr[mid+1,r]两部分进行归并
     *
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] aux = Arrays.copyOfRange(arr, l, r + 1);

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }

    private static void sort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
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
