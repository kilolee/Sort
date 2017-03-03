package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * 
 * @author ASUS
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Random random = new Random();
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 冒泡排序算法
	 * 
	 * @param number
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
