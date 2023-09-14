package ddit.chap04.sec02;

public class ForEx01 {

	public static void main(String[] args) {

		// forMethod01();
		// forMethod02();
		// forMethod03();
		forMethod04();

	}

	public static void forMethod01() {
		// 1~10 ������ ���� �ٿ��� ���
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-3d", i);

		}
	}

	public static void forMethod02() {
		// ���ĺ� A ~ Z ���� ���ٿ� ����Ͻÿ�

		// for���� ���ڿ��� ���͵���
		// for (char ch = 'A'; ch <= 'Z'; ch++) {
		for (int ch = 'A'; ch <= 'Z'; ch++) {
			// ������ Ÿ���� ������ �־ ����, ���ǽ��� �����ϱ� �� 'Z'�� ������ ����ȯ�� �Ͼ
			System.out.printf("%2c", ch);
		}
	}

	public static void forMethod03() {
		// 0 ~ 50 ������ fibonacci number �Ǻ���ġ ���� ���� ���Ͻÿ�
		// �Ǻ���ġ ���� : ù��°�� �ι��� ���� 1�� �־�����
		// ����° ������ �� �μ��� ���� ���� ���� �Ǵ� ���� (1,1,2,3,5,8,13,...)

		int p = 1; // ����
		int pp = 1; // ������
		int c = 0; // �����

		System.out.printf("%-3d %-3d", p, pp);
		for (int i = 0; i < 51; i++) {
			c = p + pp;
			if (c >= 50)
				break; // if���� �ƴ϶� for���� �ڱⰡ ���� �ݺ����� ���
			System.out.printf("%-3d", c);
			pp = p;
			p = c;
		}
	}

	public static void forMethod04() {
		// 1 + 1/2 + 1/3 + ... + 1/10 = ?

		double sum = 0.0;

		for (int i = 1; i < 11; i++) {
			sum = sum + (1 / (double) i);
		}
		System.out.printf("��� = %7.3f", sum);
		// 7.3 : �� 7ĭ �߿� �Ҽ����� 3ĭ ����ϰ� ������ 4ĭ�� ���� Ȥ�� ��ĭ���� ���
	}
}
