package ddit.chap04.sec03;

public class NestedForEx01 {

	public static void main(String[] args) {
		// nestedForMethod01();
		nestedForMethod02();
	}

	public static void nestedForMethod01() {
		// 1 ~ 10 ������ ���� �ٿ��� 5�� ���

		for (int i = 0; i < 5; i++) { // ���� ���
			for (int j = 0; j < 10; j++) { // ���� ���� i�� �����̱� ������ �ߺ������� ���Ϸ��� j�� ����
				System.out.print(j + 1);
			}
			System.out.println();
			// �ٹٲ�, ���� �������� �����ϸ� �ٹٲ��� ���� �ʰ� ���ٿ� 5������ 1~0�� �����
		}
	}

	public static void nestedForMethod02() {
		// �������� 2��~9�� ���� ���

		for (int i = 2; i < 10; i++) { // �������� ���� ���
			System.out.println("[[ " + i + "�� ]]");
			for (int j = 1; j < 10; j++) { // �������� ��(�¼�)
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println(); // ���� �ٹٲ� : �ܰ� �� ������
		}
	}
}
