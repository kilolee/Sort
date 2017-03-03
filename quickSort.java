package sort;

/**
 * 快速排序
 * 
 * @author ASUS
 *
 */
public class quickSort {
	public static void sort(int[] number) {
		quickSort(number, 0, number.length - 1);
	}

	/**
	 * 快速排序方法
	 * 
	 * @param number
	 * @param i
	 * @param j
	 */
	private static void quickSort(int[] number, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int s = number[left];
			int i = left;
			int j = right + 1;
			while (true) {
				// 向右找大于s的数的索引
				while (i + 1 < number.length && number[++i] < s)
					;
				// 向左找小于s的数的索引
				while (j - 1 > -1 && number[--j] > s)
					;
				// 如果i>=j,退出循环
				if (i >= j) {
					break;
				}
				// 否则交换索引i和j的元素
				swap(number, i, j);
			}
			number[left] = number[j];
			number[j] = s;
			// 对左边进行递归
			quickSort(number, left, j - 1);
			// 对右边进行递归
			quickSort(number, j + 1, right);
		}
	}

	/**
	 * 交换数组number中的索引为i、j的元素
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] { 34, 1, 21, 345, 12, 546, 131, 54, 78, 6543, 321, 85, 1234, 7, 76, 234 };
		sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
