package ddit.chap04.sec04;

import java.io.IOException;
import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		WhileStatement ws = new WhileStatement();
		// 생성자 : 소괄호를 갖고 있지만 클래스명 그대로 가져왔다
		// 인스턴스 변수를 초기화 시키는 역할
		// ws.whileMethod01();
		//ws.whileMethod02();
		//ws.whileMethod03();
	}

}

class WhileStatement {
	// 클래스는 스스로 실행이 안됨 - new 메소드가 없으면 객체를 생성할 수 없음 string 제외
	public static void whileMethod01() {
		// 1~100 사이의 홀수와 짝수 합

		int cnt = 1; // 1~100 사이의 수를 보관하는 변수
		int even = 0; // 짝수의 합 변수
		int odd = 0; // 홀수의 합 변수

		while (cnt < 101) {
			if (cnt % 2 == 0) {
				even = even + cnt;
			} else {
				odd = odd + cnt;
			}
			cnt++; // 증감식을 통해 제한을 두었다
		}
		System.out.println("홀수의 합 =" + odd);
		System.out.println("짝수의 합 =" + even);
	}

	public static void whileMethod02() {
		// 키보드로 숫자하나를 입력받아 각 자리수의 합을 구하시오
		// 예) 23456 => 2+3+4+5+6 = 20

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");

		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("각 자리수의 합 : " + sum);
	}
	public static void whileMethod03() {
		// 컴퓨터가 1~50 사이의 난수를 하나 발생시키고 사용자가 그 숫자를 맞추는 게임
		// 컴퓨터 난수 > 사용자 입력 수 => "더 큰 수 입력하시오"
		// 컴퓨터 난수 < 사용자 입력 수 => "더 작은 수 입력하시오"
		// 컴퓨터 난수 = 사용자 입력 수 => "정답입니다"

		int ch = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int)(Math.random()*50)+1;
		
		try {
			do {
				
			} while ((char)(ch = System.in.read())!='y'); 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

















