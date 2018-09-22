package insertion;

/**
 * Created by kilo on 2018/9/19.
 * 希尔排序 O(nlogn)
 * 中心思想：将数据进行分组，然后对每一组数据进行排序，
 * 在每一组数据都有序之后，就可以对所有的分组利用插入排序进行最后一次排序。
 * <p>
 * 可以显著减少数据交换的次数。
 */
public class ShellSort {

    public static void sort(int[] arr, int n) {
        int d = n / 2;
        while (d > 0) {
            for (int i = d; i < n; i++) {
                // 对 arr[i], arr[i-d], arr[i-2*d], arr[i-3*d]... 使用插入排序
                int temp = arr[i];
                int j = i;
                for (; j >= d && temp < arr[j - d]; j -= d) {
                    arr[j] = arr[j - d];
                }
                arr[j] = temp;
//                print(arr);
            }
            d = d / 2;//步长取原值的一半
        }
    }


    public static void sort1(int[] arr, int n) {
        int d = n / 2;//步长，首次取n/2，即每组有两个元素
        while (d > 0) {
            for (int i = d; i < n; i++) {
                int temp = arr[i];
                int j = i - d;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + d] = arr[j];
                    j -= d;
                }
                arr[j + d] = temp;
            }
            d /= 2;
        }
    }

    public static void sort2(int[] arr, int n) {
        int d = n / 2;//步长，首次取n/2，即每组有两个元素
        while (d > 0) {
            for (int i = d; i < n; i++) {
                for (int j = i; j >= d && arr[j - d] > arr[j]; j--) {
                    swap(arr, j - d, j);
                }
            }
            d /= 2;
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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
//        sort(a,a.length);
//        sort1(a,a.length);
        sort2(a, a.length);
        System.out.println("=========最后结果=========");
        print(a);
    }

}
