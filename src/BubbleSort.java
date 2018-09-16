/**
 * Created by kilo on 2018/9/16.
 * 冒泡排序
 */
public class BubbleSort {


    public static void sort(int[] source) {
        System.out.println("==========每趟排序的结果==========");
        for (int i = source.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (source[j] > source[j + 1]) {
                    swap(source, j, j + 1);
                }
            }
            for (int j = 0; j < source.length; j++) {
                System.out.printf("%d ", source[j]);
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

    private static void swap(int[] source, int x, int y) {
        int temp = source[x];
        source[x] = source[y];
        source[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
