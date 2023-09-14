package ddit.chap11.classes;

import java.util.Arrays;

public class MathEx {

	public static void main(String[] args) {
		// ������ ����� �����ϴ� �޼ҵ� ���� - random()

		// max(val1, val2) : �� �Ű� ���� �� ū ���� ��ȯ
		// : ����Ŭ db�� greatest �Լ��� ���� ������� ��ȯ

		// 10���� ���ϸ����� �迭�� ������ �� �� ���� 1000�̸��̸� 1000���� ��ȯ
		// �ڷ� :1000,2300,3500,1700,6500,2700,800,1500,900,1100

		int[] mileage = { 1000, 2300, 3500, 1700, 6500, 2700, 800, 1500, 900, 1100 };
		System.out.println("����: " + Arrays.toString(mileage));

		for (int i = 0; i < mileage.length; i++) {
			mileage[i] = Math.max(1000, mileage[i]);
		} // max �޼ҵ��� ����: �ΰ� ������ ���Ѵ�
		System.out.println("����: " + Arrays.toString(mileage));

	}

}
