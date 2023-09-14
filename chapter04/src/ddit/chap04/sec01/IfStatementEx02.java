package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx02 {

	public static void main(String[] args) {
		// method1();
		method2();
		// 호출문
	}

	public static void method1() {
		// 키보드로 숫자하나(1~10)를 입력받고,
		// 컴퓨터에서 난수(1~10)를 입력받아 두 수를 비교하여
		// 같은 값이면 "정답입니다"를 출력하시오

		Scanner sc = new Scanner(System.in);
		// API 자바 회사에서 만든 이미 만들어놓은 클래스 :
		// 내가 만든게 아닌 남이 만든 클래스이기 때문에 import(밖에 있는 것을 불러와 쓴다)를 써서 이용해야한다
		System.out.print("1~10 사이의 숫자를 입력 : ");
		int userNum = sc.nextInt();
		// .은 소속을 나타냄 -> nextInt()메소드가 sc라는 변수에 소속한다

		int comNum = (int) (Math.random() * 10) + 1;
		// 1~10 정수형 난수 발생

		if (userNum == comNum) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다 " + comNum);
		}
	}

	public static void method2() {
		// 키보드로 숫자하나(1~10)를 입력받고,
		// 컴퓨터에서 난수(1~10)를 입력받아 두 수를 비교하여
		// 컵퓨터에서 생성된 수가 사용자의 수자보다 더 큰 수이면 "더 큰 수를 입력하시오"를 출력하고
		// 컵퓨터에서 생성된 수가 사용자의 수자보다 더 작은 수이면 "더 작은 수를 입력하시오"를 출력하고
		// 같은값이면 "정답입니다" 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 숫자를 입력 : ");
		int userNum = sc.nextInt();

		int comNum = (int) (Math.random() * 10) + 1;

		while (true) {
			// while 문을 두어 컴퓨터가 꺼낸 임의의 난수형정수를 갇혀놓고 if로 맞추는 것
			if (userNum < comNum) {
				System.out.println("더 큰 수를 입력하시오");
			} else if (userNum > comNum) {
				System.out.println("더 작은 수를 입력하시오");
			} else {
				System.out.println("정답입니다");
				break;
				// while문에서 break로 벗어나기 위함
			}
			userNum = sc.nextInt();
		}
	}
}
