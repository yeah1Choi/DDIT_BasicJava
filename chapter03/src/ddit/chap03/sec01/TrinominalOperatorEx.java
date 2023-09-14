package ddit.chap03.sec01;

import java.util.Scanner;
// 객체가 반드시 만들어져야 Scanner 쓸 수 있음

public class TrinominalOperatorEx {

	static Scanner sc = new Scanner(System.in); // static이 있으면 어디서든 쓸 수 있다
	
	public static void main(String[] args) {
		// 삼항연산자
		// (조건문)? 명령문1 : 명령문2
		// - 조건이 참(true)이면 명령문1을 수행하고, 조건이 거짓(false)이면 명령문2를 수행
		
		//method1();
		method2();
	}
	public static void method1() {
		// 나이를 입력받아 성년인지 미성년인지를 판단
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine()); 
		// 문자열(nextLine)로 받는 이유는 안정적이기때문에 사용함 정수로 환산하기 위해 Integer.parseInt를 붙임
		String str = (age >= 18)? "성년자 입니다" : "미성년자입니다"; // 입력을 받으면 조건에 따라 문자열이 str 변수로 들어감
		System.out.println(str);
	}
	public static void method2() {
		// 키보드로 입력받은 점수가 
		// 90-100 : A
		// 80-89  : B
		// 70-79  : C
		// 60-69  : D
		// 그 이하     : F
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		//String str = (score >= 90? "A학점" : (score >= 80? "B학점" : (score >= 70? "C학점" : (score >= 60? "D학점" : "F학점" )))); // 괄호의 위치로 논리들의 관계를 이해할 수 있다
		String str = (score >= 90)? "A학점" : (score >= 80)? "B학점" : (score >= 70)? "C학점" : (score >= 60)? "D학점" : "F학점"; // 하지만 괄호위치는 결과값과 상관없이 쓸 수 있다
		
		System.out.println(score + " => " + str);
	}
}
