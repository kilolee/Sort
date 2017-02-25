package sort;

/**
 * ��ѡ������
 * 
 * @author ASUS
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����һ������
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		// ����
		selectionSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	/**
	 * ѡ�����򷽷�
	 * 
	 * @param number
	 */
	public static void selectionSort(int[] number) {
		for (int i = 0; i < number.length - 1; i++) {// һ��ִ��n-1��
			int min = i; // ��¼��СԪ��λ��
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
	 * ���ڽ��������ܵ�����Ϊi��j��Ԫ��
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
