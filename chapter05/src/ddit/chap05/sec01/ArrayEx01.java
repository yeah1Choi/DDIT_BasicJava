package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] num = null;
		System.out.println("num = " + num);
		// ���������� ���� �������� ������ �����̴�

		num = new int[5]; 
		// new �����ڴ� ��ü�� �����Ҷ� ���, heap ������ ���ο� �޸� ������ �Ҵ� �� �ּҰ� ��ȯ, ���� �������� ���� �ٸ� �޸𸮸� �Ҵ��� ���� �ٸ� ��ü 
		System.out.println("num = " + num);

		num[0] = 50;
		num[1] = 20;
		num[2] = 90;
		num[3] = 80;
		num[4] = 60;
		System.out.println("num = " + Arrays.toString(num));

		for (int a : num) {
			System.out.printf("%3d", a);
		}

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%3d", num[i]);
		}

	}

}
