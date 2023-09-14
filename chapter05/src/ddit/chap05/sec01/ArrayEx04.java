package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// Ű����� 1000�������� ���� �Է¹޾Ʊ� �׼���ŭ�� �ζǹ�ȣ�� ����Ͻÿ�

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // �ζ��� ������ �迭ó�� 0�� �ƴϱ� ������
		}
		shuffle(lotto);
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ծ׼�(1000) : ");
		int money = sc.nextInt();

		getLottoNumber(lotto, money);
	}

	public static void shuffle(int[] lotto) {
		for (int i = 0; i < 100000000; i++) {
			int rnd = (int) (Math.random() * lotto.length);
			int temp = lotto[0]; // �迭�� ���� �ٲ�� ���� ���� ������� ������ ���� �迭 0�� temp ������� �ӽ������� ��
			lotto[0] = lotto[rnd]; // ������ �迭�� �� 0���� ��
			lotto[rnd] = temp; // ������ �迭�� �Űܰ� �� �ڸ��� ������� �ű⿡ �迭 0�� ����� temp ������ �ͼ� 0�� ��
		}
	}

	public static void getLottoNumber(int[] lotto, int money) {
		for (int i = 0; i < money / 1000; i++) { // �ٹٲ�
			shuffle(lotto); // ���÷� �ٲ�
			System.out.print((i + 1) * 1000 + "�� : [");
			for (int j = 0; j < 6; j++) { // 6���� ���ڸ� ����ϱ� ����
				System.out.printf("%3d", lotto[j]);
			}
			System.out.println(" ]");
		}
	}	
}
