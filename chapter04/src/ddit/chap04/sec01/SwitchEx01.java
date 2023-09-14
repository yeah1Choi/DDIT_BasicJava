package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		// method01();
		// method02();
		method03();
	}

	public static void method01() {
		// Ű����� �Է¹��� ���� ���Ͽ� ¦�� Ȧ���� �����Ѵ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + "�� ¦���Դϴ�.");
			break; // ���⼭ break �Ⱦ��� ���� case1�� print�� �Է���
		case 1:
			System.out.println(num + "�� Ȧ���Դϴ�.");
			// break; // �� ������ �������̱� ������ ���� �Ƚᵵ ��
		}
	}

	public static void method02() {
		// 1~12 ������ ���� �Է¹޾� �� ���� ���� ������ �����ϴ� �� Ȯ���Ѵ�
		// 3~5 �� , 6~8 ����, 9~11 ����, 12~2�� �ܿ�

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�");
			break;
		// ������ �Ʒ��� ���� �����鼭 break�� ���� ���� ���� �� �ִٴ� ������ �����
		// ���� 3,4,5�� ��� �� ������
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�");
			break;
		default:
			System.out.println("�Է��� ���� Ʋ�� �����Դϴ�");
		}
	}

	public static void method03() {
		// ȸ������ ���ϸ����� ����
		// 1000~3999 "�Ϲ�ȸ��"
		// 4000~6999 "���ȸ��"
		// �� �̻��̸� "VIPȸ��"�� ��� ����Ͻÿ�
		// �Է��ڷ�� ȸ����ȣ, ȸ����, ���ϸ����̰�
		// �Է��� ȸ����ȣ, ȸ����, ���ϸ���, ����Դϴ�.

		Scanner sc = new Scanner(System.in);
		String kind = "";

		System.out.print("ȸ����ȣ�� �Է��Ͻÿ� : ");
		String mid = sc.nextLine();

		System.out.print("ȸ���̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();

		System.out.print("���ϸ����� �Է��Ͻÿ� : ");
		int mile = sc.nextInt();

		switch (mile / 1000) { // õ ������ ����� �������� õ ���� �Ʒ��� int�� Ż������ õ������ ���� ����� ������ ��������
		case 1:
		case 2:
		case 3:
			kind = "�Ϲ�ȸ��";
			break;
		case 4:
		case 5:
		case 6:
			kind = "���ȸ��";
			break;
		default:
			kind = "VIPȸ��";
		}

		System.out.println("ȸ����ȣ: " + mid + ", ȸ����: " + name + ", ���ϸ���: " + mile + ", ���(ȸ�����): " + kind);
	}
}
