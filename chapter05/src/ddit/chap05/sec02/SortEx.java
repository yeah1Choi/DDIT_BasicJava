package ddit.chap05.sec02;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(); // Ŭ������ ���� ���� new���� ��ü����
		bubbleSort.sort(); // = bubbleSort�� �ִ� sort ����
	}

}

class BubbleSort {
	private int[] number;
	// privite ����������:Ŭ���� ����� ������ �� ����, Ŭ���� �ȿ����� number ���

	BubbleSort() {
		// �����ڸ޼ҵ�: ����ʵ�(����)�ʱ�ȭ�� ��������, Ŭ�����ε� �޼ҵ���
		// �� �� �ִ� ����� new ��ü����
		number = new int[] { 27, 35, 19, 5, 47, 80, 15, 65, 50, 12 };
	}

	public void sort() {
		boolean flag = true;
		System.out.println("[���� ������");
		System.out.println(Arrays.toString(number));
		for (int i = 0; i < number.length - 1; i++) { // ȸ���� ���� -1��, ȸ�������� n-1
			flag = true;
			for (int j = 0; j < number.length - 1 - i; j++) {
				// ȸ���� ������ �������� ū���⿡ ���� ȸ������ �����ܸ� ���� -i��
				if (number[j] > number[j + 1]) {
					int temp = number[j]; // temp�� ������ �� �ڸ��� �� temp������ ������ �޼����� �ڸ��ٲ��� ����
					number[j] = number[j + 1];
					number[j + 1] = temp;
					flag = false; // �ڸ��ٲ��� �Ͼ�� flag�� false�� ���� �ٲ۴�
				}
			}
			if (flag == true)
				break; // flag�� ���̸� break�� �����ϰ� �Ͽ� �ڸ��ٲ��� ���� ���̻� ���� ������ ���� �Ǿ� �����
		}
		System.out.println("[���ĵ� ������]");
		System.out.println(Arrays.toString(number));

	}

	public class SelectionSort {
		private int[] num; // = new int[10]; // �̹� 0�� 10ĭ�� ���ִ� int ����Ÿ���̶�
		// num ������ SelectionSort Ŭ���� �ȿ��� ���� ��밡��

		public SelectionSort() { // ������ : Ŭ�����ε� �޼ҵ�: �ν��Ͻ�����(num) �ʱ�ȭ�� ����
			num = new int[] { 35, 40, 70, 16, 95, 19, 27, 63, 88, 57 };
			// �ұ�Ģ�����̶� �ռ� ���� �ʱ�ȭ�� new �����ڷ� ������ �������� �ʾƵ� �ȴ� "new int[10];"
			// �׷��� ������ SelectionSort �޼ҵ� �ȿ��� �����ߴ�(?
		}

		public void selectionSort() {
			System.out.println("[���� �� �ڷ�]");
			System.out.println(Arrays.toString(num));

			for (int i = 0; i < num.length - 1; i++) { // ȸ�� ���
				for (int j = i + 1; j < num.length; j++) { // �� ȸ������ �� ���
					if (num[i] > num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
		}

		public void printDate() {
			System.out.println("[���� �� �ڷ�]");
			System.out.print("[");
			for (int su : num) {
				System.out.printf("%-2d", su);
			}
			System.out.print("]");
		}
	}
}
