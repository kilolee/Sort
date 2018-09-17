package insertion;

/**
 * Created by kilo on 2018/9/17.
 * 折半排序（二分排序）
 * <p>
 * <p>
 * 直接插入排序算法中，当第i-1趟需要将第i个元素插入到0~i-1个元素之间时，
 * 总是需要从第i-个元素开始，依次与前面的每一个元素进行比较，直至找到合适的位置进行插入。
 * 这样比较的过程显然没有利用到0~i-1个元素已经有序这一有效信息，折半插入排序则对此进行了改进。
 * 当需要将第i个元素插入到先前有序列表中去时，折半排序的做法是：
 *
 * 1、首先选取0~i-1个有序列表元素的中间元素，即位置为(i-1)/2的元素，与需要插入的第i个元素进行比较，
 * 如果位置为(i-1)/2处的元素大于第i个元素，则在位置区间为0~(i-1)/2-1的范围内进行搜索，
 * 反之则在(i-1)/2+1~i-1的范围内进行搜索。以上过程即是折半的思想；
 *
 * 2、在以上半个范围内进行搜索时，可以重复1中的搜索方法，这样即把搜索区间逐渐缩小为1/4，1/8等，
 * 从而较快的定位合适的插入位置。
 */
public class BinaryInsertSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int low = 0;
            int high = i - 1;

            //不断折半，寻找合适的插入位置
            while (low <= high) {
                int mid = (low + high) / 2;
                if (temp > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            //依次将元素后移
            for (int j = i; j > low; j--) {
                arr[j] = arr[j - 1];
            }
            arr[low] = temp;
        }
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
