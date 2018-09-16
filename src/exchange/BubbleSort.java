package exchange;

/**
 * Created by kilo on 2018/9/16.
 * 冒泡排序
 */
public class BubbleSort {


    public static void sort(int[] arr) {
        System.out.println("==========每趟排序的结果==========");
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[j]);
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
