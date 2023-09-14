package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	Scanner sc = new Scanner(System.in);
	// ����ʵ�(���� Ŭ�������� ����) : ������ static�� �����ϰ�� ��� �ۿ� ����Ǿ��⿡ �� ������ ��ο��� ��밡���ϴ�

	public static void main(String[] args) {
		// �����迭 10�� (score)�� �����ϰ� Ű���带 ���� ���� �Էµ� ������ �ʱ�ȭ�� ��
		// �ִ밪�� �ּҰ��� ���Ͻÿ�
		int[] num = new ArrayEx03().setDate();
		new ArrayEx03().getMaxMin(num);
	}

	public int[] setDate() {
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = Integer.parseInt(sc.nextLine());
			// nextLine() �޼ҵ�� ����(����)�� ����� ���� ���� ��ü�� �Է¹޴´�
		}
		return number;
		// ���� ���� �޼��� �����ϰ� ȣ���� �޼���� �ǵ��ư�
		// �� number�� �ΰ��� ������ ���� ������ �ϳ��̱⿡ �� ������� number ���� ����
		// �ٸ� ������ �ٲ�� �ٸ� �ʿ����� �ٲ�� �ϳ��̱⿡
	}

	public void getMaxMin(int[] num) {
		int tmax = num[0]; // �ӽ��ִ밪
		int tmin = num[0]; // �ӽ��ּҰ�

		for (int i = 1; i < num.length; i++) {
			if (tmax < num[i])
				tmax = num[i];
			if (tmin > num[i])
				tmin = num[i];
		}
		System.out.println("�����迭 : " + Arrays.toString(num));
		System.out.println("�ִ밪 = " + tmax);
		System.out.println("�ּҰ� = " + tmin);
	}
}
