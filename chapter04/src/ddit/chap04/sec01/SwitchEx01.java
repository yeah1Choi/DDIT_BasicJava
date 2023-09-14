package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		// method01();
		// method02();
		method03();
	}

	public static void method01() {
		// 키보드로 입력받은 수를 평가하여 짝수 홀수를 구분한다

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + "은 짝수입니다.");
			break; // 여기서 break 안쓰면 뒤의 case1의 print를 입력함
		case 1:
			System.out.println(num + "은 홀수입니다.");
			// break; // 이 구문의 마지막이기 때문에 굳이 안써도 됨
		}
	}

	public static void method02() {
		// 1~12 사이의 수를 입력받아 그 값이 무슨 계절에 포함하는 지 확인한다
		// 3~5 봄 , 6~8 여름, 9~11 가을, 12~2월 겨울

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 숫자 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다");
			break;
		// 위에서 아래로 식을 읽으면서 break를 만나 식을 나갈 수 있다는 성질을 사용해
		// 값이 3,4,5인 경우 를 묶었음
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
		default:
			System.out.println("입력한 월이 틀린 숫자입니다");
		}
	}

	public static void method03() {
		// 회원들의 마일리지에 따라
		// 1000~3999 "일반회원"
		// 4000~6999 "우수회원"
		// 그 이상이면 "VIP회원"을 비고에 출력하시오
		// 입력자료는 회원번호, 회원명, 마일리지이고
		// 입력은 회원번호, 회원명, 마일리지, 비고입니다.

		Scanner sc = new Scanner(System.in);
		String kind = "";

		System.out.print("회원번호를 입력하시오 : ");
		String mid = sc.nextLine();

		System.out.print("회원이름을 입력하시오 : ");
		String name = sc.nextLine();

		System.out.print("마일리지를 입력하시오 : ");
		int mile = sc.nextInt();

		switch (mile / 1000) { // 천 단위로 등급이 나눠지니 천 단위 아래는 int로 탈락시켜 천단위만 보고 등급을 나누기 쉬워졌다
		case 1:
		case 2:
		case 3:
			kind = "일반회원";
			break;
		case 4:
		case 5:
		case 6:
			kind = "우수회원";
			break;
		default:
			kind = "VIP회원";
		}

		System.out.println("회원번호: " + mid + ", 회원명: " + name + ", 마일리지: " + mile + ", 비고(회원등급): " + kind);
	}
}
