package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx03 {

	public static void main(String[] args) {

		method01();

	}

	public static void method01() {
		// Ű����� ���̵�� ��й�ȣ�� �Է¹޾� �α��εǴ� �����̴�.
		// ���̵� ���Ͽ� ���̵� ��ġ�ϸ� ��й�ȣ�� ���ϰ�
		// ���̵� ��ġ���� ������ "���̵� ��ġ���� �ʽ��ϴ�"�� ����ϰ�
		// ���α׷� ������ �����ϸ�, ��й�ȣ�� ���� ������� ���Ͽ�
		// ��� ��ġ�ϸ� "~~��, ȯ���մϴ�"��� �޽����� ���

		String id = "e1004";
		String pw = "1234";
		// Ŭ������ String�� ����Ǵ� ������ �ּҰ��� ����Ǵ� ��

		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String userId = sc.nextLine();

		System.out.print("��ȣ�� �Է� : ");
		String userPw = sc.nextLine();

		// if (id == userId) : id ������ �ռ� �����ߵ� String �̶�� Ŭ������ ������ �ּҰ��� ���� ���� �� ���� �ּҰ���
		// ���ϴ� ��
		// equals �޼ҵ�� �빮�ڼҹ��� ��� ���縵 ����, caseignore �޼ҵ�� ���縵�� ��
		// .equals �޼ҵ带 ���� ���� ������ ���� �޼ҵ��� ���縵�� ���Ѵ�
		if (id.equals(userId)) {
			if (pw.equals(userPw)) {
				System.out.println(userId + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		} else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�");
		}
	}
}
