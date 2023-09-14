package ddit.chap03.sec01;

import java.util.Scanner;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		 //arithmeticOperator();
		 //relationalOperator();
		 //relationalOperator02();
		 //relationalOperator02Anwser();
		logicalOperator();
	}
	public static void arithmeticOperator() {
		// +, -, *, /, %
		
		// 1 ~ 100 사이의 짝수 합과 홀수 합을 출력
		int even = 0; // 짝수 합
		int odd = 0;  // 홀수 합
		for (int i = 1 ; i < 101 ; i++) {
			if(i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			System.out.println("짝수의 합 : " + even);
			System.out.println("홀수의 합 : " + odd);
		}
		
	}
	public static void relationalOperator() {
		// 비교(관계)연산 : 크기 비교할때 사용 (>,<,=,>=,<=,!=(<>))
		// 결과는 true or false, 주로 조건문에 사용
		// 키보드로 입력을 받은 점수가 
		// 90 - 100 : A학점 , 80 - 89 : B학점, 
		// 70 - 79 : C학점, 60 - 69 : D학점, 그 이하 : F학점
		
		String grade = ""; // 공백, 화이트 스페이스를 초기값으로 부여
		
		Scanner sc = new Scanner(System.in); // 자주씀 공식 외우기
		System.out.print("점수 : ");
		int score = sc.nextInt(); 
		// 공백(엔터)이 입력되기 전에 받은 정수(데이터)를 왼쪽 항 변수에 넣어줌
		
		if (score >= 90) {
			grade = "A학점";
		} else if (score <= 89 && score >= 80) { // 짧게 쓸 수 있는 조건문은 굳이 길게 써서 오류가능성을 높히지마
			grade = "B학점";
		} else if (score >= 70) {
			grade = "C학점";
		} else if (score >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		System.out.println(score + "점수는 " + grade + "입니다");
	}
	public static void relationalOperator02() {
		// 키보드로 10세 이상의 나이를 입력받아 그 사람이 어느 부분에 속하는지 출력
		// 예) 35세 : "30대입니다"
		
		String groups = "";
				
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요 : ");
		
		int ages = sc.nextInt();
		
		if (ages >= 100) {
			System.out.println("대단하세요! 만수무강하세요!");
		} else if (ages >= 90) {
			groups = "90대";
		} else if (ages >= 80) {
			groups = "80대";
		} else if (ages >= 70) {
			groups = "70대";
		} else if (ages >= 60) {
			groups = "60대";
		} else if (ages >= 50) {
			groups = "50대";
		} else if (ages >= 40) {
			groups = "40대";
		} else if (ages >= 30) {
			groups = "30대";
		} else if (ages >= 20) {
			groups = "20대";
		} else if (ages >= 10) {
			groups = "10대";
		} else {
			System.out.println("당신은 이 프로그램을 사용하기에 적합하지않은 나이입니다");
	}
		System.out.println("입력한 당신의 나이는 " + ages + "이고 연령대는 " + groups + "입니다");
	}
	public static void relationalOperator02Anwser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		int age1 = (age / 10) * 10;
		String message = age1 + "대입니다";
		System.out.println(age + "세는" + message);
	}
	public static void logicalOperator() {
		// 논리연산자 : !(NOT) > &&(and) > ||(or) * 빠른 순 not 연산자는 단항 연산자라 제일 빠름
		
		// 자신의 출생년도를 입력받아 윤년과 평년을 판단하시오
		// 윤년 : (4의 배수이면서 100의 10수가 아닌 해이거나)(400의 배수가 되는 해)
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		if ((year % 4 == 0 && year % 100 != 0)) {
			
		} else {
			
		}
	}
}
