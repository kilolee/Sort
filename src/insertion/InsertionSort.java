package insertion;

/**
 * Created by kilo on 2018/9/16.
 * 插入排序
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        //执行了arr.length-1次排序
        for (int i = 1; i < arr.length; i++) {
            //寻找元素arr[i]合适的插入位置,找到位置后则推出循环
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
            //输出每趟排序后的结果
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[j]);
            }
            System.out.println();
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        sort(a);
        System.out.println("=========最后结果=========");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
