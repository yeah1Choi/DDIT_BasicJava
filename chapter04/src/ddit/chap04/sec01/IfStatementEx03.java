package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx03 {

	public static void main(String[] args) {

		method01();

	}

	public static void method01() {
		// 키보드로 아이디와 비밀번호를 입력받아 로그인되는 과정이다.
		// 아이디를 비교하여 아이디가 일치하면 비밀번호를 비교하고
		// 아이디가 일치하지 않으면 "아이디가 일치하지 않습니다"를 출력하고
		// 프로그램 실행을 종료하며, 비밀번호도 같은 방법으로 비교하여
		// 모두 일치하면 "~~님, 환영합니다"라는 메시지를 출력

		String id = "e1004";
		String pw = "1234";
		// 클래스인 String에 저장되는 변수는 주소값이 저장되는 것

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력 : ");
		String userId = sc.nextLine();

		System.out.print("암호를 입력 : ");
		String userPw = sc.nextLine();

		// if (id == userId) : id 변수는 앞서 설명했듯 String 이라는 클래스의 변수라서 주소값을 갖고 있음 이 식은 주소값을
		// 비교하는 것
		// equals 메소드는 대문자소문자 모두 스펠링 비교함, caseignore 메소드는 스펠링만 비교
		// .equals 메소드를 통해 뒤의 변수와 앞의 메소드의 스펠링을 비교한다
		if (id.equals(userId)) {
			if (pw.equals(userPw)) {
				System.out.println(userId + "님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
	}
}
