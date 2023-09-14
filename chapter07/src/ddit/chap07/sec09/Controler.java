package ddit.chap07.sec09;

import java.util.Scanner;

public class Controler {

	public static void main(String[] args) {
		// static : 공유영역, 집 구조로 치면 거실
		// new 연산자로 자기 객체 생성하면 그게 이제 현재 시점이 되기 때문에 static을 벗어나 쓸 수 있다
		new Controler().start();
		// 한번 호출할 거라서 다른 곳에서 쓸 일이 없어서
		// 변수 없이 연산자만 사용해서 객체 생성만 한 모양새
		// 변수에 넣는 것은 다른 곳에서 쓰기 위해서: Controler c1 = new Controler();
	}

	public void start() {
		int view = View.HOME;
		// 인터페이스 상수 앞에 static이 붙은 거라서, 인터페이스의 상수를 가져와 참조할 수 있다
		while (true) { // 무한루프
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
		System.out.println("************* 회원관리 *************");
		System.out.println("(1) 로그인   (2) 회원가입   (3) 관리자접속");
		System.out.println("[선택]");
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
