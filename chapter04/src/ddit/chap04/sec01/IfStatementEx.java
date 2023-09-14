package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//method01();
		//method02();
		//ifPractice01();
		//ifPractice02();
		ifPractice03();

	}
	public static void method01() {
		// 점수를 하나 입력 받아 60점 이상이면 '합격'을 출력
		int score = 70;
		if(score >= 60) System.out.println("합격");
	}
	public static void method02() {
		// 점수를 하나 입력 받아 60점 이상이면 '합격', 그 이하면 '불합격' 출력
		int score = 50;
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	public static void ifPractice01() {
		// 1~12월에 해당하는 월 하나를 입력받아 조건에 해당하는 값을 부여해라
		// 3~5월 : '봄'
		// 6~8월 : '여름'
		// 9~11월 : '가을'
		// 12~2월 : '겨울'
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 월을 입력 : ");
		int month = sc.nextInt(); 
		
		/* if(month < 3) {
			System.out.println(month + "월은 겨울입니다");
		} else if(month <= 5) {
			System.out.println(month + "월은 봄입니다");
		} else if(month <= 8) {
			System.out.println(month + "월은 여름입니다");
		} else if(month <= 11) {
			System.out.println(month + "월은 가을입니다");
		} else {
			System.out.println(month + "월은 겨울입니다");
		} */
		if(month < 0 || month > 12) {
			System.out.println("잘못된 월 입력입니다");
		} else {
			if(month >= 3 && month <= 5) {
				System.out.println(month + "월은 봄입니다");
			} else if(month >= 6 && month <= 8) {
				System.out.println(month + "월은 여름입니다");
			} else if(month >= 9 && month <= 11) {
				System.out.println(month + "월은 가을입니다");
			} else {
				System.out.println(month + "월은 겨울입니다");
			}
		}
		
	}
	public static void ifPractice02() {
		// 점수를 입력받아 그 값이 
		// 100~97 : A+
		// 96~93  : A0
		// 92~90  : A-
		// 89~87  : B+
		// 86~83  : B0
		// 82~80  : B-
		// 그 이하는 F이다
		
		int score  = 94;
		String grade = "";
		if (score >= 90) {
			grade = "A";
			if (score > 96) {
				grade = grade + "+";
			} else if (score > 92) {
				grade = grade + "0";
			} else {
				grade = grade + "-";
			}
		} else if (score >= 80) {
			grade = "A";
			if (score > 86) {
				grade = grade + "+";
			} else if (score > 82) {
				grade = grade + "0";
			} else {
				grade = grade + "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "의 점수는 " + grade + "입니다");
	}
	public static void ifPractice03() {
		// 키(센치)와 체중(킬로그램)을 입력하여 BMI지수를 구하고 지수에 따른 판정을 하시오
		// BMI = 체중 / (키 * 키)
		// 0    ~ 18.4  : 저체중
		// 18.5 ~ 22.9  : 정상
		// 23.0 ~ 24.9  : 과체중
		// 25.0 ~ 29.9  : 비만
		// 30.0 이상            : 고도비만
		
		int height;
		int weight;
		
		System.out.print("당신의 키를 입력 : ");
		height = sc.nextInt(); 
		
		// sc.nextLine(); 
		
		System.out.print("당신의 몸무게를 입력 : ");
		weight = sc.nextInt(); 
		
		double bmi = (double)weight / ((((double)height/100) * ((double)height/100)));
		
		if (bmi > 0 && bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23.0) {
			System.out.println("정상");
		} else if(bmi < 25.0) {
			System.out.println("과체중");
		} else if(bmi < 30.0) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
}

/*class Account {
	private static Account instance = null;
	private Account() {}
	public static Account getInstance() {
		if(instance == null) instance = new Account(); 
		// if 문이 if문 하나의 기초적인 구조면 한문장으로 중괄호 없이 쓸 수 있다
		return instance;
	}
}
*/