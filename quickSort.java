package sort;

/**
 * ��������
 * 
 * @author ASUS
 *
 */
public class quickSort {
	public static void sort(int[] number) {
		quickSort(number, 0, number.length - 1);
	}

	/**
	 * �������򷽷�
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
				// �����Ҵ���s����������
				while (i + 1 < number.length && number[++i] < s)
					;
				// ������С��s����������
				while (j - 1 > -1 && number[--j] > s)
					;
				// ���i>=j,�˳�ѭ��
				if (i >= j) {
					break;
				}
				// ���򽻻�����i��j��Ԫ��
				swap(number, i, j);
			}
			number[left] = number[j];
			number[j] = s;
			// ����߽��еݹ�
			quickSort(number, left, j - 1);
			// ���ұ߽��еݹ�
			quickSort(number, j + 1, right);
		}
	}

	/**
	 * ��������number�е�����Ϊi��j��Ԫ��
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
