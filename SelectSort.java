package sort;

/**
 * 简单选择排序
 * 
 * @author ASUS
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义一个数组
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		// 排序
		selectionSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	/**
	 * 选择排序方法
	 * 
	 * @param number
	 */
	public static void selectionSort(int[] number) {
		for (int i = 0; i < number.length - 1; i++) {// 一共执行n-1趟
			int min = i; // 记录最小元素位置
			for (int j = i+1; j < number.length; j++) {
				if (number[j] < number[min]) 
					min = j;			
			}
			if (i != min) {
				swap(number, i, min);
			}
		}
	}

	/**
	 * 用于交换数组总的索引为i、j的元素
	 * 
	 * @param number
	 * @param i
	 * @param j
	 */
	private static void swap(int[] number, int i, int j) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}
}
