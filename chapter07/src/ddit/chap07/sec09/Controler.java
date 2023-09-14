package ddit.chap07.sec09;

import java.util.Scanner;

public class Controler {

	public static void main(String[] args) {
		// static : ��������, �� ������ ġ�� �Ž�
		// new �����ڷ� �ڱ� ��ü �����ϸ� �װ� ���� ���� ������ �Ǳ� ������ static�� ��� �� �� �ִ�
		new Controler().start();
		// �ѹ� ȣ���� �Ŷ� �ٸ� ������ �� ���� ���
		// ���� ���� �����ڸ� ����ؼ� ��ü ������ �� ����
		// ������ �ִ� ���� �ٸ� ������ ���� ���ؼ�: Controler c1 = new Controler();
	}

	public void start() {
		int view = View.HOME;
		// �������̽� ��� �տ� static�� ���� �Ŷ�, �������̽��� ����� ������ ������ �� �ִ�
		while (true) { // ���ѷ���
			switch (view) {
			case View.HOME:
				view = home();
				break;
			case View.MEMBER_LOGIN:
			//	view = memberService.logIn();
				break;
			case View.MEMBER_SIGNUP:
			//	view = memberService.signUp();
				break;
			case View.ADMIN_LOGIN:
			//	view = memberService.adminLogIn();
				break;
			}
		}
	}

	public int home() {
		System.out.println("************* ȸ������ *************");
		System.out.println("(1) �α���   (2) ȸ������   (3) ����������");
		System.out.println("[����]");
		Scanner sc = new Scanner(System.in);
		
		switch(sc.nextInt()) {
		case 1 :
			return View.MEMBER_LOGIN;
		case 2 :
			return View.MEMBER_SIGNUP;
		case 3 :
			return View.ADMIN_LOGIN;
		default :
			return View.HOME;
		}
	}
}
