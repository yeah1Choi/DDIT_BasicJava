package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx02 {

	public static void main(String[] args) {
		// method1();
		method2();
		// ȣ�⹮
	}

	public static void method1() {
		// Ű����� �����ϳ�(1~10)�� �Է¹ް�,
		// ��ǻ�Ϳ��� ����(1~10)�� �Է¹޾� �� ���� ���Ͽ�
		// ���� ���̸� "�����Դϴ�"�� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		// API �ڹ� ȸ�翡�� ���� �̹� �������� Ŭ���� :
		// ���� ����� �ƴ� ���� ���� Ŭ�����̱� ������ import(�ۿ� �ִ� ���� �ҷ��� ����)�� �Ἥ �̿��ؾ��Ѵ�
		System.out.print("1~10 ������ ���ڸ� �Է� : ");
		int userNum = sc.nextInt();
		// .�� �Ҽ��� ��Ÿ�� -> nextInt()�޼ҵ尡 sc��� ������ �Ҽ��Ѵ�

		int comNum = (int) (Math.random() * 10) + 1;
		// 1~10 ������ ���� �߻�

		if (userNum == comNum) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ� " + comNum);
		}
	}

	public static void method2() {
		// Ű����� �����ϳ�(1~10)�� �Է¹ް�,
		// ��ǻ�Ϳ��� ����(1~10)�� �Է¹޾� �� ���� ���Ͽ�
		// ��ǻ�Ϳ��� ������ ���� ������� ���ں��� �� ū ���̸� "�� ū ���� �Է��Ͻÿ�"�� ����ϰ�
		// ��ǻ�Ϳ��� ������ ���� ������� ���ں��� �� ���� ���̸� "�� ���� ���� �Է��Ͻÿ�"�� ����ϰ�
		// �������̸� "�����Դϴ�" ���

		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 ������ ���ڸ� �Է� : ");
		int userNum = sc.nextInt();

		int comNum = (int) (Math.random() * 10) + 1;

		while (true) {
			// while ���� �ξ� ��ǻ�Ͱ� ���� ������ ������������ �������� if�� ���ߴ� ��
			if (userNum < comNum) {
				System.out.println("�� ū ���� �Է��Ͻÿ�");
			} else if (userNum > comNum) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�");
			} else {
				System.out.println("�����Դϴ�");
				break;
				// while������ break�� ����� ����
			}
			userNum = sc.nextInt();
		}
	}
}
